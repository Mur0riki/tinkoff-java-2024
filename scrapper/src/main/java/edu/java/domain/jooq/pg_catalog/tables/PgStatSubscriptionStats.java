/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatSubscriptionStatsRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


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
public class PgStatSubscriptionStats extends TableImpl<PgStatSubscriptionStatsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_subscription_stats</code>
     */
    public static final PgStatSubscriptionStats PG_STAT_SUBSCRIPTION_STATS = new PgStatSubscriptionStats();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgStatSubscriptionStatsRecord> getRecordType() {
        return PgStatSubscriptionStatsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_subscription_stats.subid</code>.
     */
    public final TableField<PgStatSubscriptionStatsRecord, Long> SUBID = createField(DSL.name("subid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription_stats.subname</code>.
     */
    public final TableField<PgStatSubscriptionStatsRecord, String> SUBNAME = createField(DSL.name("subname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_subscription_stats.apply_error_count</code>.
     */
    public final TableField<PgStatSubscriptionStatsRecord, Long> APPLY_ERROR_COUNT = createField(DSL.name("apply_error_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_subscription_stats.sync_error_count</code>.
     */
    public final TableField<PgStatSubscriptionStatsRecord, Long> SYNC_ERROR_COUNT = createField(DSL.name("sync_error_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_subscription_stats.stats_reset</code>.
     */
    public final TableField<PgStatSubscriptionStatsRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatSubscriptionStats(Name alias, Table<PgStatSubscriptionStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSubscriptionStats(Name alias, Table<PgStatSubscriptionStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_subscription_stats" as  SELECT ss.subid,
         s.subname,
         ss.apply_error_count,
         ss.sync_error_count,
         ss.stats_reset
        FROM pg_subscription s,
         LATERAL pg_stat_get_subscription_stats(s.oid) ss(subid, apply_error_count, sync_error_count, stats_reset);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_subscription_stats</code>
     * table reference
     */
    public PgStatSubscriptionStats(String alias) {
        this(DSL.name(alias), PG_STAT_SUBSCRIPTION_STATS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_subscription_stats</code>
     * table reference
     */
    public PgStatSubscriptionStats(Name alias) {
        this(alias, PG_STAT_SUBSCRIPTION_STATS);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_subscription_stats</code> table
     * reference
     */
    public PgStatSubscriptionStats() {
        this(DSL.name("pg_stat_subscription_stats"), null);
    }

    public <O extends Record> PgStatSubscriptionStats(Table<O> child, ForeignKey<O, PgStatSubscriptionStatsRecord> key) {
        super(child, key, PG_STAT_SUBSCRIPTION_STATS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgStatSubscriptionStats as(String alias) {
        return new PgStatSubscriptionStats(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatSubscriptionStats as(Name alias) {
        return new PgStatSubscriptionStats(alias, this);
    }

    @Override
    @NotNull
    public PgStatSubscriptionStats as(Table<?> alias) {
        return new PgStatSubscriptionStats(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatSubscriptionStats rename(String name) {
        return new PgStatSubscriptionStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatSubscriptionStats rename(Name name) {
        return new PgStatSubscriptionStats(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatSubscriptionStats rename(Table<?> name) {
        return new PgStatSubscriptionStats(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Long, String, Long, Long, OffsetDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super String, ? super Long, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super String, ? super Long, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}