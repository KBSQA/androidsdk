
package com.kbsqa.ibsdk.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Product {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("product_image")
    @Expose
    private String productImage;
    @SerializedName("isEnable")
    @Expose
    private Boolean isEnable;
    @SerializedName("categoryId")
    @Expose
    private List<String> categoryId;
    @SerializedName("serviceProviderId")
    @Expose
    private String serviceProviderId;
    @SerializedName("serviceCategoryId")
    @Expose
    private String serviceCategoryId;

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

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public List<String> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<String> categoryId) {
        this.categoryId = categoryId;
    }

    public String getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getServiceCategoryId() {
        return serviceCategoryId;
    }

    public void setServiceCategoryId(String serviceCategoryId) {
        this.serviceCategoryId = serviceCategoryId;
    }

}
