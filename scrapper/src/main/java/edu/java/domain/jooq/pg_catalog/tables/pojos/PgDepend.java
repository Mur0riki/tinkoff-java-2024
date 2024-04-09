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
public class PgDepend implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long classid;
    private Long objid;
    private Integer objsubid;
    private Long refclassid;
    private Long refobjid;
    private Integer refobjsubid;
    private String deptype;

    public PgDepend() {}

    public PgDepend(PgDepend value) {
        this.classid = value.classid;
        this.objid = value.objid;
        this.objsubid = value.objsubid;
        this.refclassid = value.refclassid;
        this.refobjid = value.refobjid;
        this.refobjsubid = value.refobjsubid;
        this.deptype = value.deptype;
    }

    @ConstructorProperties({ "classid", "objid", "objsubid", "refclassid", "refobjid", "refobjsubid", "deptype" })
    public PgDepend(
        @NotNull Long classid,
        @NotNull Long objid,
        @NotNull Integer objsubid,
        @NotNull Long refclassid,
        @NotNull Long refobjid,
        @NotNull Integer refobjsubid,
        @NotNull String deptype
    ) {
        this.classid = classid;
        this.objid = objid;
        this.objsubid = objsubid;
        this.refclassid = refclassid;
        this.refobjid = refobjid;
        this.refobjsubid = refobjsubid;
        this.deptype = deptype;
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.classid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getClassid() {
        return this.classid;
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.classid</code>.
     */
    public void setClassid(@NotNull Long classid) {
        this.classid = classid;
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.objid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getObjid() {
        return this.objid;
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.objid</code>.
     */
    public void setObjid(@NotNull Long objid) {
        this.objid = objid;
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.objsubid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getObjsubid() {
        return this.objsubid;
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.objsubid</code>.
     */
    public void setObjsubid(@NotNull Integer objsubid) {
        this.objsubid = objsubid;
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.refclassid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRefclassid() {
        return this.refclassid;
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.refclassid</code>.
     */
    public void setRefclassid(@NotNull Long refclassid) {
        this.refclassid = refclassid;
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.refobjid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRefobjid() {
        return this.refobjid;
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.refobjid</code>.
     */
    public void setRefobjid(@NotNull Long refobjid) {
        this.refobjid = refobjid;
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.refobjsubid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getRefobjsubid() {
        return this.refobjsubid;
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.refobjsubid</code>.
     */
    public void setRefobjsubid(@NotNull Integer refobjsubid) {
        this.refobjsubid = refobjsubid;
    }

    /**
     * Getter for <code>pg_catalog.pg_depend.deptype</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDeptype() {
        return this.deptype;
    }

    /**
     * Setter for <code>pg_catalog.pg_depend.deptype</code>.
     */
    public void setDeptype(@NotNull String deptype) {
        this.deptype = deptype;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgDepend other = (PgDepend) obj;
        if (this.classid == null) {
            if (other.classid != null)
                return false;
        }
        else if (!this.classid.equals(other.classid))
            return false;
        if (this.objid == null) {
            if (other.objid != null)
                return false;
        }
        else if (!this.objid.equals(other.objid))
            return false;
        if (this.objsubid == null) {
            if (other.objsubid != null)
                return false;
        }
        else if (!this.objsubid.equals(other.objsubid))
            return false;
        if (this.refclassid == null) {
            if (other.refclassid != null)
                return false;
        }
        else if (!this.refclassid.equals(other.refclassid))
            return false;
        if (this.refobjid == null) {
            if (other.refobjid != null)
                return false;
        }
        else if (!this.refobjid.equals(other.refobjid))
            return false;
        if (this.refobjsubid == null) {
            if (other.refobjsubid != null)
                return false;
        }
        else if (!this.refobjsubid.equals(other.refobjsubid))
            return false;
        if (this.deptype == null) {
            if (other.deptype != null)
                return false;
        }
        else if (!this.deptype.equals(other.deptype))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.classid == null) ? 0 : this.classid.hashCode());
        result = prime * result + ((this.objid == null) ? 0 : this.objid.hashCode());
        result = prime * result + ((this.objsubid == null) ? 0 : this.objsubid.hashCode());
        result = prime * result + ((this.refclassid == null) ? 0 : this.refclassid.hashCode());
        result = prime * result + ((this.refobjid == null) ? 0 : this.refobjid.hashCode());
        result = prime * result + ((this.refobjsubid == null) ? 0 : this.refobjsubid.hashCode());
        result = prime * result + ((this.deptype == null) ? 0 : this.deptype.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgDepend (");

        sb.append(classid);
        sb.append(", ").append(objid);
        sb.append(", ").append(objsubid);
        sb.append(", ").append(refclassid);
        sb.append(", ").append(refobjid);
        sb.append(", ").append(refobjsubid);
        sb.append(", ").append(deptype);

        sb.append(")");
        return sb.toString();
    }
}