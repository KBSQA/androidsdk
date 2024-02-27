
package com.kbsqa.ibsdk.request.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class BrandDetails {

    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("product_image")
    @Expose
    private String productImage;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("pin_redeemable")
    @Expose
    private Boolean pinRedeemable;
    @SerializedName("name")
    @Expose
    private String name;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

}
