
package orderrequest;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "addressSupplement",
    "lastName",
    "partnerCode",
    "city",
    "countryIsoCode",
    "postalCode",
    "houseNumber",
    "remark",
    "title",
    "partnerRoleCode",
    "firstName",
    "telNumber",
    "street",
    "company",
    "email"
})
public class Partner {

    @JsonProperty("addressSupplement")
    private String addressSupplement;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("partnerCode")
    private String partnerCode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("countryIsoCode")
    private String countryIsoCode;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("houseNumber")
    private String houseNumber;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("title")
    private String title;
    @JsonProperty("partnerRoleCode")
    private String partnerRoleCode;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("telNumber")
    private String telNumber;
    @JsonProperty("street")
    private String street;
    @JsonProperty("company")
    private String company;
    @JsonProperty("email")
    private String email;

    /**
     * 
     * @return
     *     The addressSupplement
     */
    @JsonProperty("addressSupplement")
    public String getAddressSupplement() {
        return addressSupplement;
    }

    /**
     * 
     * @param addressSupplement
     *     The addressSupplement
     */
    @JsonProperty("addressSupplement")
    public void setAddressSupplement(String addressSupplement) {
        this.addressSupplement = addressSupplement;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The lastName
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The partnerCode
     */
    @JsonProperty("partnerCode")
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * 
     * @param partnerCode
     *     The partnerCode
     */
    @JsonProperty("partnerCode")
    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The countryIsoCode
     */
    @JsonProperty("countryIsoCode")
    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    /**
     * 
     * @param countryIsoCode
     *     The countryIsoCode
     */
    @JsonProperty("countryIsoCode")
    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postalCode
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The houseNumber
     */
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * 
     * @param houseNumber
     *     The houseNumber
     */
    @JsonProperty("houseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * 
     * @return
     *     The remark
     */
    @JsonProperty("remark")
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark
     *     The remark
     */
    @JsonProperty("remark")
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The partnerRoleCode
     */
    @JsonProperty("partnerRoleCode")
    public String getPartnerRoleCode() {
        return partnerRoleCode;
    }

    /**
     * 
     * @param partnerRoleCode
     *     The partnerRoleCode
     */
    @JsonProperty("partnerRoleCode")
    public void setPartnerRoleCode(String partnerRoleCode) {
        this.partnerRoleCode = partnerRoleCode;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The firstName
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The telNumber
     */
    @JsonProperty("telNumber")
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * 
     * @param telNumber
     *     The telNumber
     */
    @JsonProperty("telNumber")
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    /**
     * 
     * @return
     *     The street
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     * 
     * @param street
     *     The street
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 
     * @return
     *     The company
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

}
