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
public class Int48ne extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.int48ne.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.int48ne._1</code>.
     */
    public static final Parameter<Integer> _1 = Internal.createParameter("_1", SQLDataType.INTEGER, false, true);

    /**
     * The parameter <code>pg_catalog.int48ne._2</code>.
     */
    public static final Parameter<Long> _2 = Internal.createParameter("_2", SQLDataType.BIGINT, false, true);

    /**
     * Create a new routine call instance
     */
    public Int48ne() {
        super("int48ne", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Integer value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Integer> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Long value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<Long> field) {
        setField(_2, field);
    }
}