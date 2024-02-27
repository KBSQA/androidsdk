
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TransferRecord {

    @SerializedName("TransferId")
    @Expose
    private TransferId transferId;
    @SerializedName("SkuCode")
    @Expose
    private String skuCode;
    @SerializedName("Price")
    @Expose
    private Price price;
    @SerializedName("CommissionApplied")
    @Expose
    private Integer commissionApplied;
    @SerializedName("StartedUtc")
    @Expose
    private String startedUtc;
    @SerializedName("CompletedUtc")
    @Expose
    private String completedUtc;
    @SerializedName("ProcessingState")
    @Expose
    private String processingState;
    @SerializedName("ReceiptText")
    @Expose
    private String receiptText;
    @SerializedName("ReceiptParams")
    @Expose
    private ReceiptParams receiptParams;
    @SerializedName("AccountNumber")
    @Expose
    private String accountNumber;

    public TransferId getTransferId() {
        return transferId;
    }

    public void setTransferId(TransferId transferId) {
        this.transferId = transferId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Integer getCommissionApplied() {
        return commissionApplied;
    }

    public void setCommissionApplied(Integer commissionApplied) {
        this.commissionApplied = commissionApplied;
    }

    public String getStartedUtc() {
        return startedUtc;
    }

    public void setStartedUtc(String startedUtc) {
        this.startedUtc = startedUtc;
    }

    public String getCompletedUtc() {
        return completedUtc;
    }

    public void setCompletedUtc(String completedUtc) {
        this.completedUtc = completedUtc;
    }

    public String getProcessingState() {
        return processingState;
    }

    public void setProcessingState(String processingState) {
        this.processingState = processingState;
    }

    public String getReceiptText() {
        return receiptText;
    }

    public void setReceiptText(String receiptText) {
        this.receiptText = receiptText;
    }

    public ReceiptParams getReceiptParams() {
        return receiptParams;
    }

    public void setReceiptParams(ReceiptParams receiptParams) {
        this.receiptParams = receiptParams;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
