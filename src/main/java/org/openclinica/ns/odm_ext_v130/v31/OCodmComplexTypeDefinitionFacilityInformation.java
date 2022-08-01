//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.01 at 01:16:04 PM EDT 
//


package org.openclinica.ns.odm_ext_v130.v31;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-FacilityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-FacilityInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FacilityName" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityCity" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityState" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityCountry" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityContactName" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityContactDegree" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityContactPhone" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityContactEmail" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}FacilityInformationElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}FacilityInformationAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}FacilityInformationAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-FacilityInformation", propOrder = {
    "facilityName",
    "facilityCity",
    "facilityState",
    "postalCode",
    "facilityCountry",
    "facilityContactName",
    "facilityContactDegree",
    "facilityContactPhone",
    "facilityContactEmail"
})
public class OCodmComplexTypeDefinitionFacilityInformation
    implements Serializable
{

    @XmlElement(name = "FacilityName")
    protected String facilityName;
    @XmlElement(name = "FacilityCity")
    protected String facilityCity;
    @XmlElement(name = "FacilityState")
    protected String facilityState;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "FacilityCountry")
    protected String facilityCountry;
    @XmlElement(name = "FacilityContactName")
    protected String facilityContactName;
    @XmlElement(name = "FacilityContactDegree")
    protected String facilityContactDegree;
    @XmlElement(name = "FacilityContactPhone")
    protected String facilityContactPhone;
    @XmlElement(name = "FacilityContactEmail")
    protected String facilityContactEmail;

    /**
     * Gets the value of the facilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Sets the value of the facilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
    }

    public boolean isSetFacilityName() {
        return (this.facilityName!= null);
    }

    /**
     * Gets the value of the facilityCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCity() {
        return facilityCity;
    }

    /**
     * Sets the value of the facilityCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCity(String value) {
        this.facilityCity = value;
    }

    public boolean isSetFacilityCity() {
        return (this.facilityCity!= null);
    }

    /**
     * Gets the value of the facilityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityState() {
        return facilityState;
    }

    /**
     * Sets the value of the facilityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityState(String value) {
        this.facilityState = value;
    }

    public boolean isSetFacilityState() {
        return (this.facilityState!= null);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public boolean isSetPostalCode() {
        return (this.postalCode!= null);
    }

    /**
     * Gets the value of the facilityCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCountry() {
        return facilityCountry;
    }

    /**
     * Sets the value of the facilityCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCountry(String value) {
        this.facilityCountry = value;
    }

    public boolean isSetFacilityCountry() {
        return (this.facilityCountry!= null);
    }

    /**
     * Gets the value of the facilityContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContactName() {
        return facilityContactName;
    }

    /**
     * Sets the value of the facilityContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContactName(String value) {
        this.facilityContactName = value;
    }

    public boolean isSetFacilityContactName() {
        return (this.facilityContactName!= null);
    }

    /**
     * Gets the value of the facilityContactDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContactDegree() {
        return facilityContactDegree;
    }

    /**
     * Sets the value of the facilityContactDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContactDegree(String value) {
        this.facilityContactDegree = value;
    }

    public boolean isSetFacilityContactDegree() {
        return (this.facilityContactDegree!= null);
    }

    /**
     * Gets the value of the facilityContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContactPhone() {
        return facilityContactPhone;
    }

    /**
     * Sets the value of the facilityContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContactPhone(String value) {
        this.facilityContactPhone = value;
    }

    public boolean isSetFacilityContactPhone() {
        return (this.facilityContactPhone!= null);
    }

    /**
     * Gets the value of the facilityContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContactEmail() {
        return facilityContactEmail;
    }

    /**
     * Sets the value of the facilityContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContactEmail(String value) {
        this.facilityContactEmail = value;
    }

    public boolean isSetFacilityContactEmail() {
        return (this.facilityContactEmail!= null);
    }

}
