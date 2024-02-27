
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConversionRates {

    @SerializedName("LBP")
    @Expose
    private Double lbp;
    @SerializedName("USD")
    @Expose
    private Integer usd;
    @SerializedName("KWD")
    @Expose
    private Double kwd;
    @SerializedName("QAR")
    @Expose
    private Double qar;
    @SerializedName("NGN")
    @Expose
    private Double ngn;
    @SerializedName("EGP")
    @Expose
    private Double egp;
    @SerializedName("BHD")
    @Expose
    private Double bhd;
    @SerializedName("INR")
    @Expose
    private Double inr;
    @SerializedName("OMR")
    @Expose
    private Double omr;
    @SerializedName("AED")
    @Expose
    private Double aed;
    @SerializedName("GBP")
    @Expose
    private Double gbp;
    @SerializedName("SAR")
    @Expose
    private Double sar;
    @SerializedName("KES")
    @Expose
    private Double kes;
    @SerializedName("EUR")
    @Expose
    private Double eur;

    public Double getLbp() {
        return lbp;
    }

    public void setLbp(Double lbp) {
        this.lbp = lbp;
    }

    public Integer getUsd() {
        return usd;
    }

    public void setUsd(Integer usd) {
        this.usd = usd;
    }

    public Double getKwd() {
        return kwd;
    }

    public void setKwd(Double kwd) {
        this.kwd = kwd;
    }

    public Double getQar() {
        return qar;
    }

    public void setQar(Double qar) {
        this.qar = qar;
    }

    public Double getNgn() {
        return ngn;
    }

    public void setNgn(Double ngn) {
        this.ngn = ngn;
    }

    public Double getEgp() {
        return egp;
    }

    public void setEgp(Double egp) {
        this.egp = egp;
    }

    public Double getBhd() {
        return bhd;
    }

    public void setBhd(Double bhd) {
        this.bhd = bhd;
    }

    public Double getInr() {
        return inr;
    }

    public void setInr(Double inr) {
        this.inr = inr;
    }

    public Double getOmr() {
        return omr;
    }

    public void setOmr(Double omr) {
        this.omr = omr;
    }

    public Double getAed() {
        return aed;
    }

    public void setAed(Double aed) {
        this.aed = aed;
    }

    public Double getGbp() {
        return gbp;
    }

    public void setGbp(Double gbp) {
        this.gbp = gbp;
    }

    public Double getSar() {
        return sar;
    }

    public void setSar(Double sar) {
        this.sar = sar;
    }

    public Double getKes() {
        return kes;
    }

    public void setKes(Double kes) {
        this.kes = kes;
    }

    public Double getEur() {
        return eur;
    }

    public void setEur(Double eur) {
        this.eur = eur;
    }

}
