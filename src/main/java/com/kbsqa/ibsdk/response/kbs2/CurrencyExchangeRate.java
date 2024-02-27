
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CurrencyExchangeRate {

    @SerializedName("base_currency")
    @Expose
    private String baseCurrency;
    @SerializedName("conversion_rates")
    @Expose
    private ConversionRates conversionRates;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public ConversionRates getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(ConversionRates conversionRates) {
        this.conversionRates = conversionRates;
    }

}
