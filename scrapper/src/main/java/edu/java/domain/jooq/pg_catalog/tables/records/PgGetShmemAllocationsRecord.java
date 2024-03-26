/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgGetShmemAllocations;

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
public class PgGetShmemAllocationsRecord extends TableRecordImpl<PgGetShmemAllocationsRecord> implements Record4<String, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_shmem_allocations.name</code>.
     */
    public void setName(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_shmem_allocations.name</code>.
     */
    @Nullable
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_shmem_allocations.off</code>.
     */
    public void setOff(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_shmem_allocations.off</code>.
     */
    @Nullable
    public Long getOff() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_shmem_allocations.size</code>.
     */
    public void setSize(@Nullable Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_shmem_allocations.size</code>.
     */
    @Nullable
    public Long getSize() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_shmem_allocations.allocated_size</code>.
     */
    public void setAllocatedSize(@Nullable Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_shmem_allocations.allocated_size</code>.
     */
    @Nullable
    public Long getAllocatedSize() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<String, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row4<String, Long, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS.NAME;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS.OFF;
    }

    @Override
    @NotNull
    public Field<Long> field3() {
        return PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS.SIZE;
    }

    @Override
    @NotNull
    public Field<Long> field4() {
        return PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS.ALLOCATED_SIZE;
    }

    @Override
    @Nullable
    public String component1() {
        return getName();
    }

    @Override
    @Nullable
    public Long component2() {
        return getOff();
    }

    @Override
    @Nullable
    public Long component3() {
        return getSize();
    }

    @Override
    @Nullable
    public Long component4() {
        return getAllocatedSize();
    }

    @Override
    @Nullable
    public String value1() {
        return getName();
    }

    @Override
    @Nullable
    public Long value2() {
        return getOff();
    }

    @Override
    @Nullable
    public Long value3() {
        return getSize();
    }

    @Override
    @Nullable
    public Long value4() {
        return getAllocatedSize();
    }

    @Override
    @NotNull
    public PgGetShmemAllocationsRecord value1(@Nullable String value) {
        setName(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetShmemAllocationsRecord value2(@Nullable Long value) {
        setOff(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetShmemAllocationsRecord value3(@Nullable Long value) {
        setSize(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetShmemAllocationsRecord value4(@Nullable Long value) {
        setAllocatedSize(value);
        return this;
    }

    @Override
    @NotNull
    public PgGetShmemAllocationsRecord values(@Nullable String value1, @Nullable Long value2, @Nullable Long value3, @Nullable Long value4) {
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
     * Create a detached PgGetShmemAllocationsRecord
     */
    public PgGetShmemAllocationsRecord() {
        super(PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS);
    }

    /**
     * Create a detached, initialised PgGetShmemAllocationsRecord
     */
    @ConstructorProperties({ "name", "off", "size", "allocatedSize" })
    public PgGetShmemAllocationsRecord(@Nullable String name, @Nullable Long off, @Nullable Long size, @Nullable Long allocatedSize) {
        super(PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS);

        setName(name);
        setOff(off);
        setSize(size);
        setAllocatedSize(allocatedSize);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgGetShmemAllocationsRecord
     */
    public PgGetShmemAllocationsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgGetShmemAllocations value) {
        super(PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS);

        if (value != null) {
            setName(value.getName());
            setOff(value.getOff());
            setSize(value.getSize());
            setAllocatedSize(value.getAllocatedSize());
            resetChangedOnNotNull();
        }
    }
}