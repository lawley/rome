/*
 * Copyright 2004 Sun Microsystems, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.rometools.rome.feed.atom;

import com.rometools.rome.feed.impl.CloneableBean;
import com.rometools.rome.feed.impl.EqualsBean;
import com.rometools.rome.feed.impl.ToStringBean;
import com.rometools.rome.feed.synd.SyndLinkAttribute;
import com.rometools.utils.Alternatives;
import com.rometools.utils.Lists;
import org.jdom2.Attribute;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;


/**
 * Bean for link elements of Atom feeds.
 */
public class Link implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String href;
    private String hrefResolved;
    private String rel = "alternate";
    private String type;
    private String hreflang;
    private String title;
    private long length;
    private List<LinkAttribute> attributes;


    public Link() { }

    /**
     * Creates a deep 'bean' clone of the object.
     *
     * @return a clone of the object.
     * @throws CloneNotSupportedException thrown if an element of the object cannot be cloned.
     *
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return CloneableBean.beanClone(this, Collections.<String>emptySet());
    }

    /**
     * Indicates whether some other object is "equal to" this one as defined by the Object equals()
     * method.
     *
     * @param other The reference object with which to compare.
     * @return <b>true</b> if 'this' object is equal to the 'other' object.
     *
     */
    @Override
    public boolean equals(final Object other) {
        return EqualsBean.beanEquals(this.getClass(), this, other);
    }

    /**
     * Returns a hashcode value for the object.
     * It follows the contract defined by the Object hashCode() method.
     *
     * @return the hashcode of the bean object.
     *
     */
    @Override
    public int hashCode() {
        return EqualsBean.beanHashCode(this);
    }

    /**
     * Returns the String representation for the object.
     *
     * @return String representation for the object.
     *
     */
    @Override
    public String toString() {
        return ToStringBean.toString(this.getClass(), this);
    }

    /**
     * Returns the link rel.
     *
     * @return the link rel, <b>null</b> if none.
     *
     */
    public String getRel() {
        return rel;
    }

    /**
     * Sets the link rel.
     *
     * @param rel the link rel,, <b>null</b> if none.
     *
     */
    public void setRel(final String rel) {
        // TODO add check, ask P@ about the check
        this.rel = rel;
    }

    /**
     * Returns the link type.
     *
     * @return the link type, <b>null</b> if none.
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the link type.
     *
     * @param type the link type, <b>null</b> if none.
     *
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Returns the link href.
     *
     * @return the link href, <b>null</b> if none.
     *
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the link href.
     *
     * @param href the link href, <b>null</b> if none.
     *
     */
    public void setHref(final String href) {
        this.href = href;
    }

    public void setHrefResolved(final String hrefResolved) {
        this.hrefResolved = hrefResolved;
    }

    public String getHrefResolved() {
        return Alternatives.firstNotNull(hrefResolved, href);
    }

    /**
     * Returns the link title.
     *
     * @return the link title, <b>null</b> if none.
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the link title.
     *
     * @param title the link title, <b>null</b> if none.
     *
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Returns the hreflang
     *
     * @return Returns the hreflang.
     * @since Atom 1.0
     */
    public String getHreflang() {
        return hreflang;
    }

    /**
     * Set the hreflang
     *
     * @param hreflang The hreflang to set.
     * @since Atom 1.0
     */
    public void setHreflang(final String hreflang) {
        this.hreflang = hreflang;
    }

    /**
     * Returns the length
     *
     * @return Returns the length.
     */
    public long getLength() {
        return length;
    }

    /**
     * Set the length
     *
     * @param length The length to set.
     */
    public void setLength(final long length) {
        this.length = length;
    }

    /**
     * Returns link attributes found on the Link object
     * 
     * @return the link attributes (mutable)
     */
    public List<LinkAttribute> getLinkAttributes() {
        return attributes = Lists.createWhenNull(attributes);
    }

    /**
     * Sets link attributes on the Link object
     * 
     * @param attributes the link attributes to set
     */
    public void setLinkAttributes(List<LinkAttribute> attributes) {
        this.attributes = attributes;
    }
}
