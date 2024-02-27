
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InternationalDialingInformation {

    @SerializedName("Prefix")
    @Expose
    private String prefix;
    @SerializedName("MinimumLength")
    @Expose
    private Integer minimumLength;
    @SerializedName("MaximumLength")
    @Expose
    private Integer maximumLength;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getMinimumLength() {
        return minimumLength;
    }

    public void setMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
    }

    public Integer getMaximumLength() {
        return maximumLength;
    }

    public void setMaximumLength(Integer maximumLength) {
        this.maximumLength = maximumLength;
    }

}
