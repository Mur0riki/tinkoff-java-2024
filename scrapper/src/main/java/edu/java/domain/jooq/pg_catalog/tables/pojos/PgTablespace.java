/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
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
public class PgTablespace implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String spcname;
    private Long spcowner;
    private String[] spcacl;
    private String[] spcoptions;

    public PgTablespace() {}

    public PgTablespace(PgTablespace value) {
        this.oid = value.oid;
        this.spcname = value.spcname;
        this.spcowner = value.spcowner;
        this.spcacl = value.spcacl;
        this.spcoptions = value.spcoptions;
    }

    @ConstructorProperties({ "oid", "spcname", "spcowner", "spcacl", "spcoptions" })
    public PgTablespace(
        @NotNull Long oid,
        @NotNull String spcname,
        @NotNull Long spcowner,
        @Nullable String[] spcacl,
        @Nullable String[] spcoptions
    ) {
        this.oid = oid;
        this.spcname = spcname;
        this.spcowner = spcowner;
        this.spcacl = spcacl;
        this.spcoptions = spcoptions;
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_tablespace.oid</code>.
     */
    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.spcname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getSpcname() {
        return this.spcname;
    }

    /**
     * Setter for <code>pg_catalog.pg_tablespace.spcname</code>.
     */
    public void setSpcname(@NotNull String spcname) {
        this.spcname = spcname;
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.spcowner</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getSpcowner() {
        return this.spcowner;
    }

    /**
     * Setter for <code>pg_catalog.pg_tablespace.spcowner</code>.
     */
    public void setSpcowner(@NotNull Long spcowner) {
        this.spcowner = spcowner;
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.spcacl</code>.
     */
    @Nullable
    public String[] getSpcacl() {
        return this.spcacl;
    }

    /**
     * Setter for <code>pg_catalog.pg_tablespace.spcacl</code>.
     */
    public void setSpcacl(@Nullable String[] spcacl) {
        this.spcacl = spcacl;
    }

    /**
     * Getter for <code>pg_catalog.pg_tablespace.spcoptions</code>.
     */
    @Nullable
    public String[] getSpcoptions() {
        return this.spcoptions;
    }

    /**
     * Setter for <code>pg_catalog.pg_tablespace.spcoptions</code>.
     */
    public void setSpcoptions(@Nullable String[] spcoptions) {
        this.spcoptions = spcoptions;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgTablespace other = (PgTablespace) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.spcname == null) {
            if (other.spcname != null)
                return false;
        }
        else if (!this.spcname.equals(other.spcname))
            return false;
        if (this.spcowner == null) {
            if (other.spcowner != null)
                return false;
        }
        else if (!this.spcowner.equals(other.spcowner))
            return false;
        if (this.spcacl == null) {
            if (other.spcacl != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.spcacl, other.spcacl))
            return false;
        if (this.spcoptions == null) {
            if (other.spcoptions != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.spcoptions, other.spcoptions))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.spcname == null) ? 0 : this.spcname.hashCode());
        result = prime * result + ((this.spcowner == null) ? 0 : this.spcowner.hashCode());
        result = prime * result + ((this.spcacl == null) ? 0 : Arrays.deepHashCode(this.spcacl));
        result = prime * result + ((this.spcoptions == null) ? 0 : Arrays.deepHashCode(this.spcoptions));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTablespace (");

        sb.append(oid);
        sb.append(", ").append(spcname);
        sb.append(", ").append(spcowner);
        sb.append(", ").append(Arrays.deepToString(spcacl));
        sb.append(", ").append(Arrays.deepToString(spcoptions));

        sb.append(")");
        return sb.toString();
    }
}