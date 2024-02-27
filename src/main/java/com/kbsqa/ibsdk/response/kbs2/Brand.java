
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Brand {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("brand_code")
    @Expose
    private String brandCode;
    @SerializedName("pin_redeemable")
    @Expose
    private Boolean pinRedeemable;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("product_image")
    @Expose
    private String productImage;
    @SerializedName("country")
    @Expose
    private BrandCountry country;
    @SerializedName("validity_in_months")
    @Expose
    private Integer validityInMonths;
    @SerializedName("variable_amount")
    @Expose
    private Boolean variableAmount;
    @SerializedName("denominations")
    @Expose
    private BrandDenomination denominations;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("brand_accepted_currency")
    @Expose
    private String brandAcceptedCurrency;
    @SerializedName("image_gallery")
    @Expose
    private List<ImageGallery> imageGallery;
    @SerializedName("redemption_type")
    @Expose
    private String redemptionType;
    @SerializedName("redemption_instructions")
    @Expose
    private String redemptionInstructions;
    @SerializedName("detail_url")
    @Expose
    private String detailUrl;
    @SerializedName("locations_url")
    @Expose
    private String locationsUrl;
    @SerializedName("categories")
    @Expose
    private List<BrandCategory> categories;
    @SerializedName("redemption_instruction")
    @Expose
    private String redemptionInstruction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public Boolean getPinRedeemable() {
        return pinRedeemable;
    }

    public void setPinRedeemable(Boolean pinRedeemable) {
        this.pinRedeemable = pinRedeemable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public BrandCountry getCountry() {
        return country;
    }

    public void setCountry(BrandCountry country) {
        this.country = country;
    }

    public Integer getValidityInMonths() {
        return validityInMonths;
    }

    public void setValidityInMonths(Integer validityInMonths) {
        this.validityInMonths = validityInMonths;
    }

    public Boolean getVariableAmount() {
        return variableAmount;
    }

    public void setVariableAmount(Boolean variableAmount) {
        this.variableAmount = variableAmount;
    }

    public BrandDenomination getBrandDenomination() {
        return denominations;
    }

    public void setBrandDenomination(BrandDenomination denominations) {
        this.denominations = denominations;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrandAcceptedCurrency() {
        return brandAcceptedCurrency;
    }

    public void setBrandAcceptedCurrency(String brandAcceptedCurrency) {
        this.brandAcceptedCurrency = brandAcceptedCurrency;
    }

    public List<ImageGallery> getImageGallery() {
        return imageGallery;
    }

    public void setImageGallery(List<ImageGallery> imageGallery) {
        this.imageGallery = imageGallery;
    }

    public String getRedemptionType() {
        return redemptionType;
    }

    public void setRedemptionType(String redemptionType) {
        this.redemptionType = redemptionType;
    }

    public String getRedemptionInstructions() {
        return redemptionInstructions;
    }

    public void setRedemptionInstructions(String redemptionInstructions) {
        this.redemptionInstructions = redemptionInstructions;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getLocationsUrl() {
        return locationsUrl;
    }

    public void setLocationsUrl(String locationsUrl) {
        this.locationsUrl = locationsUrl;
    }

    public List<BrandCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<BrandCategory> categories) {
        this.categories = categories;
    }

    public String getRedemptionInstruction() {
        return redemptionInstruction;
    }

    public void setRedemptionInstruction(String redemptionInstruction) {
        this.redemptionInstruction = redemptionInstruction;
    }

}
