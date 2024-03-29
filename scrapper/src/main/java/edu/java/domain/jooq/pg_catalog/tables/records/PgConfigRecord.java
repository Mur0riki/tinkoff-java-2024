/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgConfig;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class PgConfigRecord extends TableRecordImpl<PgConfigRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_config.name</code>.
     */
    public void setName(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_config.name</code>.
     */
    @Nullable
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_config.setting</code>.
     */
    public void setSetting(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_config.setting</code>.
     */
    @Nullable
    public String getSetting() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgConfig.PG_CONFIG.NAME;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return PgConfig.PG_CONFIG.SETTING;
    }

    @Override
    @Nullable
    public String component1() {
        return getName();
    }

    @Override
    @Nullable
    public String component2() {
        return getSetting();
    }

    @Override
    @Nullable
    public String value1() {
        return getName();
    }

    @Override
    @Nullable
    public String value2() {
        return getSetting();
    }

    @Override
    @NotNull
    public PgConfigRecord value1(@Nullable String value) {
        setName(value);
        return this;
    }

    @Override
    @NotNull
    public PgConfigRecord value2(@Nullable String value) {
        setSetting(value);
        return this;
    }

    @Override
    @NotNull
    public PgConfigRecord values(@Nullable String value1, @Nullable String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgConfigRecord
     */
    public PgConfigRecord() {
        super(PgConfig.PG_CONFIG);
    }

    /**
     * Create a detached, initialised PgConfigRecord
     */
    @ConstructorProperties({ "name", "setting" })
    public PgConfigRecord(@Nullable String name, @Nullable String setting) {
        super(PgConfig.PG_CONFIG);

        setName(name);
        setSetting(setting);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgConfigRecord
     */
    public PgConfigRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgConfig value) {
        super(PgConfig.PG_CONFIG);

        if (value != null) {
            setName(value.getName());
            setSetting(value.getSetting());
            resetChangedOnNotNull();
        }
    }
}
