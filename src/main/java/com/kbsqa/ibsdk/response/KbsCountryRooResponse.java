
package com.kbsqa.ibsdk.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KbsCountryRooResponse {

    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("data")
    @Expose
    private List<KbsCountry> data;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<KbsCountry> getData() {
        return data;
    }

    public void setData(List<KbsCountry> data) {
        this.data = data;
    }

}
