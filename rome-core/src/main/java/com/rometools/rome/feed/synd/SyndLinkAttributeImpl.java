package com.rometools.rome.feed.synd;

import com.rometools.rome.feed.impl.CloneableBean;
import com.rometools.rome.feed.impl.EqualsBean;
import com.rometools.rome.feed.impl.ToStringBean;

import java.io.Serializable;
import java.util.Collections;

public class SyndLinkAttributeImpl implements SyndLinkAttribute, Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String value;
    private String namespaceURI;
    private String namespacePrefix;

    public SyndLinkAttributeImpl() { }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getNamespaceURI() {
        return this.namespaceURI;
    }

    @Override
    public void setNamespaceURI(String namespaceURI) {
        this.namespaceURI = namespaceURI;
    }

    /**
     * Returns the prefix of the attribute namespace
     *
     * @return the prefix of the attribute namespace
     */
    @Override
    public String getNamespacePrefix() {
        return this.namespacePrefix;
    }

    /**
     * Sets the prefix of the attribute namespace
     *
     * @param prefix the prefix of the attribute namespace
     */
    @Override
    public void setNamespacePrefix(String prefix) {
        this.namespacePrefix = prefix;
    }

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
     * @param other the object to compare with
     * @return <b>true</b> if 'this' object is equal to the 'other' object.
     *
     */
    @Override
    public boolean equals(final Object other) {
        return EqualsBean.beanEquals(SyndLinkAttribute.class, this, other);
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
}
