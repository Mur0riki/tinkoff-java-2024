/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables;


import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.pg_catalog.tables.records.JsonArrayElementsTextRecord;

import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row1;
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
public class JsonArrayElementsText extends TableImpl<JsonArrayElementsTextRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.json_array_elements_text</code>
     */
    public static final JsonArrayElementsText JSON_ARRAY_ELEMENTS_TEXT = new JsonArrayElementsText();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<JsonArrayElementsTextRecord> getRecordType() {
        return JsonArrayElementsTextRecord.class;
    }

    /**
     * The column <code>pg_catalog.json_array_elements_text.value</code>.
     */
    public final TableField<JsonArrayElementsTextRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB, this, "");

    private JsonArrayElementsText(Name alias, Table<JsonArrayElementsTextRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSON)
        });
    }

    private JsonArrayElementsText(Name alias, Table<JsonArrayElementsTextRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.json_array_elements_text</code> table
     * reference
     */
    public JsonArrayElementsText(String alias) {
        this(DSL.name(alias), JSON_ARRAY_ELEMENTS_TEXT);
    }

    /**
     * Create an aliased <code>pg_catalog.json_array_elements_text</code> table
     * reference
     */
    public JsonArrayElementsText(Name alias) {
        this(alias, JSON_ARRAY_ELEMENTS_TEXT);
    }

    /**
     * Create a <code>pg_catalog.json_array_elements_text</code> table reference
     */
    public JsonArrayElementsText() {
        this(DSL.name("json_array_elements_text"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    @NotNull
    public JsonArrayElementsText as(String alias) {
        return new JsonArrayElementsText(DSL.name(alias), this, parameters);
    }

    @Override
    @NotNull
    public JsonArrayElementsText as(Name alias) {
        return new JsonArrayElementsText(alias, this, parameters);
    }

    @Override
    @NotNull
    public JsonArrayElementsText as(Table<?> alias) {
        return new JsonArrayElementsText(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public JsonArrayElementsText rename(String name) {
        return new JsonArrayElementsText(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public JsonArrayElementsText rename(Name name) {
        return new JsonArrayElementsText(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public JsonArrayElementsText rename(Table<?> name) {
        return new JsonArrayElementsText(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public JsonArrayElementsText call(
          JSON fromJson
    ) {
        JsonArrayElementsText result = new JsonArrayElementsText(DSL.name("json_array_elements_text"), null, new Field[] {
            DSL.val(fromJson, SQLDataType.JSON)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonArrayElementsText call(
          Field<JSON> fromJson
    ) {
        JsonArrayElementsText result = new JsonArrayElementsText(DSL.name("json_array_elements_text"), null, new Field[] {
            fromJson
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
