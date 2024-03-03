//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.03.03 at 09:32:17 PM EET
//

package ua.spro.soaphelloworld.loaneligibility;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="approvedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CriteriaMismatch" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"isEligible", "approvedAmount", "criteriaMismatch"})
@XmlRootElement(name = "Acknowledgement")
public class Acknowledgement {

  /**
   * -- SETTER -- Sets the value of the isEligible property. -- GETTER -- Gets the value of the
   * isEligible property.
   */
  @Getter @Setter protected boolean isEligible;

  /**
   * -- SETTER -- Sets the value of the approvedAmount property. -- GETTER -- Gets the value of the
   * approvedAmount property.
   */
  @Getter @Setter protected long approvedAmount;

  @XmlElement(name = "CriteriaMismatch", required = true)
  protected List<String> criteriaMismatch;

  /**
   * Gets the value of the criteriaMismatch property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the criteriaMismatch property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCriteriaMismatch().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getCriteriaMismatch() {
    if (criteriaMismatch == null) {
      criteriaMismatch = new ArrayList<String>();
    }
    return this.criteriaMismatch;
  }
}