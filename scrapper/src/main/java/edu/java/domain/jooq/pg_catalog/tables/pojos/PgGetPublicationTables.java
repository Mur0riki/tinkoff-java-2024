/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgGetPublicationTables implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long pubid;
    private Long relid;
    private Object[] attrs;
    private Object qual;

    public PgGetPublicationTables() {}

    public PgGetPublicationTables(PgGetPublicationTables value) {
        this.pubid = value.pubid;
        this.relid = value.relid;
        this.attrs = value.attrs;
        this.qual = value.qual;
    }

    @ConstructorProperties({ "pubid", "relid", "attrs", "qual" })
    public PgGetPublicationTables(
        @Nullable Long pubid,
        @Nullable Long relid,
        @Nullable Object[] attrs,
        @Nullable Object qual
    ) {
        this.pubid = pubid;
        this.relid = relid;
        this.attrs = attrs;
        this.qual = qual;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_publication_tables.pubid</code>.
     */
    @Nullable
    public Long getPubid() {
        return this.pubid;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_publication_tables.pubid</code>.
     */
    public void setPubid(@Nullable Long pubid) {
        this.pubid = pubid;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_publication_tables.attrs</code>.
     */
    @Nullable
    public Object[] getAttrs() {
        return this.attrs;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_publication_tables.attrs</code>.
     */
    public void setAttrs(@Nullable Object[] attrs) {
        this.attrs = attrs;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getQual() {
        return this.qual;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setQual(@Nullable Object qual) {
        this.qual = qual;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgGetPublicationTables other = (PgGetPublicationTables) obj;
        if (this.pubid == null) {
            if (other.pubid != null)
                return false;
        }
        else if (!this.pubid.equals(other.pubid))
            return false;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.attrs == null) {
            if (other.attrs != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.attrs, other.attrs))
            return false;
        if (this.qual == null) {
            if (other.qual != null)
                return false;
        }
        else if (!this.qual.equals(other.qual))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pubid == null) ? 0 : this.pubid.hashCode());
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.attrs == null) ? 0 : Arrays.deepHashCode(this.attrs));
        result = prime * result + ((this.qual == null) ? 0 : this.qual.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgGetPublicationTables (");

        sb.append(pubid);
        sb.append(", ").append(relid);
        sb.append(", ").append(Arrays.deepToString(attrs));
        sb.append(", ").append(qual);

        sb.append(")");
        return sb.toString();
    }
}