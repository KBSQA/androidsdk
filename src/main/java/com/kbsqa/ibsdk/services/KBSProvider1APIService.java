package com.kbsqa.ibsdk.services;

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

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface KBSProvider1APIService {

    @GET("/provider/kbs1/GetCurrencies")
    Call<Currency> getCurrencies(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs1/GetCountries")
    Call<Country> getCountries(@Header("x-api-key") String apiKey);

    @GET("/provider/kbs1/GetRegions")
    Call<Region> getRegions(
            @Query("countryIsos") List<String> countryIsos,
            @Header("x-api-key") String apiKey
    );

    @GET("/provider/kbs1/GetProviders")
    Call<Provider> getProviders(
            @Query("providerCodes") List<String> providerCodes,
            @Query("countryIsos") List<String> countryIsos,
            @Query("regionCodes") List<String> regionCodes,
            @Query("accountNumber") String accountNumber,
            @Header("x-api-key") String apiKey
    );



    @GET("/provider/kbs1/GetProviders")
    Call<Provider> getProvidersByCountryIsos(
            @Query("countryIsos") List<String> countryIsos,
            @Header("x-api-key") String apiKey
    );


    @GET("/provider/kbs1/GetProviderStatus")
    Call<ProviderStatus> getProviderStatus(
            @Query("providerCodes") List<String> providerCodes,
            @Header("x-api-key") String apiKey
    );
    @GET("/provider/kbs1/GetAccountLookup")
    Call<AccountLookup> getAccountLookup(
            @Query("accountNumber") String accountNumber,
            @Header("x-api-key") String apiKey
    );

    @GET("/provider/kbs1/GetErrorCodeDescriptions")
    Call<ErrorCodeDescription> getErrorCodeDescriptions(
            @Header("x-api-key") String apiKey
    );

    @GET("/provider/kbs1/GetPromotionDescriptions")
    Call<PromotionDescription> getPromotionDescriptions(
            @Query("languageCodes") List<String> languageCodes,
            @Header("x-api-key") String apiKey
    );

    @GET("/provider/kbs1/GetPromotions")
    Call<Promotion> getPromotions(
            @Query("countryIsos") List<String> countryIsos,
            @Query("providerCodes") List<String> providerCodes,
            @Query("accountNumber") String accountNumber,
            @Header("x-api-key") String apiKey
    );

    @GET("/provider/kbs1/GetBalance")
    Call<Balance> getBalance(
            @Header("x-api-key") String apiKey
//            @Header("Authorization") String authorizationHeader
    );

    @GET("/provider/kbs1/GetProductDescriptions")
    Call<ProductDescription> getProductDescriptions(
            @Query("languageCodes") List<String> languageCodes,
            @Query("skuCodes") List<String> skuCodes,
            @Header("x-api-key") String apiKey
    );

    @GET("/provider/kbs1/GetProducts")
    Call<Product> getProducts(
            @Query("countryIsos") List<String> countryIsos,
            @Query("providerCodes") List<String> providerCodes,
            @Query("skuCodes") List<String> skuCodes,
            @Query("benefits") List<String> benefits,
            @Query("regionCodes") List<String> regionCodes,
            @Query("accountNumber") String accountNumber,
            @Header("x-api-key") String apiKey
    );



    @POST("/provider/kbs1/SendTransfer")
    Call<TransferRecordResponse> sendTransfer(
            @Header("x-api-key") String apiKey,
            @Header("Content-Type") String contentType,
            @Body SendTransferRequest requestBody
    );

    @POST("/provider/kbs1/EstimatePrices")
    Call<EstimatePrice> estimatePrices(
            @Header("x-api-key") String apiKey,
            @Header("Content-Type") String contentType,
            @Body List<EstimatePriceRequest> requestBody
    );

    @POST("/provider/kbs1/ListTransferRecords")
    Call<ListTransferRecord> listTransferRecords(
            @Header("x-api-key") String apiKey,
            @Header("Content-Type") String contentType,
            @Body ListTransferRecordRequest requestBody
    );

    @POST("/provider/kbs1/CancelTransfers")
    Call<CancelTransfer> cancelTransfers(
            @Header("x-api-key") String apiKey,
            @Header("Content-Type") String contentType,
            @Body CancelTransfersRequest requestBody
    );

    @POST("/provider/kbs1/LookupBills")
    Call<LookupBill> lookupBills(
            @Header("x-api-key") String apiKey,
            @Header("Content-Type") String contentType,
            @Body LookupBillsRequest requestBody
    );

    @GET("/provider/kbs1-provider/")
    Call<KBSP1ProviderResponse> getKBSProviders(
//            @Header("x-api-key") String apiKey
    );
    @GET("/provider/kbs1-product/")
    Call<KBSP1ProductResponse> getKBSProducts(
//            @Header("x-api-key") String apiKey
    );
}
