package com.kbsqa.ibsdk.rest;

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
import com.kbsqa.ibsdk.retrofit.RetrofitClient;
import com.kbsqa.ibsdk.services.KBSProvider2ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class KBSProvider2ApiHandler {

    KBSProvider2ApiService KBSProvider2ApiService;

    public KBSProvider2ApiHandler() {
        KBSProvider2ApiService = RetrofitClient.getRetrofit().create(KBSProvider2ApiService.class);
    }

    public void getCurrencies(String apiKey, ApiResponseCallback<CurrencyResponse> callback) {
        Call<CurrencyResponse> call = KBSProvider2ApiService.getCurrencies(apiKey);
        enqueueCall(call, callback);
    }

    public void getAccount(String apiKey, ApiResponseCallback<AccountResponse> callback) {
        Call<AccountResponse> call = KBSProvider2ApiService.getAccount(apiKey);
        enqueueCall(call, callback);
    }

    public void searchOrderByGiftCode(String apiKey, String code, ApiResponseCallback<OrderResponse> callback) {
        Call<OrderResponse> call = KBSProvider2ApiService.searchOrderByGiftCode(apiKey, code);
        enqueueCall(call, callback);
    }

    public void searchOrderByOrderId(String apiKey, String orderId, ApiResponseCallback<OrderResponse> callback) {
        Call<OrderResponse> call = KBSProvider2ApiService.searchOrderByOrderId(apiKey, orderId);
        enqueueCall(call, callback);
    }

    public void listAllDigitalOrders(String apiKey, boolean notify, String fromDate, String toDate, ApiResponseCallback<OrderResponse> callback) {
        Call<OrderResponse> call = KBSProvider2ApiService.listAllDigitalOrders(apiKey, notify, fromDate, toDate);
        enqueueCall(call, callback);
    }

    public void listOrdersPlacedInCountry(String apiKey, String country, String fromDate, String toDate, ApiResponseCallback<OrderResponse> callback) {
        Call<OrderResponse> call = KBSProvider2ApiService.listOrdersPlacedInCountry(apiKey, country, fromDate, toDate);
        enqueueCall(call, callback);
    }

    public void listOrdersPlacedInBrand(String apiKey, String brandCode, String fromDate, String toDate, ApiResponseCallback<OrderResponse> callback) {
        Call<OrderResponse> call = KBSProvider2ApiService.listOrdersPlacedInBrand(apiKey, brandCode, fromDate, toDate);
        enqueueCall(call, callback);
    }

    public void listOrdersByPage(String apiKey, int page, String fromDate, String toDate, ApiResponseCallback<OrderResponse> callback) {
        Call<OrderResponse> call = KBSProvider2ApiService.listOrdersByPage(apiKey, page, fromDate, toDate);
        enqueueCall(call, callback);
    }

    public void getAllBrands(String apiKey, ApiResponseCallback<BrandResponse> callback) {
        Call<BrandResponse> call = KBSProvider2ApiService.getAllBrands(apiKey);
        enqueueCall(call, callback);
    }

    public void getBrandsByCountry(String apiKey, String country, ApiResponseCallback<BrandResponse> callback) {
        Call<BrandResponse> call = KBSProvider2ApiService.getBrandsByCountry(apiKey, country);
        enqueueCall(call, callback);
    }

    public void getBrandByCode(String apiKey, String brandCode, ApiResponseCallback<BrandResponse> callback) {
        Call<BrandResponse> call = KBSProvider2ApiService.getBrandByCode(apiKey, brandCode);
        enqueueCall(call, callback);
    }

    public void getBrandByName(String apiKey, String name, ApiResponseCallback<BrandResponse> callback) {
        Call<BrandResponse> call = KBSProvider2ApiService.getBrandByName(apiKey, name);
        enqueueCall(call, callback);
    }

    public void getActiveBrands(String apiKey, boolean isActive, ApiResponseCallback<BrandResponse> callback) {
        Call<BrandResponse> call = KBSProvider2ApiService.getActiveBrands(apiKey, isActive);
        enqueueCall(call, callback);
    }

    public void getBrandsByCategoryId(String apiKey, int categoryId, ApiResponseCallback<P2BrandResponse> callback) {
        Call<P2BrandResponse> call = KBSProvider2ApiService.getBrandsByCategoryId(apiKey, categoryId);
        enqueueCall(call, callback);
    }

    public void getBrandLocations(String apiKey, String brandCode, ApiResponseCallback<BrandLocationResponse> callback) {
        Call<BrandLocationResponse> call = KBSProvider2ApiService.getBrandLocations(apiKey, brandCode);
        enqueueCall(call, callback);
    }
    public void getLocationByCityId(String apiKey, String brandCode, String cityId, ApiResponseCallback<BrandLocationCityResponse> callback) {
        Call<BrandLocationCityResponse> call = KBSProvider2ApiService.getLocationByCityId(apiKey, brandCode, cityId);
        enqueueCall(call, callback);
    }
    public void getCategories(String apiKey, ApiResponseCallback<CategoryResponse> callback) {
        Call<CategoryResponse> call = KBSProvider2ApiService.getCategories(apiKey);
        enqueueCall(call, callback);
    }
    public void getCountries(String apiKey, ApiResponseCallback<CountryResponse> callback) {
        Call<CountryResponse> call = KBSProvider2ApiService.getCountries(apiKey);
        enqueueCall(call, callback);
    }

    public void getCurrencyExchangeRates(String apiKey, ApiResponseCallback<ExchangeRateResponse> callback) {
        Call<ExchangeRateResponse> call = KBSProvider2ApiService.getCurrencyRates(apiKey);
        enqueueCall(call, callback);
    }
    public void getCredentials(String apiKey, ApiResponseCallback<CredentialsResponse> callback) {
        Call<CredentialsResponse> call = KBSProvider2ApiService.getCredentials(apiKey);
        enqueueCall(call, callback);
    }
    public void generateCredentials(String apiKey, ApiResponseCallback<CredentialsGenerationResponse> callback) {
        Call<CredentialsGenerationResponse> call = KBSProvider2ApiService.generateCredentials(apiKey);
        enqueueCall(call, callback);
    }
    public void getBrandWebhooks(String apiKey, ApiResponseCallback<WebhooksResponse> callback) {
        Call<WebhooksResponse> call = KBSProvider2ApiService.getBrandWebhooks(apiKey);
        enqueueCall(call, callback);
    }
    public void activateWebhook(String apiKey, String webhookId, ApiResponseCallback<WebhooksActivationResponse> callback) {
        Call<WebhooksActivationResponse> call = KBSProvider2ApiService.activateWebhook(apiKey, webhookId);
        enqueueCall(call, callback);
    }

    public void deactivateWebhook(String apiKey, String webhookId, ApiResponseCallback<WebhooksDeactivationResponse> callback) {
        Call<WebhooksDeactivationResponse> call = KBSProvider2ApiService.deactivateWebhook(apiKey, webhookId);
        enqueueCall(call, callback);
    }

    public void createOrder(String apiKey, OrderCreateRequest request, ApiResponseCallback<OrderCreateResponse> callback) {
        Call<OrderCreateResponse> call = KBSProvider2ApiService.createOrder(apiKey, request);
        enqueueCall(call, callback);
    }

    public void topupAccount(String apiKey, TopupRequest request, ApiResponseCallback<TopupResponse> callback) {
        Call<TopupResponse> call = KBSProvider2ApiService.topupAccount(apiKey, request);
        enqueueCall(call, callback);
    }

    public void activateCredentials(String apiKey, CredentialActivationRequest request, ApiResponseCallback<CredentialActivationResponse> callback) {
        Call<CredentialActivationResponse> call = KBSProvider2ApiService.activateCredentials(apiKey, request);
        enqueueCall(call, callback);
    }

    public void createWebhook(String apiKey, WebhookCreateRequest request, ApiResponseCallback<WebhookCreateResponse> callback) {
        Call<WebhookCreateResponse> call = KBSProvider2ApiService.createWebhook(apiKey, request);
        enqueueCall(call, callback);
    }
    public void simulateWebhook(String apiKey, String webhookId, ApiResponseCallback<SimulateWebhookResponse> callback) {
        Call<SimulateWebhookResponse> call = KBSProvider2ApiService.simulateWebhook(apiKey, webhookId);
        enqueueCall(call, callback);
    }

    public void getGiftCardCategories(String apiKey, ApiResponseCallback<KBSCategoryResponse> callback) {
        Call<KBSCategoryResponse> call = KBSProvider2ApiService.getGiftCardCategories();
        enqueueCall(call, callback);
    }
    public void getKBSBrandsByCategoryId(String apiKey, int categoryId, ApiResponseCallback<KBSCategoryBrandResponse> callback) {
        Call<KBSCategoryBrandResponse> call = KBSProvider2ApiService.getBrandsByCategoryId(categoryId);
        enqueueCall(call, callback);
    }
    private <T> void enqueueCall(Call<T> call, ApiResponseCallback<T> callback) {
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed with code " + response.code());
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }

}
