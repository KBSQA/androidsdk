package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KBSCategoryBrandResponse {
    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("data")
    @Expose
    private List<P2Brand> data;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<P2Brand> getData() {
        return data;
    }

    public void setData(List<P2Brand> data) {
        this.data = data;
    }
}
