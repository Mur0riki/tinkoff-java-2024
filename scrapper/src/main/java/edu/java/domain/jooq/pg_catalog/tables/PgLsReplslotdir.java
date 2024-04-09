/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLsReplslotdirRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row3;
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
public class PgLsReplslotdir extends TableImpl<PgLsReplslotdirRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ls_replslotdir</code>
     */
    public static final PgLsReplslotdir PG_LS_REPLSLOTDIR = new PgLsReplslotdir();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgLsReplslotdirRecord> getRecordType() {
        return PgLsReplslotdirRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ls_replslotdir.name</code>.
     */
    public final TableField<PgLsReplslotdirRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_replslotdir.size</code>.
     */
    public final TableField<PgLsReplslotdirRecord, Long> SIZE = createField(DSL.name("size"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_replslotdir.modification</code>.
     */
    public final TableField<PgLsReplslotdirRecord, OffsetDateTime> MODIFICATION = createField(DSL.name("modification"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgLsReplslotdir(Name alias, Table<PgLsReplslotdirRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private PgLsReplslotdir(Name alias, Table<PgLsReplslotdirRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_replslotdir</code> table
     * reference
     */
    public PgLsReplslotdir(String alias) {
        this(DSL.name(alias), PG_LS_REPLSLOTDIR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_replslotdir</code> table
     * reference
     */
    public PgLsReplslotdir(Name alias) {
        this(alias, PG_LS_REPLSLOTDIR);
    }

    /**
     * Create a <code>pg_catalog.pg_ls_replslotdir</code> table reference
     */
    public PgLsReplslotdir() {
        this(DSL.name("pg_ls_replslotdir"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgLsReplslotdir as(String alias) {
        return new PgLsReplslotdir(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgLsReplslotdir as(Name alias) {
        return new PgLsReplslotdir(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgLsReplslotdir as(Table<?> alias) {
        return new PgLsReplslotdir(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLsReplslotdir rename(String name) {
        return new PgLsReplslotdir(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLsReplslotdir rename(Name name) {
        return new PgLsReplslotdir(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLsReplslotdir rename(Table<?> name) {
        return new PgLsReplslotdir(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<String, Long, OffsetDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgLsReplslotdir call(
          String slotName
    ) {
        PgLsReplslotdir result = new PgLsReplslotdir(DSL.name("pg_ls_replslotdir"), null, new Field[] {
            DSL.val(slotName, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgLsReplslotdir call(
          Field<String> slotName
    ) {
        PgLsReplslotdir result = new PgLsReplslotdir(DSL.name("pg_ls_replslotdir"), null, new Field[] {
            slotName
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}