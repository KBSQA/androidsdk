
package com.kbsqa.ibsdk.response.kbs2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class P2BrandCategory {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "P2BrandCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
