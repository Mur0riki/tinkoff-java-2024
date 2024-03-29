/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.DomainUdtUsageRecord;

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
public class DomainUdtUsage extends TableImpl<DomainUdtUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.domain_udt_usage</code>
     */
    public static final DomainUdtUsage DOMAIN_UDT_USAGE = new DomainUdtUsage();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<DomainUdtUsageRecord> getRecordType() {
        return DomainUdtUsageRecord.class;
    }

    /**
     * The column <code>information_schema.domain_udt_usage.udt_catalog</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domain_udt_usage.udt_schema</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domain_udt_usage.udt_name</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> UDT_NAME = createField(DSL.name("udt_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domain_udt_usage.domain_catalog</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.domain_udt_usage.domain_schema</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.domain_udt_usage.domain_name</code>.
     */
    public final TableField<DomainUdtUsageRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private DomainUdtUsage(Name alias, Table<DomainUdtUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private DomainUdtUsage(Name alias, Table<DomainUdtUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "domain_udt_usage" as  SELECT (current_database())::information_schema.sql_identifier AS udt_catalog,
          (nbt.nspname)::information_schema.sql_identifier AS udt_schema,
          (bt.typname)::information_schema.sql_identifier AS udt_name,
          (current_database())::information_schema.sql_identifier AS domain_catalog,
          (nt.nspname)::information_schema.sql_identifier AS domain_schema,
          (t.typname)::information_schema.sql_identifier AS domain_name
         FROM pg_type t,
          pg_namespace nt,
          pg_type bt,
          pg_namespace nbt
        WHERE ((t.typnamespace = nt.oid) AND (t.typbasetype = bt.oid) AND (bt.typnamespace = nbt.oid) AND (t.typtype = 'd'::"char") AND pg_has_role(bt.typowner, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.domain_udt_usage</code> table
     * reference
     */
    public DomainUdtUsage(String alias) {
        this(DSL.name(alias), DOMAIN_UDT_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.domain_udt_usage</code> table
     * reference
     */
    public DomainUdtUsage(Name alias) {
        this(alias, DOMAIN_UDT_USAGE);
    }

    /**
     * Create a <code>information_schema.domain_udt_usage</code> table reference
     */
    public DomainUdtUsage() {
        this(DSL.name("domain_udt_usage"), null);
    }

    public <O extends Record> DomainUdtUsage(Table<O> child, ForeignKey<O, DomainUdtUsageRecord> key) {
        super(child, key, DOMAIN_UDT_USAGE);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public DomainUdtUsage as(String alias) {
        return new DomainUdtUsage(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public DomainUdtUsage as(Name alias) {
        return new DomainUdtUsage(alias, this);
    }

    @Override
    @NotNull
    public DomainUdtUsage as(Table<?> alias) {
        return new DomainUdtUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public DomainUdtUsage rename(String name) {
        return new DomainUdtUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public DomainUdtUsage rename(Name name) {
        return new DomainUdtUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public DomainUdtUsage rename(Table<?> name) {
        return new DomainUdtUsage(name.getQualifiedName(), null);
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
