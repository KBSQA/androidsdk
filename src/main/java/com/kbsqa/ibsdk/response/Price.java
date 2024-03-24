
package com.kbsqa.ibsdk.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Price {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("prices")
    @Expose
    private List<Object> prices;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Object> getPrices() {
        return prices;
    }

    public void setPrices(List<Object> prices) {
        this.prices = prices;
    }

    //    public List<Integer> getPrices() {
//        return prices;
//    }
//
//    public void setPrices(List<Integer> prices) {
//        this.prices = prices;
//    }

}
