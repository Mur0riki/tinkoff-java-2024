/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.RoleUdtGrantsRecord;

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
public class RoleUdtGrants extends TableImpl<RoleUdtGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.role_udt_grants</code>
     */
    public static final RoleUdtGrants ROLE_UDT_GRANTS = new RoleUdtGrants();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<RoleUdtGrantsRecord> getRecordType() {
        return RoleUdtGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_udt_grants.grantor</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.grantee</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.udt_catalog</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.udt_schema</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.udt_name</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> UDT_NAME = createField(DSL.name("udt_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_udt_grants.privilege_type</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.is_grantable</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), edu.java.domain.jooq.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleUdtGrants(Name alias, Table<RoleUdtGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleUdtGrants(Name alias, Table<RoleUdtGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "role_udt_grants" as  SELECT grantor,
          grantee,
          udt_catalog,
          udt_schema,
          udt_name,
          privilege_type,
          is_grantable
         FROM information_schema.udt_privileges
        WHERE (((grantor)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)) OR ((grantee)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.role_udt_grants</code> table
     * reference
     */
    public RoleUdtGrants(String alias) {
        this(DSL.name(alias), ROLE_UDT_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_udt_grants</code> table
     * reference
     */
    public RoleUdtGrants(Name alias) {
        this(alias, ROLE_UDT_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_udt_grants</code> table reference
     */
    public RoleUdtGrants() {
        this(DSL.name("role_udt_grants"), null);
    }

    public <O extends Record> RoleUdtGrants(Table<O> child, ForeignKey<O, RoleUdtGrantsRecord> key) {
        super(child, key, ROLE_UDT_GRANTS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public RoleUdtGrants as(String alias) {
        return new RoleUdtGrants(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public RoleUdtGrants as(Name alias) {
        return new RoleUdtGrants(alias, this);
    }

    @Override
    @NotNull
    public RoleUdtGrants as(Table<?> alias) {
        return new RoleUdtGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public RoleUdtGrants rename(String name) {
        return new RoleUdtGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public RoleUdtGrants rename(Name name) {
        return new RoleUdtGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public RoleUdtGrants rename(Table<?> name) {
        return new RoleUdtGrants(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
