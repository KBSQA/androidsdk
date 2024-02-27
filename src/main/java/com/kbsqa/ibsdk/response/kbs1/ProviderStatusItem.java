package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ProviderStatusItem {

    @SerializedName("ProviderCode")
    @Expose
    private String providerCode;
    @SerializedName("IsProcessingTransfers")
    @Expose
    private Boolean isProcessingTransfers;
    @SerializedName("Message")
    @Expose
    private String message;

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public Boolean getIsProcessingTransfers() {
        return isProcessingTransfers;
    }

    public void setIsProcessingTransfers(Boolean isProcessingTransfers) {
        this.isProcessingTransfers = isProcessingTransfers;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
