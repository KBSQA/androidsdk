
package com.kbsqa.ibsdk.response.kbs2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class P2BrandDenomination {

    @SerializedName("QAR")
    @Expose
    private P2BrandQar qar;

    public P2BrandQar getQar() {
        return qar;
    }

    public void setQar(P2BrandQar qar) {
        this.qar = qar;
    }

    @Override
    public String toString() {
        return "P2BrandDenomination{" +
                "qar=" + qar +
                '}';
    }
}
