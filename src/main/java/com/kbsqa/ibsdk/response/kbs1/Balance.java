package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Balance {

    @SerializedName("Balance")
    @Expose
    private Integer balance;
    @SerializedName("CurrencyIso")
    @Expose
    private String currencyIso;
    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<ErrorCode> errorCodes;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getCurrencyIso() {
        return currencyIso;
    }

    public void setCurrencyIso(String currencyIso) {
        this.currencyIso = currencyIso;
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
