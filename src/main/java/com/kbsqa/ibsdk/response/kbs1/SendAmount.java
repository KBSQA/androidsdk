
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SendAmount {

    @SerializedName("Minimum")
    @Expose
    private Integer minimum;
    @SerializedName("Maximum")
    @Expose
    private Integer maximum;
    @SerializedName("Bonuses")
    @Expose
    private List<Bonuse> bonuses;

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    public List<Bonuse> getBonuses() {
        return bonuses;
    }

    public void setBonuses(List<Bonuse> bonuses) {
        this.bonuses = bonuses;
    }

}
