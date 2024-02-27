
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CountryItem {

    @SerializedName("CountryIso")
    @Expose
    private String countryIso;
    @SerializedName("CountryName")
    @Expose
    private String countryName;
    @SerializedName("InternationalDialingInformation")
    @Expose
    private List<InternationalDialingInformation> internationalDialingInformation;
    @SerializedName("RegionCodes")
    @Expose
    private List<String> regionCodes;

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<InternationalDialingInformation> getInternationalDialingInformation() {
        return internationalDialingInformation;
    }

    public void setInternationalDialingInformation(List<InternationalDialingInformation> internationalDialingInformation) {
        this.internationalDialingInformation = internationalDialingInformation;
    }

    public List<String> getRegionCodes() {
        return regionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        this.regionCodes = regionCodes;
    }

    @Override
    public String toString() {
        return "CountryItem{" +
                "countryIso='" + countryIso + '\'' +
                ", countryName='" + countryName + '\'' +
                ", internationalDialingInformation=" + internationalDialingInformation +
                ", regionCodes=" + regionCodes +
                '}';
    }
}
