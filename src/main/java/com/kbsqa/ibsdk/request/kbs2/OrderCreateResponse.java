
package com.kbsqa.ibsdk.request.kbs2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class OrderCreateResponse {

    @SerializedName("reference_id")
    @Expose
    private String referenceId;
    @SerializedName("order_id")
    @Expose
    private Integer orderId;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("notify")
    @Expose
    private Integer notify;
    @SerializedName("ordered_amount")
    @Expose
    private OrderedAmount orderedAmount;
    @SerializedName("extra_fields")
    @Expose
    private String extraFields;
    @SerializedName("brand_accepted_amount")
    @Expose
    private BrandAcceptedAmount brandAcceptedAmount;
    @SerializedName("exchange_rate")
    @Expose
    private ExchangeRate exchangeRate;
    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("gift_voucher")
    @Expose
    private List<GiftVoucher> giftVoucher;
    @SerializedName("expiry_date")
    @Expose
    private String expiryDate;
    @SerializedName("redemption_instructions")
    @Expose
    private String redemptionInstructions;
    @SerializedName("brand_details")
    @Expose
    private BrandDetails brandDetails;
    @SerializedName("receiver_name")
    @Expose
    private String receiverName;
    @SerializedName("receiver_email")
    @Expose
    private String receiverEmail;
    @SerializedName("receiver_phone")
    @Expose
    private String receiverPhone;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("egift_card")
    @Expose
    private EgiftCard egiftCard;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getNotify() {
        return notify;
    }

    public void setNotify(Integer notify) {
        this.notify = notify;
    }

    public OrderedAmount getOrderedAmount() {
        return orderedAmount;
    }

    public void setOrderedAmount(OrderedAmount orderedAmount) {
        this.orderedAmount = orderedAmount;
    }

    public String getExtraFields() {
        return extraFields;
    }

    public void setExtraFields(String extraFields) {
        this.extraFields = extraFields;
    }

    public BrandAcceptedAmount getBrandAcceptedAmount() {
        return brandAcceptedAmount;
    }

    public void setBrandAcceptedAmount(BrandAcceptedAmount brandAcceptedAmount) {
        this.brandAcceptedAmount = brandAcceptedAmount;
    }

    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public List<GiftVoucher> getGiftVoucher() {
        return giftVoucher;
    }

    public void setGiftVoucher(List<GiftVoucher> giftVoucher) {
        this.giftVoucher = giftVoucher;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getRedemptionInstructions() {
        return redemptionInstructions;
    }

    public void setRedemptionInstructions(String redemptionInstructions) {
        this.redemptionInstructions = redemptionInstructions;
    }

    public BrandDetails getBrandDetails() {
        return brandDetails;
    }

    public void setBrandDetails(BrandDetails brandDetails) {
        this.brandDetails = brandDetails;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public EgiftCard getEgiftCard() {
        return egiftCard;
    }

    public void setEgiftCard(EgiftCard egiftCard) {
        this.egiftCard = egiftCard;
    }

}
