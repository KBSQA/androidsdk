package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorCodeDescription {

    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<Object> errorCodes;
    @SerializedName("Items")
    @Expose
    private List<ErrorCodeDescriptionItem> errorCodeDescriptionItems;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public List<Object> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(List<Object> errorCodes) {
        this.errorCodes = errorCodes;
    }

    public List<ErrorCodeDescriptionItem> getItems() {
        return errorCodeDescriptionItems;
    }

    public void setItems(List<ErrorCodeDescriptionItem> errorCodeDescriptionItems) {
        this.errorCodeDescriptionItems = errorCodeDescriptionItems;
    }

}