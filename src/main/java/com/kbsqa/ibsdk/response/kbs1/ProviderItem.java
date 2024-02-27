
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProviderItem {

    @SerializedName("ProviderCode")
    @Expose
    private String providerCode;
    @SerializedName("CountryIso")
    @Expose
    private String countryIso;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ShortName")
    @Expose
    private String shortName;
    @SerializedName("ValidationRegex")
    @Expose
    private String validationRegex;
    @SerializedName("CustomerCareNumber")
    @Expose
    private String customerCareNumber;
    @SerializedName("RegionCodes")
    @Expose
    private List<String> regionCodes;
    @SerializedName("PaymentTypes")
    @Expose
    private List<String> paymentTypes;
    @SerializedName("LogoUrl")
    @Expose
    private String logoUrl;

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getValidationRegex() {
        return validationRegex;
    }

    public void setValidationRegex(String validationRegex) {
        this.validationRegex = validationRegex;
    }

    public String getCustomerCareNumber() {
        return customerCareNumber;
    }

    public void setCustomerCareNumber(String customerCareNumber) {
        this.customerCareNumber = customerCareNumber;
    }

    public List<String> getRegionCodes() {
        return regionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        this.regionCodes = regionCodes;
    }

    public List<String> getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(List<String> paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

}
