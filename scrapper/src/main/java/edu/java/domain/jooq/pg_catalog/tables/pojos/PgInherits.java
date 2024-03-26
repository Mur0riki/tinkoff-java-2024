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
public class PgInherits implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long inhrelid;
    private Long inhparent;
    private Integer inhseqno;
    private Boolean inhdetachpending;

    public PgInherits() {}

    public PgInherits(PgInherits value) {
        this.inhrelid = value.inhrelid;
        this.inhparent = value.inhparent;
        this.inhseqno = value.inhseqno;
        this.inhdetachpending = value.inhdetachpending;
    }

    @ConstructorProperties({ "inhrelid", "inhparent", "inhseqno", "inhdetachpending" })
    public PgInherits(
        @NotNull Long inhrelid,
        @NotNull Long inhparent,
        @NotNull Integer inhseqno,
        @NotNull Boolean inhdetachpending
    ) {
        this.inhrelid = inhrelid;
        this.inhparent = inhparent;
        this.inhseqno = inhseqno;
        this.inhdetachpending = inhdetachpending;
    }

    /**
     * Getter for <code>pg_catalog.pg_inherits.inhrelid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getInhrelid() {
        return this.inhrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_inherits.inhrelid</code>.
     */
    public void setInhrelid(@NotNull Long inhrelid) {
        this.inhrelid = inhrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_inherits.inhparent</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getInhparent() {
        return this.inhparent;
    }

    /**
     * Setter for <code>pg_catalog.pg_inherits.inhparent</code>.
     */
    public void setInhparent(@NotNull Long inhparent) {
        this.inhparent = inhparent;
    }

    /**
     * Getter for <code>pg_catalog.pg_inherits.inhseqno</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getInhseqno() {
        return this.inhseqno;
    }

    /**
     * Setter for <code>pg_catalog.pg_inherits.inhseqno</code>.
     */
    public void setInhseqno(@NotNull Integer inhseqno) {
        this.inhseqno = inhseqno;
    }

    /**
     * Getter for <code>pg_catalog.pg_inherits.inhdetachpending</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getInhdetachpending() {
        return this.inhdetachpending;
    }

    /**
     * Setter for <code>pg_catalog.pg_inherits.inhdetachpending</code>.
     */
    public void setInhdetachpending(@NotNull Boolean inhdetachpending) {
        this.inhdetachpending = inhdetachpending;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgInherits other = (PgInherits) obj;
        if (this.inhrelid == null) {
            if (other.inhrelid != null)
                return false;
        }
        else if (!this.inhrelid.equals(other.inhrelid))
            return false;
        if (this.inhparent == null) {
            if (other.inhparent != null)
                return false;
        }
        else if (!this.inhparent.equals(other.inhparent))
            return false;
        if (this.inhseqno == null) {
            if (other.inhseqno != null)
                return false;
        }
        else if (!this.inhseqno.equals(other.inhseqno))
            return false;
        if (this.inhdetachpending == null) {
            if (other.inhdetachpending != null)
                return false;
        }
        else if (!this.inhdetachpending.equals(other.inhdetachpending))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.inhrelid == null) ? 0 : this.inhrelid.hashCode());
        result = prime * result + ((this.inhparent == null) ? 0 : this.inhparent.hashCode());
        result = prime * result + ((this.inhseqno == null) ? 0 : this.inhseqno.hashCode());
        result = prime * result + ((this.inhdetachpending == null) ? 0 : this.inhdetachpending.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgInherits (");

        sb.append(inhrelid);
        sb.append(", ").append(inhparent);
        sb.append(", ").append(inhseqno);
        sb.append(", ").append(inhdetachpending);

        sb.append(")");
        return sb.toString();
    }
}