/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.Keys;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgTypeRecord;

import java.util.Arrays;
import java.util.List;

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
public class PgType extends TableImpl<PgTypeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_type</code>
     */
    public static final PgType PG_TYPE = new PgType();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgTypeRecord> getRecordType() {
        return PgTypeRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_type.oid</code>.
     */
    public final TableField<PgTypeRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typname</code>.
     */
    public final TableField<PgTypeRecord, String> TYPNAME = createField(DSL.name("typname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typnamespace</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPNAMESPACE = createField(DSL.name("typnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typowner</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPOWNER = createField(DSL.name("typowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typlen</code>.
     */
    public final TableField<PgTypeRecord, Short> TYPLEN = createField(DSL.name("typlen"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typbyval</code>.
     */
    public final TableField<PgTypeRecord, Boolean> TYPBYVAL = createField(DSL.name("typbyval"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typtype</code>.
     */
    public final TableField<PgTypeRecord, String> TYPTYPE = createField(DSL.name("typtype"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typcategory</code>.
     */
    public final TableField<PgTypeRecord, String> TYPCATEGORY = createField(DSL.name("typcategory"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typispreferred</code>.
     */
    public final TableField<PgTypeRecord, Boolean> TYPISPREFERRED = createField(DSL.name("typispreferred"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typisdefined</code>.
     */
    public final TableField<PgTypeRecord, Boolean> TYPISDEFINED = createField(DSL.name("typisdefined"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typdelim</code>.
     */
    public final TableField<PgTypeRecord, String> TYPDELIM = createField(DSL.name("typdelim"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typrelid</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPRELID = createField(DSL.name("typrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typsubscript</code>.
     */
    public final TableField<PgTypeRecord, String> TYPSUBSCRIPT = createField(DSL.name("typsubscript"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typelem</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPELEM = createField(DSL.name("typelem"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typarray</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPARRAY = createField(DSL.name("typarray"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typinput</code>.
     */
    public final TableField<PgTypeRecord, String> TYPINPUT = createField(DSL.name("typinput"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typoutput</code>.
     */
    public final TableField<PgTypeRecord, String> TYPOUTPUT = createField(DSL.name("typoutput"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typreceive</code>.
     */
    public final TableField<PgTypeRecord, String> TYPRECEIVE = createField(DSL.name("typreceive"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typsend</code>.
     */
    public final TableField<PgTypeRecord, String> TYPSEND = createField(DSL.name("typsend"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typmodin</code>.
     */
    public final TableField<PgTypeRecord, String> TYPMODIN = createField(DSL.name("typmodin"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typmodout</code>.
     */
    public final TableField<PgTypeRecord, String> TYPMODOUT = createField(DSL.name("typmodout"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typanalyze</code>.
     */
    public final TableField<PgTypeRecord, String> TYPANALYZE = createField(DSL.name("typanalyze"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typalign</code>.
     */
    public final TableField<PgTypeRecord, String> TYPALIGN = createField(DSL.name("typalign"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typstorage</code>.
     */
    public final TableField<PgTypeRecord, String> TYPSTORAGE = createField(DSL.name("typstorage"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typnotnull</code>.
     */
    public final TableField<PgTypeRecord, Boolean> TYPNOTNULL = createField(DSL.name("typnotnull"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typbasetype</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPBASETYPE = createField(DSL.name("typbasetype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typtypmod</code>.
     */
    public final TableField<PgTypeRecord, Integer> TYPTYPMOD = createField(DSL.name("typtypmod"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typndims</code>.
     */
    public final TableField<PgTypeRecord, Integer> TYPNDIMS = createField(DSL.name("typndims"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typcollation</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPCOLLATION = createField(DSL.name("typcollation"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgTypeRecord, Object> TYPDEFAULTBIN = createField(DSL.name("typdefaultbin"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typdefault</code>.
     */
    public final TableField<PgTypeRecord, String> TYPDEFAULT = createField(DSL.name("typdefault"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_type.typacl</code>.
     */
    public final TableField<PgTypeRecord, String[]> TYPACL = createField(DSL.name("typacl"), SQLDataType.VARCHAR.array(), this, "");

    private PgType(Name alias, Table<PgTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgType(Name alias, Table<PgTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_type</code> table reference
     */
    public PgType(String alias) {
        this(DSL.name(alias), PG_TYPE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_type</code> table reference
     */
    public PgType(Name alias) {
        this(alias, PG_TYPE);
    }

    /**
     * Create a <code>pg_catalog.pg_type</code> table reference
     */
    public PgType() {
        this(DSL.name("pg_type"), null);
    }

    public <O extends Record> PgType(Table<O> child, ForeignKey<O, PgTypeRecord> key) {
        super(child, key, PG_TYPE);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public UniqueKey<PgTypeRecord> getPrimaryKey() {
        return Keys.PG_TYPE_OID_INDEX;
    }

    @Override
    @NotNull
    public List<UniqueKey<PgTypeRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_TYPE_TYPNAME_NSP_INDEX);
    }

    @Override
    @NotNull
    public PgType as(String alias) {
        return new PgType(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgType as(Name alias) {
        return new PgType(alias, this);
    }

    @Override
    @NotNull
    public PgType as(Table<?> alias) {
        return new PgType(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgType rename(String name) {
        return new PgType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgType rename(Name name) {
        return new PgType(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgType rename(Table<?> name) {
        return new PgType(name.getQualifiedName(), null);
    }
}
