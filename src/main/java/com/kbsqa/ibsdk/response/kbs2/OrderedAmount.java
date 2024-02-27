
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderedAmount {

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("amount")
    @Expose
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
