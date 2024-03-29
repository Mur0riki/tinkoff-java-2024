/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgGetKeywordsRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function5;
import org.jooq.Name;
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
public class PgGetKeywords extends TableImpl<PgGetKeywordsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_get_keywords</code>
     */
    public static final PgGetKeywords PG_GET_KEYWORDS = new PgGetKeywords();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgGetKeywordsRecord> getRecordType() {
        return PgGetKeywordsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_keywords.word</code>.
     */
    public final TableField<PgGetKeywordsRecord, String> WORD = createField(DSL.name("word"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_get_keywords.catcode</code>.
     */
    public final TableField<PgGetKeywordsRecord, String> CATCODE = createField(DSL.name("catcode"), SQLDataType.CHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_get_keywords.barelabel</code>.
     */
    public final TableField<PgGetKeywordsRecord, Boolean> BARELABEL = createField(DSL.name("barelabel"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_get_keywords.catdesc</code>.
     */
    public final TableField<PgGetKeywordsRecord, String> CATDESC = createField(DSL.name("catdesc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_get_keywords.baredesc</code>.
     */
    public final TableField<PgGetKeywordsRecord, String> BAREDESC = createField(DSL.name("baredesc"), SQLDataType.CLOB, this, "");

    private PgGetKeywords(Name alias, Table<PgGetKeywordsRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgGetKeywords(Name alias, Table<PgGetKeywordsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_keywords</code> table reference
     */
    public PgGetKeywords(String alias) {
        this(DSL.name(alias), PG_GET_KEYWORDS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_keywords</code> table reference
     */
    public PgGetKeywords(Name alias) {
        this(alias, PG_GET_KEYWORDS);
    }

    /**
     * Create a <code>pg_catalog.pg_get_keywords</code> table reference
     */
    public PgGetKeywords() {
        this(DSL.name("pg_get_keywords"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgGetKeywords as(String alias) {
        return new PgGetKeywords(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgGetKeywords as(Name alias) {
        return new PgGetKeywords(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgGetKeywords as(Table<?> alias) {
        return new PgGetKeywords(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgGetKeywords rename(String name) {
        return new PgGetKeywords(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgGetKeywords rename(Name name) {
        return new PgGetKeywords(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgGetKeywords rename(Table<?> name) {
        return new PgGetKeywords(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<String, String, Boolean, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgGetKeywords call() {
        PgGetKeywords result = new PgGetKeywords(DSL.name("pg_get_keywords"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super Boolean, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super Boolean, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
