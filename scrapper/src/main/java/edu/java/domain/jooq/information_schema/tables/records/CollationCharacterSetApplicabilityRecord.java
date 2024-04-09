/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.CollationCharacterSetApplicability;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class CollationCharacterSetApplicabilityRecord extends TableRecordImpl<CollationCharacterSetApplicabilityRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    public void setCollationCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    @Nullable
    public String getCollationCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    public void setCollationSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    @Nullable
    public String getCollationSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    public void setCollationName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    @Nullable
    public String getCollationName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    @Nullable
    public String getCharacterSetCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    public void setCharacterSetSchema(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    @Nullable
    public String getCharacterSetSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    public void setCharacterSetName(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    @Nullable
    public String getCharacterSetName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME;
    }

    @Override
    @Nullable
    public String component1() {
        return getCollationCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getCollationSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getCollationName();
    }

    @Override
    @Nullable
    public String component4() {
        return getCharacterSetCatalog();
    }

    @Override
    @Nullable
    public String component5() {
        return getCharacterSetSchema();
    }

    @Override
    @Nullable
    public String component6() {
        return getCharacterSetName();
    }

    @Override
    @Nullable
    public String value1() {
        return getCollationCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getCollationSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getCollationName();
    }

    @Override
    @Nullable
    public String value4() {
        return getCharacterSetCatalog();
    }

    @Override
    @Nullable
    public String value5() {
        return getCharacterSetSchema();
    }

    @Override
    @Nullable
    public String value6() {
        return getCharacterSetName();
    }

    @Override
    @NotNull
    public CollationCharacterSetApplicabilityRecord value1(@Nullable String value) {
        setCollationCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public CollationCharacterSetApplicabilityRecord value2(@Nullable String value) {
        setCollationSchema(value);
        return this;
    }

    @Override
    @NotNull
    public CollationCharacterSetApplicabilityRecord value3(@Nullable String value) {
        setCollationName(value);
        return this;
    }

    @Override
    @NotNull
    public CollationCharacterSetApplicabilityRecord value4(@Nullable String value) {
        setCharacterSetCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public CollationCharacterSetApplicabilityRecord value5(@Nullable String value) {
        setCharacterSetSchema(value);
        return this;
    }

    @Override
    @NotNull
    public CollationCharacterSetApplicabilityRecord value6(@Nullable String value) {
        setCharacterSetName(value);
        return this;
    }

    @Override
    @NotNull
    public CollationCharacterSetApplicabilityRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6) {
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
     * Create a detached CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord() {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create a detached, initialised CollationCharacterSetApplicabilityRecord
     */
    @ConstructorProperties({ "collationCatalog", "collationSchema", "collationName", "characterSetCatalog", "characterSetSchema", "characterSetName" })
    public CollationCharacterSetApplicabilityRecord(@Nullable String collationCatalog, @Nullable String collationSchema, @Nullable String collationName, @Nullable String characterSetCatalog, @Nullable String characterSetSchema, @Nullable String characterSetName) {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);

        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord(edu.java.domain.jooq.information_schema.tables.pojos.CollationCharacterSetApplicability value) {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);

        if (value != null) {
            setCollationCatalog(value.getCollationCatalog());
            setCollationSchema(value.getCollationSchema());
            setCollationName(value.getCollationName());
            setCharacterSetCatalog(value.getCharacterSetCatalog());
            setCharacterSetSchema(value.getCharacterSetSchema());
            setCharacterSetName(value.getCharacterSetName());
            resetChangedOnNotNull();
        }
    }
}