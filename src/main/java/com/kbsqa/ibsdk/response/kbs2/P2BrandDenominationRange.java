package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.SerializedName;

public class P2BrandDenominationRange {
    @SerializedName("min")
    private int min;

    @SerializedName("max")
    private int max;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
