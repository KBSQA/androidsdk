
package com.kbsqa.ibsdk.response.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class BrandLocationCityResponse {

    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("total_page")
    @Expose
    private Integer totalPage;
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("current_page_count")
    @Expose
    private Integer currentPageCount;
    @SerializedName("next")
    @Expose
    private Object next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("brand_name")
    @Expose
    private String brandName;
    @SerializedName("locations")
    @Expose
    private List<LocationCity> locations;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentPageCount() {
        return currentPageCount;
    }

    public void setCurrentPageCount(Integer currentPageCount) {
        this.currentPageCount = currentPageCount;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<LocationCity> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationCity> locations) {
        this.locations = locations;
    }

}
