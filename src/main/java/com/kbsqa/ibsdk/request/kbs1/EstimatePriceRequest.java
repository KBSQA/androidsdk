package com.kbsqa.ibsdk.request.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class EstimatePriceRequest implements Serializable {

    @SerializedName("SendValue")
    @Expose
    private Integer sendValue;
    @SerializedName("SendCurrencyIso")
    @Expose
    private String sendCurrencyIso;
    @SerializedName("ReceiveValue")
    @Expose
    private Integer receiveValue;
    @SerializedName("SkuCode")
    @Expose
    private String skuCode;
    @SerializedName("BatchItemRef")
    @Expose
    private String batchItemRef;

    public Integer getSendValue() {
        return sendValue;
    }

    public void setSendValue(Integer sendValue) {
        this.sendValue = sendValue;
    }

    public String getSendCurrencyIso() {
        return sendCurrencyIso;
    }

    public void setSendCurrencyIso(String sendCurrencyIso) {
        this.sendCurrencyIso = sendCurrencyIso;
    }

    public Integer getReceiveValue() {
        return receiveValue;
    }

    public void setReceiveValue(Integer receiveValue) {
        this.receiveValue = receiveValue;
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

}