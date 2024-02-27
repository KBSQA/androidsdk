package com.kbsqa.ibsdk.rest;

import com.kbsqa.ibsdk.request.kbs1.CancelTransfersRequest;
import com.kbsqa.ibsdk.request.kbs1.EstimatePriceRequest;
import com.kbsqa.ibsdk.request.kbs1.ListTransferRecordRequest;
import com.kbsqa.ibsdk.request.kbs1.LookupBillsRequest;
import com.kbsqa.ibsdk.request.kbs1.SendTransferRequest;
import com.kbsqa.ibsdk.response.kbs1.AccountLookup;
import com.kbsqa.ibsdk.response.kbs1.Balance;
import com.kbsqa.ibsdk.response.kbs1.CancelTransfer;
import com.kbsqa.ibsdk.response.kbs1.Country;
import com.kbsqa.ibsdk.response.kbs1.Currency;
import com.kbsqa.ibsdk.response.kbs1.ErrorCodeDescription;
import com.kbsqa.ibsdk.response.kbs1.EstimatePrice;
import com.kbsqa.ibsdk.response.kbs1.KBSP1ProductResponse;
import com.kbsqa.ibsdk.response.kbs1.KBSP1ProviderResponse;
import com.kbsqa.ibsdk.response.kbs1.ListTransferRecord;
import com.kbsqa.ibsdk.response.kbs1.LookupBill;
import com.kbsqa.ibsdk.response.kbs1.Product;
import com.kbsqa.ibsdk.response.kbs1.ProductDescription;
import com.kbsqa.ibsdk.response.kbs1.Promotion;
import com.kbsqa.ibsdk.response.kbs1.PromotionDescription;
import com.kbsqa.ibsdk.response.kbs1.Provider;
import com.kbsqa.ibsdk.response.kbs1.ProviderStatus;
import com.kbsqa.ibsdk.response.kbs1.Region;
import com.kbsqa.ibsdk.response.kbs1.TransferRecordResponse;
import com.kbsqa.ibsdk.services.KBSProvider1APIService;
import com.kbsqa.ibsdk.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A manager class for handling Retrofit calls to fetch data.
 */
public class KBSProvider1ApiHandler {

    KBSProvider1APIService KBSProvider1APIService;

    public KBSProvider1ApiHandler() {
        KBSProvider1APIService = RetrofitClient.getRetrofit().create(KBSProvider1APIService.class);
    }

    public void getCurrencies(String apiKey, final ApiResponseCallback<Currency> callback) {
        Call<Currency> call = KBSProvider1APIService.getCurrencies(apiKey);
        enqueueCall(call, callback);
    }

    public void getCountries(String apiKey, final ApiResponseCallback<Country> callback) {
        Call<Country> call = KBSProvider1APIService.getCountries(apiKey);
        enqueueCall(call, callback);
    }

    public void getRegions(String apiKey, List<String> countryIsos, final ApiResponseCallback<Region> callback) {
        Call<Region> call = KBSProvider1APIService.getRegions(countryIsos, apiKey);
        enqueueCall(call, callback);
    }

    public void getProviders(List<String> providerCodes, List<String> countryIsos, List<String> regionCodes, String accountNumber, String apiKey, final ApiResponseCallback<Provider> callback) {
        Call<Provider> call = KBSProvider1APIService.getProviders(providerCodes, countryIsos, regionCodes, accountNumber, apiKey);
        enqueueCall(call, callback);
    }
    public void getProvidersByCountryIsos(List<String> countryIsos, String apiKey, final ApiResponseCallback<Provider> callback) {
        Call<Provider> call = KBSProvider1APIService.getProvidersByCountryIsos(countryIsos, apiKey);
        enqueueCall(call, callback);
    }

    public void getProviderStatus(List<String> providerCodes, String apiKey, final ApiResponseCallback<ProviderStatus> callback) {
        Call<ProviderStatus> call = KBSProvider1APIService.getProviderStatus(providerCodes, apiKey);
        enqueueCall(call, callback);
    }

    public void getAccountLookup(String accountNumber, String apiKey, final ApiResponseCallback<AccountLookup> callback) {
        Call<AccountLookup> call = KBSProvider1APIService.getAccountLookup(accountNumber, apiKey);
        enqueueCall(call, callback);
    }

    public void getErrorCodeDescriptions(String apiKey, final ApiResponseCallback<ErrorCodeDescription> callback) {
        Call<ErrorCodeDescription> call = KBSProvider1APIService.getErrorCodeDescriptions(apiKey);
        enqueueCall(call, callback);
    }

    public void getPromotionDescriptions(List<String> languageCodes, String apiKey, final ApiResponseCallback<PromotionDescription> callback) {
        Call<PromotionDescription> call = KBSProvider1APIService.getPromotionDescriptions(languageCodes, apiKey);
        enqueueCall(call, callback);
    }

    public void getPromotions(List<String> countryIsos, List<String> providerCodes, String accountNumber, String apiKey, final ApiResponseCallback<Promotion> callback) {
        Call<Promotion> call = KBSProvider1APIService.getPromotions(countryIsos, providerCodes, accountNumber, apiKey);
        enqueueCall(call, callback);
    }
    public void getBalance(String apiKey, final ApiResponseCallback<Balance> callback) {
        Call<Balance> call = KBSProvider1APIService.getBalance(apiKey);
        enqueueCall(call, callback);
    }
    public void getProductDescriptions(List<String> languageCodes, List<String> skuCodes, String apiKey, final ApiResponseCallback<ProductDescription> callback) {
        Call<ProductDescription> call = KBSProvider1APIService.getProductDescriptions(languageCodes, skuCodes, apiKey);
        enqueueCall(call, callback);
    }
    public void getProducts(List<String> countryIsos, List<String> providerCodes, List<String> skuCodes, List<String> benefits, List<String> regionCodes, String accountNumber, String apiKey, final ApiResponseCallback<Product> callback) {
        Call<Product> call = KBSProvider1APIService.getProducts(countryIsos, providerCodes, skuCodes, benefits, regionCodes, accountNumber, apiKey);
        enqueueCall(call, callback);
    }


    public void sendTransfer(String apiKey, SendTransferRequest request, final ApiResponseCallback<TransferRecordResponse> callback) {
        Call<TransferRecordResponse> call = KBSProvider1APIService.sendTransfer(apiKey, "application/json", request);
        enqueueCall(call, callback);
    }
    public void estimatePrices(String apiKey, List<EstimatePriceRequest> request, final ApiResponseCallback<EstimatePrice> callback) {
        Call<EstimatePrice> call = KBSProvider1APIService.estimatePrices(apiKey, "application/json", request);
        enqueueCall(call, callback);
    }
    public void listTransferRecords(String apiKey, ListTransferRecordRequest request, final ApiResponseCallback<ListTransferRecord> callback) {
        Call<ListTransferRecord> call = KBSProvider1APIService.listTransferRecords(apiKey, "application/json", request);
        enqueueCall(call, callback);
    }
    public void cancelTransfers(String apiKey, CancelTransfersRequest request, final ApiResponseCallback<CancelTransfer> callback) {
        Call<CancelTransfer> call = KBSProvider1APIService.cancelTransfers(apiKey, "application/json", request);
        enqueueCall(call, callback);
    }
    public void lookupBills(String apiKey, LookupBillsRequest request, final ApiResponseCallback<LookupBill> callback) {
        Call<LookupBill> call = KBSProvider1APIService.lookupBills(apiKey, "application/json", request);
        enqueueCall(call, callback);
    }

    public void getKBSProducts(final ApiResponseCallback<KBSP1ProductResponse> callback) {
        Call<KBSP1ProductResponse> call = KBSProvider1APIService.getKBSProducts();
        enqueueCall(call, callback);
    }

    public void getKBSProviders(final ApiResponseCallback<KBSP1ProviderResponse> callback) {
        Call<KBSP1ProviderResponse> call = KBSProvider1APIService.getKBSProviders();
        enqueueCall(call, callback);
    }

    private <T> void enqueueCall(Call<T> call, ApiResponseCallback<T> callback) {
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed with code " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }





}
