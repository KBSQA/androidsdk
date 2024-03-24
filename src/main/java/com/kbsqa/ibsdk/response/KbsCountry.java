
package com.kbsqa.ibsdk.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class KbsCountry {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("countryIso")
    @Expose
    private String countryIso;
    @SerializedName("isEnable")
    @Expose
    private Boolean isEnable;
    @SerializedName("serviceCategoryId")
    @Expose
    private String serviceCategoryId;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public String getServiceCategoryId() {
        return serviceCategoryId;
    }

    public void setServiceCategoryId(String serviceCategoryId) {
        this.serviceCategoryId = serviceCategoryId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
