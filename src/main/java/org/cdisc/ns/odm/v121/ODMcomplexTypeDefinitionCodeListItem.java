//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.23 at 11:13:14 AM EST 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-CodeListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-CodeListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Decode"/>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}CodeListItemElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}CodeListItemAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}CodeListItemAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-CodeListItem", propOrder = {
    "decode"
})
public class ODMcomplexTypeDefinitionCodeListItem {

    @XmlElement(name = "Decode", required = true)
    protected ODMcomplexTypeDefinitionDecode decode;
    @XmlAttribute(name = "CodedValue", required = true)
    protected String codedValue;

    /**
     * Gets the value of the decode property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDecode }
     *     
     */
    public ODMcomplexTypeDefinitionDecode getDecode() {
        return decode;
    }

    /**
     * Sets the value of the decode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDecode }
     *     
     */
    public void setDecode(ODMcomplexTypeDefinitionDecode value) {
        this.decode = value;
    }

    /**
     * Gets the value of the codedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedValue() {
        return codedValue;
    }

    /**
     * Sets the value of the codedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedValue(String value) {
        this.codedValue = value;
    }

}
