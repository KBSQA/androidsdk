
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AccountResponse {

    @SerializedName("account")
    @Expose
    private String account;
    @SerializedName("balance_amount")
    @Expose
    private BalanceAmount balanceAmount;
    @SerializedName("custom_sms_message")
    @Expose
    private String customSmsMessage;
    @SerializedName("order_validity_month")
    @Expose
    private String orderValidityMonth;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public BalanceAmount getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BalanceAmount balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getCustomSmsMessage() {
        return customSmsMessage;
    }

    public void setCustomSmsMessage(String customSmsMessage) {
        this.customSmsMessage = customSmsMessage;
    }

    public String getOrderValidityMonth() {
        return orderValidityMonth;
    }

    public void setOrderValidityMonth(String orderValidityMonth) {
        this.orderValidityMonth = orderValidityMonth;
    }

}
