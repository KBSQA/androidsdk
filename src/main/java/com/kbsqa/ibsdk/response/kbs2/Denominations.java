
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Denominations {

    @SerializedName("LBP")
    @Expose
    private List<Lbp> lbp;
    @SerializedName("USD")
    @Expose
    private Usd usd;
    @SerializedName("QAR")
    @Expose
    private Qar qar;
    @SerializedName("BHD")
    @Expose
    private Bhd bhd;
    @SerializedName("AED")
    @Expose
    private List<Aed> aed;
    @SerializedName("GBP")
    @Expose
    private Gbp gbp;
    @SerializedName("SAR")
    @Expose
    private List<Sar> sar;
    @SerializedName("EUR")
    @Expose
    private Eur eur;

    public List<Lbp> getLbp() {
        return lbp;
    }

    public void setLbp(List<Lbp> lbp) {
        this.lbp = lbp;
    }

    public Usd getUsd() {
        return usd;
    }

    public void setUsd(Usd usd) {
        this.usd = usd;
    }

    public Qar getQar() {
        return qar;
    }

    public void setQar(Qar qar) {
        this.qar = qar;
    }

    public Bhd getBhd() {
        return bhd;
    }

    public void setBhd(Bhd bhd) {
        this.bhd = bhd;
    }

    public List<Aed> getAed() {
        return aed;
    }

    public void setAed(List<Aed> aed) {
        this.aed = aed;
    }

    public Gbp getGbp() {
        return gbp;
    }

    public void setGbp(Gbp gbp) {
        this.gbp = gbp;
    }

    public List<Sar> getSar() {
        return sar;
    }

    public void setSar(List<Sar> sar) {
        this.sar = sar;
    }

    public Eur getEur() {
        return eur;
    }

    public void setEur(Eur eur) {
        this.eur = eur;
    }

}
