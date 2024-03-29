/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.PgReplicationOriginStatusRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
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
public class PgReplicationOriginStatus extends TableImpl<PgReplicationOriginStatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_replication_origin_status</code>
     */
    public static final PgReplicationOriginStatus PG_REPLICATION_ORIGIN_STATUS = new PgReplicationOriginStatus();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<PgReplicationOriginStatusRecord> getRecordType() {
        return PgReplicationOriginStatusRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_replication_origin_status.local_id</code>.
     */
    public final TableField<PgReplicationOriginStatusRecord, Long> LOCAL_ID = createField(DSL.name("local_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_replication_origin_status.external_id</code>.
     */
    public final TableField<PgReplicationOriginStatusRecord, String> EXTERNAL_ID = createField(DSL.name("external_id"), SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgReplicationOriginStatusRecord, Object> REMOTE_LSN = createField(DSL.name("remote_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgReplicationOriginStatusRecord, Object> LOCAL_LSN = createField(DSL.name("local_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    private PgReplicationOriginStatus(Name alias, Table<PgReplicationOriginStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgReplicationOriginStatus(Name alias, Table<PgReplicationOriginStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_replication_origin_status" as  SELECT local_id,
         external_id,
         remote_lsn,
         local_lsn
        FROM pg_show_replication_origin_status() pg_show_replication_origin_status(local_id, external_id, remote_lsn, local_lsn);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin_status</code>
     * table reference
     */
    public PgReplicationOriginStatus(String alias) {
        this(DSL.name(alias), PG_REPLICATION_ORIGIN_STATUS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin_status</code>
     * table reference
     */
    public PgReplicationOriginStatus(Name alias) {
        this(alias, PG_REPLICATION_ORIGIN_STATUS);
    }

    /**
     * Create a <code>pg_catalog.pg_replication_origin_status</code> table
     * reference
     */
    public PgReplicationOriginStatus() {
        this(DSL.name("pg_replication_origin_status"), null);
    }

    public <O extends Record> PgReplicationOriginStatus(Table<O> child, ForeignKey<O, PgReplicationOriginStatusRecord> key) {
        super(child, key, PG_REPLICATION_ORIGIN_STATUS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public PgReplicationOriginStatus as(String alias) {
        return new PgReplicationOriginStatus(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public PgReplicationOriginStatus as(Name alias) {
        return new PgReplicationOriginStatus(alias, this);
    }

    @Override
    @NotNull
    public PgReplicationOriginStatus as(Table<?> alias) {
        return new PgReplicationOriginStatus(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgReplicationOriginStatus rename(String name) {
        return new PgReplicationOriginStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgReplicationOriginStatus rename(Name name) {
        return new PgReplicationOriginStatus(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public PgReplicationOriginStatus rename(Table<?> name) {
        return new PgReplicationOriginStatus(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, String, Object, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super String, ? super Object, ? super Object, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super String, ? super Object, ? super Object, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
