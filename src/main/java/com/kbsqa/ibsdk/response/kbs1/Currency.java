
package com.kbsqa.ibsdk.response.kbs1;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Currency {

    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<Object> errorCodes;
    @SerializedName("Items")
    @Expose
    private List<CurrencyItem> items;

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

    public List<CurrencyItem> getItems() {
        return items;
    }

    public void setItems(List<CurrencyItem> items) {
        this.items = items;
    }

}
