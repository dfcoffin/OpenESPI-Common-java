/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 01:43:57 PM EDT 
//


package org.energyos.espi.common.models.atom;

import org.energyos.espi.common.models.atom.adapters.ContentAdapter;
import org.energyos.espi.common.models.atom.adapters.LinkAdapter;
import org.energyos.espi.common.models.atom.adapters.PublishedAdapter;
import org.energyos.espi.common.models.atom.adapters.UpdatedAdapter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The Atom entry construct is defined in section 4.1.2 of the format spec.
 * <p/>
 * <p/>
 * <p>Java class for entryType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="entryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="author" type="{http://www.w3.org/2005/Atom}personType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2005/Atom}categoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2005/Atom}contentType" minOccurs="0"/>
 *         &lt;element name="contributor" type="{http://www.w3.org/2005/Atom}personType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2005/Atom}idType"/>
 *         &lt;element name="link" type="{http://www.w3.org/2005/Atom}linkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="published" type="{http://www.w3.org/2005/Atom}dateTimeType" minOccurs="0"/>
 *         &lt;element name="rights" type="{http://www.w3.org/2005/Atom}textType" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2005/Atom}textType" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2005/Atom}textType" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2005/Atom}textType"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2005/Atom}dateTimeType"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2005/Atom}commonAttributes"/>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement(name = "entry")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entryType", propOrder = {
        "id",
        "links",
        "title",
        "content",
        "published",
        "updated",
        "authorOrCategoryOrContent"
})
public class EntryType {


    @XmlElement
    protected String id;

    @XmlElementRefs({
            @XmlElementRef(name = "link", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    @XmlJavaTypeAdapter(LinkAdapter.class)
    protected List<LinkType> links = new ArrayList<LinkType>();

    @XmlElement
    private String title;

    @XmlElementRefs({
            @XmlElementRef(name = "content", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    @XmlJavaTypeAdapter(ContentAdapter.class)
    protected ContentType content = new ContentType();

    @XmlElementRefs({
            @XmlElementRef(name = "published", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    @XmlJavaTypeAdapter(PublishedAdapter.class)
    protected DateTimeType published;

    @XmlElementRefs({
            @XmlElementRef(name = "updated", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    @XmlJavaTypeAdapter(UpdatedAdapter.class)
    protected DateTimeType updated;

    @XmlElementRefs({
            @XmlElementRef(name = "contributor", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "link", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "author", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "rights", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "source", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "summary", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "content", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "published", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "updated", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "id", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "category", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "title", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> authorOrCategoryOrContent;

    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public ContentType getContent() {
        return content;
    }

    public void setContent(ContentType content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LinkType> getLinks() {
        return links;
    }

    public void setLinks(List<LinkType> links) {
        this.links = links;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DateTimeType getPublished() {
        return published;
    }

    public void setPublished(DateTimeType published) {
        this.published = published;
    }

    public DateTimeType getUpdated() {
        return updated;
    }

    public void setUpdated(DateTimeType updated) {
        this.updated = updated;
    }
    /**
     * Gets the value of the authorOrCategoryOrContent property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorOrCategoryOrContent property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorOrCategoryOrContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link ContentType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     *
     *
     */
    public List<Object> getAuthorOrCategoryOrContent() {
        if (authorOrCategoryOrContent == null) {
            authorOrCategoryOrContent = new ArrayList<Object>();
        }
        return this.authorOrCategoryOrContent;
    }

    /**
     * Gets the value of the base property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the lang property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public void addRelatedLink(String href) {
        getLinks().add(new LinkType(LinkType.RELATED, href));
    }

    public void addUpLink(String href) {
        getLinks().add(new LinkType(LinkType.UP, href));
    }

    public String getUpHref() {
        String upHref = null;
        for(LinkType link : getLinks()) {
            if (link.getRel().equals(LinkType.UP)) {
                upHref = link.getHref();
                break;
            }
        }
        return upHref;
    }
}
