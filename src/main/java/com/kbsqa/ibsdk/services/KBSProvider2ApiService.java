package com.kbsqa.ibsdk.services;

import com.kbsqa.ibsdk.request.kbs2.CredentialActivationRequest;
import com.kbsqa.ibsdk.request.kbs2.CredentialActivationResponse;
import com.kbsqa.ibsdk.request.kbs2.OrderCreateRequest;
import com.kbsqa.ibsdk.request.kbs2.OrderCreateResponse;
import com.kbsqa.ibsdk.request.kbs2.SimulateWebhookResponse;
import com.kbsqa.ibsdk.request.kbs2.TopupRequest;
import com.kbsqa.ibsdk.request.kbs2.TopupResponse;
import com.kbsqa.ibsdk.request.kbs2.WebhookCreateRequest;
import com.kbsqa.ibsdk.request.kbs2.WebhookCreateResponse;
import com.kbsqa.ibsdk.response.kbs2.AccountResponse;
import com.kbsqa.ibsdk.response.kbs2.BrandLocationCityResponse;
import com.kbsqa.ibsdk.response.kbs2.BrandLocationResponse;
import com.kbsqa.ibsdk.response.kbs2.BrandResponse;
import com.kbsqa.ibsdk.response.kbs2.CategoryResponse;
import com.kbsqa.ibsdk.response.kbs2.CountryResponse;
import com.kbsqa.ibsdk.response.kbs2.CredentialsGenerationResponse;
import com.kbsqa.ibsdk.response.kbs2.CredentialsResponse;
import com.kbsqa.ibsdk.response.kbs2.CurrencyResponse;
import com.kbsqa.ibsdk.response.kbs2.ExchangeRateResponse;
import com.kbsqa.ibsdk.response.kbs2.KBSCategoryBrandResponse;
import com.kbsqa.ibsdk.response.kbs2.KBSCategoryResponse;
import com.kbsqa.ibsdk.response.kbs2.OrderResponse;
import com.kbsqa.ibsdk.response.kbs2.P2BrandResponse;
import com.kbsqa.ibsdk.response.kbs2.WebhooksActivationResponse;
import com.kbsqa.ibsdk.response.kbs2.WebhooksDeactivationResponse;
import com.kbsqa.ibsdk.response.kbs2.WebhooksResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface KBSProvider2ApiService {
    @GET("/provider/kbs2/currencies/")
    Call<CurrencyResponse> getCurrencies(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs2/account/")
    Call<AccountResponse> getAccount(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs2/orders/")
    Call<OrderResponse> searchOrderByGiftCode(@Header("x-api-key") String apiKey,
                                              @Query("code") String code);

    @GET("/provider/kbs2/orders/")
    Call<OrderResponse> searchOrderByOrderId(@Header("x-api-key") String apiKey,
                                             @Query("order_id") String orderId);

    @GET("/provider/kbs2/orders/")
    Call<OrderResponse> listAllDigitalOrders(@Header("x-api-key") String apiKey,
                                             @Query("notify") boolean notify,
                                             @Query("from_date") String fromDate,
                                             @Query("to_date") String toDate);

    @GET("/provider/kbs2/orders/")
    Call<OrderResponse> listOrdersPlacedInCountry(@Header("x-api-key") String apiKey,
                                                  @Query("country") String country,
                                                  @Query("from_date") String fromDate,
                                                  @Query("to_date") String toDate);

    @GET("/provider/kbs2/orders/")
    Call<OrderResponse> listOrdersPlacedInBrand(@Header("x-api-key") String apiKey,
                                                @Query("brand_code") String brandCode,
                                                @Query("from_date") String fromDate,
                                                @Query("to_date") String toDate);

    @GET("/provider/kbs2/orders/")
    Call<OrderResponse> listOrdersByPage(@Header("x-api-key") String apiKey,
                                         @Query("page") int page,
                                         @Query("from_date") String fromDate,
                                         @Query("to_date") String toDate);

    @GET("/provider/kbs2/brands/")
    Call<BrandResponse> getAllBrands(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs2/brands/")
    Call<BrandResponse> getBrandsByCountry(@Header("x-api-key") String apiKey, @Query("country") String country);

    @GET("/provider/kbs2/brands/")
    Call<BrandResponse> getBrandByCode(@Header("x-api-key") String apiKey, @Query("brand_code") String brandCode);

    @GET("/provider/kbs2/brands/")
    Call<BrandResponse> getBrandByName(@Header("x-api-key") String apiKey, @Query("name") String name);

    @GET("/provider/kbs2/brands/")
    Call<BrandResponse> getActiveBrands(@Header("x-api-key") String apiKey, @Query("is_active") boolean isActive);

    @GET("/provider/kbs2/brands/")
    Call<P2BrandResponse> getBrandsByCategoryId(@Header("x-api-key") String apiKey, @Query("category_id") int categoryId);
    @GET("/provider/kbs2/brands/{brand_code}/locations/")
    Call<BrandLocationResponse> getBrandLocations(@Header("x-api-key") String apiKey, @Path("brand_code") String brandCode);

    @GET("/provider/kbs2/brands/{brand_code}/locations/{city_id}")
    Call<BrandLocationCityResponse> getLocationByCityId(@Header("x-api-key") String apiKey,
                                                        @Path("brand_code") String brandCode,
                                                        @Path("city_id") String cityId);
    @GET("/provider/kbs2/categories/")
    Call<CategoryResponse> getCategories(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs2/countries/")
    Call<CountryResponse> getCountries(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs2/currencies/rates/")
    Call<ExchangeRateResponse> getCurrencyRates(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs2/credentials/")
    Call<CredentialsResponse> getCredentials(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs2/credentials/generate/")
    Call<CredentialsGenerationResponse> generateCredentials(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs2/webhooks/brands")
    Call<WebhooksResponse> getBrandWebhooks(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs2/webhooks/brands/{id}/activate/")
    Call<WebhooksActivationResponse> activateWebhook(@Header("x-api-key") String apiKey, @Path("id") String webhookId);

    @GET("/provider/kbs2/webhooks/brands/{id}/deactivate/")
    Call<WebhooksDeactivationResponse> deactivateWebhook(@Header("x-api-key") String apiKey, @Path("id") String webhookId);

    @POST("/provider/kbs2/orders/")
    Call<OrderCreateResponse> createOrder(
            @Header("x-api-key") String apiKey,
            @Body OrderCreateRequest request
    );

    @POST("/provider/kbs2/account/topup/")
    Call<TopupResponse> topupAccount(
            @Header("x-api-key") String apiKey,
            @Body TopupRequest request
    );

    @POST("/provider/kbs2/credentials/activate/")
    Call<CredentialActivationResponse> activateCredentials(
            @Header("x-api-key") String apiKey,
            @Body CredentialActivationRequest request
    );

    @POST("/provider/kbs2/webhooks/brands/")
    Call<WebhookCreateResponse> createWebhook(
            @Header("x-api-key") String apiKey,
            @Body WebhookCreateRequest request
    );

    @POST("/provider/kbs2/webhooks/brands/{id}/simulate/")
    Call<SimulateWebhookResponse> simulateWebhook(
            @Header("x-api-key") String apiKey,
            @Path("id") String webhookId
    );

    @GET("/provider/kbs2-gift-card/category")
    Call<KBSCategoryResponse> getGiftCardCategories(
//            @Header("x-api-key") String apiKey
    );

    @GET("/provider/kbs2-gift-card/brands")
    Call<KBSCategoryBrandResponse> getBrandsByCategoryId(
            @Query("categoryId") int categoryId
//            @Header("x-api-key") String apiKey
    );

}
