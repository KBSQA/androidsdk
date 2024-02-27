package com.kbsqa.ibsdk.request.kbs1;


import com.kbsqa.ibsdk.response.kbs1.TransferId;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class CancelTransfersRequest implements Serializable {

    @SerializedName("TransferId")
    @Expose
    private TransferId transferId;
    @SerializedName("BatchItemRef")
    @Expose
    private String batchItemRef;

    public TransferId getTransferId() {
        return transferId;
    }

    public void setTransferId(TransferId transferId) {
        this.transferId = transferId;
    }

    public String getBatchItemRef() {
        return batchItemRef;
    }

    public void setBatchItemRef(String batchItemRef) {
        this.batchItemRef = batchItemRef;
    }

}
