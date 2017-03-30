
package orderrequest;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "date",
    "generationID",
    "paymentMode",
    "orderId",
    "deliveryTimeTo",
    "deliveryTimeFrom",
    "warehouseCode",
    "entries",
    "deliveryMode",
    "partners",
    "payment",
    "discountType",
    "orderCurrencyIsoCode"
})
public class OrderRequest {

    @JsonProperty("date")
    private String date;
    @JsonProperty("generationID")
    private String generationID;
    @JsonProperty("paymentMode")
    private String paymentMode;
    @JsonProperty("orderId")
    private String orderId;
    @JsonProperty("deliveryTimeTo")
    private String deliveryTimeTo;
    @JsonProperty("deliveryTimeFrom")
    private String deliveryTimeFrom;
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("entries")
    private List<Entry> entries = new ArrayList<Entry>();
    @JsonProperty("deliveryMode")
    private String deliveryMode;
    @JsonProperty("partners")
    private List<Partner> partners = new ArrayList<Partner>();
    @JsonProperty("payment")
    private Payment payment;
    @JsonProperty("discountType")
    private int discountType;
    @JsonProperty("orderCurrencyIsoCode")
    private String orderCurrencyIsoCode;

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The generationID
     */
    @JsonProperty("generationID")
    public String getGenerationID() {
        return generationID;
    }

    /**
     * 
     * @param generationID
     *     The generationID
     */
    @JsonProperty("generationID")
    public void setGenerationID(String generationID) {
        this.generationID = generationID;
    }

    /**
     * 
     * @return
     *     The paymentMode
     */
    @JsonProperty("paymentMode")
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * 
     * @param paymentMode
     *     The paymentMode
     */
    @JsonProperty("paymentMode")
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    /**
     * 
     * @return
     *     The orderId
     */
    @JsonProperty("orderId")
    public String getOrderId() {
        return orderId;
    }

    /**
     * 
     * @param orderId
     *     The orderId
     */
    @JsonProperty("orderId")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 
     * @return
     *     The deliveryTimeTo
     */
    @JsonProperty("deliveryTimeTo")
    public String getDeliveryTimeTo() {
        return deliveryTimeTo;
    }

    /**
     * 
     * @param deliveryTimeTo
     *     The deliveryTimeTo
     */
    @JsonProperty("deliveryTimeTo")
    public void setDeliveryTimeTo(String deliveryTimeTo) {
        this.deliveryTimeTo = deliveryTimeTo;
    }

    /**
     * 
     * @return
     *     The deliveryTimeFrom
     */
    @JsonProperty("deliveryTimeFrom")
    public String getDeliveryTimeFrom() {
        return deliveryTimeFrom;
    }

    /**
     * 
     * @param deliveryTimeFrom
     *     The deliveryTimeFrom
     */
    @JsonProperty("deliveryTimeFrom")
    public void setDeliveryTimeFrom(String deliveryTimeFrom) {
        this.deliveryTimeFrom = deliveryTimeFrom;
    }

    /**
     * 
     * @return
     *     The warehouseCode
     */
    @JsonProperty("warehouseCode")
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * 
     * @param warehouseCode
     *     The warehouseCode
     */
    @JsonProperty("warehouseCode")
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    /**
     * 
     * @return
     *     The entries
     */
    @JsonProperty("entries")
    public List<Entry> getEntries() {
        return entries;
    }

    /**
     * 
     * @param entries
     *     The entries
     */
    @JsonProperty("entries")
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    /**
     * 
     * @return
     *     The deliveryMode
     */
    @JsonProperty("deliveryMode")
    public String getDeliveryMode() {
        return deliveryMode;
    }

    /**
     * 
     * @param deliveryMode
     *     The deliveryMode
     */
    @JsonProperty("deliveryMode")
    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    /**
     * 
     * @return
     *     The partners
     */
    @JsonProperty("partners")
    public List<Partner> getPartners() {
        return partners;
    }

    /**
     * 
     * @param partners
     *     The partners
     */
    @JsonProperty("partners")
    public void setPartners(List<Partner> partners) {
        this.partners = partners;
    }

    /**
     * 
     * @return
     *     The payment
     */
    @JsonProperty("payment")
    public Payment getPayment() {
        return payment;
    }

    /**
     * 
     * @param payment
     *     The payment
     */
    @JsonProperty("payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    /**
     * 
     * @return
     *     The discountType
     */
    @JsonProperty("discountType")
    public int getDiscountType() {
        return discountType;
    }

    /**
     * 
     * @param discountType
     *     The discountType
     */
    @JsonProperty("discountType")
    public void setDiscountType(int discountType) {
        this.discountType = discountType;
    }

    /**
     * 
     * @return
     *     The orderCurrencyIsoCode
     */
    @JsonProperty("orderCurrencyIsoCode")
    public String getOrderCurrencyIsoCode() {
        return orderCurrencyIsoCode;
    }

    /**
     * 
     * @param orderCurrencyIsoCode
     *     The orderCurrencyIsoCode
     */
    @JsonProperty("orderCurrencyIsoCode")
    public void setOrderCurrencyIsoCode(String orderCurrencyIsoCode) {
        this.orderCurrencyIsoCode = orderCurrencyIsoCode;
    }

}
