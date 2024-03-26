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
public class PgAvailableExtensions implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String defaultVersion;
    private String installedVersion;
    private String comment;

    public PgAvailableExtensions() {}

    public PgAvailableExtensions(PgAvailableExtensions value) {
        this.name = value.name;
        this.defaultVersion = value.defaultVersion;
        this.installedVersion = value.installedVersion;
        this.comment = value.comment;
    }

    @ConstructorProperties({ "name", "defaultVersion", "installedVersion", "comment" })
    public PgAvailableExtensions(
        @Nullable String name,
        @Nullable String defaultVersion,
        @Nullable String installedVersion,
        @Nullable String comment
    ) {
        this.name = name;
        this.defaultVersion = defaultVersion;
        this.installedVersion = installedVersion;
        this.comment = comment;
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.name</code>.
     */
    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.name</code>.
     */
    public void setName(@Nullable String name) {
        this.name = name;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    @Nullable
    public String getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    public void setDefaultVersion(@Nullable String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extensions.installed_version</code>.
     */
    @Nullable
    public String getInstalledVersion() {
        return this.installedVersion;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extensions.installed_version</code>.
     */
    public void setInstalledVersion(@Nullable String installedVersion) {
        this.installedVersion = installedVersion;
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    @Nullable
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    public void setComment(@Nullable String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgAvailableExtensions other = (PgAvailableExtensions) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.defaultVersion == null) {
            if (other.defaultVersion != null)
                return false;
        }
        else if (!this.defaultVersion.equals(other.defaultVersion))
            return false;
        if (this.installedVersion == null) {
            if (other.installedVersion != null)
                return false;
        }
        else if (!this.installedVersion.equals(other.installedVersion))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.defaultVersion == null) ? 0 : this.defaultVersion.hashCode());
        result = prime * result + ((this.installedVersion == null) ? 0 : this.installedVersion.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAvailableExtensions (");

        sb.append(name);
        sb.append(", ").append(defaultVersion);
        sb.append(", ").append(installedVersion);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }
}