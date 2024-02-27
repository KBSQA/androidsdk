
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class PromotionDescription {

    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<ErrorCode> errorCodes;
    @SerializedName("Items")
    @Expose
    private List<PromotionDescriptionItem> promotionDescriptionItems;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public List<ErrorCode> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(List<ErrorCode> errorCodes) {
        this.errorCodes = errorCodes;
    }

    public List<PromotionDescriptionItem> getItems() {
        return promotionDescriptionItems;
    }

    public void setItems(List<PromotionDescriptionItem> promotionDescriptionItems) {
        this.promotionDescriptionItems = promotionDescriptionItems;
    }

}
