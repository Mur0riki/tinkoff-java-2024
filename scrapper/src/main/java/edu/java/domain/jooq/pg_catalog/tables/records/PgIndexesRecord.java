/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgIndexes;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class PgIndexesRecord extends TableRecordImpl<PgIndexesRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_indexes.schemaname</code>.
     */
    public void setSchemaname(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.schemaname</code>.
     */
    @Nullable
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_indexes.tablename</code>.
     */
    public void setTablename(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.tablename</code>.
     */
    @Nullable
    public String getTablename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_indexes.indexname</code>.
     */
    public void setIndexname(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.indexname</code>.
     */
    @Nullable
    public String getIndexname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_indexes.tablespace</code>.
     */
    public void setTablespace(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.tablespace</code>.
     */
    @Nullable
    public String getTablespace() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_indexes.indexdef</code>.
     */
    public void setIndexdef(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.indexdef</code>.
     */
    @Nullable
    public String getIndexdef() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgIndexes.PG_INDEXES.SCHEMANAME;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgIndexes.PG_INDEXES.TABLENAME;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgIndexes.PG_INDEXES.INDEXNAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return PgIndexes.PG_INDEXES.TABLESPACE;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return PgIndexes.PG_INDEXES.INDEXDEF;
    }

    @Override
    @Nullable
    public String component1() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String component2() {
        return getTablename();
    }

    @Override
    @Nullable
    public String component3() {
        return getIndexname();
    }

    @Override
    @Nullable
    public String component4() {
        return getTablespace();
    }

    @Override
    @Nullable
    public String component5() {
        return getIndexdef();
    }

    @Override
    @Nullable
    public String value1() {
        return getSchemaname();
    }

    @Override
    @Nullable
    public String value2() {
        return getTablename();
    }

    @Override
    @Nullable
    public String value3() {
        return getIndexname();
    }

    @Override
    @Nullable
    public String value4() {
        return getTablespace();
    }

    @Override
    @Nullable
    public String value5() {
        return getIndexdef();
    }

    @Override
    @NotNull
    public PgIndexesRecord value1(@Nullable String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexesRecord value2(@Nullable String value) {
        setTablename(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexesRecord value3(@Nullable String value) {
        setIndexname(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexesRecord value4(@Nullable String value) {
        setTablespace(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexesRecord value5(@Nullable String value) {
        setIndexdef(value);
        return this;
    }

    @Override
    @NotNull
    public PgIndexesRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgIndexesRecord
     */
    public PgIndexesRecord() {
        super(PgIndexes.PG_INDEXES);
    }

    /**
     * Create a detached, initialised PgIndexesRecord
     */
    @ConstructorProperties({ "schemaname", "tablename", "indexname", "tablespace", "indexdef" })
    public PgIndexesRecord(@Nullable String schemaname, @Nullable String tablename, @Nullable String indexname, @Nullable String tablespace, @Nullable String indexdef) {
        super(PgIndexes.PG_INDEXES);

        setSchemaname(schemaname);
        setTablename(tablename);
        setIndexname(indexname);
        setTablespace(tablespace);
        setIndexdef(indexdef);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgIndexesRecord
     */
    public PgIndexesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgIndexes value) {
        super(PgIndexes.PG_INDEXES);

        if (value != null) {
            setSchemaname(value.getSchemaname());
            setTablename(value.getTablename());
            setIndexname(value.getIndexname());
            setTablespace(value.getTablespace());
            setIndexdef(value.getIndexdef());
            resetChangedOnNotNull();
        }
    }
}
