//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.iso20022.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageReject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageReject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppHdr" type="{}BusinessApplicationHeaderV01"/>
 *         &lt;element name="Document" type="{}admi.002.001.01"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageReject", propOrder = {
    "appHdr",
    "document"
})
public class MessageReject {

    @XmlElement(name = "AppHdr", required = true)
    protected BusinessApplicationHeaderV01 appHdr;
    @XmlElement(name = "Document", required = true)
    protected Admi00200101 document;

    /**
     * Gets the value of the appHdr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeaderV01 }
     *     
     */
    public BusinessApplicationHeaderV01 getAppHdr() {
        return appHdr;
    }

    /**
     * Sets the value of the appHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeaderV01 }
     *     
     */
    public void setAppHdr(BusinessApplicationHeaderV01 value) {
        this.appHdr = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Admi00200101 }
     *     
     */
    public Admi00200101 getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Admi00200101 }
     *     
     */
    public void setDocument(Admi00200101 value) {
        this.document = value;
    }

}