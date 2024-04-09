/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgPartitionTreeRecord;

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
public class PgPartitionTree extends TableImpl<PgPartitionTreeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_partition_tree</code>
     */
    public static final PgPartitionTree PG_PARTITION_TREE = new PgPartitionTree();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgPartitionTreeRecord> getRecordType() {
        return PgPartitionTreeRecord.class;
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
    public final TableField<PgPartitionTreeRecord, Object> RELID = createField(DSL.name("relid"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgPartitionTreeRecord, Object> PARENTRELID = createField(DSL.name("parentrelid"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), this, "");

    /**
     * The column <code>pg_catalog.pg_partition_tree.isleaf</code>.
     */
    public final TableField<PgPartitionTreeRecord, Boolean> ISLEAF = createField(DSL.name("isleaf"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_partition_tree.level</code>.
     */
    public final TableField<PgPartitionTreeRecord, Integer> LEVEL = createField(DSL.name("level"), SQLDataType.INTEGER, this, "");

    private PgPartitionTree(Name alias, Table<PgPartitionTreeRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
        });
    }

    private PgPartitionTree(Name alias, Table<PgPartitionTreeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_partition_tree</code> table
     * reference
     */
    public PgPartitionTree(String alias) {
        this(DSL.name(alias), PG_PARTITION_TREE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_partition_tree</code> table
     * reference
     */
    public PgPartitionTree(Name alias) {
        this(alias, PG_PARTITION_TREE);
    }

    /**
     * Create a <code>pg_catalog.pg_partition_tree</code> table reference
     */
    public PgPartitionTree() {
        this(DSL.name("pg_partition_tree"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgPartitionTree as(String alias) {
        return new PgPartitionTree(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public PgPartitionTree as(Name alias) {
        return new PgPartitionTree(alias, this, parameters);
    }

    @Override
    @NotNull
    public PgPartitionTree as(Table<?> alias) {
        return new PgPartitionTree(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgPartitionTree rename(String name) {
        return new PgPartitionTree(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgPartitionTree rename(Name name) {
        return new PgPartitionTree(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgPartitionTree rename(Table<?> name) {
        return new PgPartitionTree(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Object, Object, Boolean, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgPartitionTree call(
          Object rootrelid
    ) {
        PgPartitionTree result = new PgPartitionTree(DSL.name("pg_partition_tree"), null, new Field[] {
            DSL.val(rootrelid, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgPartitionTree call(
          Field<Object> rootrelid
    ) {
        PgPartitionTree result = new PgPartitionTree(DSL.name("pg_partition_tree"), null, new Field[] {
            rootrelid
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Object, ? super Object, ? super Boolean, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Object, ? super Object, ? super Boolean, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}