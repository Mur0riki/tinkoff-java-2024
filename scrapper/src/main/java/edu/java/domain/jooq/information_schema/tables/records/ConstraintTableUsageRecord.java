/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.ConstraintTableUsage;

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
public class ConstraintTableUsageRecord extends TableRecordImpl<ConstraintTableUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.constraint_table_usage.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_table_usage.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_table_usage.table_schema</code>.
     */
    public void setTableSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_table_usage.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_table_usage.table_name</code>.
     */
    public void setTableName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_table_usage.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_table_usage.constraint_catalog</code>.
     */
    public void setConstraintCatalog(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_table_usage.constraint_catalog</code>.
     */
    @Nullable
    public String getConstraintCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_table_usage.constraint_schema</code>.
     */
    public void setConstraintSchema(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_table_usage.constraint_schema</code>.
     */
    @Nullable
    public String getConstraintSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.constraint_table_usage.constraint_name</code>.
     */
    public void setConstraintName(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.constraint_table_usage.constraint_name</code>.
     */
    @Nullable
    public String getConstraintName() {
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
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.TABLE_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.TABLE_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.TABLE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.CONSTRAINT_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.CONSTRAINT_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return ConstraintTableUsage.CONSTRAINT_TABLE_USAGE.CONSTRAINT_NAME;
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
        return getConstraintCatalog();
    }

    @Override
    @Nullable
    public String component5() {
        return getConstraintSchema();
    }

    @Override
    @Nullable
    public String component6() {
        return getConstraintName();
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
        return getConstraintCatalog();
    }

    @Override
    @Nullable
    public String value5() {
        return getConstraintSchema();
    }

    @Override
    @Nullable
    public String value6() {
        return getConstraintName();
    }

    @Override
    @NotNull
    public ConstraintTableUsageRecord value1(@Nullable String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ConstraintTableUsageRecord value2(@Nullable String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    @NotNull
    public ConstraintTableUsageRecord value3(@Nullable String value) {
        setTableName(value);
        return this;
    }

    @Override
    @NotNull
    public ConstraintTableUsageRecord value4(@Nullable String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public ConstraintTableUsageRecord value5(@Nullable String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    @NotNull
    public ConstraintTableUsageRecord value6(@Nullable String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    @NotNull
    public ConstraintTableUsageRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6) {
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
     * Create a detached ConstraintTableUsageRecord
     */
    public ConstraintTableUsageRecord() {
        super(ConstraintTableUsage.CONSTRAINT_TABLE_USAGE);
    }

    /**
     * Create a detached, initialised ConstraintTableUsageRecord
     */
    @ConstructorProperties({ "tableCatalog", "tableSchema", "tableName", "constraintCatalog", "constraintSchema", "constraintName" })
    public ConstraintTableUsageRecord(@Nullable String tableCatalog, @Nullable String tableSchema, @Nullable String tableName, @Nullable String constraintCatalog, @Nullable String constraintSchema, @Nullable String constraintName) {
        super(ConstraintTableUsage.CONSTRAINT_TABLE_USAGE);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ConstraintTableUsageRecord
     */
    public ConstraintTableUsageRecord(edu.java.domain.jooq.information_schema.tables.pojos.ConstraintTableUsage value) {
        super(ConstraintTableUsage.CONSTRAINT_TABLE_USAGE);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setConstraintCatalog(value.getConstraintCatalog());
            setConstraintSchema(value.getConstraintSchema());
            setConstraintName(value.getConstraintName());
            resetChangedOnNotNull();
        }
    }
}