package com.kbsqa.ibsdk.request.kbs2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ExtraFields {

    @SerializedName("department")
    @Expose
    private String department;
    @SerializedName("custuomer_id")
    @Expose
    private String custuomerId;
    @SerializedName("pi_12")
    @Expose
    private String pi12;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCustuomerId() {
        return custuomerId;
    }

    public void setCustuomerId(String custuomerId) {
        this.custuomerId = custuomerId;
    }

    public String getPi12() {
        return pi12;
    }

    public void setPi12(String pi12) {
        this.pi12 = pi12;
    }

}
