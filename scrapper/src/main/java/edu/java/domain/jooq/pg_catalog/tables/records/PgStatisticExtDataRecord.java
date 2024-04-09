/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgStatisticExtData;

import java.beans.ConstructorProperties;
import java.util.stream.Stream;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PgStatisticExtDataRecord extends UpdatableRecordImpl<PgStatisticExtDataRecord> implements Record6<Long, Boolean, Object, Object, Object, PgStatisticRecord[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext_data.stxoid</code>.
     */
    public void setStxoid(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext_data.stxoid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getStxoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext_data.stxdinherit</code>.
     */
    public void setStxdinherit(@NotNull Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext_data.stxdinherit</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getStxdinherit() {
        return (Boolean) get(1);
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
    public void setStxdndistinct(@Nullable Object value) {
        set(2, value);
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
    public Object getStxdndistinct() {
        return get(2);
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
    public void setStxddependencies(@Nullable Object value) {
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
    public Object getStxddependencies() {
        return get(3);
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
    public void setStxdmcv(@Nullable Object value) {
        set(4, value);
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
    public Object getStxdmcv() {
        return get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic_ext_data.stxdexpr</code>.
     */
    public void setStxdexpr(@Nullable PgStatisticRecord[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic_ext_data.stxdexpr</code>.
     */
    @Nullable
    public PgStatisticRecord[] getStxdexpr() {
        return (PgStatisticRecord[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record2<Long, Boolean> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<Long, Boolean, Object, Object, Object, PgStatisticRecord[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<Long, Boolean, Object, Object, Object, PgStatisticRecord[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXOID;
    }

    @Override
    @NotNull
    public Field<Boolean> field2() {
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXDINHERIT;
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
    public Field<Object> field3() {
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXDNDISTINCT;
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
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXDDEPENDENCIES;
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
    public Field<Object> field5() {
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXDMCV;
    }

    @Override
    @NotNull
    public Field<PgStatisticRecord[]> field6() {
        return PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXDEXPR;
    }

    @Override
    @NotNull
    public Long component1() {
        return getStxoid();
    }

    @Override
    @NotNull
    public Boolean component2() {
        return getStxdinherit();
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
    public Object component3() {
        return getStxdndistinct();
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
        return getStxddependencies();
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
    public Object component5() {
        return getStxdmcv();
    }

    @Override
    @Nullable
    public PgStatisticRecord[] component6() {
        return getStxdexpr();
    }

    @Override
    @NotNull
    public Long value1() {
        return getStxoid();
    }

    @Override
    @NotNull
    public Boolean value2() {
        return getStxdinherit();
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
    public Object value3() {
        return getStxdndistinct();
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
        return getStxddependencies();
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
    public Object value5() {
        return getStxdmcv();
    }

    @Override
    @Nullable
    public PgStatisticRecord[] value6() {
        return getStxdexpr();
    }

    @Override
    @NotNull
    public PgStatisticExtDataRecord value1(@NotNull Long value) {
        setStxoid(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatisticExtDataRecord value2(@NotNull Boolean value) {
        setStxdinherit(value);
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
    public PgStatisticExtDataRecord value3(@Nullable Object value) {
        setStxdndistinct(value);
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
    public PgStatisticExtDataRecord value4(@Nullable Object value) {
        setStxddependencies(value);
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
    public PgStatisticExtDataRecord value5(@Nullable Object value) {
        setStxdmcv(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatisticExtDataRecord value6(@Nullable PgStatisticRecord[] value) {
        setStxdexpr(value);
        return this;
    }

    @Override
    @NotNull
    public PgStatisticExtDataRecord values(@NotNull Long value1, @NotNull Boolean value2, @Nullable Object value3, @Nullable Object value4, @Nullable Object value5, @Nullable PgStatisticRecord[] value6) {
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
     * Create a detached PgStatisticExtDataRecord
     */
    public PgStatisticExtDataRecord() {
        super(PgStatisticExtData.PG_STATISTIC_EXT_DATA);
    }

    /**
     * Create a detached, initialised PgStatisticExtDataRecord
     */
    @ConstructorProperties({ "stxoid", "stxdinherit", "stxdndistinct", "stxddependencies", "stxdmcv", "stxdexpr" })
    public PgStatisticExtDataRecord(@NotNull Long stxoid, @NotNull Boolean stxdinherit, @Nullable Object stxdndistinct, @Nullable Object stxddependencies, @Nullable Object stxdmcv, @Nullable PgStatisticRecord[] stxdexpr) {
        super(PgStatisticExtData.PG_STATISTIC_EXT_DATA);

        setStxoid(stxoid);
        setStxdinherit(stxdinherit);
        setStxdndistinct(stxdndistinct);
        setStxddependencies(stxddependencies);
        setStxdmcv(stxdmcv);
        setStxdexpr(stxdexpr);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgStatisticExtDataRecord
     */
    public PgStatisticExtDataRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgStatisticExtData value) {
        super(PgStatisticExtData.PG_STATISTIC_EXT_DATA);

        if (value != null) {
            setStxoid(value.getStxoid());
            setStxdinherit(value.getStxdinherit());
            setStxdndistinct(value.getStxdndistinct());
            setStxddependencies(value.getStxddependencies());
            setStxdmcv(value.getStxdmcv());
            setStxdexpr(value.getStxdexpr() == null ? null : Stream.of(value.getStxdexpr()).map(PgStatisticRecord::new).toArray(PgStatisticRecord[]::new));
            resetChangedOnNotNull();
        }
    }
}