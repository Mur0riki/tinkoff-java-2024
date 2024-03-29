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
public class PgTablespaceDatabases implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long pgTablespaceDatabases;

    public PgTablespaceDatabases() {}

    public PgTablespaceDatabases(PgTablespaceDatabases value) {
        this.pgTablespaceDatabases = value.pgTablespaceDatabases;
    }

    @ConstructorProperties({ "pgTablespaceDatabases" })
    public PgTablespaceDatabases(
        @Nullable Long pgTablespaceDatabases
    ) {
        this.pgTablespaceDatabases = pgTablespaceDatabases;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_tablespace_databases.pg_tablespace_databases</code>.
     */
    @Nullable
    public Long getPgTablespaceDatabases() {
        return this.pgTablespaceDatabases;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_tablespace_databases.pg_tablespace_databases</code>.
     */
    public void setPgTablespaceDatabases(@Nullable Long pgTablespaceDatabases) {
        this.pgTablespaceDatabases = pgTablespaceDatabases;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgTablespaceDatabases other = (PgTablespaceDatabases) obj;
        if (this.pgTablespaceDatabases == null) {
            if (other.pgTablespaceDatabases != null)
                return false;
        }
        else if (!this.pgTablespaceDatabases.equals(other.pgTablespaceDatabases))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pgTablespaceDatabases == null) ? 0 : this.pgTablespaceDatabases.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTablespaceDatabases (");

        sb.append(pgTablespaceDatabases);

        sb.append(")");
        return sb.toString();
    }
}
