/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgPreparedXacts;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

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
public class PgPreparedXactsRecord extends TableRecordImpl<PgPreparedXactsRecord> implements Record5<Long, String, OffsetDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.transaction</code>.
     */
    public void setTransaction(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.transaction</code>.
     */
    @Nullable
    public Long getTransaction() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.gid</code>.
     */
    public void setGid(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.gid</code>.
     */
    @Nullable
    public String getGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.prepared</code>.
     */
    public void setPrepared(@Nullable OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.prepared</code>.
     */
    @Nullable
    public OffsetDateTime getPrepared() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.owner</code>.
     */
    public void setOwner(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.owner</code>.
     */
    @Nullable
    public String getOwner() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.database</code>.
     */
    public void setDatabase(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.database</code>.
     */
    @Nullable
    public String getDatabase() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Long, String, OffsetDateTime, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<Long, String, OffsetDateTime, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgPreparedXacts.PG_PREPARED_XACTS.TRANSACTION;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgPreparedXacts.PG_PREPARED_XACTS.GID;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field3() {
        return PgPreparedXacts.PG_PREPARED_XACTS.PREPARED;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return PgPreparedXacts.PG_PREPARED_XACTS.OWNER;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return PgPreparedXacts.PG_PREPARED_XACTS.DATABASE;
    }

    @Override
    @Nullable
    public Long component1() {
        return getTransaction();
    }

    @Override
    @Nullable
    public String component2() {
        return getGid();
    }

    @Override
    @Nullable
    public OffsetDateTime component3() {
        return getPrepared();
    }

    @Override
    @Nullable
    public String component4() {
        return getOwner();
    }

    @Override
    @Nullable
    public String component5() {
        return getDatabase();
    }

    @Override
    @Nullable
    public Long value1() {
        return getTransaction();
    }

    @Override
    @Nullable
    public String value2() {
        return getGid();
    }

    @Override
    @Nullable
    public OffsetDateTime value3() {
        return getPrepared();
    }

    @Override
    @Nullable
    public String value4() {
        return getOwner();
    }

    @Override
    @Nullable
    public String value5() {
        return getDatabase();
    }

    @Override
    @NotNull
    public PgPreparedXactsRecord value1(@Nullable Long value) {
        setTransaction(value);
        return this;
    }

    @Override
    @NotNull
    public PgPreparedXactsRecord value2(@Nullable String value) {
        setGid(value);
        return this;
    }

    @Override
    @NotNull
    public PgPreparedXactsRecord value3(@Nullable OffsetDateTime value) {
        setPrepared(value);
        return this;
    }

    @Override
    @NotNull
    public PgPreparedXactsRecord value4(@Nullable String value) {
        setOwner(value);
        return this;
    }

    @Override
    @NotNull
    public PgPreparedXactsRecord value5(@Nullable String value) {
        setDatabase(value);
        return this;
    }

    @Override
    @NotNull
    public PgPreparedXactsRecord values(@Nullable Long value1, @Nullable String value2, @Nullable OffsetDateTime value3, @Nullable String value4, @Nullable String value5) {
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
     * Create a detached PgPreparedXactsRecord
     */
    public PgPreparedXactsRecord() {
        super(PgPreparedXacts.PG_PREPARED_XACTS);
    }

    /**
     * Create a detached, initialised PgPreparedXactsRecord
     */
    @ConstructorProperties({ "transaction", "gid", "prepared", "owner", "database" })
    public PgPreparedXactsRecord(@Nullable Long transaction, @Nullable String gid, @Nullable OffsetDateTime prepared, @Nullable String owner, @Nullable String database) {
        super(PgPreparedXacts.PG_PREPARED_XACTS);

        setTransaction(transaction);
        setGid(gid);
        setPrepared(prepared);
        setOwner(owner);
        setDatabase(database);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgPreparedXactsRecord
     */
    public PgPreparedXactsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgPreparedXacts value) {
        super(PgPreparedXacts.PG_PREPARED_XACTS);

        if (value != null) {
            setTransaction(value.getTransaction());
            setGid(value.getGid());
            setPrepared(value.getPrepared());
            setOwner(value.getOwner());
            setDatabase(value.getDatabase());
            resetChangedOnNotNull();
        }
    }
}
