/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;



/**
 * @deprecated Unknown data type. If this is a qualified, user-defined type, it
 * may have been excluded from code generation. If this is a built-in type, you
 * can define an explicit {@link org.jooq.Binding} to specify how this type
 * should be handled. Deprecation can be turned off using {@literal
 * <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@Deprecated
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Ginqueryarrayextract extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, false);

    /**
     * The parameter <code>pg_catalog.ginqueryarrayextract._1</code>.
     */
    public static final Parameter<Object[]> _1 = Internal.createParameter("_1", SQLDataType.OTHER.array(), false, true);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> _2 = Internal.createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    /**
     * The parameter <code>pg_catalog.ginqueryarrayextract._3</code>.
     */
    public static final Parameter<Short> _3 = Internal.createParameter("_3", SQLDataType.SMALLINT, false, true);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> _4 = Internal.createParameter("_4", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> _5 = Internal.createParameter("_5", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> _6 = Internal.createParameter("_6", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> _7 = Internal.createParameter("_7", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    /**
     * Create a new routine call instance
     */
    public Ginqueryarrayextract() {
        super("ginqueryarrayextract", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
        addInParameter(_6);
        addInParameter(_7);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object[] value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Object value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<Object> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Short value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__3(Field<Short> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Object value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__4(Field<Object> field) {
        setField(_4, field);
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    public void set__5(Object value) {
        setValue(_5, value);
    }

    /**
     * Set the <code>_5</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__5(Field<Object> field) {
        setField(_5, field);
    }

    /**
     * Set the <code>_6</code> parameter IN value to the routine
     */
    public void set__6(Object value) {
        setValue(_6, value);
    }

    /**
     * Set the <code>_6</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__6(Field<Object> field) {
        setField(_6, field);
    }

    /**
     * Set the <code>_7</code> parameter IN value to the routine
     */
    public void set__7(Object value) {
        setValue(_7, value);
    }

    /**
     * Set the <code>_7</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__7(Field<Object> field) {
        setField(_7, field);
    }
}
