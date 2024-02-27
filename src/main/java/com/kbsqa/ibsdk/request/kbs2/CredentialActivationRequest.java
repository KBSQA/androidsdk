package com.kbsqa.ibsdk.request.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CredentialActivationRequest {

    @SerializedName("apiKey")
    @Expose
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

}
