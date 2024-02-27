
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ErrorCode {

    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Context")
    @Expose
    private String context;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

}
