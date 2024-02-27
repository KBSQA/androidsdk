package com.kbsqa.ibsdk.response.kbs2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CredentialsGenerationResponse {

    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("api_key")
    @Expose
    private String apiKey;
    @SerializedName("api_secret")
    @Expose
    private String apiSecret;
    @SerializedName("expiry_date")
    @Expose
    private String expiryDate;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
