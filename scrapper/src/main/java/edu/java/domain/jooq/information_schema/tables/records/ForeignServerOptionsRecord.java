/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ForeignServerOptions;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ForeignServerOptionsRecord extends TableRecordImpl<ForeignServerOptionsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.foreign_server_catalog</code>.
     */
    @Nullable
    public String getForeignServerCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.foreign_server_name</code>.
     */
    public void setForeignServerName(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.foreign_server_name</code>.
     */
    @Nullable
    public String getForeignServerName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.option_name</code>.
     */
    public void setOptionName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.option_name</code>.
     */
    @Nullable
    public String getOptionName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_server_options.option_value</code>.
     */
    public void setOptionValue(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_server_options.option_value</code>.
     */
    @Nullable
    public String getOptionValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return ForeignServerOptions.FOREIGN_SERVER_OPTIONS.FOREIGN_SERVER_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return ForeignServerOptions.FOREIGN_SERVER_OPTIONS.FOREIGN_SERVER_NAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return ForeignServerOptions.FOREIGN_SERVER_OPTIONS.OPTION_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return ForeignServerOptions.FOREIGN_SERVER_OPTIONS.OPTION_VALUE;
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
        return getOptionName();
    }

    @Override
    @Nullable
    public String component4() {
        return getOptionValue();
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
        return getOptionName();
    }

    @Override
    @Nullable
    public String value4() {
        return getOptionValue();
    }

    @Override
    @NotNull
    public ForeignServerOptionsRecord value1(@Nullable String value) {
        setForeignServerCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServerOptionsRecord value2(@Nullable String value) {
        setForeignServerName(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServerOptionsRecord value3(@Nullable String value) {
        setOptionName(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServerOptionsRecord value4(@Nullable String value) {
        setOptionValue(value);
        return this;
    }

    @Override
    @NotNull
    public ForeignServerOptionsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ForeignServerOptionsRecord
     */
    public ForeignServerOptionsRecord() {
        super(ForeignServerOptions.FOREIGN_SERVER_OPTIONS);
    }

    /**
     * Create a detached, initialised ForeignServerOptionsRecord
     */
    @ConstructorProperties({ "foreignServerCatalog", "foreignServerName", "optionName", "optionValue" })
    public ForeignServerOptionsRecord(@Nullable String foreignServerCatalog, @Nullable String foreignServerName, @Nullable String optionName, @Nullable String optionValue) {
        super(ForeignServerOptions.FOREIGN_SERVER_OPTIONS);

        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        setOptionName(optionName);
        setOptionValue(optionValue);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ForeignServerOptionsRecord
     */
    public ForeignServerOptionsRecord(edu.java.domain.jooq.information_schema.tables.pojos.ForeignServerOptions value) {
        super(ForeignServerOptions.FOREIGN_SERVER_OPTIONS);

        if (value != null) {
            setForeignServerCatalog(value.getForeignServerCatalog());
            setForeignServerName(value.getForeignServerName());
            setOptionName(value.getOptionName());
            setOptionValue(value.getOptionValue());
            resetChangedOnNotNull();
        }
    }
}