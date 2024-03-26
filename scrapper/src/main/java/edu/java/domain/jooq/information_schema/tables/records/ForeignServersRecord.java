/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ForeignServers;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class ForeignServersRecord extends TableRecordImpl<ForeignServersRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_server_catalog</code>.
     */
    @Nullable
    public String getForeignServerCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_server_name</code>.
     */
    public void setForeignServerName(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_server_name</code>.
     */
    @Nullable
    public String getForeignServerName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public void setForeignDataWrapperCatalog(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    @Nullable
    public String getForeignDataWrapperCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_data_wrapper_name</code>.
     */
    public void setForeignDataWrapperName(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_data_wrapper_name</code>.
     */
    @Nullable
    public String getForeignDataWrapperName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_server_type</code>.
     */
    public void setForeignServerType(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_server_type</code>.
     */
    @Nullable
    public String getForeignServerType() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.foreign_server_version</code>.
     */
    public void setForeignServerVersion(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.foreign_server_version</code>.
     */
    @Nullable
    public String getForeignServerVersion() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_servers.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_servers.authorization_identifier</code>.
     */
    @Nullable
    public String getAuthorizationIdentifier() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_SERVER_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_SERVER_NAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_DATA_WRAPPER_NAME;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_SERVER_TYPE;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return ForeignServers.FOREIGN_SERVERS.FOREIGN_SERVER_VERSION;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return ForeignServers.FOREIGN_SERVERS.AUTHORIZATION_IDENTIFIER;
    }

    @Override
    @Nullable
    public String component1() {
        return getForeignServerCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getForeignServerName();
    }

    @Override
    @Nullable
    public String component3() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    @Nullable
    public String component4() {
        return getForeignDataWrapperName();
    }

    @Override
    @Nullable
    public String component5() {
        return getForeignServerType();
    }

    @Override
    @Nullable
    public String component6() {
        return getForeignServerVersion();
    }

    @Override
    @Nullable
    public String component7() {
        return getAuthorizationIdentifier();
    }

    @Override
    @Nullable
    public String value1() {
        return getForeignServerCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getForeignServerName();
    }

    @Override
    @Nullable
    public String value3() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    @Nullable
    public String value4() {
        return getForeignDataWrapperName();
    }

    @Override
    @Nullable
    public String value5() {
        return getForeignServerType();
    }

    @Override
    @Nullable
    public String value6() {
        return getForeignServerVersion();
    }

    @Override
    @Nullable
    public String value7() {
        return getAuthorizationIdentifier();
    }

    @Override
    @NotNull
    public ForeignServersRecord value1(@Nullable String value) {
        setForeignServerCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServersRecord value2(@Nullable String value) {
        setForeignServerName(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServersRecord value3(@Nullable String value) {
        setForeignDataWrapperCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServersRecord value4(@Nullable String value) {
        setForeignDataWrapperName(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServersRecord value5(@Nullable String value) {
        setForeignServerType(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServersRecord value6(@Nullable String value) {
        setForeignServerVersion(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServersRecord value7(@Nullable String value) {
        setAuthorizationIdentifier(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServersRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ForeignServersRecord
     */
    public ForeignServersRecord() {
        super(ForeignServers.FOREIGN_SERVERS);
    }

    /**
     * Create a detached, initialised ForeignServersRecord
     */
    @ConstructorProperties({ "foreignServerCatalog", "foreignServerName", "foreignDataWrapperCatalog", "foreignDataWrapperName", "foreignServerType", "foreignServerVersion", "authorizationIdentifier" })
    public ForeignServersRecord(@Nullable String foreignServerCatalog, @Nullable String foreignServerName, @Nullable String foreignDataWrapperCatalog, @Nullable String foreignDataWrapperName, @Nullable String foreignServerType, @Nullable String foreignServerVersion, @Nullable String authorizationIdentifier) {
        super(ForeignServers.FOREIGN_SERVERS);

        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        setForeignDataWrapperCatalog(foreignDataWrapperCatalog);
        setForeignDataWrapperName(foreignDataWrapperName);
        setForeignServerType(foreignServerType);
        setForeignServerVersion(foreignServerVersion);
        setAuthorizationIdentifier(authorizationIdentifier);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ForeignServersRecord
     */
    public ForeignServersRecord(edu.java.domain.jooq.information_schema.tables.pojos.ForeignServers value) {
        super(ForeignServers.FOREIGN_SERVERS);

        if (value != null) {
            setForeignServerCatalog(value.getForeignServerCatalog());
            setForeignServerName(value.getForeignServerName());
            setForeignDataWrapperCatalog(value.getForeignDataWrapperCatalog());
            setForeignDataWrapperName(value.getForeignDataWrapperName());
            setForeignServerType(value.getForeignServerType());
            setForeignServerVersion(value.getForeignServerVersion());
            setAuthorizationIdentifier(value.getAuthorizationIdentifier());
            resetChangedOnNotNull();
        }
    }
}