//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.01 at 01:16:04 PM EDT 
//


package org.cdisc.ns.odm.v121;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-MetaDataVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-MetaDataVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionPreIncludeElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Include" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Protocol" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}FormDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemGroupDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}CodeList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ImputationMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Presentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "include",
    "protocol",
    "studyEventDef",
    "formDef",
    "itemGroupDef",
    "itemDef",
    "codeList",
    "imputationMethod",
    "presentation"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionMetaDataVersion.class
})
public class OriginalODMcomplexTypeDefinitionMetaDataVersion
    implements Serializable
{

    @XmlElement(name = "Include")
    protected ODMcomplexTypeDefinitionInclude include;
    @XmlElement(name = "Protocol")
    protected ODMcomplexTypeDefinitionProtocol protocol;
    @XmlElement(name = "StudyEventDef")
    protected List<ODMcomplexTypeDefinitionStudyEventDef> studyEventDef;
    @XmlElement(name = "FormDef")
    protected List<ODMcomplexTypeDefinitionFormDef> formDef;
    @XmlElement(name = "ItemGroupDef")
    protected List<ODMcomplexTypeDefinitionItemGroupDef> itemGroupDef;
    @XmlElement(name = "ItemDef")
    protected List<ODMcomplexTypeDefinitionItemDef> itemDef;
    @XmlElement(name = "CodeList")
    protected List<ODMcomplexTypeDefinitionCodeList> codeList;
    @XmlElement(name = "ImputationMethod")
    protected List<ODMcomplexTypeDefinitionImputationMethod> imputationMethod;
    @XmlElement(name = "Presentation")
    protected List<ODMcomplexTypeDefinitionPresentation> presentation;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionInclude }
     *     
     */
    public ODMcomplexTypeDefinitionInclude getInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionInclude }
     *     
     */
    public void setInclude(ODMcomplexTypeDefinitionInclude value) {
        this.include = value;
    }

    public boolean isSetInclude() {
        return (this.include!= null);
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionProtocol }
     *     
     */
    public ODMcomplexTypeDefinitionProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionProtocol }
     *     
     */
    public void setProtocol(ODMcomplexTypeDefinitionProtocol value) {
        this.protocol = value;
    }

    public boolean isSetProtocol() {
        return (this.protocol!= null);
    }

    /**
     * Gets the value of the studyEventDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEventDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEventDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStudyEventDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStudyEventDef> getStudyEventDef() {
        if (studyEventDef == null) {
            studyEventDef = new ArrayList<ODMcomplexTypeDefinitionStudyEventDef>();
        }
        return this.studyEventDef;
    }

    public boolean isSetStudyEventDef() {
        return ((this.studyEventDef!= null)&&(!this.studyEventDef.isEmpty()));
    }

    public void unsetStudyEventDef() {
        this.studyEventDef = null;
    }

    /**
     * Gets the value of the formDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFormDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFormDef> getFormDef() {
        if (formDef == null) {
            formDef = new ArrayList<ODMcomplexTypeDefinitionFormDef>();
        }
        return this.formDef;
    }

    public boolean isSetFormDef() {
        return ((this.formDef!= null)&&(!this.formDef.isEmpty()));
    }

    public void unsetFormDef() {
        this.formDef = null;
    }

    /**
     * Gets the value of the itemGroupDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemGroupDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemGroupDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemGroupDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemGroupDef> getItemGroupDef() {
        if (itemGroupDef == null) {
            itemGroupDef = new ArrayList<ODMcomplexTypeDefinitionItemGroupDef>();
        }
        return this.itemGroupDef;
    }

    public boolean isSetItemGroupDef() {
        return ((this.itemGroupDef!= null)&&(!this.itemGroupDef.isEmpty()));
    }

    public void unsetItemGroupDef() {
        this.itemGroupDef = null;
    }

    /**
     * Gets the value of the itemDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemDef> getItemDef() {
        if (itemDef == null) {
            itemDef = new ArrayList<ODMcomplexTypeDefinitionItemDef>();
        }
        return this.itemDef;
    }

    public boolean isSetItemDef() {
        return ((this.itemDef!= null)&&(!this.itemDef.isEmpty()));
    }

    public void unsetItemDef() {
        this.itemDef = null;
    }

    /**
     * Gets the value of the codeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCodeList }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCodeList> getCodeList() {
        if (codeList == null) {
            codeList = new ArrayList<ODMcomplexTypeDefinitionCodeList>();
        }
        return this.codeList;
    }

    public boolean isSetCodeList() {
        return ((this.codeList!= null)&&(!this.codeList.isEmpty()));
    }

    public void unsetCodeList() {
        this.codeList = null;
    }

    /**
     * Gets the value of the imputationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imputationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImputationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionImputationMethod }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionImputationMethod> getImputationMethod() {
        if (imputationMethod == null) {
            imputationMethod = new ArrayList<ODMcomplexTypeDefinitionImputationMethod>();
        }
        return this.imputationMethod;
    }

    public boolean isSetImputationMethod() {
        return ((this.imputationMethod!= null)&&(!this.imputationMethod.isEmpty()));
    }

    public void unsetImputationMethod() {
        this.imputationMethod = null;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionPresentation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionPresentation> getPresentation() {
        if (presentation == null) {
            presentation = new ArrayList<ODMcomplexTypeDefinitionPresentation>();
        }
        return this.presentation;
    }

    public boolean isSetPresentation() {
        return ((this.presentation!= null)&&(!this.presentation.isEmpty()));
    }

    public void unsetPresentation() {
        this.presentation = null;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    public boolean isSetOID() {
        return (this.oid!= null);
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

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

}
