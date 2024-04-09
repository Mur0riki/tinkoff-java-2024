/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


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
public class UserMappings implements Serializable {

    private static final long serialVersionUID = 1L;

    private String authorizationIdentifier;
    private String foreignServerCatalog;
    private String foreignServerName;

    public UserMappings() {}

    public UserMappings(UserMappings value) {
        this.authorizationIdentifier = value.authorizationIdentifier;
        this.foreignServerCatalog = value.foreignServerCatalog;
        this.foreignServerName = value.foreignServerName;
    }

    @ConstructorProperties({ "authorizationIdentifier", "foreignServerCatalog", "foreignServerName" })
    public UserMappings(
        @Nullable String authorizationIdentifier,
        @Nullable String foreignServerCatalog,
        @Nullable String foreignServerName
    ) {
        this.authorizationIdentifier = authorizationIdentifier;
        this.foreignServerCatalog = foreignServerCatalog;
        this.foreignServerName = foreignServerName;
    }

    /**
     * Getter for
     * <code>information_schema.user_mappings.authorization_identifier</code>.
     */
    @Nullable
    public String getAuthorizationIdentifier() {
        return this.authorizationIdentifier;
    }

    /**
     * Setter for
     * <code>information_schema.user_mappings.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(@Nullable String authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
    }

    /**
     * Getter for
     * <code>information_schema.user_mappings.foreign_server_catalog</code>.
     */
    @Nullable
    public String getForeignServerCatalog() {
        return this.foreignServerCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.user_mappings.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(@Nullable String foreignServerCatalog) {
        this.foreignServerCatalog = foreignServerCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.user_mappings.foreign_server_name</code>.
     */
    @Nullable
    public String getForeignServerName() {
        return this.foreignServerName;
    }

    /**
     * Setter for
     * <code>information_schema.user_mappings.foreign_server_name</code>.
     */
    public void setForeignServerName(@Nullable String foreignServerName) {
        this.foreignServerName = foreignServerName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UserMappings other = (UserMappings) obj;
        if (this.authorizationIdentifier == null) {
            if (other.authorizationIdentifier != null)
                return false;
        }
        else if (!this.authorizationIdentifier.equals(other.authorizationIdentifier))
            return false;
        if (this.foreignServerCatalog == null) {
            if (other.foreignServerCatalog != null)
                return false;
        }
        else if (!this.foreignServerCatalog.equals(other.foreignServerCatalog))
            return false;
        if (this.foreignServerName == null) {
            if (other.foreignServerName != null)
                return false;
        }
        else if (!this.foreignServerName.equals(other.foreignServerName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.authorizationIdentifier == null) ? 0 : this.authorizationIdentifier.hashCode());
        result = prime * result + ((this.foreignServerCatalog == null) ? 0 : this.foreignServerCatalog.hashCode());
        result = prime * result + ((this.foreignServerName == null) ? 0 : this.foreignServerName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserMappings (");

        sb.append(authorizationIdentifier);
        sb.append(", ").append(foreignServerCatalog);
        sb.append(", ").append(foreignServerName);

        sb.append(")");
        return sb.toString();
    }
}