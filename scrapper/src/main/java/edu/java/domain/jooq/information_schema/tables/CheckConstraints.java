/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.CheckConstraintsRecord;

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
public class CheckConstraints extends TableImpl<CheckConstraintsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.check_constraints</code>
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = new CheckConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<CheckConstraintsRecord> getRecordType() {
        return CheckConstraintsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.check_constraints.constraint_catalog</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.check_constraints.constraint_schema</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.check_constraints.constraint_name</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.check_constraints.check_clause</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CHECK_CLAUSE = createField(DSL.name("check_clause"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private CheckConstraints(Name alias, Table<CheckConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CheckConstraints(Name alias, Table<CheckConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
         create view "check_constraints" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,
            (rs.nspname)::information_schema.sql_identifier AS constraint_schema,
            (con.conname)::information_schema.sql_identifier AS constraint_name,
            (SUBSTRING(pg_get_constraintdef(con.oid) FROM 7))::information_schema.character_data AS check_clause
           FROM (((pg_constraint con
             LEFT JOIN pg_namespace rs ON ((rs.oid = con.connamespace)))
             LEFT JOIN pg_class c ON ((c.oid = con.conrelid)))
             LEFT JOIN pg_type t ON ((t.oid = con.contypid)))
          WHERE (pg_has_role(COALESCE(c.relowner, t.typowner), 'USAGE'::text) AND (con.contype = 'c'::"char"))
        UNION
         SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,
            (n.nspname)::information_schema.sql_identifier AS constraint_schema,
            (((((((n.oid)::text || '_'::text) || (r.oid)::text) || '_'::text) || (a.attnum)::text) || '_not_null'::text))::information_schema.sql_identifier AS constraint_name,
            (((a.attname)::text || ' IS NOT NULL'::text))::information_schema.character_data AS check_clause
           FROM pg_namespace n,
            pg_class r,
            pg_attribute a
          WHERE ((n.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (a.attnum > 0) AND (NOT a.attisdropped) AND a.attnotnull AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) AND pg_has_role(r.relowner, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.check_constraints</code> table
     * reference
     */
    public CheckConstraints(String alias) {
        this(DSL.name(alias), CHECK_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.check_constraints</code> table
     * reference
     */
    public CheckConstraints(Name alias) {
        this(alias, CHECK_CONSTRAINTS);
    }

    /**
     * Create a <code>information_schema.check_constraints</code> table
     * reference
     */
    public CheckConstraints() {
        this(DSL.name("check_constraints"), null);
    }

    public <O extends Record> CheckConstraints(Table<O> child, ForeignKey<O, CheckConstraintsRecord> key) {
        super(child, key, CHECK_CONSTRAINTS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public CheckConstraints as(String alias) {
        return new CheckConstraints(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public CheckConstraints as(Name alias) {
        return new CheckConstraints(alias, this);
    }

    @Override
    @NotNull
    public CheckConstraints as(Table<?> alias) {
        return new CheckConstraints(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public CheckConstraints rename(String name) {
        return new CheckConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public CheckConstraints rename(Name name) {
        return new CheckConstraints(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public CheckConstraints rename(Table<?> name) {
        return new CheckConstraints(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
