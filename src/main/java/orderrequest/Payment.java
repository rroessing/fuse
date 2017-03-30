
package orderrequest;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "reservedAmount",
    "sepaOwner",
    "boniCheckID",
    "subscriptionId",
    "reservationDate",
    "sepaIBAN",
    "ppccPayerName"
})
public class Payment {

    @JsonProperty("reservedAmount")
    private String reservedAmount;
    @JsonProperty("sepaOwner")
    private String sepaOwner;
    @JsonProperty("boniCheckID")
    private String boniCheckID;
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    @JsonProperty("reservationDate")
    private String reservationDate;
    @JsonProperty("sepaIBAN")
    private String sepaIBAN;
    @JsonProperty("ppccPayerName")
    private String ppccPayerName;

    /**
     * 
     * @return
     *     The reservedAmount
     */
    @JsonProperty("reservedAmount")
    public String getReservedAmount() {
        return reservedAmount;
    }

    /**
     * 
     * @param reservedAmount
     *     The reservedAmount
     */
    @JsonProperty("reservedAmount")
    public void setReservedAmount(String reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    /**
     * 
     * @return
     *     The sepaOwner
     */
    @JsonProperty("sepaOwner")
    public String getSepaOwner() {
        return sepaOwner;
    }

    /**
     * 
     * @param sepaOwner
     *     The sepaOwner
     */
    @JsonProperty("sepaOwner")
    public void setSepaOwner(String sepaOwner) {
        this.sepaOwner = sepaOwner;
    }

    /**
     * 
     * @return
     *     The boniCheckID
     */
    @JsonProperty("boniCheckID")
    public String getBoniCheckID() {
        return boniCheckID;
    }

    /**
     * 
     * @param boniCheckID
     *     The boniCheckID
     */
    @JsonProperty("boniCheckID")
    public void setBoniCheckID(String boniCheckID) {
        this.boniCheckID = boniCheckID;
    }

    /**
     * 
     * @return
     *     The subscriptionId
     */
    @JsonProperty("subscriptionId")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * 
     * @param subscriptionId
     *     The subscriptionId
     */
    @JsonProperty("subscriptionId")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * 
     * @return
     *     The reservationDate
     */
    @JsonProperty("reservationDate")
    public String getReservationDate() {
        return reservationDate;
    }

    /**
     * 
     * @param reservationDate
     *     The reservationDate
     */
    @JsonProperty("reservationDate")
    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    /**
     * 
     * @return
     *     The sepaIBAN
     */
    @JsonProperty("sepaIBAN")
    public String getSepaIBAN() {
        return sepaIBAN;
    }

    /**
     * 
     * @param sepaIBAN
     *     The sepaIBAN
     */
    @JsonProperty("sepaIBAN")
    public void setSepaIBAN(String sepaIBAN) {
        this.sepaIBAN = sepaIBAN;
    }

    /**
     * 
     * @return
     *     The ppccPayerName
     */
    @JsonProperty("ppccPayerName")
    public String getPpccPayerName() {
        return ppccPayerName;
    }

    /**
     * 
     * @param ppccPayerName
     *     The ppccPayerName
     */
    @JsonProperty("ppccPayerName")
    public void setPpccPayerName(String ppccPayerName) {
        this.ppccPayerName = ppccPayerName;
    }

}
