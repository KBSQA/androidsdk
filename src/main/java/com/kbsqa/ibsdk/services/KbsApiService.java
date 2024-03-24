package com.kbsqa.ibsdk.services;

import com.google.gson.JsonObject;
import com.kbsqa.ibsdk.response.CategoryRootResponse;
import com.kbsqa.ibsdk.response.KbsCountryRooResponse;
import com.kbsqa.ibsdk.response.KbsServiceRootResponse;
import com.kbsqa.ibsdk.response.MicroServiceResponse;
import com.kbsqa.ibsdk.response.OrderResponse;
import com.kbsqa.ibsdk.response.ProductRootResponse;
import com.kbsqa.ibsdk.response.SchemaRootResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface KbsApiService {

    @GET("/")
    Call<MicroServiceResponse> getApiGateway();

    @GET("/auth/admin/service-sdk/category/all/")
    Call<KbsServiceRootResponse> getServiceCategoryResponse();

    @GET("provider/sdk/kbs-services")
    Call<KbsServiceRootResponse> getKbsServices();
    @GET("provider/sdk/categories")
    Call<CategoryRootResponse> getCategories();

    @GET("provider/sdk/categories")
    Call<CategoryRootResponse> getCategoriesByServiceId(
            @Query("serviceCategoryId") String serviceId
    );

    @GET("/provider/sdk/categories")
    Call<CategoryRootResponse> getCategoriesByServiceCategoryIdAndCountryIso(
            @Query("serviceCategoryId") String serviceCategoryId,
            @Query("countryIso") String countryIso
    );

    @GET("provider/sdk/products")
    Call<ProductRootResponse> getProducts(@Query("serviceCategoryId") String serviceCategoryId);

    @GET("provider/sdk/products")
    Call<ProductRootResponse> getProductsByCategoryId(@Query("categoryId") String categoryId);


    @GET("provider/product/schema/{schemaId}")
    Call<SchemaRootResponse> getSchema(@Path("schemaId") String productId);

    @POST("provider/product/order")
    Call<OrderResponse> submitOrder(
            @Header("x-api-key") String apiKey,
            @Header("Content-Type") String contentType,
            @Body JsonObject formData
    );

    @GET("/provider/sdk/countries")
    Call<KbsCountryRooResponse> getCountriesByServiceCategoryId(
            @Query("serviceCategoryId") String serviceCategoryId
    );


   /* @GET("provider/product/category/{categoryId}")
    Call<KBS1Category> getKbs1CategoryById(@Path("categoryId") String categoryId);

    @GET("provider/product/category/all")
    Call<KBS1CategoryRootResponse> getKbs1CategoryByServiceId(
            @Query("serviceCategoryId") String serviceCategoryId
    );

    @GET("provider/product/{productId}")
    Call<KBS1Product> getProductById(@Path("productId") String productId);

    @GET("provider/product/all")
    Call<KBS1ProductRootResponse> getProductsByCategoryId(
            @Query("categoryId") String categoryId
    );*/
}

