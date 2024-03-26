/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgLsWaldir;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PgLsWaldirRecord extends TableRecordImpl<PgLsWaldirRecord> implements Record3<String, Long, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ls_waldir.name</code>.
     */
    public void setName(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_waldir.name</code>.
     */
    @Nullable
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ls_waldir.size</code>.
     */
    public void setSize(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_waldir.size</code>.
     */
    @Nullable
    public Long getSize() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ls_waldir.modification</code>.
     */
    public void setModification(@Nullable OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_waldir.modification</code>.
     */
    @Nullable
    public OffsetDateTime getModification() {
        return (OffsetDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<String, Long, OffsetDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row3<String, Long, OffsetDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgLsWaldir.PG_LS_WALDIR.NAME;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgLsWaldir.PG_LS_WALDIR.SIZE;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field3() {
        return PgLsWaldir.PG_LS_WALDIR.MODIFICATION;
    }

    @Override
    @Nullable
    public String component1() {
        return getName();
    }

    @Override
    @Nullable
    public Long component2() {
        return getSize();
    }

    @Override
    @Nullable
    public OffsetDateTime component3() {
        return getModification();
    }

    @Override
    @Nullable
    public String value1() {
        return getName();
    }

    @Override
    @Nullable
    public Long value2() {
        return getSize();
    }

    @Override
    @Nullable
    public OffsetDateTime value3() {
        return getModification();
    }

    @Override
    @NotNull
    public PgLsWaldirRecord value1(@Nullable String value) {
        setName(value);
        return this;
    }

    @Override
    @NotNull
    public PgLsWaldirRecord value2(@Nullable Long value) {
        setSize(value);
        return this;
    }

    @Override
    @NotNull
    public PgLsWaldirRecord value3(@Nullable OffsetDateTime value) {
        setModification(value);
        return this;
    }

    @Override
    @NotNull
    public PgLsWaldirRecord values(@Nullable String value1, @Nullable Long value2, @Nullable OffsetDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLsWaldirRecord
     */
    public PgLsWaldirRecord() {
        super(PgLsWaldir.PG_LS_WALDIR);
    }

    /**
     * Create a detached, initialised PgLsWaldirRecord
     */
    @ConstructorProperties({ "name", "size", "modification" })
    public PgLsWaldirRecord(@Nullable String name, @Nullable Long size, @Nullable OffsetDateTime modification) {
        super(PgLsWaldir.PG_LS_WALDIR);

        setName(name);
        setSize(size);
        setModification(modification);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgLsWaldirRecord
     */
    public PgLsWaldirRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgLsWaldir value) {
        super(PgLsWaldir.PG_LS_WALDIR);

        if (value != null) {
            setName(value.getName());
            setSize(value.getSize());
            setModification(value.getModification());
            resetChangedOnNotNull();
        }
    }
}