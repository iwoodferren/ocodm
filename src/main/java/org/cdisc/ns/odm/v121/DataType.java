//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.01 at 01:16:04 PM EDT 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="integer"/&gt;
 *     &lt;enumeration value="float"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="datetime"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;maxLength value="8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataType")
@XmlEnum
public enum DataType {

    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("string")
    STRING("string");
    private final String value;

    DataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataType fromValue(String v) {
        for (DataType c: DataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
