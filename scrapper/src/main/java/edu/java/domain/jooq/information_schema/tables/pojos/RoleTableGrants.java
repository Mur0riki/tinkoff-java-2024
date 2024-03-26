/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import jakarta.validation.constraints.Size;

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
public class RoleTableGrants implements Serializable {

    private static final long serialVersionUID = 1L;

    private String grantor;
    private String grantee;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String privilegeType;
    private String isGrantable;
    private String withHierarchy;

    public RoleTableGrants() {}

    public RoleTableGrants(RoleTableGrants value) {
        this.grantor = value.grantor;
        this.grantee = value.grantee;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
        this.withHierarchy = value.withHierarchy;
    }

    @ConstructorProperties({ "grantor", "grantee", "tableCatalog", "tableSchema", "tableName", "privilegeType", "isGrantable", "withHierarchy" })
    public RoleTableGrants(
        @Nullable String grantor,
        @Nullable String grantee,
        @Nullable String tableCatalog,
        @Nullable String tableSchema,
        @Nullable String tableName,
        @Nullable String privilegeType,
        @Nullable String isGrantable,
        @Nullable String withHierarchy
    ) {
        this.grantor = grantor;
        this.grantee = grantee;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
        this.withHierarchy = withHierarchy;
    }

    /**
     * Getter for <code>information_schema.role_table_grants.grantor</code>.
     */
    @Nullable
    public String getGrantor() {
        return this.grantor;
    }

    /**
     * Setter for <code>information_schema.role_table_grants.grantor</code>.
     */
    public void setGrantor(@Nullable String grantor) {
        this.grantor = grantor;
    }

    /**
     * Getter for <code>information_schema.role_table_grants.grantee</code>.
     */
    @Nullable
    public String getGrantee() {
        return this.grantee;
    }

    /**
     * Setter for <code>information_schema.role_table_grants.grantee</code>.
     */
    public void setGrantee(@Nullable String grantee) {
        this.grantee = grantee;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.table_schema</code>.
     */
    public void setTableSchema(@Nullable String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * Getter for <code>information_schema.role_table_grants.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Setter for <code>information_schema.role_table_grants.table_name</code>.
     */
    public void setTableName(@Nullable String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.privilege_type</code>.
     */
    @Nullable
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.privilege_type</code>.
     */
    public void setPrivilegeType(@Nullable String privilegeType) {
        this.privilegeType = privilegeType;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.is_grantable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsGrantable() {
        return this.isGrantable;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.is_grantable</code>.
     */
    public void setIsGrantable(@Nullable String isGrantable) {
        this.isGrantable = isGrantable;
    }

    /**
     * Getter for
     * <code>information_schema.role_table_grants.with_hierarchy</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getWithHierarchy() {
        return this.withHierarchy;
    }

    /**
     * Setter for
     * <code>information_schema.role_table_grants.with_hierarchy</code>.
     */
    public void setWithHierarchy(@Nullable String withHierarchy) {
        this.withHierarchy = withHierarchy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final RoleTableGrants other = (RoleTableGrants) obj;
        if (this.grantor == null) {
            if (other.grantor != null)
                return false;
        }
        else if (!this.grantor.equals(other.grantor))
            return false;
        if (this.grantee == null) {
            if (other.grantee != null)
                return false;
        }
        else if (!this.grantee.equals(other.grantee))
            return false;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.privilegeType == null) {
            if (other.privilegeType != null)
                return false;
        }
        else if (!this.privilegeType.equals(other.privilegeType))
            return false;
        if (this.isGrantable == null) {
            if (other.isGrantable != null)
                return false;
        }
        else if (!this.isGrantable.equals(other.isGrantable))
            return false;
        if (this.withHierarchy == null) {
            if (other.withHierarchy != null)
                return false;
        }
        else if (!this.withHierarchy.equals(other.withHierarchy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.grantor == null) ? 0 : this.grantor.hashCode());
        result = prime * result + ((this.grantee == null) ? 0 : this.grantee.hashCode());
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.privilegeType == null) ? 0 : this.privilegeType.hashCode());
        result = prime * result + ((this.isGrantable == null) ? 0 : this.isGrantable.hashCode());
        result = prime * result + ((this.withHierarchy == null) ? 0 : this.withHierarchy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoleTableGrants (");

        sb.append(grantor);
        sb.append(", ").append(grantee);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);
        sb.append(", ").append(withHierarchy);

        sb.append(")");
        return sb.toString();
    }
}