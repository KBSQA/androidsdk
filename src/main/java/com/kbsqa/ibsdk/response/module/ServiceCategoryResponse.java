
package com.kbsqa.ibsdk.response.module;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ServiceCategoryResponse {

    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("data")
    @Expose
    private List<ServiceCategory> data;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ServiceCategory> getData() {
        return data;
    }

    public void setData(List<ServiceCategory> data) {
        this.data = data;
    }

}
