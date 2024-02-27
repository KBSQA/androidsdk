
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ProductDescription {

    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<ErrorCode> errorCodes;
    @SerializedName("Items")
    @Expose
    private List<ProductDescriptionItem> productDescriptionItems;

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

    public List<ProductDescriptionItem> getItems() {
        return productDescriptionItems;
    }

    public void setItems(List<ProductDescriptionItem> productDescriptionItems) {
        this.productDescriptionItems = productDescriptionItems;
    }

}
