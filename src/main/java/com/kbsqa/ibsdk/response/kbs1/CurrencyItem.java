
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CurrencyItem {

    @SerializedName("CurrencyIso")
    @Expose
    private String currencyIso;
    @SerializedName("CurrencyName")
    @Expose
    private String currencyName;

    public String getCurrencyIso() {
        return currencyIso;
    }

    public void setCurrencyIso(String currencyIso) {
        this.currencyIso = currencyIso;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

}
