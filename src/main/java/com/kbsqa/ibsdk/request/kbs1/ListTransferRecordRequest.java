package com.kbsqa.ibsdk.request.kbs1;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ListTransferRecordRequest implements Serializable {

    @SerializedName("TransferRef")
    @Expose
    private String transferRef;
    @SerializedName("DistributorRef")
    @Expose
    private String distributorRef;
    @SerializedName("AccountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("Skip")
    @Expose
    private Integer skip;
    @SerializedName("Take")
    @Expose
    private Integer take;

    public String getTransferRef() {
        return transferRef;
    }

    public void setTransferRef(String transferRef) {
        this.transferRef = transferRef;
    }

    public String getDistributorRef() {
        return distributorRef;
    }

    public void setDistributorRef(String distributorRef) {
        this.distributorRef = distributorRef;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public Integer getTake() {
        return take;
    }

    public void setTake(Integer take) {
        this.take = take;
    }

}