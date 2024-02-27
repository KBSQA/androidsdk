package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ListTransferRecord {

    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<ErrorCode> errorCodes;
    @SerializedName("Items")
    @Expose
    private List<ListTransferRecordItem> listTransferRecordItems;
    @SerializedName("ThereAreMoreItems")
    @Expose
    private Boolean thereAreMoreItems;

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

    public List<ListTransferRecordItem> getItems() {
        return listTransferRecordItems;
    }

    public void setItems(List<ListTransferRecordItem> listTransferRecordItems) {
        this.listTransferRecordItems = listTransferRecordItems;
    }

    public Boolean getThereAreMoreItems() {
        return thereAreMoreItems;
    }

    public void setThereAreMoreItems(Boolean thereAreMoreItems) {
        this.thereAreMoreItems = thereAreMoreItems;
    }

}