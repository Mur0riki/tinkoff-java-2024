/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgUserMappings;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class PgUserMappingsRecord extends TableRecordImpl<PgUserMappingsRecord> implements Record6<Long, Long, String, Long, String, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.umid</code>.
     */
    public void setUmid(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.umid</code>.
     */
    @Nullable
    public Long getUmid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.srvid</code>.
     */
    public void setSrvid(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.srvid</code>.
     */
    @Nullable
    public Long getSrvid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.srvname</code>.
     */
    public void setSrvname(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.srvname</code>.
     */
    @Nullable
    public String getSrvname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.umuser</code>.
     */
    public void setUmuser(@Nullable Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.umuser</code>.
     */
    @Nullable
    public Long getUmuser() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.usename</code>.
     */
    public void setUsename(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.usename</code>.
     */
    @Nullable
    public String getUsename() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.umoptions</code>.
     */
    public void setUmoptions(@Nullable String[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.umoptions</code>.
     */
    @Nullable
    public String[] getUmoptions() {
        return (String[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<Long, Long, String, Long, String, String[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<Long, Long, String, Long, String, String[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgUserMappings.PG_USER_MAPPINGS.UMID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgUserMappings.PG_USER_MAPPINGS.SRVID;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgUserMappings.PG_USER_MAPPINGS.SRVNAME;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgUserMappings.PG_USER_MAPPINGS.UMUSER;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return PgUserMappings.PG_USER_MAPPINGS.USENAME;
    }

    @Override
    @NotNull
    public Field<String[]> field6() {
        return PgUserMappings.PG_USER_MAPPINGS.UMOPTIONS;
    }

    @Override
    @Nullable
    public Long component1() {
        return getUmid();
    }

    @Override
    @Nullable
    public Long component2() {
        return getSrvid();
    }

    @Override
    @Nullable
    public String component3() {
        return getSrvname();
    }

    @Override
    @Nullable
    public Long component4() {
        return getUmuser();
    }

    @Override
    @Nullable
    public String component5() {
        return getUsename();
    }

    @Override
    @Nullable
    public String[] component6() {
        return getUmoptions();
    }

    @Override
    @Nullable
    public Long value1() {
        return getUmid();
    }

    @Override
    @Nullable
    public Long value2() {
        return getSrvid();
    }

    @Override
    @Nullable
    public String value3() {
        return getSrvname();
    }

    @Override
    @Nullable
    public Long value4() {
        return getUmuser();
    }

    @Override
    @Nullable
    public String value5() {
        return getUsename();
    }

    @Override
    @Nullable
    public String[] value6() {
        return getUmoptions();
    }

    @Override
    @NotNull
    public PgUserMappingsRecord value1(@Nullable Long value) {
        setUmid(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingsRecord value2(@Nullable Long value) {
        setSrvid(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingsRecord value3(@Nullable String value) {
        setSrvname(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingsRecord value4(@Nullable Long value) {
        setUmuser(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingsRecord value5(@Nullable String value) {
        setUsename(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingsRecord value6(@Nullable String[] value) {
        setUmoptions(value);
        return this;
    }

    @Override
    @NotNull
    public PgUserMappingsRecord values(@Nullable Long value1, @Nullable Long value2, @Nullable String value3, @Nullable Long value4, @Nullable String value5, @Nullable String[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgUserMappingsRecord
     */
    public PgUserMappingsRecord() {
        super(PgUserMappings.PG_USER_MAPPINGS);
    }

    /**
     * Create a detached, initialised PgUserMappingsRecord
     */
    @ConstructorProperties({ "umid", "srvid", "srvname", "umuser", "usename", "umoptions" })
    public PgUserMappingsRecord(@Nullable Long umid, @Nullable Long srvid, @Nullable String srvname, @Nullable Long umuser, @Nullable String usename, @Nullable String[] umoptions) {
        super(PgUserMappings.PG_USER_MAPPINGS);

        setUmid(umid);
        setSrvid(srvid);
        setSrvname(srvname);
        setUmuser(umuser);
        setUsename(usename);
        setUmoptions(umoptions);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgUserMappingsRecord
     */
    public PgUserMappingsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgUserMappings value) {
        super(PgUserMappings.PG_USER_MAPPINGS);

        if (value != null) {
            setUmid(value.getUmid());
            setSrvid(value.getSrvid());
            setSrvname(value.getSrvname());
            setUmuser(value.getUmuser());
            setUsename(value.getUsename());
            setUmoptions(value.getUmoptions());
            resetChangedOnNotNull();
        }
    }
}