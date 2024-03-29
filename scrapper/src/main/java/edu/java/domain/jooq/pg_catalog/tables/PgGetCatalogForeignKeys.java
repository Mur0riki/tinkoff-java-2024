/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgGetCatalogForeignKeysRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row6;
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
public class PgGetCatalogForeignKeys extends TableImpl<PgGetCatalogForeignKeysRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_get_catalog_foreign_keys</code>
     */
    public static final PgGetCatalogForeignKeys PG_GET_CATALOG_FOREIGN_KEYS = new PgGetCatalogForeignKeys();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgGetCatalogForeignKeysRecord> getRecordType() {
        return PgGetCatalogForeignKeysRecord.class;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgGetCatalogForeignKeysRecord, Object> FKTABLE = createField(DSL.name("fktable"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), this, "");

    /**
     * The column <code>pg_catalog.pg_get_catalog_foreign_keys.fkcols</code>.
     */
    public final TableField<PgGetCatalogForeignKeysRecord, String[]> FKCOLS = createField(DSL.name("fkcols"), SQLDataType.CLOB.array(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgGetCatalogForeignKeysRecord, Object> PKTABLE = createField(DSL.name("pktable"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), this, "");

    /**
     * The column <code>pg_catalog.pg_get_catalog_foreign_keys.pkcols</code>.
     */
    public final TableField<PgGetCatalogForeignKeysRecord, String[]> PKCOLS = createField(DSL.name("pkcols"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_get_catalog_foreign_keys.is_array</code>.
     */
    public final TableField<PgGetCatalogForeignKeysRecord, Boolean> IS_ARRAY = createField(DSL.name("is_array"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_get_catalog_foreign_keys.is_opt</code>.
     */
    public final TableField<PgGetCatalogForeignKeysRecord, Boolean> IS_OPT = createField(DSL.name("is_opt"), SQLDataType.BOOLEAN, this, "");

    private PgGetCatalogForeignKeys(Name alias, Table<PgGetCatalogForeignKeysRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgGetCatalogForeignKeys(Name alias, Table<PgGetCatalogForeignKeysRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_catalog_foreign_keys</code>
     * table reference
     */
    public PgGetCatalogForeignKeys(String alias) {
        this(DSL.name(alias), PG_GET_CATALOG_FOREIGN_KEYS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_catalog_foreign_keys</code>
     * table reference
     */
    public PgGetCatalogForeignKeys(Name alias) {
        this(alias, PG_GET_CATALOG_FOREIGN_KEYS);
    }

    /**
     * Create a <code>pg_catalog.pg_get_catalog_foreign_keys</code> table
     * reference
     */
    public PgGetCatalogForeignKeys() {
        this(DSL.name("pg_get_catalog_foreign_keys"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgGetCatalogForeignKeys as(String alias) {
        return new PgGetCatalogForeignKeys(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgGetCatalogForeignKeys as(Name alias) {
        return new PgGetCatalogForeignKeys(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgGetCatalogForeignKeys as(Table<?> alias) {
        return new PgGetCatalogForeignKeys(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgGetCatalogForeignKeys rename(String name) {
        return new PgGetCatalogForeignKeys(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgGetCatalogForeignKeys rename(Name name) {
        return new PgGetCatalogForeignKeys(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgGetCatalogForeignKeys rename(Table<?> name) {
        return new PgGetCatalogForeignKeys(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<Object, String[], Object, String[], Boolean, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgGetCatalogForeignKeys call() {
        PgGetCatalogForeignKeys result = new PgGetCatalogForeignKeys(DSL.name("pg_get_catalog_foreign_keys"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Object, ? super String[], ? super Object, ? super String[], ? super Boolean, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Object, ? super String[], ? super Object, ? super String[], ? super Boolean, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
