package com.kbsqa.ibsdk.rest;

import android.util.Log;

import com.kbsqa.ibsdk.response.module.ApiModuleResponse;
import com.kbsqa.ibsdk.response.kbs1.ServiceResponse;
import com.kbsqa.ibsdk.response.module.ServiceCategoryResponse;
import com.kbsqa.ibsdk.services.APIService;
import com.kbsqa.ibsdk.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiHandler {
    private static final String TAG = "ApiHandler";
    private final APIService apiService;

    public ApiHandler() {
        apiService = RetrofitClient.getRetrofit().create(APIService.class);
    }

    public void getApiGatewayResponse(final ApiResponseCallback<ServiceResponse> callback) {
        Call<ServiceResponse> call = apiService.getApiGateway();
        call.enqueue(new Callback<ServiceResponse>() {
            @Override
            public void onResponse(Call<ServiceResponse> call, Response<ServiceResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Error: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<ServiceResponse> call, Throwable t) {
                callback.onError("Network error: " + t.getMessage());
            }
        });

    }

    public void getServiceCategoryResponse(final ApiResponseCallback<ServiceCategoryResponse> callback) {
        Call<ServiceCategoryResponse> call = apiService.getServiceCategoryResponse();
        enqueueCall(call, callback);
    }

    public void getApiModuleListByCategory(String categoryId, final ApiResponseCallback<List<ApiModuleResponse>> callback) {
        Call<List<ApiModuleResponse>> call = apiService.getApiModuleListByCategory(categoryId);
        enqueueCall(call, callback);
    }

    private <T> void enqueueCall(Call<T> call, ApiResponseCallback<T> callback) {
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed with code " + response.message());
                    Log.d(TAG, "onError: "+ response.message());
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }
}
