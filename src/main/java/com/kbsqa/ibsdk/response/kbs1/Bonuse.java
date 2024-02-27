
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Bonuse {

    @SerializedName("BonusType")
    @Expose
    private String bonusType;
    @SerializedName("Quantity")
    @Expose
    private Integer quantity;
    @SerializedName("Validity")
    @Expose
    private Integer validity;

    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

}
