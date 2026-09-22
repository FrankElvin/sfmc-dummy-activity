
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Account">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="AccountType" type="{http://exacttarget.com/wsdl/partnerAPI}AccountTypeEnum"/>
 *         <element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BrandID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="PrivateLabelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ReportingParentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="IsTestAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="DBID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="DeletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="EditionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Children" type="{http://exacttarget.com/wsdl/partnerAPI}AccountDataItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Subscription" type="{http://exacttarget.com/wsdl/partnerAPI}Subscription" minOccurs="0"/>
 *         <element name="PrivateLabels" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BusinessRules" type="{http://exacttarget.com/wsdl/partnerAPI}BusinessRule" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AccountUsers" type="{http://exacttarget.com/wsdl/partnerAPI}AccountUser" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InheritAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsTrialAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Locale" type="{http://exacttarget.com/wsdl/partnerAPI}Locale" minOccurs="0"/>
 *         <element name="ParentAccount" type="{http://exacttarget.com/wsdl/partnerAPI}Account" minOccurs="0"/>
 *         <element name="TimeZone" type="{http://exacttarget.com/wsdl/partnerAPI}TimeZone" minOccurs="0"/>
 *         <element name="Roles" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Role" type="{http://exacttarget.com/wsdl/partnerAPI}Role" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="LanguageLocale" type="{http://exacttarget.com/wsdl/partnerAPI}Locale" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountType",
    "parentID",
    "brandID",
    "privateLabelID",
    "reportingParentID",
    "name",
    "email",
    "fromName",
    "businessName",
    "phone",
    "address",
    "fax",
    "city",
    "state",
    "zip",
    "country",
    "isActive",
    "isTestAccount",
    "orgID",
    "dbid",
    "parentName",
    "customerID",
    "deletedDate",
    "editionID",
    "children",
    "subscription",
    "privateLabels",
    "businessRules",
    "accountUsers",
    "inheritAddress",
    "isTrialAccount",
    "locale",
    "parentAccount",
    "timeZone",
    "roles",
    "languageLocale"
})
@XmlSeeAlso({
    BusinessUnit.class
})
public class Account
    extends APIObject
{

    @XmlElement(name = "AccountType", required = true)
    @XmlSchemaType(name = "string")
    protected AccountTypeEnum accountType;
    @XmlElement(name = "ParentID")
    protected Integer parentID;
    @XmlElement(name = "BrandID")
    protected Integer brandID;
    @XmlElement(name = "PrivateLabelID")
    protected Integer privateLabelID;
    @XmlElement(name = "ReportingParentID")
    protected Integer reportingParentID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "FromName")
    protected String fromName;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "IsActive")
    protected Integer isActive;
    @XmlElement(name = "IsTestAccount")
    protected Boolean isTestAccount;
    @XmlElement(name = "OrgID")
    protected Integer orgID;
    @XmlElement(name = "DBID")
    protected Integer dbid;
    @XmlElement(name = "ParentName")
    protected String parentName;
    @XmlElement(name = "CustomerID")
    protected Long customerID;
    @XmlElement(name = "DeletedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedDate;
    @XmlElement(name = "EditionID")
    protected Integer editionID;
    @XmlElement(name = "Children", nillable = true)
    protected List<AccountDataItem> children;
    @XmlElementRef(name = "Subscription", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Subscription> subscription;
    @XmlElement(name = "PrivateLabels", nillable = true)
    protected List<PrivateLabel> privateLabels;
    @XmlElement(name = "BusinessRules", nillable = true)
    protected List<BusinessRule> businessRules;
    @XmlElement(name = "AccountUsers", nillable = true)
    protected List<AccountUser> accountUsers;
    @XmlElement(name = "InheritAddress")
    protected Boolean inheritAddress;
    @XmlElement(name = "IsTrialAccount")
    protected Boolean isTrialAccount;
    @XmlElement(name = "Locale")
    protected Locale locale;
    @XmlElement(name = "ParentAccount")
    protected Account parentAccount;
    @XmlElement(name = "TimeZone")
    protected TimeZone timeZone;
    @XmlElement(name = "Roles")
    protected Roles roles;
    @XmlElement(name = "LanguageLocale")
    protected Locale languageLocale;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeEnum }
     *     
     */
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeEnum }
     *     
     */
    public void setAccountType(AccountTypeEnum value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentID(Integer value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrandID(Integer value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the privateLabelID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrivateLabelID() {
        return privateLabelID;
    }

    /**
     * Sets the value of the privateLabelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrivateLabelID(Integer value) {
        this.privateLabelID = value;
    }

    /**
     * Gets the value of the reportingParentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportingParentID() {
        return reportingParentID;
    }

    /**
     * Sets the value of the reportingParentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportingParentID(Integer value) {
        this.reportingParentID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsActive(Integer value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isTestAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTestAccount() {
        return isTestAccount;
    }

    /**
     * Sets the value of the isTestAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTestAccount(Boolean value) {
        this.isTestAccount = value;
    }

    /**
     * Gets the value of the orgID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrgID(Integer value) {
        this.orgID = value;
    }

    /**
     * Gets the value of the dbid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDBID() {
        return dbid;
    }

    /**
     * Sets the value of the dbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDBID(Integer value) {
        this.dbid = value;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerID(Long value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the deletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeletedDate() {
        return deletedDate;
    }

    /**
     * Sets the value of the deletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeletedDate(XMLGregorianCalendar value) {
        this.deletedDate = value;
    }

    /**
     * Gets the value of the editionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEditionID() {
        return editionID;
    }

    /**
     * Sets the value of the editionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEditionID(Integer value) {
        this.editionID = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDataItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the children property.
     */
    public List<AccountDataItem> getChildren() {
        if (children == null) {
            children = new ArrayList<>();
        }
        return this.children;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     *     
     */
    public JAXBElement<Subscription> getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     *     
     */
    public void setSubscription(JAXBElement<Subscription> value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the privateLabels property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateLabels property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrivateLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateLabel }
     * </p>
     * 
     * 
     * @return
     *     The value of the privateLabels property.
     */
    public List<PrivateLabel> getPrivateLabels() {
        if (privateLabels == null) {
            privateLabels = new ArrayList<>();
        }
        return this.privateLabels;
    }

    /**
     * Gets the value of the businessRules property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessRules property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBusinessRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessRule }
     * </p>
     * 
     * 
     * @return
     *     The value of the businessRules property.
     */
    public List<BusinessRule> getBusinessRules() {
        if (businessRules == null) {
            businessRules = new ArrayList<>();
        }
        return this.businessRules;
    }

    /**
     * Gets the value of the accountUsers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountUsers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountUser }
     * </p>
     * 
     * 
     * @return
     *     The value of the accountUsers property.
     */
    public List<AccountUser> getAccountUsers() {
        if (accountUsers == null) {
            accountUsers = new ArrayList<>();
        }
        return this.accountUsers;
    }

    /**
     * Gets the value of the inheritAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritAddress() {
        return inheritAddress;
    }

    /**
     * Sets the value of the inheritAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritAddress(Boolean value) {
        this.inheritAddress = value;
    }

    /**
     * Gets the value of the isTrialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrialAccount() {
        return isTrialAccount;
    }

    /**
     * Sets the value of the isTrialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrialAccount(Boolean value) {
        this.isTrialAccount = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLocale(Locale value) {
        this.locale = value;
    }

    /**
     * Gets the value of the parentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getParentAccount() {
        return parentAccount;
    }

    /**
     * Sets the value of the parentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setParentAccount(Account value) {
        this.parentAccount = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link Roles }
     *     
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Roles }
     *     
     */
    public void setRoles(Roles value) {
        this.roles = value;
    }

    /**
     * Gets the value of the languageLocale property.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLanguageLocale() {
        return languageLocale;
    }

    /**
     * Sets the value of the languageLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLanguageLocale(Locale value) {
        this.languageLocale = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Role" type="{http://exacttarget.com/wsdl/partnerAPI}Role" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "role"
    })
    public static class Roles {

        @XmlElement(name = "Role")
        protected List<Role> role;

        /**
         * Gets the value of the role property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Role }
         * </p>
         * 
         * 
         * @return
         *     The value of the role property.
         */
        public List<Role> getRole() {
            if (role == null) {
                role = new ArrayList<>();
            }
            return this.role;
        }

    }

}
