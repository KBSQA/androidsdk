package com.kbsqa.ibsdk.response.kbs1;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ListTransferRecordItem {

    @SerializedName("TransferRecord")
    @Expose
    private TransferRecord transferRecord;
    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<ErrorCode> errorCodes;

    public TransferRecord getTransferRecord() {
        return transferRecord;
    }

    public void setTransferRecord(TransferRecord transferRecord) {
        this.transferRecord = transferRecord;
    }

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

}
