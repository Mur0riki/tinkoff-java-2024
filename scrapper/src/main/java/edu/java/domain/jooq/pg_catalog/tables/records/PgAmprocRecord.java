/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgAmproc;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PgAmprocRecord extends UpdatableRecordImpl<PgAmprocRecord> implements Record6<Long, Long, Long, Long, Short, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_amproc.oid</code>.
     */
    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amproc.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_amproc.amprocfamily</code>.
     */
    public void setAmprocfamily(@NotNull Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amproc.amprocfamily</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getAmprocfamily() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_amproc.amproclefttype</code>.
     */
    public void setAmproclefttype(@NotNull Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amproc.amproclefttype</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getAmproclefttype() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_amproc.amprocrighttype</code>.
     */
    public void setAmprocrighttype(@NotNull Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amproc.amprocrighttype</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getAmprocrighttype() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_amproc.amprocnum</code>.
     */
    public void setAmprocnum(@NotNull Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amproc.amprocnum</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getAmprocnum() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_amproc.amproc</code>.
     */
    public void setAmproc(@NotNull String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_amproc.amproc</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getAmproc() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<Long, Long, Long, Long, Short, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<Long, Long, Long, Long, Short, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgAmproc.PG_AMPROC.OID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgAmproc.PG_AMPROC.AMPROCFAMILY;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgAmproc.PG_AMPROC.AMPROCLEFTTYPE;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgAmproc.PG_AMPROC.AMPROCRIGHTTYPE;
    }

    @Override
    @NotNull
    public Field<Short> field5() {
        return PgAmproc.PG_AMPROC.AMPROCNUM;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return PgAmproc.PG_AMPROC.AMPROC;
    }

    @Override
    @NotNull
    public Long component1() {
        return getOid();
    }

    @Override
    @NotNull
    public Long component2() {
        return getAmprocfamily();
    }

    @Override
    @NotNull
    public Long component3() {
        return getAmproclefttype();
    }

    @Override
    @NotNull
    public Long component4() {
        return getAmprocrighttype();
    }

    @Override
    @NotNull
    public Short component5() {
        return getAmprocnum();
    }

    @Override
    @NotNull
    public String component6() {
        return getAmproc();
    }

    @Override
    @NotNull
    public Long value1() {
        return getOid();
    }

    @Override
    @NotNull
    public Long value2() {
        return getAmprocfamily();
    }

    @Override
    @NotNull
    public Long value3() {
        return getAmproclefttype();
    }

    @Override
    @NotNull
    public Long value4() {
        return getAmprocrighttype();
    }

    @Override
    @NotNull
    public Short value5() {
        return getAmprocnum();
    }

    @Override
    @NotNull
    public String value6() {
        return getAmproc();
    }

    @Override
    @NotNull
    public PgAmprocRecord value1(@NotNull Long value) {
        setOid(value);
        return this;
    }

    @Override
    @NotNull
    public PgAmprocRecord value2(@NotNull Long value) {
        setAmprocfamily(value);
        return this;
    }

    @Override
    @NotNull
    public PgAmprocRecord value3(@NotNull Long value) {
        setAmproclefttype(value);
        return this;
    }

    @Override
    @NotNull
    public PgAmprocRecord value4(@NotNull Long value) {
        setAmprocrighttype(value);
        return this;
    }

    @Override
    @NotNull
    public PgAmprocRecord value5(@NotNull Short value) {
        setAmprocnum(value);
        return this;
    }

    @Override
    @NotNull
    public PgAmprocRecord value6(@NotNull String value) {
        setAmproc(value);
        return this;
    }

    @Override
    @NotNull
    public PgAmprocRecord values(@NotNull Long value1, @NotNull Long value2, @NotNull Long value3, @NotNull Long value4, @NotNull Short value5, @NotNull String value6) {
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
     * Create a detached PgAmprocRecord
     */
    public PgAmprocRecord() {
        super(PgAmproc.PG_AMPROC);
    }

    /**
     * Create a detached, initialised PgAmprocRecord
     */
    @ConstructorProperties({ "oid", "amprocfamily", "amproclefttype", "amprocrighttype", "amprocnum", "amproc" })
    public PgAmprocRecord(@NotNull Long oid, @NotNull Long amprocfamily, @NotNull Long amproclefttype, @NotNull Long amprocrighttype, @NotNull Short amprocnum, @NotNull String amproc) {
        super(PgAmproc.PG_AMPROC);

        setOid(oid);
        setAmprocfamily(amprocfamily);
        setAmproclefttype(amproclefttype);
        setAmprocrighttype(amprocrighttype);
        setAmprocnum(amprocnum);
        setAmproc(amproc);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgAmprocRecord
     */
    public PgAmprocRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgAmproc value) {
        super(PgAmproc.PG_AMPROC);

        if (value != null) {
            setOid(value.getOid());
            setAmprocfamily(value.getAmprocfamily());
            setAmproclefttype(value.getAmproclefttype());
            setAmprocrighttype(value.getAmprocrighttype());
            setAmprocnum(value.getAmprocnum());
            setAmproc(value.getAmproc());
            resetChangedOnNotNull();
        }
    }
}