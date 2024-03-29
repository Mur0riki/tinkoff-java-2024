/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

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
public class PgGetWalResourceManagers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer rmId;
    private String rmName;
    private Boolean rmBuiltin;

    public PgGetWalResourceManagers() {}

    public PgGetWalResourceManagers(PgGetWalResourceManagers value) {
        this.rmId = value.rmId;
        this.rmName = value.rmName;
        this.rmBuiltin = value.rmBuiltin;
    }

    @ConstructorProperties({ "rmId", "rmName", "rmBuiltin" })
    public PgGetWalResourceManagers(
        @Nullable Integer rmId,
        @Nullable String rmName,
        @Nullable Boolean rmBuiltin
    ) {
        this.rmId = rmId;
        this.rmName = rmName;
        this.rmBuiltin = rmBuiltin;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_wal_resource_managers.rm_id</code>.
     */
    @Nullable
    public Integer getRmId() {
        return this.rmId;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_wal_resource_managers.rm_id</code>.
     */
    public void setRmId(@Nullable Integer rmId) {
        this.rmId = rmId;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_wal_resource_managers.rm_name</code>.
     */
    @Nullable
    public String getRmName() {
        return this.rmName;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_wal_resource_managers.rm_name</code>.
     */
    public void setRmName(@Nullable String rmName) {
        this.rmName = rmName;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_wal_resource_managers.rm_builtin</code>.
     */
    @Nullable
    public Boolean getRmBuiltin() {
        return this.rmBuiltin;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_wal_resource_managers.rm_builtin</code>.
     */
    public void setRmBuiltin(@Nullable Boolean rmBuiltin) {
        this.rmBuiltin = rmBuiltin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgGetWalResourceManagers other = (PgGetWalResourceManagers) obj;
        if (this.rmId == null) {
            if (other.rmId != null)
                return false;
        }
        else if (!this.rmId.equals(other.rmId))
            return false;
        if (this.rmName == null) {
            if (other.rmName != null)
                return false;
        }
        else if (!this.rmName.equals(other.rmName))
            return false;
        if (this.rmBuiltin == null) {
            if (other.rmBuiltin != null)
                return false;
        }
        else if (!this.rmBuiltin.equals(other.rmBuiltin))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.rmId == null) ? 0 : this.rmId.hashCode());
        result = prime * result + ((this.rmName == null) ? 0 : this.rmName.hashCode());
        result = prime * result + ((this.rmBuiltin == null) ? 0 : this.rmBuiltin.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgGetWalResourceManagers (");

        sb.append(rmId);
        sb.append(", ").append(rmName);
        sb.append(", ").append(rmBuiltin);

        sb.append(")");
        return sb.toString();
    }
}
