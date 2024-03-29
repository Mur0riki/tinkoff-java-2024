/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.RoutinePrivileges;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class RoutinePrivilegesRecord extends TableRecordImpl<RoutinePrivilegesRecord> implements Record10<String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.routine_privileges.grantor</code>.
     */
    public void setGrantor(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.routine_privileges.grantor</code>.
     */
    @Nullable
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.routine_privileges.grantee</code>.
     */
    public void setGrantee(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.routine_privileges.grantee</code>.
     */
    @Nullable
    public String getGrantee() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.routine_privileges.specific_catalog</code>.
     */
    public void setSpecificCatalog(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_privileges.specific_catalog</code>.
     */
    @Nullable
    public String getSpecificCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.routine_privileges.specific_schema</code>.
     */
    public void setSpecificSchema(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_privileges.specific_schema</code>.
     */
    @Nullable
    public String getSpecificSchema() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.routine_privileges.specific_name</code>.
     */
    public void setSpecificName(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_privileges.specific_name</code>.
     */
    @Nullable
    public String getSpecificName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.routine_privileges.routine_catalog</code>.
     */
    public void setRoutineCatalog(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_privileges.routine_catalog</code>.
     */
    @Nullable
    public String getRoutineCatalog() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.routine_privileges.routine_schema</code>.
     */
    public void setRoutineSchema(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_privileges.routine_schema</code>.
     */
    @Nullable
    public String getRoutineSchema() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.routine_privileges.routine_name</code>.
     */
    public void setRoutineName(@Nullable String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_privileges.routine_name</code>.
     */
    @Nullable
    public String getRoutineName() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.routine_privileges.privilege_type</code>.
     */
    public void setPrivilegeType(@Nullable String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_privileges.privilege_type</code>.
     */
    @Nullable
    public String getPrivilegeType() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.routine_privileges.is_grantable</code>.
     */
    public void setIsGrantable(@Nullable String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_privileges.is_grantable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsGrantable() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row10<String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.GRANTOR;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.GRANTEE;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.SPECIFIC_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.SPECIFIC_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.SPECIFIC_NAME;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.ROUTINE_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.ROUTINE_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field8() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.ROUTINE_NAME;
    }

    @Override
    @NotNull
    public Field<String> field9() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.PRIVILEGE_TYPE;
    }

    @Override
    @NotNull
    public Field<String> field10() {
        return RoutinePrivileges.ROUTINE_PRIVILEGES.IS_GRANTABLE;
    }

    @Override
    @Nullable
    public String component1() {
        return getGrantor();
    }

    @Override
    @Nullable
    public String component2() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String component3() {
        return getSpecificCatalog();
    }

    @Override
    @Nullable
    public String component4() {
        return getSpecificSchema();
    }

    @Override
    @Nullable
    public String component5() {
        return getSpecificName();
    }

    @Override
    @Nullable
    public String component6() {
        return getRoutineCatalog();
    }

    @Override
    @Nullable
    public String component7() {
        return getRoutineSchema();
    }

    @Override
    @Nullable
    public String component8() {
        return getRoutineName();
    }

    @Override
    @Nullable
    public String component9() {
        return getPrivilegeType();
    }

    @Override
    @Nullable
    public String component10() {
        return getIsGrantable();
    }

    @Override
    @Nullable
    public String value1() {
        return getGrantor();
    }

    @Override
    @Nullable
    public String value2() {
        return getGrantee();
    }

    @Override
    @Nullable
    public String value3() {
        return getSpecificCatalog();
    }

    @Override
    @Nullable
    public String value4() {
        return getSpecificSchema();
    }

    @Override
    @Nullable
    public String value5() {
        return getSpecificName();
    }

    @Override
    @Nullable
    public String value6() {
        return getRoutineCatalog();
    }

    @Override
    @Nullable
    public String value7() {
        return getRoutineSchema();
    }

    @Override
    @Nullable
    public String value8() {
        return getRoutineName();
    }

    @Override
    @Nullable
    public String value9() {
        return getPrivilegeType();
    }

    @Override
    @Nullable
    public String value10() {
        return getIsGrantable();
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value1(@Nullable String value) {
        setGrantor(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value2(@Nullable String value) {
        setGrantee(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value3(@Nullable String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value4(@Nullable String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value5(@Nullable String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value6(@Nullable String value) {
        setRoutineCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value7(@Nullable String value) {
        setRoutineSchema(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value8(@Nullable String value) {
        setRoutineName(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value9(@Nullable String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord value10(@Nullable String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    @NotNull
    public RoutinePrivilegesRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7, @Nullable String value8, @Nullable String value9, @Nullable String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutinePrivilegesRecord
     */
    public RoutinePrivilegesRecord() {
        super(RoutinePrivileges.ROUTINE_PRIVILEGES);
    }

    /**
     * Create a detached, initialised RoutinePrivilegesRecord
     */
    @ConstructorProperties({ "grantor", "grantee", "specificCatalog", "specificSchema", "specificName", "routineCatalog", "routineSchema", "routineName", "privilegeType", "isGrantable" })
    public RoutinePrivilegesRecord(@Nullable String grantor, @Nullable String grantee, @Nullable String specificCatalog, @Nullable String specificSchema, @Nullable String specificName, @Nullable String routineCatalog, @Nullable String routineSchema, @Nullable String routineName, @Nullable String privilegeType, @Nullable String isGrantable) {
        super(RoutinePrivileges.ROUTINE_PRIVILEGES);

        setGrantor(grantor);
        setGrantee(grantee);
        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setRoutineCatalog(routineCatalog);
        setRoutineSchema(routineSchema);
        setRoutineName(routineName);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RoutinePrivilegesRecord
     */
    public RoutinePrivilegesRecord(edu.java.domain.jooq.information_schema.tables.pojos.RoutinePrivileges value) {
        super(RoutinePrivileges.ROUTINE_PRIVILEGES);

        if (value != null) {
            setGrantor(value.getGrantor());
            setGrantee(value.getGrantee());
            setSpecificCatalog(value.getSpecificCatalog());
            setSpecificSchema(value.getSpecificSchema());
            setSpecificName(value.getSpecificName());
            setRoutineCatalog(value.getRoutineCatalog());
            setRoutineSchema(value.getRoutineSchema());
            setRoutineName(value.getRoutineName());
            setPrivilegeType(value.getPrivilegeType());
            setIsGrantable(value.getIsGrantable());
            resetChangedOnNotNull();
        }
    }
}
