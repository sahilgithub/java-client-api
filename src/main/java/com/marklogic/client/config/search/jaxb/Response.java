//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.20 at 02:46:45 PM PDT 
//


/*
 * Copyright 2012 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.client.config.search.jaxb;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://marklogic.com/appservices/search}result" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}ResponseFacet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}qtext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}query" minOccurs="0"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}constraint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}warning" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}report" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}plan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}metrics"/>
 *       &lt;/sequence>
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="page-length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "responseFacet",
    "qtext",
    "query",
    "constraint",
    "warning",
    "report",
    "plan",
    "metrics"
})
@XmlRootElement(name = "response")
public class Response {

    protected List<Result> result = new Vector<Result>();
    @XmlElementRef(name = "ResponseFacet", namespace = "http://marklogic.com/appservices/search", type = JAXBElement.class)
    protected List<JAXBElement<?>> responseFacet = new Vector<JAXBElement<?>>();
    protected List<String> qtext = new Vector<String>();
    protected AnyCtsElement query;
    protected List<Constraint> constraint = new Vector<Constraint>();
    protected List<Warning> warning = new Vector<Warning>();
    protected List<Report> report = new Vector<Report>();
    protected List<Plan> plan = new Vector<Plan>();
    @XmlElement(required = true)
    protected Metrics metrics;
    @XmlAttribute(name = "total", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long total;
    @XmlAttribute(name = "start", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long start;
    @XmlAttribute(name = "page-length", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long pageLength;

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Result }
     * 
     * 
     */
    public List<Result> getResult() {
        if (result == null) {
            result = new Vector<Result>();
        }
        return this.result;
    }

    public boolean isSetResult() {
        return ((this.result!= null)&&(!this.result.isEmpty()));
    }

    public void unsetResult() {
        this.result = null;
    }

    /**
     * Gets the value of the responseFacet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseFacet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseFacet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Boxes }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getResponseFacet() {
        if (responseFacet == null) {
            responseFacet = new Vector<JAXBElement<?>>();
        }
        return this.responseFacet;
    }

    public boolean isSetResponseFacet() {
        return ((this.responseFacet!= null)&&(!this.responseFacet.isEmpty()));
    }

    public void unsetResponseFacet() {
        this.responseFacet = null;
    }

    /**
     * Gets the value of the qtext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQtext() {
        if (qtext == null) {
            qtext = new Vector<String>();
        }
        return this.qtext;
    }

    public boolean isSetQtext() {
        return ((this.qtext!= null)&&(!this.qtext.isEmpty()));
    }

    public void unsetQtext() {
        this.qtext = null;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link AnyCtsElement }
     *     
     */
    public AnyCtsElement getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyCtsElement }
     *     
     */
    public void setQuery(AnyCtsElement value) {
        this.query = value;
    }

    public boolean isSetQuery() {
        return (this.query!= null);
    }

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Constraint }
     * 
     * 
     */
    public List<Constraint> getConstraint() {
        if (constraint == null) {
            constraint = new Vector<Constraint>();
        }
        return this.constraint;
    }

    public boolean isSetConstraint() {
        return ((this.constraint!= null)&&(!this.constraint.isEmpty()));
    }

    public void unsetConstraint() {
        this.constraint = null;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Warning }
     * 
     * 
     */
    public List<Warning> getWarning() {
        if (warning == null) {
            warning = new Vector<Warning>();
        }
        return this.warning;
    }

    public boolean isSetWarning() {
        return ((this.warning!= null)&&(!this.warning.isEmpty()));
    }

    public void unsetWarning() {
        this.warning = null;
    }

    /**
     * Gets the value of the report property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Report }
     * 
     * 
     */
    public List<Report> getReport() {
        if (report == null) {
            report = new Vector<Report>();
        }
        return this.report;
    }

    public boolean isSetReport() {
        return ((this.report!= null)&&(!this.report.isEmpty()));
    }

    public void unsetReport() {
        this.report = null;
    }

    /**
     * Gets the value of the plan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plan }
     * 
     * 
     */
    public List<Plan> getPlan() {
        if (plan == null) {
            plan = new Vector<Plan>();
        }
        return this.plan;
    }

    public boolean isSetPlan() {
        return ((this.plan!= null)&&(!this.plan.isEmpty()));
    }

    public void unsetPlan() {
        this.plan = null;
    }

    /**
     * Gets the value of the metrics property.
     * 
     * @return
     *     possible object is
     *     {@link Metrics }
     *     
     */
    public Metrics getMetrics() {
        return metrics;
    }

    /**
     * Sets the value of the metrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metrics }
     *     
     */
    public void setMetrics(Metrics value) {
        this.metrics = value;
    }

    public boolean isSetMetrics() {
        return (this.metrics!= null);
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public long getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(long value) {
        this.total = value;
    }

    public boolean isSetTotal() {
        return true;
    }

    /**
     * Gets the value of the start property.
     * 
     */
    public long getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(long value) {
        this.start = value;
    }

    public boolean isSetStart() {
        return true;
    }

    /**
     * Gets the value of the pageLength property.
     * 
     */
    public long getPageLength() {
        return pageLength;
    }

    /**
     * Sets the value of the pageLength property.
     * 
     */
    public void setPageLength(long value) {
        this.pageLength = value;
    }

    public boolean isSetPageLength() {
        return true;
    }

}
