package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KBSP1ProductResponse {
    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("data")
    @Expose
    private List<ProductItem> data;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ProductItem> getData() {
        return data;
    }

    public void setData(List<ProductItem> data) {
        this.data = data;
    }
}
