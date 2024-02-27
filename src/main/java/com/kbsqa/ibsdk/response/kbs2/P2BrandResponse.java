
package com.kbsqa.ibsdk.response.kbs2;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class P2BrandResponse {

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
    @SerializedName("brands")
    @Expose
    private List<P2Brand> brands;

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

    public List<P2Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<P2Brand> brands) {
        this.brands = brands;
    }

    @Override
    public String toString() {
        return "P2BrandResponse{" +
                "totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                ", currentPageCount=" + currentPageCount +
                ", next=" + next +
                ", previous=" + previous +
                ", brands=" + brands +
                '}';
    }
}
