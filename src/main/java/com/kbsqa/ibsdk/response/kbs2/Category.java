
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Category {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("brands_url")
    @Expose
    private String brandsUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandsUrl() {
        return brandsUrl;
    }

    public void setBrandsUrl(String brandsUrl) {
        this.brandsUrl = brandsUrl;
    }

}
