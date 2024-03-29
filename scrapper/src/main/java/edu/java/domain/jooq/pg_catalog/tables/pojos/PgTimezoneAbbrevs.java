/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.types.YearToSecond;


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
public class PgTimezoneAbbrevs implements Serializable {

    private static final long serialVersionUID = 1L;

    private String abbrev;
    private YearToSecond utcOffset;
    private Boolean isDst;

    public PgTimezoneAbbrevs() {}

    public PgTimezoneAbbrevs(PgTimezoneAbbrevs value) {
        this.abbrev = value.abbrev;
        this.utcOffset = value.utcOffset;
        this.isDst = value.isDst;
    }

    @ConstructorProperties({ "abbrev", "utcOffset", "isDst" })
    public PgTimezoneAbbrevs(
        @Nullable String abbrev,
        @Nullable YearToSecond utcOffset,
        @Nullable Boolean isDst
    ) {
        this.abbrev = abbrev;
        this.utcOffset = utcOffset;
        this.isDst = isDst;
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_abbrevs.abbrev</code>.
     */
    @Nullable
    public String getAbbrev() {
        return this.abbrev;
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_abbrevs.abbrev</code>.
     */
    public void setAbbrev(@Nullable String abbrev) {
        this.abbrev = abbrev;
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_abbrevs.utc_offset</code>.
     */
    @Nullable
    public YearToSecond getUtcOffset() {
        return this.utcOffset;
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_abbrevs.utc_offset</code>.
     */
    public void setUtcOffset(@Nullable YearToSecond utcOffset) {
        this.utcOffset = utcOffset;
    }

    /**
     * Getter for <code>pg_catalog.pg_timezone_abbrevs.is_dst</code>.
     */
    @Nullable
    public Boolean getIsDst() {
        return this.isDst;
    }

    /**
     * Setter for <code>pg_catalog.pg_timezone_abbrevs.is_dst</code>.
     */
    public void setIsDst(@Nullable Boolean isDst) {
        this.isDst = isDst;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgTimezoneAbbrevs other = (PgTimezoneAbbrevs) obj;
        if (this.abbrev == null) {
            if (other.abbrev != null)
                return false;
        }
        else if (!this.abbrev.equals(other.abbrev))
            return false;
        if (this.utcOffset == null) {
            if (other.utcOffset != null)
                return false;
        }
        else if (!this.utcOffset.equals(other.utcOffset))
            return false;
        if (this.isDst == null) {
            if (other.isDst != null)
                return false;
        }
        else if (!this.isDst.equals(other.isDst))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.abbrev == null) ? 0 : this.abbrev.hashCode());
        result = prime * result + ((this.utcOffset == null) ? 0 : this.utcOffset.hashCode());
        result = prime * result + ((this.isDst == null) ? 0 : this.isDst.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTimezoneAbbrevs (");

        sb.append(abbrev);
        sb.append(", ").append(utcOffset);
        sb.append(", ").append(isDst);

        sb.append(")");
        return sb.toString();
    }
}
