
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Minimum {

    @SerializedName("CustomerFee")
    @Expose
    private Integer customerFee;
    @SerializedName("DistributorFee")
    @Expose
    private Integer distributorFee;
    @SerializedName("ReceiveValue")
    @Expose
    private Integer receiveValue;
    @SerializedName("ReceiveCurrencyIso")
    @Expose
    private String receiveCurrencyIso;
    @SerializedName("ReceiveValueExcludingTax")
    @Expose
    private Integer receiveValueExcludingTax;
    @SerializedName("TaxRate")
    @Expose
    private Integer taxRate;
    @SerializedName("TaxName")
    @Expose
    private String taxName;
    @SerializedName("TaxCalculation")
    @Expose
    private String taxCalculation;
    @SerializedName("SendValue")
    @Expose
    private Integer sendValue;
    @SerializedName("SendCurrencyIso")
    @Expose
    private String sendCurrencyIso;

    public Integer getCustomerFee() {
        return customerFee;
    }

    public void setCustomerFee(Integer customerFee) {
        this.customerFee = customerFee;
    }

    public Integer getDistributorFee() {
        return distributorFee;
    }

    public void setDistributorFee(Integer distributorFee) {
        this.distributorFee = distributorFee;
    }

    public Integer getReceiveValue() {
        return receiveValue;
    }

    public void setReceiveValue(Integer receiveValue) {
        this.receiveValue = receiveValue;
    }

    public String getReceiveCurrencyIso() {
        return receiveCurrencyIso;
    }

    public void setReceiveCurrencyIso(String receiveCurrencyIso) {
        this.receiveCurrencyIso = receiveCurrencyIso;
    }

    public Integer getReceiveValueExcludingTax() {
        return receiveValueExcludingTax;
    }

    public void setReceiveValueExcludingTax(Integer receiveValueExcludingTax) {
        this.receiveValueExcludingTax = receiveValueExcludingTax;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public String getTaxCalculation() {
        return taxCalculation;
    }

    public void setTaxCalculation(String taxCalculation) {
        this.taxCalculation = taxCalculation;
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

}
