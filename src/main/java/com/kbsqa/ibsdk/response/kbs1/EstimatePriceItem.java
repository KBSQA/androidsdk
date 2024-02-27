package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class EstimatePriceItem {

    @SerializedName("Price")
    @Expose
    private Price price;
    @SerializedName("SkuCode")
    @Expose
    private String skuCode;
    @SerializedName("BatchItemRef")
    @Expose
    private String batchItemRef;
    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<ErrorCode> errorCodes;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getBatchItemRef() {
        return batchItemRef;
    }

    public void setBatchItemRef(String batchItemRef) {
        this.batchItemRef = batchItemRef;
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
