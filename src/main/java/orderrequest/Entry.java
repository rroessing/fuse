
package orderrequest;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "quantity",
    "productCode",
    "articleName",
    "marktpreis",
    "orderedQuantity",
    "aktionspreis",
    "entryUnitCode",
    "discountAbsolute",
    "entryNumber",
    "normalpreis",
    "basePrice",
    "discountRelative"
})
public class Entry {

    @JsonProperty("quantity")
    private int quantity;
    @JsonProperty("productCode")
    private String productCode;
    @JsonProperty("articleName")
    private String articleName;
    @JsonProperty("marktpreis")
    private double marktpreis;
    @JsonProperty("orderedQuantity")
    private int orderedQuantity;
    @JsonProperty("aktionspreis")
    private double aktionspreis;
    @JsonProperty("entryUnitCode")
    private String entryUnitCode;
    @JsonProperty("discountAbsolute")
    private double discountAbsolute;
    @JsonProperty("entryNumber")
    private int entryNumber;
    @JsonProperty("normalpreis")
    private double normalpreis;
    @JsonProperty("basePrice")
    private double basePrice;
    @JsonProperty("discountRelative")
    private double discountRelative;

    /**
     * 
     * @return
     *     The quantity
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The productCode
     */
    @JsonProperty("productCode")
    public String getProductCode() {
        return productCode;
    }

    /**
     * 
     * @param productCode
     *     The productCode
     */
    @JsonProperty("productCode")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * 
     * @return
     *     The articleName
     */
    @JsonProperty("articleName")
    public String getArticleName() {
        return articleName;
    }

    /**
     * 
     * @param articleName
     *     The articleName
     */
    @JsonProperty("articleName")
    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    /**
     * 
     * @return
     *     The marktpreis
     */
    @JsonProperty("marktpreis")
    public double getMarktpreis() {
        return marktpreis;
    }

    /**
     * 
     * @param marktpreis
     *     The marktpreis
     */
    @JsonProperty("marktpreis")
    public void setMarktpreis(double marktpreis) {
        this.marktpreis = marktpreis;
    }

    /**
     * 
     * @return
     *     The orderedQuantity
     */
    @JsonProperty("orderedQuantity")
    public int getOrderedQuantity() {
        return orderedQuantity;
    }

    /**
     * 
     * @param orderedQuantity
     *     The orderedQuantity
     */
    @JsonProperty("orderedQuantity")
    public void setOrderedQuantity(int orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }

    /**
     * 
     * @return
     *     The aktionspreis
     */
    @JsonProperty("aktionspreis")
    public double getAktionspreis() {
        return aktionspreis;
    }

    /**
     * 
     * @param aktionspreis
     *     The aktionspreis
     */
    @JsonProperty("aktionspreis")
    public void setAktionspreis(double aktionspreis) {
        this.aktionspreis = aktionspreis;
    }

    /**
     * 
     * @return
     *     The entryUnitCode
     */
    @JsonProperty("entryUnitCode")
    public String getEntryUnitCode() {
        return entryUnitCode;
    }

    /**
     * 
     * @param entryUnitCode
     *     The entryUnitCode
     */
    @JsonProperty("entryUnitCode")
    public void setEntryUnitCode(String entryUnitCode) {
        this.entryUnitCode = entryUnitCode;
    }

    /**
     * 
     * @return
     *     The discountAbsolute
     */
    @JsonProperty("discountAbsolute")
    public double getDiscountAbsolute() {
        return discountAbsolute;
    }

    /**
     * 
     * @param discountAbsolute
     *     The discountAbsolute
     */
    @JsonProperty("discountAbsolute")
    public void setDiscountAbsolute(double discountAbsolute) {
        this.discountAbsolute = discountAbsolute;
    }

    /**
     * 
     * @return
     *     The entryNumber
     */
    @JsonProperty("entryNumber")
    public int getEntryNumber() {
        return entryNumber;
    }

    /**
     * 
     * @param entryNumber
     *     The entryNumber
     */
    @JsonProperty("entryNumber")
    public void setEntryNumber(int entryNumber) {
        this.entryNumber = entryNumber;
    }

    /**
     * 
     * @return
     *     The normalpreis
     */
    @JsonProperty("normalpreis")
    public double getNormalpreis() {
        return normalpreis;
    }

    /**
     * 
     * @param normalpreis
     *     The normalpreis
     */
    @JsonProperty("normalpreis")
    public void setNormalpreis(double normalpreis) {
        this.normalpreis = normalpreis;
    }

    /**
     * 
     * @return
     *     The basePrice
     */
    @JsonProperty("basePrice")
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * 
     * @param basePrice
     *     The basePrice
     */
    @JsonProperty("basePrice")
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * 
     * @return
     *     The discountRelative
     */
    @JsonProperty("discountRelative")
    public double getDiscountRelative() {
        return discountRelative;
    }

    /**
     * 
     * @param discountRelative
     *     The discountRelative
     */
    @JsonProperty("discountRelative")
    public void setDiscountRelative(double discountRelative) {
        this.discountRelative = discountRelative;
    }

}
