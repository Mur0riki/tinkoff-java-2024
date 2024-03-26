/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatGssapi;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class PgStatGssapiRecord extends TableRecordImpl<PgStatGssapiRecord> implements Record5<Integer, Boolean, String, Boolean, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_gssapi.pid</code>.
     */
    public void setPid(@Nullable Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_gssapi.pid</code>.
     */
    @Nullable
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_gssapi.gss_authenticated</code>.
     */
    public void setGssAuthenticated(@Nullable Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_gssapi.gss_authenticated</code>.
     */
    @Nullable
    public Boolean getGssAuthenticated() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_gssapi.principal</code>.
     */
    public void setPrincipal(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_gssapi.principal</code>.
     */
    @Nullable
    public String getPrincipal() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_gssapi.encrypted</code>.
     */
    public void setEncrypted(@Nullable Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_gssapi.encrypted</code>.
     */
    @Nullable
    public Boolean getEncrypted() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_gssapi.credentials_delegated</code>.
     */
    public void setCredentialsDelegated(@Nullable Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_gssapi.credentials_delegated</code>.
     */
    @Nullable
    public Boolean getCredentialsDelegated() {
        return (Boolean) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Integer, Boolean, String, Boolean, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<Integer, Boolean, String, Boolean, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Integer> field1() {
        return PgStatGssapi.PG_STAT_GSSAPI.PID;
    }

    @Override
    @NotNull
    public Field<Boolean> field2() {
        return PgStatGssapi.PG_STAT_GSSAPI.GSS_AUTHENTICATED;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return PgStatGssapi.PG_STAT_GSSAPI.PRINCIPAL;
    }

    @Override
    @NotNull
    public Field<Boolean> field4() {
        return PgStatGssapi.PG_STAT_GSSAPI.ENCRYPTED;
    }

    @Override
    @NotNull
    public Field<Boolean> field5() {
        return PgStatGssapi.PG_STAT_GSSAPI.CREDENTIALS_DELEGATED;
    }

    @Override
    @Nullable
    public Integer component1() {
        return getPid();
    }

    @Override
    @Nullable
    public Boolean component2() {
        return getGssAuthenticated();
    }

    @Override
    @Nullable
    public String component3() {
        return getPrincipal();
    }

    @Override
    @Nullable
    public Boolean component4() {
        return getEncrypted();
    }

    @Override
    @Nullable
    public Boolean component5() {
        return getCredentialsDelegated();
    }

    @Override
    @Nullable
    public Integer value1() {
        return getPid();
    }

    @Override
    @Nullable
    public Boolean value2() {
        return getGssAuthenticated();
    }

    @Override
    @Nullable
    public String value3() {
        return getPrincipal();
    }

    @Override
    @Nullable
    public Boolean value4() {
        return getEncrypted();
    }

    @Override
    @Nullable
    public Boolean value5() {
        return getCredentialsDelegated();
    }

    @Override
    @NotNull
    public PgStatGssapiRecord value1(@Nullable Integer value) {
        setPid(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGssapiRecord value2(@Nullable Boolean value) {
        setGssAuthenticated(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGssapiRecord value3(@Nullable String value) {
        setPrincipal(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGssapiRecord value4(@Nullable Boolean value) {
        setEncrypted(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGssapiRecord value5(@Nullable Boolean value) {
        setCredentialsDelegated(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatGssapiRecord values(@Nullable Integer value1, @Nullable Boolean value2, @Nullable String value3, @Nullable Boolean value4, @Nullable Boolean value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatGssapiRecord
     */
    public PgStatGssapiRecord() {
        super(PgStatGssapi.PG_STAT_GSSAPI);
    }

    /**
     * Create a detached, initialised PgStatGssapiRecord
     */
    @ConstructorProperties({ "pid", "gssAuthenticated", "principal", "encrypted", "credentialsDelegated" })
    public PgStatGssapiRecord(@Nullable Integer pid, @Nullable Boolean gssAuthenticated, @Nullable String principal, @Nullable Boolean encrypted, @Nullable Boolean credentialsDelegated) {
        super(PgStatGssapi.PG_STAT_GSSAPI);

        setPid(pid);
        setGssAuthenticated(gssAuthenticated);
        setPrincipal(principal);
        setEncrypted(encrypted);
        setCredentialsDelegated(credentialsDelegated);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatGssapiRecord
     */
    public PgStatGssapiRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatGssapi value) {
        super(PgStatGssapi.PG_STAT_GSSAPI);

        if (value != null) {
            setPid(value.getPid());
            setGssAuthenticated(value.getGssAuthenticated());
            setPrincipal(value.getPrincipal());
            setEncrypted(value.getEncrypted());
            setCredentialsDelegated(value.getCredentialsDelegated());
            resetChangedOnNotNull();
        }
    }
}