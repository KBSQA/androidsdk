
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UtilizedDetails {

    @SerializedName("redemption_reference_id")
    @Expose
    private String redemptionReferenceId;
    @SerializedName("redemption_id")
    @Expose
    private String redemptionId;
    @SerializedName("utilized_date")
    @Expose
    private String utilizedDate;
    @SerializedName("brand_code")
    @Expose
    private String brandCode;

    public String getRedemptionReferenceId() {
        return redemptionReferenceId;
    }

    public void setRedemptionReferenceId(String redemptionReferenceId) {
        this.redemptionReferenceId = redemptionReferenceId;
    }

    public String getRedemptionId() {
        return redemptionId;
    }

    public void setRedemptionId(String redemptionId) {
        this.redemptionId = redemptionId;
    }

    public String getUtilizedDate() {
        return utilizedDate;
    }

    public void setUtilizedDate(String utilizedDate) {
        this.utilizedDate = utilizedDate;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

}
