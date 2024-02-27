package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AccountLookup {

    @SerializedName("CountryIso")
    @Expose
    private String countryIso;
    @SerializedName("AccountNumberNormalized")
    @Expose
    private String accountNumberNormalized;
    @SerializedName("Items")
    @Expose
    private List<AccountLookupItem> items;
    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<ErrorCode> errorCodes;

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public String getAccountNumberNormalized() {
        return accountNumberNormalized;
    }

    public void setAccountNumberNormalized(String accountNumberNormalized) {
        this.accountNumberNormalized = accountNumberNormalized;
    }

    public List<AccountLookupItem> getItems() {
        return items;
    }

    public void setItems(List<AccountLookupItem> items) {
        this.items = items;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public List<ErrorCode> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(List<ErrorCode> errorCodes) {
        this.errorCodes = errorCodes;
    }

}