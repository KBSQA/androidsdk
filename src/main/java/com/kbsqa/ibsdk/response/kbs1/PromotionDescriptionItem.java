
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PromotionDescriptionItem {

    @SerializedName("Dates")
    @Expose
    private String dates;
    @SerializedName("Headline")
    @Expose
    private String headline;
    @SerializedName("TermsAndConditionsMarkDown")
    @Expose
    private String termsAndConditionsMarkDown;
    @SerializedName("BonusValidity")
    @Expose
    private String bonusValidity;
    @SerializedName("PromotionType")
    @Expose
    private String promotionType;
    @SerializedName("LocalizationKey")
    @Expose
    private String localizationKey;
    @SerializedName("LanguageCode")
    @Expose
    private String languageCode;
    @SerializedName("SendAmounts")
    @Expose
    private List<SendAmount> sendAmounts;

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getTermsAndConditionsMarkDown() {
        return termsAndConditionsMarkDown;
    }

    public void setTermsAndConditionsMarkDown(String termsAndConditionsMarkDown) {
        this.termsAndConditionsMarkDown = termsAndConditionsMarkDown;
    }

    public String getBonusValidity() {
        return bonusValidity;
    }

    public void setBonusValidity(String bonusValidity) {
        this.bonusValidity = bonusValidity;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public String getLocalizationKey() {
        return localizationKey;
    }

    public void setLocalizationKey(String localizationKey) {
        this.localizationKey = localizationKey;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public List<SendAmount> getSendAmounts() {
        return sendAmounts;
    }

    public void setSendAmounts(List<SendAmount> sendAmounts) {
        this.sendAmounts = sendAmounts;
    }

}
