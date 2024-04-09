/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgFileSettingsRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class PgFileSettings extends TableImpl<PgFileSettingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_file_settings</code>
     */
    public static final PgFileSettings PG_FILE_SETTINGS = new PgFileSettings();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgFileSettingsRecord> getRecordType() {
        return PgFileSettingsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_file_settings.sourcefile</code>.
     */
    public final TableField<PgFileSettingsRecord, String> SOURCEFILE = createField(DSL.name("sourcefile"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.sourceline</code>.
     */
    public final TableField<PgFileSettingsRecord, Integer> SOURCELINE = createField(DSL.name("sourceline"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.seqno</code>.
     */
    public final TableField<PgFileSettingsRecord, Integer> SEQNO = createField(DSL.name("seqno"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.name</code>.
     */
    public final TableField<PgFileSettingsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.setting</code>.
     */
    public final TableField<PgFileSettingsRecord, String> SETTING = createField(DSL.name("setting"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.applied</code>.
     */
    public final TableField<PgFileSettingsRecord, Boolean> APPLIED = createField(DSL.name("applied"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_file_settings.error</code>.
     */
    public final TableField<PgFileSettingsRecord, String> ERROR = createField(DSL.name("error"), SQLDataType.CLOB, this, "");

    private PgFileSettings(Name alias, Table<PgFileSettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgFileSettings(Name alias, Table<PgFileSettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_file_settings" as  SELECT sourcefile,
         sourceline,
         seqno,
         name,
         setting,
         applied,
         error
        FROM pg_show_all_file_settings() a(sourcefile, sourceline, seqno, name, setting, applied, error);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_file_settings</code> table
     * reference
     */
    public PgFileSettings(String alias) {
        this(DSL.name(alias), PG_FILE_SETTINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_file_settings</code> table
     * reference
     */
    public PgFileSettings(Name alias) {
        this(alias, PG_FILE_SETTINGS);
    }

    /**
     * Create a <code>pg_catalog.pg_file_settings</code> table reference
     */
    public PgFileSettings() {
        this(DSL.name("pg_file_settings"), null);
    }

    public <O extends Record> PgFileSettings(Table<O> child, ForeignKey<O, PgFileSettingsRecord> key) {
        super(child, key, PG_FILE_SETTINGS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgFileSettings as(String alias) {
        return new PgFileSettings(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgFileSettings as(Name alias) {
        return new PgFileSettings(alias, this);
    }

    @Override
    @NotNull
    public PgFileSettings as(Table<?> alias) {
        return new PgFileSettings(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgFileSettings rename(String name) {
        return new PgFileSettings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgFileSettings rename(Name name) {
        return new PgFileSettings(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgFileSettings rename(Table<?> name) {
        return new PgFileSettings(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<String, Integer, Integer, String, String, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super Integer, ? super Integer, ? super String, ? super String, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super Integer, ? super Integer, ? super String, ? super String, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}