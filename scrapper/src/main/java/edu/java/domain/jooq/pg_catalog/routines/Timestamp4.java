/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.routines;


import edu.java.domain.jooq.pg_catalog.PgCatalog;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

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
public class Timestamp4 extends AbstractRoutine<LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.timestamp.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalDateTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATETIME(6), false, false);

    /**
     * The parameter <code>pg_catalog.timestamp._1</code>.
     */
    public static final Parameter<OffsetDateTime> _1 = Internal.createParameter("_1", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true);

    /**
     * Create a new routine call instance
     */
    public Timestamp4() {
        super("timestamp", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATETIME(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(OffsetDateTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<OffsetDateTime> field) {
        setField(_1, field);
    }
}