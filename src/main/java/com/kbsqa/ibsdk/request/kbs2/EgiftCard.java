
package com.kbsqa.ibsdk.request.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class EgiftCard {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("gift_verification_pin")
    @Expose
    private String giftVerificationPin;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGiftVerificationPin() {
        return giftVerificationPin;
    }

    public void setGiftVerificationPin(String giftVerificationPin) {
        this.giftVerificationPin = giftVerificationPin;
    }

}
