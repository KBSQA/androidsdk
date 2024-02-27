
package com.kbsqa.ibsdk.response.module;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiModule {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("moduleOrServiceName")
    @Expose
    private String moduleOrServiceName;
    @SerializedName("apiPath")
    @Expose
    private String apiPath;
    @SerializedName("providerName")
    @Expose
    private String providerName;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleOrServiceName() {
        return moduleOrServiceName;
    }

    public void setModuleOrServiceName(String moduleOrServiceName) {
        this.moduleOrServiceName = moduleOrServiceName;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
