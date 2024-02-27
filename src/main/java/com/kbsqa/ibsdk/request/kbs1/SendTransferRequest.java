
package com.kbsqa.ibsdk.request.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class SendTransferRequest implements Serializable {

    @SerializedName("SkuCode")
    @Expose
    private String skuCode;
    @SerializedName("SendValue")
    @Expose
    private Integer sendValue;
    @SerializedName("SendCurrencyIso")
    @Expose
    private String sendCurrencyIso;
    @SerializedName("AccountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("DistributorRef")
    @Expose
    private String distributorRef;
    @SerializedName("Settings")
    @Expose
    private List<Setting> settings;
    @SerializedName("ValidateOnly")
    @Expose
    private Boolean validateOnly;
    @SerializedName("BillRef")
    @Expose
    private String billRef;

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDistributorRef() {
        return distributorRef;
    }

    public void setDistributorRef(String distributorRef) {
        this.distributorRef = distributorRef;
    }

    public List<Setting> getSettings() {
        return settings;
    }

    public void setSettings(List<Setting> settings) {
        this.settings = settings;
    }

    public Boolean getValidateOnly() {
        return validateOnly;
    }

    public void setValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
    }

    public String getBillRef() {
        return billRef;
    }

    public void setBillRef(String billRef) {
        this.billRef = billRef;
    }

}
