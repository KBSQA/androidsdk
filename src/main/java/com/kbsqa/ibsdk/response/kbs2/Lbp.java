
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Lbp {

    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
