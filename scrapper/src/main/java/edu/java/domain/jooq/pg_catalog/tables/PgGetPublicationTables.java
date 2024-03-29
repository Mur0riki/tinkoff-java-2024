/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgGetPublicationTablesRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row4;
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
public class PgGetPublicationTables extends TableImpl<PgGetPublicationTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_get_publication_tables</code>
     */
    public static final PgGetPublicationTables PG_GET_PUBLICATION_TABLES = new PgGetPublicationTables();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgGetPublicationTablesRecord> getRecordType() {
        return PgGetPublicationTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_publication_tables.pubid</code>.
     */
    public final TableField<PgGetPublicationTablesRecord, Long> PUBID = createField(DSL.name("pubid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public final TableField<PgGetPublicationTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_publication_tables.attrs</code>.
     */
    public final TableField<PgGetPublicationTablesRecord, Object[]> ATTRS = createField(DSL.name("attrs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").array(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgGetPublicationTablesRecord, Object> QUAL = createField(DSL.name("qual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB.array())
        });
    }

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_publication_tables</code> table
     * reference
     */
    public PgGetPublicationTables(String alias) {
        this(DSL.name(alias), PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_publication_tables</code> table
     * reference
     */
    public PgGetPublicationTables(Name alias) {
        this(alias, PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_get_publication_tables</code> table
     * reference
     */
    public PgGetPublicationTables() {
        this(DSL.name("pg_get_publication_tables"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgGetPublicationTables as(String alias) {
        return new PgGetPublicationTables(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgGetPublicationTables as(Name alias) {
        return new PgGetPublicationTables(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgGetPublicationTables as(Table<?> alias) {
        return new PgGetPublicationTables(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgGetPublicationTables rename(String name) {
        return new PgGetPublicationTables(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgGetPublicationTables rename(Name name) {
        return new PgGetPublicationTables(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgGetPublicationTables rename(Table<?> name) {
        return new PgGetPublicationTables(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, Long, Object[], Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgGetPublicationTables call(
          String[] pubname
    ) {
        PgGetPublicationTables result = new PgGetPublicationTables(DSL.name("pg_get_publication_tables"), null, new Field[] {
            DSL.val(pubname, SQLDataType.CLOB.array())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgGetPublicationTables call(
          Field<String[]> pubname
    ) {
        PgGetPublicationTables result = new PgGetPublicationTables(DSL.name("pg_get_publication_tables"), null, new Field[] {
            pubname
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super Long, ? super Object[], ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super Long, ? super Object[], ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
