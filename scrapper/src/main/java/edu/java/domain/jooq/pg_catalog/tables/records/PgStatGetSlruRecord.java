/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatGetSlru;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class PgStatGetSlruRecord extends TableRecordImpl<PgStatGetSlruRecord> implements Record9<String, Long, Long, Long, Long, Long, Long, Long, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_get_slru.name</code>.
     */
    public void setName(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_slru.name</code>.
     */
    @Nullable
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_slru.blks_zeroed</code>.
     */
    public void setBlksZeroed(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_slru.blks_zeroed</code>.
     */
    @Nullable
    public Long getBlksZeroed() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_slru.blks_hit</code>.
     */
    public void setBlksHit(@Nullable Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_slru.blks_hit</code>.
     */
    @Nullable
    public Long getBlksHit() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_slru.blks_read</code>.
     */
    public void setBlksRead(@Nullable Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_slru.blks_read</code>.
     */
    @Nullable
    public Long getBlksRead() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_slru.blks_written</code>.
     */
    public void setBlksWritten(@Nullable Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_slru.blks_written</code>.
     */
    @Nullable
    public Long getBlksWritten() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_slru.blks_exists</code>.
     */
    public void setBlksExists(@Nullable Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_slru.blks_exists</code>.
     */
    @Nullable
    public Long getBlksExists() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_slru.flushes</code>.
     */
    public void setFlushes(@Nullable Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_slru.flushes</code>.
     */
    @Nullable
    public Long getFlushes() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_slru.truncates</code>.
     */
    public void setTruncates(@Nullable Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_slru.truncates</code>.
     */
    @Nullable
    public Long getTruncates() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_slru.stats_reset</code>.
     */
    public void setStatsReset(@Nullable OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_slru.stats_reset</code>.
     */
    @Nullable
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<String, Long, Long, Long, Long, Long, Long, Long, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row9<String, Long, Long, Long, Long, Long, Long, Long, OffsetDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgStatGetSlru.PG_STAT_GET_SLRU.NAME;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgStatGetSlru.PG_STAT_GET_SLRU.BLKS_ZEROED;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgStatGetSlru.PG_STAT_GET_SLRU.BLKS_HIT;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgStatGetSlru.PG_STAT_GET_SLRU.BLKS_READ;
    }

    @Override
    @NotNull
    public Field<Long> field5() {
        return PgStatGetSlru.PG_STAT_GET_SLRU.BLKS_WRITTEN;
    }

    @Override
    @NotNull
    public Field<Long> field6() {
        return PgStatGetSlru.PG_STAT_GET_SLRU.BLKS_EXISTS;
    }

    @Override
    @NotNull
    public Field<Long> field7() {
        return PgStatGetSlru.PG_STAT_GET_SLRU.FLUSHES;
    }

    @Override
    @NotNull
    public Field<Long> field8() {
        return PgStatGetSlru.PG_STAT_GET_SLRU.TRUNCATES;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field9() {
        return PgStatGetSlru.PG_STAT_GET_SLRU.STATS_RESET;
    }

    @Override
    @Nullable
    public String component1() {
        return getName();
    }

    @Override
    @Nullable
    public Long component2() {
        return getBlksZeroed();
    }

    @Override
    @Nullable
    public Long component3() {
        return getBlksHit();
    }

    @Override
    @Nullable
    public Long component4() {
        return getBlksRead();
    }

    @Override
    @Nullable
    public Long component5() {
        return getBlksWritten();
    }

    @Override
    @Nullable
    public Long component6() {
        return getBlksExists();
    }

    @Override
    @Nullable
    public Long component7() {
        return getFlushes();
    }

    @Override
    @Nullable
    public Long component8() {
        return getTruncates();
    }

    @Override
    @Nullable
    public OffsetDateTime component9() {
        return getStatsReset();
    }

    @Override
    @Nullable
    public String value1() {
        return getName();
    }

    @Override
    @Nullable
    public Long value2() {
        return getBlksZeroed();
    }

    @Override
    @Nullable
    public Long value3() {
        return getBlksHit();
    }

    @Override
    @Nullable
    public Long value4() {
        return getBlksRead();
    }

    @Override
    @Nullable
    public Long value5() {
        return getBlksWritten();
    }

    @Override
    @Nullable
    public Long value6() {
        return getBlksExists();
    }

    @Override
    @Nullable
    public Long value7() {
        return getFlushes();
    }

    @Override
    @Nullable
    public Long value8() {
        return getTruncates();
    }

    @Override
    @Nullable
    public OffsetDateTime value9() {
        return getStatsReset();
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord value1(@Nullable String value) {
        setName(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord value2(@Nullable Long value) {
        setBlksZeroed(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord value3(@Nullable Long value) {
        setBlksHit(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord value4(@Nullable Long value) {
        setBlksRead(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord value5(@Nullable Long value) {
        setBlksWritten(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord value6(@Nullable Long value) {
        setBlksExists(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord value7(@Nullable Long value) {
        setFlushes(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord value8(@Nullable Long value) {
        setTruncates(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord value9(@Nullable OffsetDateTime value) {
        setStatsReset(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGetSlruRecord values(@Nullable String value1, @Nullable Long value2, @Nullable Long value3, @Nullable Long value4, @Nullable Long value5, @Nullable Long value6, @Nullable Long value7, @Nullable Long value8, @Nullable OffsetDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatGetSlruRecord
     */
    public PgStatGetSlruRecord() {
        super(PgStatGetSlru.PG_STAT_GET_SLRU);
    }

    /**
     * Create a detached, initialised PgStatGetSlruRecord
     */
    @ConstructorProperties({ "name", "blksZeroed", "blksHit", "blksRead", "blksWritten", "blksExists", "flushes", "truncates", "statsReset" })
    public PgStatGetSlruRecord(@Nullable String name, @Nullable Long blksZeroed, @Nullable Long blksHit, @Nullable Long blksRead, @Nullable Long blksWritten, @Nullable Long blksExists, @Nullable Long flushes, @Nullable Long truncates, @Nullable OffsetDateTime statsReset) {
        super(PgStatGetSlru.PG_STAT_GET_SLRU);

        setName(name);
        setBlksZeroed(blksZeroed);
        setBlksHit(blksHit);
        setBlksRead(blksRead);
        setBlksWritten(blksWritten);
        setBlksExists(blksExists);
        setFlushes(flushes);
        setTruncates(truncates);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatGetSlruRecord
     */
    public PgStatGetSlruRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatGetSlru value) {
        super(PgStatGetSlru.PG_STAT_GET_SLRU);

        if (value != null) {
            setName(value.getName());
            setBlksZeroed(value.getBlksZeroed());
            setBlksHit(value.getBlksHit());
            setBlksRead(value.getBlksRead());
            setBlksWritten(value.getBlksWritten());
            setBlksExists(value.getBlksExists());
            setFlushes(value.getFlushes());
            setTruncates(value.getTruncates());
            setStatsReset(value.getStatsReset());
            resetChangedOnNotNull();
        }
    }
}
