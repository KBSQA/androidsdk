package com.kbsqa.ibsdk.request.kbs2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderCreateRequest {

    @SerializedName("reference_id")
    @Expose
    private String referenceId;
    @SerializedName("notify")
    @Expose
    private Integer notify;
    @SerializedName("brand_code")
    @Expose
    private String brandCode;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("receiver_name")
    @Expose
    private String receiverName;
    @SerializedName("receiver_email")
    @Expose
    private String receiverEmail;
    @SerializedName("receiver_phone")
    @Expose
    private String receiverPhone;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("extra_fields")
    @Expose
    private ExtraFields extraFields;
    @SerializedName("delivery_language")
    @Expose
    private String deliveryLanguage;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Integer getNotify() {
        return notify;
    }

    public void setNotify(Integer notify) {
        this.notify = notify;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ExtraFields getExtraFields() {
        return extraFields;
    }

    public void setExtraFields(ExtraFields extraFields) {
        this.extraFields = extraFields;
    }

    public String getDeliveryLanguage() {
        return deliveryLanguage;
    }

    public void setDeliveryLanguage(String deliveryLanguage) {
        this.deliveryLanguage = deliveryLanguage;
    }

}