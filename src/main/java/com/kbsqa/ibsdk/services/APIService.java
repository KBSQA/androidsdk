package com.kbsqa.ibsdk.services;

import com.kbsqa.ibsdk.response.module.ApiModuleResponse;
import com.kbsqa.ibsdk.response.kbs1.ServiceResponse;
import com.kbsqa.ibsdk.response.module.ServiceCategoryResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @GET("/")
    Call<ServiceResponse> getApiGateway();

    @GET("/auth/admin/service-sdk/category/all/")
    Call<ServiceCategoryResponse> getServiceCategoryResponse();
    @GET("/auth/admin/service-sdk/get-by-category/{id}")
    Call<List<ApiModuleResponse>> getApiModuleListByCategory(@Path("id") String categoryId);
    @GET("/")
    <T>Call<T> getApiGatewayResponse();

}
