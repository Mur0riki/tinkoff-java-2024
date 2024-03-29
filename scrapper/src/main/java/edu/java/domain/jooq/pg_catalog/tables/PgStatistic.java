/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgStatisticRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
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
public class PgStatistic extends TableImpl<PgStatisticRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_statistic</code>
     */
    public static final PgStatistic PG_STATISTIC = new PgStatistic();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgStatisticRecord> getRecordType() {
        return PgStatisticRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statistic.starelid</code>.
     */
    public final TableField<PgStatisticRecord, Long> STARELID = createField(DSL.name("starelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staattnum</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAATTNUM = createField(DSL.name("staattnum"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stainherit</code>.
     */
    public final TableField<PgStatisticRecord, Boolean> STAINHERIT = createField(DSL.name("stainherit"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanullfrac</code>.
     */
    public final TableField<PgStatisticRecord, Float> STANULLFRAC = createField(DSL.name("stanullfrac"), SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stawidth</code>.
     */
    public final TableField<PgStatisticRecord, Integer> STAWIDTH = createField(DSL.name("stawidth"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stadistinct</code>.
     */
    public final TableField<PgStatisticRecord, Float> STADISTINCT = createField(DSL.name("stadistinct"), SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind1</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND1 = createField(DSL.name("stakind1"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind2</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND2 = createField(DSL.name("stakind2"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind3</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND3 = createField(DSL.name("stakind3"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind4</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND4 = createField(DSL.name("stakind4"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stakind5</code>.
     */
    public final TableField<PgStatisticRecord, Short> STAKIND5 = createField(DSL.name("stakind5"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop1</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP1 = createField(DSL.name("staop1"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop2</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP2 = createField(DSL.name("staop2"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop3</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP3 = createField(DSL.name("staop3"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop4</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP4 = createField(DSL.name("staop4"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.staop5</code>.
     */
    public final TableField<PgStatisticRecord, Long> STAOP5 = createField(DSL.name("staop5"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stacoll1</code>.
     */
    public final TableField<PgStatisticRecord, Long> STACOLL1 = createField(DSL.name("stacoll1"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stacoll2</code>.
     */
    public final TableField<PgStatisticRecord, Long> STACOLL2 = createField(DSL.name("stacoll2"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stacoll3</code>.
     */
    public final TableField<PgStatisticRecord, Long> STACOLL3 = createField(DSL.name("stacoll3"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stacoll4</code>.
     */
    public final TableField<PgStatisticRecord, Long> STACOLL4 = createField(DSL.name("stacoll4"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stacoll5</code>.
     */
    public final TableField<PgStatisticRecord, Long> STACOLL5 = createField(DSL.name("stacoll5"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers1</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS1 = createField(DSL.name("stanumbers1"), SQLDataType.REAL.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers2</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS2 = createField(DSL.name("stanumbers2"), SQLDataType.REAL.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers3</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS3 = createField(DSL.name("stanumbers3"), SQLDataType.REAL.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers4</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS4 = createField(DSL.name("stanumbers4"), SQLDataType.REAL.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stanumbers5</code>.
     */
    public final TableField<PgStatisticRecord, Float[]> STANUMBERS5 = createField(DSL.name("stanumbers5"), SQLDataType.REAL.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stavalues1</code>.
     */
    public final TableField<PgStatisticRecord, Object[]> STAVALUES1 = createField(DSL.name("stavalues1"), SQLDataType.OTHER.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stavalues2</code>.
     */
    public final TableField<PgStatisticRecord, Object[]> STAVALUES2 = createField(DSL.name("stavalues2"), SQLDataType.OTHER.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stavalues3</code>.
     */
    public final TableField<PgStatisticRecord, Object[]> STAVALUES3 = createField(DSL.name("stavalues3"), SQLDataType.OTHER.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stavalues4</code>.
     */
    public final TableField<PgStatisticRecord, Object[]> STAVALUES4 = createField(DSL.name("stavalues4"), SQLDataType.OTHER.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic.stavalues5</code>.
     */
    public final TableField<PgStatisticRecord, Object[]> STAVALUES5 = createField(DSL.name("stavalues5"), SQLDataType.OTHER.array(), this, "");

    private PgStatistic(Name alias, Table<PgStatisticRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatistic(Name alias, Table<PgStatisticRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic</code> table reference
     */
    public PgStatistic(String alias) {
        this(DSL.name(alias), PG_STATISTIC);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic</code> table reference
     */
    public PgStatistic(Name alias) {
        this(alias, PG_STATISTIC);
    }

    /**
     * Create a <code>pg_catalog.pg_statistic</code> table reference
     */
    public PgStatistic() {
        this(DSL.name("pg_statistic"), null);
    }

    public <O extends Record> PgStatistic(Table<O> child, ForeignKey<O, PgStatisticRecord> key) {
        super(child, key, PG_STATISTIC);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgStatisticRecord> getPrimaryKey() {
        return Keys.PG_STATISTIC_RELID_ATT_INH_INDEX;
    }

    @Override
    @NotNull
    public PgStatistic as(String alias) {
        return new PgStatistic(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgStatistic as(Name alias) {
        return new PgStatistic(alias, this);
    }

    @Override
    @NotNull
    public PgStatistic as(Table<?> alias) {
        return new PgStatistic(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatistic rename(String name) {
        return new PgStatistic(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatistic rename(Name name) {
        return new PgStatistic(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgStatistic rename(Table<?> name) {
        return new PgStatistic(name.getQualifiedName(), null);
    }
}
