/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ColumnOptions;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ColumnOptionsRecord extends TableRecordImpl<ColumnOptionsRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.column_options.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.column_options.table_schema</code>.
     */
    public void setTableSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.column_options.table_name</code>.
     */
    public void setTableName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.column_options.column_name</code>.
     */
    public void setColumnName(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.column_options.column_name</code>.
     */
    @Nullable
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.column_options.option_name</code>.
     */
    public void setOptionName(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.column_options.option_name</code>.
     */
    @Nullable
    public String getOptionName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.column_options.option_value</code>.
     */
    public void setOptionValue(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.column_options.option_value</code>.
     */
    @Nullable
    public String getOptionValue() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return ColumnOptions.COLUMN_OPTIONS.TABLE_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return ColumnOptions.COLUMN_OPTIONS.TABLE_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return ColumnOptions.COLUMN_OPTIONS.TABLE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return ColumnOptions.COLUMN_OPTIONS.COLUMN_NAME;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return ColumnOptions.COLUMN_OPTIONS.OPTION_NAME;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return ColumnOptions.COLUMN_OPTIONS.OPTION_VALUE;
    }

    @Override
    @Nullable
    public String component1() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getTableName();
    }

    @Override
    @Nullable
    public String component4() {
        return getColumnName();
    }

    @Override
    @Nullable
    public String component5() {
        return getOptionName();
    }

    @Override
    @Nullable
    public String component6() {
        return getOptionValue();
    }

    @Override
    @Nullable
    public String value1() {
        return getTableCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getTableSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getTableName();
    }

    @Override
    @Nullable
    public String value4() {
        return getColumnName();
    }

    @Override
    @Nullable
    public String value5() {
        return getOptionName();
    }

    @Override
    @Nullable
    public String value6() {
        return getOptionValue();
    }

    @Override
    @NotNull
    public ColumnOptionsRecord value1(@Nullable String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnOptionsRecord value2(@Nullable String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnOptionsRecord value3(@Nullable String value) {
        setTableName(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnOptionsRecord value4(@Nullable String value) {
        setColumnName(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnOptionsRecord value5(@Nullable String value) {
        setOptionName(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnOptionsRecord value6(@Nullable String value) {
        setOptionValue(value);
        return this;
    }

    @Override
    @NotNull
    public ColumnOptionsRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnOptionsRecord
     */
    public ColumnOptionsRecord() {
        super(ColumnOptions.COLUMN_OPTIONS);
    }

    /**
     * Create a detached, initialised ColumnOptionsRecord
     */
    @ConstructorProperties({ "tableCatalog", "tableSchema", "tableName", "columnName", "optionName", "optionValue" })
    public ColumnOptionsRecord(@Nullable String tableCatalog, @Nullable String tableSchema, @Nullable String tableName, @Nullable String columnName, @Nullable String optionName, @Nullable String optionValue) {
        super(ColumnOptions.COLUMN_OPTIONS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setOptionName(optionName);
        setOptionValue(optionValue);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ColumnOptionsRecord
     */
    public ColumnOptionsRecord(edu.java.domain.jooq.information_schema.tables.pojos.ColumnOptions value) {
        super(ColumnOptions.COLUMN_OPTIONS);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            setOptionName(value.getOptionName());
            setOptionValue(value.getOptionValue());
            resetChangedOnNotNull();
        }
    }
}