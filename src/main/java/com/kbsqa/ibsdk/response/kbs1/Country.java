
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Country {

    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<Object> errorCodes;
    @SerializedName("Items")
    @Expose
    private List<CountryItem> countryItems;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public List<Object> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(List<Object> errorCodes) {
        this.errorCodes = errorCodes;
    }

    public List<CountryItem> getItems() {
        return countryItems;
    }

    public void setItems(List<CountryItem> countryItems) {
        this.countryItems = countryItems;
    }

    @Override
    public String toString() {
        return "BrandCountry{" +
                "resultCode=" + resultCode +
                ", errorCodes=" + errorCodes +
                ", countryItems=" + countryItems +
                '}';
    }
}
