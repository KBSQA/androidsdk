
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PromotionItem {

    @SerializedName("ProviderCode")
    @Expose
    private String providerCode;
    @SerializedName("StartUtc")
    @Expose
    private String startUtc;
    @SerializedName("EndUtc")
    @Expose
    private String endUtc;
    @SerializedName("CurrencyIso")
    @Expose
    private String currencyIso;
    @SerializedName("ValidityPeriodIso")
    @Expose
    private String validityPeriodIso;
    @SerializedName("MinimumSendAmount")
    @Expose
    private Integer minimumSendAmount;
    @SerializedName("LocalizationKey")
    @Expose
    private String localizationKey;

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getStartUtc() {
        return startUtc;
    }

    public void setStartUtc(String startUtc) {
        this.startUtc = startUtc;
    }

    public String getEndUtc() {
        return endUtc;
    }

    public void setEndUtc(String endUtc) {
        this.endUtc = endUtc;
    }

    public String getCurrencyIso() {
        return currencyIso;
    }

    public void setCurrencyIso(String currencyIso) {
        this.currencyIso = currencyIso;
    }

    public String getValidityPeriodIso() {
        return validityPeriodIso;
    }

    public void setValidityPeriodIso(String validityPeriodIso) {
        this.validityPeriodIso = validityPeriodIso;
    }

    public Integer getMinimumSendAmount() {
        return minimumSendAmount;
    }

    public void setMinimumSendAmount(Integer minimumSendAmount) {
        this.minimumSendAmount = minimumSendAmount;
    }

    public String getLocalizationKey() {
        return localizationKey;
    }

    public void setLocalizationKey(String localizationKey) {
        this.localizationKey = localizationKey;
    }

}
