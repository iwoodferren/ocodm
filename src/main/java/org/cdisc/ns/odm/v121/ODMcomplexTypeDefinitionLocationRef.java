//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.13 at 03:00:14 PM EDT 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-LocationRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-LocationRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}LocationRefElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}LocationRefAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}LocationRefAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-LocationRef")
public class ODMcomplexTypeDefinitionLocationRef {

    @XmlAttribute(name = "LocationOID", required = true)
    protected String locationOID;

    /**
     * Gets the value of the locationOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationOID() {
        return locationOID;
    }

    /**
     * Sets the value of the locationOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationOID(String value) {
        this.locationOID = value;
    }

}
