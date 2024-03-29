/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.ColumnOptionsRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
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
public class ColumnOptions extends TableImpl<ColumnOptionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.column_options</code>
     */
    public static final ColumnOptions COLUMN_OPTIONS = new ColumnOptions();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<ColumnOptionsRecord> getRecordType() {
        return ColumnOptionsRecord.class;
    }

    /**
     * The column <code>information_schema.column_options.table_catalog</code>.
     */
    public final TableField<ColumnOptionsRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_options.table_schema</code>.
     */
    public final TableField<ColumnOptionsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_options.table_name</code>.
     */
    public final TableField<ColumnOptionsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_options.column_name</code>.
     */
    public final TableField<ColumnOptionsRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_options.option_name</code>.
     */
    public final TableField<ColumnOptionsRecord, String> OPTION_NAME = createField(DSL.name("option_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.column_options.option_value</code>.
     */
    public final TableField<ColumnOptionsRecord, String> OPTION_VALUE = createField(DSL.name("option_value"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private ColumnOptions(Name alias, Table<ColumnOptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnOptions(Name alias, Table<ColumnOptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "column_options" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,
         (nspname)::information_schema.sql_identifier AS table_schema,
         (relname)::information_schema.sql_identifier AS table_name,
         (attname)::information_schema.sql_identifier AS column_name,
         ((pg_options_to_table(attfdwoptions)).option_name)::information_schema.sql_identifier AS option_name,
         ((pg_options_to_table(attfdwoptions)).option_value)::information_schema.character_data AS option_value
        FROM information_schema._pg_foreign_table_columns c;
        """));
    }

    /**
     * Create an aliased <code>information_schema.column_options</code> table
     * reference
     */
    public ColumnOptions(String alias) {
        this(DSL.name(alias), COLUMN_OPTIONS);
    }

    /**
     * Create an aliased <code>information_schema.column_options</code> table
     * reference
     */
    public ColumnOptions(Name alias) {
        this(alias, COLUMN_OPTIONS);
    }

    /**
     * Create a <code>information_schema.column_options</code> table reference
     */
    public ColumnOptions() {
        this(DSL.name("column_options"), null);
    }

    public <O extends Record> ColumnOptions(Table<O> child, ForeignKey<O, ColumnOptionsRecord> key) {
        super(child, key, COLUMN_OPTIONS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public ColumnOptions as(String alias) {
        return new ColumnOptions(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public ColumnOptions as(Name alias) {
        return new ColumnOptions(alias, this);
    }

    @Override
    @NotNull
    public ColumnOptions as(Table<?> alias) {
        return new ColumnOptions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public ColumnOptions rename(String name) {
        return new ColumnOptions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public ColumnOptions rename(Name name) {
        return new ColumnOptions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public ColumnOptions rename(Table<?> name) {
        return new ColumnOptions(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
