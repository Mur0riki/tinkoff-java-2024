/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.JsonbToRecordset;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class JsonbToRecordsetRecord extends TableRecordImpl<JsonbToRecordsetRecord> implements Record1<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    public void setJsonbToRecordset(@Nullable Record value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    @Nullable
    public Record getJsonbToRecordset() {
        return (Record) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row1<Record> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row1<Record> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Record> field1() {
        return JsonbToRecordset.JSONB_TO_RECORDSET.JSONB_TO_RECORDSET_;
    }

    @Override
    @Nullable
    public Record component1() {
        return getJsonbToRecordset();
    }

    @Override
    @Nullable
    public Record value1() {
        return getJsonbToRecordset();
    }

    @Override
    @NotNull
    public JsonbToRecordsetRecord value1(@Nullable Record value) {
        setJsonbToRecordset(value);
        return this;
    }

    @Override
    @NotNull
    public JsonbToRecordsetRecord values(@Nullable Record value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonbToRecordsetRecord
     */
    public JsonbToRecordsetRecord() {
        super(JsonbToRecordset.JSONB_TO_RECORDSET);
    }

    /**
     * Create a detached, initialised JsonbToRecordsetRecord
     */
    @ConstructorProperties({ "jsonbToRecordset" })
    public JsonbToRecordsetRecord(@Nullable Record jsonbToRecordset) {
        super(JsonbToRecordset.JSONB_TO_RECORDSET);

        setJsonbToRecordset(jsonbToRecordset);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised JsonbToRecordsetRecord
     */
    public JsonbToRecordsetRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.JsonbToRecordset value) {
        super(JsonbToRecordset.JSONB_TO_RECORDSET);

        if (value != null) {
            setJsonbToRecordset(value.getJsonbToRecordset());
            resetChangedOnNotNull();
        }
    }
}
