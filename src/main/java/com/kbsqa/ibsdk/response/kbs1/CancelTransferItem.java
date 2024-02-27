package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CancelTransferItem {

    @SerializedName("TransferId")
    @Expose
    private TransferId transferId;
    @SerializedName("ProcessingState")
    @Expose
    private String processingState;
    @SerializedName("BatchItemRef")
    @Expose
    private String batchItemRef;
    @SerializedName("ResultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("ErrorCodes")
    @Expose
    private List<ErrorCode> errorCodes;

    public TransferId getTransferId() {
        return transferId;
    }

    public void setTransferId(TransferId transferId) {
        this.transferId = transferId;
    }

    public String getProcessingState() {
        return processingState;
    }

    public void setProcessingState(String processingState) {
        this.processingState = processingState;
    }

    public String getBatchItemRef() {
        return batchItemRef;
    }

    public void setBatchItemRef(String batchItemRef) {
        this.batchItemRef = batchItemRef;
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