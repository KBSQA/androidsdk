
package com.kbsqa.ibsdk.response.kbs2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class P2BrandImageGallery {

    @SerializedName("image")
    @Expose
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "P2BrandImageGallery{" +
                "image='" + image + '\'' +
                '}';
    }
}
