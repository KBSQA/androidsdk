
package com.kbsqa.ibsdk.response.module;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiModuleResponse {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("moduleOrServiceName")
    @Expose
    private String moduleOrServiceName;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("categoryId")
    @Expose
    private ServiceCategory serviceCategory;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }
}
