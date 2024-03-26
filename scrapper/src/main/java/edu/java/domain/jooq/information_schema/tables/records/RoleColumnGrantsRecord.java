/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.RoleColumnGrants;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class RoleColumnGrantsRecord extends TableRecordImpl<RoleColumnGrantsRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.role_column_grants.grantor</code>.
     */
    public void setGrantor(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.role_column_grants.grantor</code>.
     */
    @Nullable
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.role_column_grants.grantee</code>.
     */
    public void setGrantee(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.role_column_grants.grantee</code>.
     */
    @Nullable
    public String getGrantee() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.role_column_grants.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.role_column_grants.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.role_column_grants.table_schema</code>.
     */
    public void setTableSchema(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.role_column_grants.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.role_column_grants.table_name</code>.
     */
    public void setTableName(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.role_column_grants.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.role_column_grants.column_name</code>.
     */
    public void setColumnName(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.role_column_grants.column_name</code>.
     */
    @Nullable
    public String getColumnName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.role_column_grants.privilege_type</code>.
     */
    public void setPrivilegeType(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.role_column_grants.privilege_type</code>.
     */
    @Nullable
    public String getPrivilegeType() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.role_column_grants.is_grantable</code>.
     */
    public void setIsGrantable(@Nullable String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.role_column_grants.is_grantable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsGrantable() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row8<String, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTOR;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTEE;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.TABLE_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.TABLE_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.TABLE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.COLUMN_NAME;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.PRIVILEGE_TYPE;
    }

    @Override
    @NotNull
    public Field<String> field8() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.IS_GRANTABLE;
    }

    @Override
    @Nullable
    public String component1() {
        return getGrantor();
    }

    @Override
    @Nullable
    public String component2() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String component3() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String component4() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String component5() {
        return getTableName();
    }

    @Override
    @Nullable
    public String component6() {
        return getColumnName();
    }

    @Override
    @Nullable
    public String component7() {
        return getPrivilegeType();
    }

    @Override
    @Nullable
    public String component8() {
        return getIsGrantable();
    }

    @Override
    @Nullable
    public String value1() {
        return getGrantor();
    }

    @Override
    @Nullable
    public String value2() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String value3() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String value4() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String value5() {
        return getTableName();
    }

    @Override
    @Nullable
    public String value6() {
        return getColumnName();
    }

    @Override
    @Nullable
    public String value7() {
        return getPrivilegeType();
    }

    @Override
    @Nullable
    public String value8() {
        return getIsGrantable();
    }

    @Override
    @NotNull
    public RoleColumnGrantsRecord value1(@Nullable String value) {
        setGrantor(value);
        return this;
    }

    @Override
    @NotNull
    public RoleColumnGrantsRecord value2(@Nullable String value) {
        setGrantee(value);
        return this;
    }

    @Override
    @NotNull
    public RoleColumnGrantsRecord value3(@Nullable String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public RoleColumnGrantsRecord value4(@Nullable String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    @NotNull
    public RoleColumnGrantsRecord value5(@Nullable String value) {
        setTableName(value);
        return this;
    }

    @Override
    @NotNull
    public RoleColumnGrantsRecord value6(@Nullable String value) {
        setColumnName(value);
        return this;
    }

    @Override
    @NotNull
    public RoleColumnGrantsRecord value7(@Nullable String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    @NotNull
    public RoleColumnGrantsRecord value8(@Nullable String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    @NotNull
    public RoleColumnGrantsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7, @Nullable String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleColumnGrantsRecord
     */
    public RoleColumnGrantsRecord() {
        super(RoleColumnGrants.ROLE_COLUMN_GRANTS);
    }

    /**
     * Create a detached, initialised RoleColumnGrantsRecord
     */
    @ConstructorProperties({ "grantor", "grantee", "tableCatalog", "tableSchema", "tableName", "columnName", "privilegeType", "isGrantable" })
    public RoleColumnGrantsRecord(@Nullable String grantor, @Nullable String grantee, @Nullable String tableCatalog, @Nullable String tableSchema, @Nullable String tableName, @Nullable String columnName, @Nullable String privilegeType, @Nullable String isGrantable) {
        super(RoleColumnGrants.ROLE_COLUMN_GRANTS);

        setGrantor(grantor);
        setGrantee(grantee);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RoleColumnGrantsRecord
     */
    public RoleColumnGrantsRecord(edu.java.domain.jooq.information_schema.tables.pojos.RoleColumnGrants value) {
        super(RoleColumnGrants.ROLE_COLUMN_GRANTS);

        if (value != null) {
            setGrantor(value.getGrantor());
            setGrantee(value.getGrantee());
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            setPrivilegeType(value.getPrivilegeType());
            setIsGrantable(value.getIsGrantable());
            resetChangedOnNotNull();
        }
    }
}