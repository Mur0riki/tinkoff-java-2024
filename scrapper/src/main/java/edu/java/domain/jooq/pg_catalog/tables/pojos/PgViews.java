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
public class PgViews implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schemaname;
    private String viewname;
    private String viewowner;
    private String definition;

    public PgViews() {}

    public PgViews(PgViews value) {
        this.schemaname = value.schemaname;
        this.viewname = value.viewname;
        this.viewowner = value.viewowner;
        this.definition = value.definition;
    }

    @ConstructorProperties({ "schemaname", "viewname", "viewowner", "definition" })
    public PgViews(
        @Nullable String schemaname,
        @Nullable String viewname,
        @Nullable String viewowner,
        @Nullable String definition
    ) {
        this.schemaname = schemaname;
        this.viewname = viewname;
        this.viewowner = viewowner;
        this.definition = definition;
    }

    /**
     * Getter for <code>pg_catalog.pg_views.schemaname</code>.
     */
    @Nullable
    public String getSchemaname() {
        return this.schemaname;
    }

    /**
     * Setter for <code>pg_catalog.pg_views.schemaname</code>.
     */
    public void setSchemaname(@Nullable String schemaname) {
        this.schemaname = schemaname;
    }

    /**
     * Getter for <code>pg_catalog.pg_views.viewname</code>.
     */
    @Nullable
    public String getViewname() {
        return this.viewname;
    }

    /**
     * Setter for <code>pg_catalog.pg_views.viewname</code>.
     */
    public void setViewname(@Nullable String viewname) {
        this.viewname = viewname;
    }

    /**
     * Getter for <code>pg_catalog.pg_views.viewowner</code>.
     */
    @Nullable
    public String getViewowner() {
        return this.viewowner;
    }

    /**
     * Setter for <code>pg_catalog.pg_views.viewowner</code>.
     */
    public void setViewowner(@Nullable String viewowner) {
        this.viewowner = viewowner;
    }

    /**
     * Getter for <code>pg_catalog.pg_views.definition</code>.
     */
    @Nullable
    public String getDefinition() {
        return this.definition;
    }

    /**
     * Setter for <code>pg_catalog.pg_views.definition</code>.
     */
    public void setDefinition(@Nullable String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgViews other = (PgViews) obj;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.viewname == null) {
            if (other.viewname != null)
                return false;
        }
        else if (!this.viewname.equals(other.viewname))
            return false;
        if (this.viewowner == null) {
            if (other.viewowner != null)
                return false;
        }
        else if (!this.viewowner.equals(other.viewowner))
            return false;
        if (this.definition == null) {
            if (other.definition != null)
                return false;
        }
        else if (!this.definition.equals(other.definition))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.viewname == null) ? 0 : this.viewname.hashCode());
        result = prime * result + ((this.viewowner == null) ? 0 : this.viewowner.hashCode());
        result = prime * result + ((this.definition == null) ? 0 : this.definition.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgViews (");

        sb.append(schemaname);
        sb.append(", ").append(viewname);
        sb.append(", ").append(viewowner);
        sb.append(", ").append(definition);

        sb.append(")");
        return sb.toString();
    }
}
