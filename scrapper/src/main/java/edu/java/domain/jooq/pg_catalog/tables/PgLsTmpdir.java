/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgLsTmpdirRecord;

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
public class PgLsTmpdir extends TableImpl<PgLsTmpdirRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ls_tmpdir</code>
     */
    public static final PgLsTmpdir PG_LS_TMPDIR = new PgLsTmpdir();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgLsTmpdirRecord> getRecordType() {
        return PgLsTmpdirRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ls_tmpdir.name</code>.
     */
    public final TableField<PgLsTmpdirRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_tmpdir.size</code>.
     */
    public final TableField<PgLsTmpdirRecord, Long> SIZE = createField(DSL.name("size"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_tmpdir.modification</code>.
     */
    public final TableField<PgLsTmpdirRecord, OffsetDateTime> MODIFICATION = createField(DSL.name("modification"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgLsTmpdir(Name alias, Table<PgLsTmpdirRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.BIGINT)
        });
    }

    private PgLsTmpdir(Name alias, Table<PgLsTmpdirRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_tmpdir</code> table reference
     */
    public PgLsTmpdir(String alias) {
        this(DSL.name(alias), PG_LS_TMPDIR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_tmpdir</code> table reference
     */
    public PgLsTmpdir(Name alias) {
        this(alias, PG_LS_TMPDIR);
    }

    /**
     * Create a <code>pg_catalog.pg_ls_tmpdir</code> table reference
     */
    public PgLsTmpdir() {
        this(DSL.name("pg_ls_tmpdir"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgLsTmpdir as(String alias) {
        return new PgLsTmpdir(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgLsTmpdir as(Name alias) {
        return new PgLsTmpdir(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgLsTmpdir as(Table<?> alias) {
        return new PgLsTmpdir(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLsTmpdir rename(String name) {
        return new PgLsTmpdir(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLsTmpdir rename(Name name) {
        return new PgLsTmpdir(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgLsTmpdir rename(Table<?> name) {
        return new PgLsTmpdir(name.getQualifiedName(), null, parameters);
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
    public PgLsTmpdir call(
          Long tablespace
    ) {
        PgLsTmpdir result = new PgLsTmpdir(DSL.name("pg_ls_tmpdir"), null, new Field[] {
            DSL.val(tablespace, SQLDataType.BIGINT)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgLsTmpdir call(
          Field<Long> tablespace
    ) {
        PgLsTmpdir result = new PgLsTmpdir(DSL.name("pg_ls_tmpdir"), null, new Field[] {
            tablespace
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
