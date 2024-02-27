
package com.kbsqa.ibsdk.request.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ExchangeRate {

    @SerializedName("base_currency")
    @Expose
    private String baseCurrency;
    @SerializedName("target_currency")
    @Expose
    private String targetCurrency;
    @SerializedName("conversion_rate")
    @Expose
    private Double conversionRate;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

}
