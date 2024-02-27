package com.kbsqa.ibsdk.response.kbs2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("city_locations_url")
    @Expose
    private String cityLocationsUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityLocationsUrl() {
        return cityLocationsUrl;
    }

    public void setCityLocationsUrl(String cityLocationsUrl) {
        this.cityLocationsUrl = cityLocationsUrl;
    }

}
