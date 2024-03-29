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
public class ForeignServerOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    private String foreignServerCatalog;
    private String foreignServerName;
    private String optionName;
    private String optionValue;

    public ForeignServerOptions() {}

    public ForeignServerOptions(ForeignServerOptions value) {
        this.foreignServerCatalog = value.foreignServerCatalog;
        this.foreignServerName = value.foreignServerName;
        this.optionName = value.optionName;
        this.optionValue = value.optionValue;
    }

    @ConstructorProperties({ "foreignServerCatalog", "foreignServerName", "optionName", "optionValue" })
    public ForeignServerOptions(
        @Nullable String foreignServerCatalog,
        @Nullable String foreignServerName,
        @Nullable String optionName,
        @Nullable String optionValue
    ) {
        this.foreignServerCatalog = foreignServerCatalog;
        this.foreignServerName = foreignServerName;
        this.optionName = optionName;
        this.optionValue = optionValue;
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.foreign_server_catalog</code>.
     */
    @Nullable
    public String getForeignServerCatalog() {
        return this.foreignServerCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(@Nullable String foreignServerCatalog) {
        this.foreignServerCatalog = foreignServerCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.foreign_server_name</code>.
     */
    @Nullable
    public String getForeignServerName() {
        return this.foreignServerName;
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.foreign_server_name</code>.
     */
    public void setForeignServerName(@Nullable String foreignServerName) {
        this.foreignServerName = foreignServerName;
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.option_name</code>.
     */
    @Nullable
    public String getOptionName() {
        return this.optionName;
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.option_name</code>.
     */
    public void setOptionName(@Nullable String optionName) {
        this.optionName = optionName;
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.option_value</code>.
     */
    @Nullable
    public String getOptionValue() {
        return this.optionValue;
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.option_value</code>.
     */
    public void setOptionValue(@Nullable String optionValue) {
        this.optionValue = optionValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ForeignServerOptions other = (ForeignServerOptions) obj;
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
        if (this.optionName == null) {
            if (other.optionName != null)
                return false;
        }
        else if (!this.optionName.equals(other.optionName))
            return false;
        if (this.optionValue == null) {
            if (other.optionValue != null)
                return false;
        }
        else if (!this.optionValue.equals(other.optionValue))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.foreignServerCatalog == null) ? 0 : this.foreignServerCatalog.hashCode());
        result = prime * result + ((this.foreignServerName == null) ? 0 : this.foreignServerName.hashCode());
        result = prime * result + ((this.optionName == null) ? 0 : this.optionName.hashCode());
        result = prime * result + ((this.optionValue == null) ? 0 : this.optionValue.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ForeignServerOptions (");

        sb.append(foreignServerCatalog);
        sb.append(", ").append(foreignServerName);
        sb.append(", ").append(optionName);
        sb.append(", ").append(optionValue);

        sb.append(")");
        return sb.toString();
    }
}
