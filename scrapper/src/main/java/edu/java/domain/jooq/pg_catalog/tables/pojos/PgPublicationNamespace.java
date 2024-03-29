/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


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
public class PgPublicationNamespace implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private Long pnpubid;
    private Long pnnspid;

    public PgPublicationNamespace() {}

    public PgPublicationNamespace(PgPublicationNamespace value) {
        this.oid = value.oid;
        this.pnpubid = value.pnpubid;
        this.pnnspid = value.pnnspid;
    }

    @ConstructorProperties({ "oid", "pnpubid", "pnnspid" })
    public PgPublicationNamespace(
        @NotNull Long oid,
        @NotNull Long pnpubid,
        @NotNull Long pnnspid
    ) {
        this.oid = oid;
        this.pnpubid = pnpubid;
        this.pnnspid = pnnspid;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_namespace.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_namespace.oid</code>.
     */
    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_namespace.pnpubid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPnpubid() {
        return this.pnpubid;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_namespace.pnpubid</code>.
     */
    public void setPnpubid(@NotNull Long pnpubid) {
        this.pnpubid = pnpubid;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_namespace.pnnspid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPnnspid() {
        return this.pnnspid;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_namespace.pnnspid</code>.
     */
    public void setPnnspid(@NotNull Long pnnspid) {
        this.pnnspid = pnnspid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgPublicationNamespace other = (PgPublicationNamespace) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.pnpubid == null) {
            if (other.pnpubid != null)
                return false;
        }
        else if (!this.pnpubid.equals(other.pnpubid))
            return false;
        if (this.pnnspid == null) {
            if (other.pnnspid != null)
                return false;
        }
        else if (!this.pnnspid.equals(other.pnnspid))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.pnpubid == null) ? 0 : this.pnpubid.hashCode());
        result = prime * result + ((this.pnnspid == null) ? 0 : this.pnnspid.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPublicationNamespace (");

        sb.append(oid);
        sb.append(", ").append(pnpubid);
        sb.append(", ").append(pnnspid);

        sb.append(")");
        return sb.toString();
    }
}
