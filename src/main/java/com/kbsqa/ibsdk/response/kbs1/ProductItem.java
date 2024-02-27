
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductItem {

    @SerializedName("ProviderCode")
    @Expose
    private String providerCode;
    @SerializedName("SkuCode")
    @Expose
    private String skuCode;
    @SerializedName("LocalizationKey")
    @Expose
    private String localizationKey;
    @SerializedName("SettingDefinitions")
    @Expose
    private List<SettingDefinition> settingDefinitions;
    @SerializedName("Maximum")
    @Expose
    private Maximum maximum;
    @SerializedName("Minimum")
    @Expose
    private Minimum minimum;
    @SerializedName("CommissionRate")
    @Expose
    private Integer commissionRate;
    @SerializedName("ProcessingMode")
    @Expose
    private String processingMode;
    @SerializedName("RedemptionMechanism")
    @Expose
    private String redemptionMechanism;
    @SerializedName("Benefits")
    @Expose
    private List<String> benefits;
    @SerializedName("ValidityPeriodIso")
    @Expose
    private String validityPeriodIso;
    @SerializedName("UatNumber")
    @Expose
    private String uatNumber;
    @SerializedName("AdditionalInformation")
    @Expose
    private String additionalInformation;
    @SerializedName("DefaultDisplayText")
    @Expose
    private String defaultDisplayText;
    @SerializedName("RegionCode")
    @Expose
    private String regionCode;
    @SerializedName("PaymentTypes")
    @Expose
    private List<String> paymentTypes;
    @SerializedName("LookupBillsRequired")
    @Expose
    private Boolean lookupBillsRequired;

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getLocalizationKey() {
        return localizationKey;
    }

    public void setLocalizationKey(String localizationKey) {
        this.localizationKey = localizationKey;
    }

    public List<SettingDefinition> getSettingDefinitions() {
        return settingDefinitions;
    }

    public void setSettingDefinitions(List<SettingDefinition> settingDefinitions) {
        this.settingDefinitions = settingDefinitions;
    }

    public Maximum getMaximum() {
        return maximum;
    }

    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
    }

    public Minimum getMinimum() {
        return minimum;
    }

    public void setMinimum(Minimum minimum) {
        this.minimum = minimum;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getProcessingMode() {
        return processingMode;
    }

    public void setProcessingMode(String processingMode) {
        this.processingMode = processingMode;
    }

    public String getRedemptionMechanism() {
        return redemptionMechanism;
    }

    public void setRedemptionMechanism(String redemptionMechanism) {
        this.redemptionMechanism = redemptionMechanism;
    }

    public List<String> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<String> benefits) {
        this.benefits = benefits;
    }

    public String getValidityPeriodIso() {
        return validityPeriodIso;
    }

    public void setValidityPeriodIso(String validityPeriodIso) {
        this.validityPeriodIso = validityPeriodIso;
    }

    public String getUatNumber() {
        return uatNumber;
    }

    public void setUatNumber(String uatNumber) {
        this.uatNumber = uatNumber;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getDefaultDisplayText() {
        return defaultDisplayText;
    }

    public void setDefaultDisplayText(String defaultDisplayText) {
        this.defaultDisplayText = defaultDisplayText;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public List<String> getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(List<String> paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public Boolean getLookupBillsRequired() {
        return lookupBillsRequired;
    }

    public void setLookupBillsRequired(Boolean lookupBillsRequired) {
        this.lookupBillsRequired = lookupBillsRequired;
    }

}
