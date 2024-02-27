package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LookupBillItem {

    @SerializedName("Price")
    @Expose
    private Price price;
    @SerializedName("BillRef")
    @Expose
    private String billRef;
    @SerializedName("AdditionalInfo")
    @Expose
    private AdditionalInfo additionalInfo;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getBillRef() {
        return billRef;
    }

    public void setBillRef(String billRef) {
        this.billRef = billRef;
    }

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

}