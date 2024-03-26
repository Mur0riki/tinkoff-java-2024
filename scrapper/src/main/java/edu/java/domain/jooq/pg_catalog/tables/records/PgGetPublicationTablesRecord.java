/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetPublicationTables;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PgGetPublicationTablesRecord extends TableRecordImpl<PgGetPublicationTablesRecord> implements Record4<Long, Long, Object[], Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_publication_tables.pubid</code>.
     */
    public void setPubid(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_publication_tables.pubid</code>.
     */
    @Nullable
    public Long getPubid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public void setRelid(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_publication_tables.attrs</code>.
     */
    public void setAttrs(@Nullable Object[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_publication_tables.attrs</code>.
     */
    @Nullable
    public Object[] getAttrs() {
        return (Object[]) get(2);
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
    public void setQual(@Nullable Object value) {
        set(3, value);
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
    @Nullable
    public Object getQual() {
        return get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, Long, Object[], Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row4<Long, Long, Object[], Object> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgGetPublicationTables.PG_GET_PUBLICATION_TABLES.PUBID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgGetPublicationTables.PG_GET_PUBLICATION_TABLES.RELID;
    }

    @Override
    @NotNull
    public Field<Object[]> field3() {
        return PgGetPublicationTables.PG_GET_PUBLICATION_TABLES.ATTRS;
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
    @Override
    @NotNull
    public Field<Object> field4() {
        return PgGetPublicationTables.PG_GET_PUBLICATION_TABLES.QUAL;
    }

    @Override
    @Nullable
    public Long component1() {
        return getPubid();
    }

    @Override
    @Nullable
    public Long component2() {
        return getRelid();
    }

    @Override
    @Nullable
    public Object[] component3() {
        return getAttrs();
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
    @Override
    @Nullable
    public Object component4() {
        return getQual();
    }

    @Override
    @Nullable
    public Long value1() {
        return getPubid();
    }

    @Override
    @Nullable
    public Long value2() {
        return getRelid();
    }

    @Override
    @Nullable
    public Object[] value3() {
        return getAttrs();
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
    @Override
    @Nullable
    public Object value4() {
        return getQual();
    }

    @Override
    @NotNull
    public PgGetPublicationTablesRecord value1(@Nullable Long value) {
        setPubid(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetPublicationTablesRecord value2(@Nullable Long value) {
        setRelid(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetPublicationTablesRecord value3(@Nullable Object[] value) {
        setAttrs(value);
        return this;
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
    @Override
    @NotNull
    public PgGetPublicationTablesRecord value4(@Nullable Object value) {
        setQual(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetPublicationTablesRecord values(@Nullable Long value1, @Nullable Long value2, @Nullable Object[] value3, @Nullable Object value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetPublicationTablesRecord
     */
    public PgGetPublicationTablesRecord() {
        super(PgGetPublicationTables.PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create a detached, initialised PgGetPublicationTablesRecord
     */
    @ConstructorProperties({ "pubid", "relid", "attrs", "qual" })
    public PgGetPublicationTablesRecord(@Nullable Long pubid, @Nullable Long relid, @Nullable Object[] attrs, @Nullable Object qual) {
        super(PgGetPublicationTables.PG_GET_PUBLICATION_TABLES);

        setPubid(pubid);
        setRelid(relid);
        setAttrs(attrs);
        setQual(qual);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgGetPublicationTablesRecord
     */
    public PgGetPublicationTablesRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGetPublicationTables value) {
        super(PgGetPublicationTables.PG_GET_PUBLICATION_TABLES);

        if (value != null) {
            setPubid(value.getPubid());
            setRelid(value.getRelid());
            setAttrs(value.getAttrs());
            setQual(value.getQual());
            resetChangedOnNotNull();
        }
    }
}