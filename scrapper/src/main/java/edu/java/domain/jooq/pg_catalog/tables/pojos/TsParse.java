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
public class TsParse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer tokid;
    private String token;

    public TsParse() {}

    public TsParse(TsParse value) {
        this.tokid = value.tokid;
        this.token = value.token;
    }

    @ConstructorProperties({ "tokid", "token" })
    public TsParse(
        @Nullable Integer tokid,
        @Nullable String token
    ) {
        this.tokid = tokid;
        this.token = token;
    }

    /**
     * Getter for <code>pg_catalog.ts_parse.tokid</code>.
     */
    @Nullable
    public Integer getTokid() {
        return this.tokid;
    }

    /**
     * Setter for <code>pg_catalog.ts_parse.tokid</code>.
     */
    public void setTokid(@Nullable Integer tokid) {
        this.tokid = tokid;
    }

    /**
     * Getter for <code>pg_catalog.ts_parse.token</code>.
     */
    @Nullable
    public String getToken() {
        return this.token;
    }

    /**
     * Setter for <code>pg_catalog.ts_parse.token</code>.
     */
    public void setToken(@Nullable String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TsParse other = (TsParse) obj;
        if (this.tokid == null) {
            if (other.tokid != null)
                return false;
        }
        else if (!this.tokid.equals(other.tokid))
            return false;
        if (this.token == null) {
            if (other.token != null)
                return false;
        }
        else if (!this.token.equals(other.token))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tokid == null) ? 0 : this.tokid.hashCode());
        result = prime * result + ((this.token == null) ? 0 : this.token.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TsParse (");

        sb.append(tokid);
        sb.append(", ").append(token);

        sb.append(")");
        return sb.toString();
    }
}