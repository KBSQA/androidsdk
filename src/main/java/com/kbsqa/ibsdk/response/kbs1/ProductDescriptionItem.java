
package com.kbsqa.ibsdk.response.kbs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ProductDescriptionItem {

    @SerializedName("DisplayText")
    @Expose
    private String displayText;
    @SerializedName("DescriptionMarkdown")
    @Expose
    private String descriptionMarkdown;
    @SerializedName("ReadMoreMarkdown")
    @Expose
    private String readMoreMarkdown;
    @SerializedName("LocalizationKey")
    @Expose
    private String localizationKey;
    @SerializedName("LanguageCode")
    @Expose
    private String languageCode;

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getDescriptionMarkdown() {
        return descriptionMarkdown;
    }

    public void setDescriptionMarkdown(String descriptionMarkdown) {
        this.descriptionMarkdown = descriptionMarkdown;
    }

    public String getReadMoreMarkdown() {
        return readMoreMarkdown;
    }

    public void setReadMoreMarkdown(String readMoreMarkdown) {
        this.readMoreMarkdown = readMoreMarkdown;
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

}
