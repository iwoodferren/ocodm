//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.13 at 03:00:14 PM EDT 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sponsor"/>
 *     &lt;enumeration value="Site"/>
 *     &lt;enumeration value="CRO"/>
 *     &lt;enumeration value="Lab"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;maxLength value="7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationType")
@XmlEnum
public enum LocationType {

    @XmlEnumValue("Sponsor")
    SPONSOR("Sponsor"),
    @XmlEnumValue("Site")
    SITE("Site"),
    CRO("CRO"),
    @XmlEnumValue("Lab")
    LAB("Lab"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationType fromValue(String v) {
        for (LocationType c: LocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
