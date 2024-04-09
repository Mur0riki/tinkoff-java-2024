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
public class PgAuthMembers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private Long roleid;
    private Long member;
    private Long grantor;
    private Boolean adminOption;
    private Boolean inheritOption;
    private Boolean setOption;

    public PgAuthMembers() {}

    public PgAuthMembers(PgAuthMembers value) {
        this.oid = value.oid;
        this.roleid = value.roleid;
        this.member = value.member;
        this.grantor = value.grantor;
        this.adminOption = value.adminOption;
        this.inheritOption = value.inheritOption;
        this.setOption = value.setOption;
    }

    @ConstructorProperties({ "oid", "roleid", "member", "grantor", "adminOption", "inheritOption", "setOption" })
    public PgAuthMembers(
        @NotNull Long oid,
        @NotNull Long roleid,
        @NotNull Long member,
        @NotNull Long grantor,
        @NotNull Boolean adminOption,
        @NotNull Boolean inheritOption,
        @NotNull Boolean setOption
    ) {
        this.oid = oid;
        this.roleid = roleid;
        this.member = member;
        this.grantor = grantor;
        this.adminOption = adminOption;
        this.inheritOption = inheritOption;
        this.setOption = setOption;
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.oid</code>.
     */
    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.roleid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRoleid() {
        return this.roleid;
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.roleid</code>.
     */
    public void setRoleid(@NotNull Long roleid) {
        this.roleid = roleid;
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.member</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getMember() {
        return this.member;
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.member</code>.
     */
    public void setMember(@NotNull Long member) {
        this.member = member;
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.grantor</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getGrantor() {
        return this.grantor;
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.grantor</code>.
     */
    public void setGrantor(@NotNull Long grantor) {
        this.grantor = grantor;
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.admin_option</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getAdminOption() {
        return this.adminOption;
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.admin_option</code>.
     */
    public void setAdminOption(@NotNull Boolean adminOption) {
        this.adminOption = adminOption;
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.inherit_option</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getInheritOption() {
        return this.inheritOption;
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.inherit_option</code>.
     */
    public void setInheritOption(@NotNull Boolean inheritOption) {
        this.inheritOption = inheritOption;
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.set_option</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getSetOption() {
        return this.setOption;
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.set_option</code>.
     */
    public void setSetOption(@NotNull Boolean setOption) {
        this.setOption = setOption;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgAuthMembers other = (PgAuthMembers) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.roleid == null) {
            if (other.roleid != null)
                return false;
        }
        else if (!this.roleid.equals(other.roleid))
            return false;
        if (this.member == null) {
            if (other.member != null)
                return false;
        }
        else if (!this.member.equals(other.member))
            return false;
        if (this.grantor == null) {
            if (other.grantor != null)
                return false;
        }
        else if (!this.grantor.equals(other.grantor))
            return false;
        if (this.adminOption == null) {
            if (other.adminOption != null)
                return false;
        }
        else if (!this.adminOption.equals(other.adminOption))
            return false;
        if (this.inheritOption == null) {
            if (other.inheritOption != null)
                return false;
        }
        else if (!this.inheritOption.equals(other.inheritOption))
            return false;
        if (this.setOption == null) {
            if (other.setOption != null)
                return false;
        }
        else if (!this.setOption.equals(other.setOption))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.roleid == null) ? 0 : this.roleid.hashCode());
        result = prime * result + ((this.member == null) ? 0 : this.member.hashCode());
        result = prime * result + ((this.grantor == null) ? 0 : this.grantor.hashCode());
        result = prime * result + ((this.adminOption == null) ? 0 : this.adminOption.hashCode());
        result = prime * result + ((this.inheritOption == null) ? 0 : this.inheritOption.hashCode());
        result = prime * result + ((this.setOption == null) ? 0 : this.setOption.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAuthMembers (");

        sb.append(oid);
        sb.append(", ").append(roleid);
        sb.append(", ").append(member);
        sb.append(", ").append(grantor);
        sb.append(", ").append(adminOption);
        sb.append(", ").append(inheritOption);
        sb.append(", ").append(setOption);

        sb.append(")");
        return sb.toString();
    }
}