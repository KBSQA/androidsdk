package com.kbsqa.ibsdk.request.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopupResponse {

    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("balance_amount")
    @Expose
    private BalanceAmount balanceAmount;
    @SerializedName("reference_id")
    @Expose
    private String referenceId;
    @SerializedName("topup_id")
    @Expose
    private Integer topupId;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BalanceAmount getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BalanceAmount balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Integer getTopupId() {
        return topupId;
    }

    public void setTopupId(Integer topupId) {
        this.topupId = topupId;
    }

}
