package com.kbsqa.ibsdk.handler;

import com.google.gson.JsonObject;
import com.kbsqa.ibsdk.callback.ApiResponseCallback;
import com.kbsqa.ibsdk.response.CategoryRootResponse;
import com.kbsqa.ibsdk.response.KbsCountryRooResponse;
import com.kbsqa.ibsdk.response.KbsServiceRootResponse;
import com.kbsqa.ibsdk.response.MicroServiceResponse;
import com.kbsqa.ibsdk.response.OrderResponse;
import com.kbsqa.ibsdk.response.ProductRootResponse;
import com.kbsqa.ibsdk.response.SchemaRootResponse;
import com.kbsqa.ibsdk.retrofit.RetrofitClient;
import com.kbsqa.ibsdk.services.KbsApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class KbsApiHandler {
    private static final String TAG = "KbsApiHandler";

    KbsApiService kbsApiService;

    public KbsApiHandler() {
        kbsApiService = RetrofitClient.getRetrofit().create(KbsApiService.class);
    }

    public void getApiGatewayResponse(final ApiResponseCallback<MicroServiceResponse> callback) {
        Call<MicroServiceResponse> call = kbsApiService.getApiGateway();
        enqueueCall(call, callback);
    }

/*    public void getKbs1CategoryById(final ApiResponseCallback<KBS1Category> callback,String categoryId) {
        Call<KBS1Category> call = kbsApiService.getKbs1CategoryById(categoryId);
        enqueueCall(call, callback);
    }

    public void getKbs1CategoryByServiceId(final ApiResponseCallback<KBS1CategoryRootResponse> callback, String categoryId) {
        Call<KBS1CategoryRootResponse> call = kbsApiService.getKbs1CategoryByServiceId(categoryId);
        enqueueCall(call, callback);
    }

    public void getKbs1ProductById(final ApiResponseCallback<KBS1Product> callback, String productId) {
        Call<KBS1Product> call = kbsApiService.getProductById(productId);
        enqueueCall(call, callback);
    }

    public void getKbs1ProductsByCategoryId(final ApiResponseCallback<KBS1ProductRootResponse> callback, String categoryId) {
        Call<KBS1ProductRootResponse> call = kbsApiService.getProductsByCategoryId(categoryId);
        enqueueCall(call, callback);
    }*/


    public void getKbsServices(final ApiResponseCallback<KbsServiceRootResponse> callback) {
        Call<KbsServiceRootResponse> call = kbsApiService.getKbsServices();
        enqueueCall(call, callback);
    }

    public void getCategories(final ApiResponseCallback<CategoryRootResponse> callback) {
        Call<CategoryRootResponse> call = kbsApiService.getCategories();
        enqueueCall(call, callback);
    }

    public void getCategoriesByServiceId(String serviceId, final ApiResponseCallback<CategoryRootResponse> callback) {
        Call<CategoryRootResponse> call = kbsApiService.getCategoriesByServiceId(serviceId);
        enqueueCall(call, callback);
    }

    public void getCategoriesByServiceCategoryIdAndCountryIso(String serviceCategoryId,String countryIso, final ApiResponseCallback<CategoryRootResponse> callback) {
        Call<CategoryRootResponse> call = kbsApiService.getCategoriesByServiceCategoryIdAndCountryIso(serviceCategoryId,countryIso );
        enqueueCall(call, callback);
    }

    public void getProductsByServiceCategoryId(String serviceCategoryId, final ApiResponseCallback<ProductRootResponse> callback) {
        Call<ProductRootResponse> call = kbsApiService.getProducts(serviceCategoryId);
        enqueueCall(call, callback);
    }

    public void getProductsByCategoryId(String categoryId, final ApiResponseCallback<ProductRootResponse> callback) {
        Call<ProductRootResponse> call = kbsApiService.getProductsByCategoryId(categoryId);
        enqueueCall(call, callback);
    }

    public void getSchemaByProductId(String productId, final ApiResponseCallback<SchemaRootResponse> callback) {
        Call<SchemaRootResponse> call = kbsApiService.getSchema(productId);
        enqueueCall(call, callback);
    }

    public void submitOrder(String apiKey, JsonObject jsonObject, final ApiResponseCallback<OrderResponse> callback) {
        Call<OrderResponse> call = kbsApiService.submitOrder(apiKey, "application/json", jsonObject);
        enqueueCall(call, callback);
    }

    public void getCountriesByServiceCategoryId(String serviceCategoryId, final ApiResponseCallback<KbsCountryRooResponse> callback) {
        Call<KbsCountryRooResponse> call = kbsApiService.getCountriesByServiceCategoryId(serviceCategoryId);
        enqueueCall(call, callback);
    }


    private <T> void enqueueCall(Call<T> call, ApiResponseCallback<T> callback) {
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed with code " + response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }


}
