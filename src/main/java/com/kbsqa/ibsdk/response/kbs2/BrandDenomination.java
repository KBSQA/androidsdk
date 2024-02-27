package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BrandDenomination {
    @SerializedName("QAR")
    @Expose
    private Qar qar;

    public Qar getQar() {
        return qar;
    }

    public void setQar(Qar qar) {
        this.qar = qar;
    }
}
