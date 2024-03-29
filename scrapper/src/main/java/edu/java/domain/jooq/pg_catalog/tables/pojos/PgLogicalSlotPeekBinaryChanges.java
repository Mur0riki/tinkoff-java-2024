/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


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
public class PgLogicalSlotPeekBinaryChanges implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object lsn;
    private Long xid;
    private byte[] data;

    public PgLogicalSlotPeekBinaryChanges() {}

    public PgLogicalSlotPeekBinaryChanges(PgLogicalSlotPeekBinaryChanges value) {
        this.lsn = value.lsn;
        this.xid = value.xid;
        this.data = value.data;
    }

    @ConstructorProperties({ "lsn", "xid", "data" })
    public PgLogicalSlotPeekBinaryChanges(
        @Nullable Object lsn,
        @Nullable Long xid,
        @Nullable byte[] data
    ) {
        this.lsn = lsn;
        this.xid = xid;
        this.data = data;
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
    public Object getLsn() {
        return this.lsn;
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
    public void setLsn(@Nullable Object lsn) {
        this.lsn = lsn;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.xid</code>.
     */
    @Nullable
    public Long getXid() {
        return this.xid;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.xid</code>.
     */
    public void setXid(@Nullable Long xid) {
        this.xid = xid;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.data</code>.
     */
    @Nullable
    public byte[] getData() {
        return this.data;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.data</code>.
     */
    public void setData(@Nullable byte[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgLogicalSlotPeekBinaryChanges other = (PgLogicalSlotPeekBinaryChanges) obj;
        if (this.lsn == null) {
            if (other.lsn != null)
                return false;
        }
        else if (!this.lsn.equals(other.lsn))
            return false;
        if (this.xid == null) {
            if (other.xid != null)
                return false;
        }
        else if (!this.xid.equals(other.xid))
            return false;
        if (this.data == null) {
            if (other.data != null)
                return false;
        }
        else if (!Arrays.equals(this.data, other.data))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.lsn == null) ? 0 : this.lsn.hashCode());
        result = prime * result + ((this.xid == null) ? 0 : this.xid.hashCode());
        result = prime * result + ((this.data == null) ? 0 : Arrays.hashCode(this.data));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgLogicalSlotPeekBinaryChanges (");

        sb.append(lsn);
        sb.append(", ").append(xid);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
