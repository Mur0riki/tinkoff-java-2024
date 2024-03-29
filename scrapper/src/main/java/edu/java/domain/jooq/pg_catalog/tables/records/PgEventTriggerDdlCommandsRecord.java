/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgEventTriggerDdlCommands;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class PgEventTriggerDdlCommandsRecord extends TableRecordImpl<PgEventTriggerDdlCommandsRecord> implements Record9<Long, Long, Integer, String, String, String, String, Boolean, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_event_trigger_ddl_commands.classid</code>.
     */
    public void setClassid(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger_ddl_commands.classid</code>.
     */
    @Nullable
    public Long getClassid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger_ddl_commands.objid</code>.
     */
    public void setObjid(@Nullable Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger_ddl_commands.objid</code>.
     */
    @Nullable
    public Long getObjid() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.objsubid</code>.
     */
    public void setObjsubid(@Nullable Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.objsubid</code>.
     */
    @Nullable
    public Integer getObjsubid() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.command_tag</code>.
     */
    public void setCommandTag(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.command_tag</code>.
     */
    @Nullable
    public String getCommandTag() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_type</code>.
     */
    public void setObjectType(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_type</code>.
     */
    @Nullable
    public String getObjectType() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.schema_name</code>.
     */
    public void setSchemaName(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.schema_name</code>.
     */
    @Nullable
    public String getSchemaName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_identity</code>.
     */
    public void setObjectIdentity(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_identity</code>.
     */
    @Nullable
    public String getObjectIdentity() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.in_extension</code>.
     */
    public void setInExtension(@Nullable Boolean value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_event_trigger_ddl_commands.in_extension</code>.
     */
    @Nullable
    public Boolean getInExtension() {
        return (Boolean) get(7);
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
    public void setCommand(@Nullable Object value) {
        set(8, value);
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
    public Object getCommand() {
        return get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row9<Long, Long, Integer, String, String, String, String, Boolean, Object> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row9<Long, Long, Integer, String, String, String, String, Boolean, Object> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS.CLASSID;
    }

    @Override
    @NotNull
    public Field<Long> field2() {
        return PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS.OBJID;
    }

    @Override
    @NotNull
    public Field<Integer> field3() {
        return PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS.OBJSUBID;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS.COMMAND_TAG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS.OBJECT_TYPE;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS.SCHEMA_NAME;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS.OBJECT_IDENTITY;
    }

    @Override
    @NotNull
    public Field<Boolean> field8() {
        return PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS.IN_EXTENSION;
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
    public Field<Object> field9() {
        return PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS.COMMAND;
    }

    @Override
    @Nullable
    public Long component1() {
        return getClassid();
    }

    @Override
    @Nullable
    public Long component2() {
        return getObjid();
    }

    @Override
    @Nullable
    public Integer component3() {
        return getObjsubid();
    }

    @Override
    @Nullable
    public String component4() {
        return getCommandTag();
    }

    @Override
    @Nullable
    public String component5() {
        return getObjectType();
    }

    @Override
    @Nullable
    public String component6() {
        return getSchemaName();
    }

    @Override
    @Nullable
    public String component7() {
        return getObjectIdentity();
    }

    @Override
    @Nullable
    public Boolean component8() {
        return getInExtension();
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
    public Object component9() {
        return getCommand();
    }

    @Override
    @Nullable
    public Long value1() {
        return getClassid();
    }

    @Override
    @Nullable
    public Long value2() {
        return getObjid();
    }

    @Override
    @Nullable
    public Integer value3() {
        return getObjsubid();
    }

    @Override
    @Nullable
    public String value4() {
        return getCommandTag();
    }

    @Override
    @Nullable
    public String value5() {
        return getObjectType();
    }

    @Override
    @Nullable
    public String value6() {
        return getSchemaName();
    }

    @Override
    @Nullable
    public String value7() {
        return getObjectIdentity();
    }

    @Override
    @Nullable
    public Boolean value8() {
        return getInExtension();
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
    public Object value9() {
        return getCommand();
    }

    @Override
    @NotNull
    public PgEventTriggerDdlCommandsRecord value1(@Nullable Long value) {
        setClassid(value);
        return this;
    }

    @Override
    @NotNull
    public PgEventTriggerDdlCommandsRecord value2(@Nullable Long value) {
        setObjid(value);
        return this;
    }

    @Override
    @NotNull
    public PgEventTriggerDdlCommandsRecord value3(@Nullable Integer value) {
        setObjsubid(value);
        return this;
    }

    @Override
    @NotNull
    public PgEventTriggerDdlCommandsRecord value4(@Nullable String value) {
        setCommandTag(value);
        return this;
    }

    @Override
    @NotNull
    public PgEventTriggerDdlCommandsRecord value5(@Nullable String value) {
        setObjectType(value);
        return this;
    }

    @Override
    @NotNull
    public PgEventTriggerDdlCommandsRecord value6(@Nullable String value) {
        setSchemaName(value);
        return this;
    }

    @Override
    @NotNull
    public PgEventTriggerDdlCommandsRecord value7(@Nullable String value) {
        setObjectIdentity(value);
        return this;
    }

    @Override
    @NotNull
    public PgEventTriggerDdlCommandsRecord value8(@Nullable Boolean value) {
        setInExtension(value);
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
    public PgEventTriggerDdlCommandsRecord value9(@Nullable Object value) {
        setCommand(value);
        return this;
    }

    @Override
    @NotNull
    public PgEventTriggerDdlCommandsRecord values(@Nullable Long value1, @Nullable Long value2, @Nullable Integer value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7, @Nullable Boolean value8, @Nullable Object value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgEventTriggerDdlCommandsRecord
     */
    public PgEventTriggerDdlCommandsRecord() {
        super(PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS);
    }

    /**
     * Create a detached, initialised PgEventTriggerDdlCommandsRecord
     */
    @ConstructorProperties({ "classid", "objid", "objsubid", "commandTag", "objectType", "schemaName", "objectIdentity", "inExtension", "command" })
    public PgEventTriggerDdlCommandsRecord(@Nullable Long classid, @Nullable Long objid, @Nullable Integer objsubid, @Nullable String commandTag, @Nullable String objectType, @Nullable String schemaName, @Nullable String objectIdentity, @Nullable Boolean inExtension, @Nullable Object command) {
        super(PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS);

        setClassid(classid);
        setObjid(objid);
        setObjsubid(objsubid);
        setCommandTag(commandTag);
        setObjectType(objectType);
        setSchemaName(schemaName);
        setObjectIdentity(objectIdentity);
        setInExtension(inExtension);
        setCommand(command);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PgEventTriggerDdlCommandsRecord
     */
    public PgEventTriggerDdlCommandsRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgEventTriggerDdlCommands value) {
        super(PgEventTriggerDdlCommands.PG_EVENT_TRIGGER_DDL_COMMANDS);

        if (value != null) {
            setClassid(value.getClassid());
            setObjid(value.getObjid());
            setObjsubid(value.getObjsubid());
            setCommandTag(value.getCommandTag());
            setObjectType(value.getObjectType());
            setSchemaName(value.getSchemaName());
            setObjectIdentity(value.getObjectIdentity());
            setInExtension(value.getInExtension());
            setCommand(value.getCommand());
            resetChangedOnNotNull();
        }
    }
}
