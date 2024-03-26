/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.Columns;

import jakarta.validation.constraints.Size;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
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
public class ColumnsRecord extends TableRecordImpl<ColumnsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.columns.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.columns.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.columns.table_schema</code>.
     */
    public void setTableSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.columns.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.columns.table_name</code>.
     */
    public void setTableName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.columns.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.columns.column_name</code>.
     */
    public void setColumnName(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.columns.column_name</code>.
     */
    @Nullable
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.columns.ordinal_position</code>.
     */
    public void setOrdinalPosition(@Nullable Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.columns.ordinal_position</code>.
     */
    @Nullable
    public Integer getOrdinalPosition() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.columns.column_default</code>.
     */
    public void setColumnDefault(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.columns.column_default</code>.
     */
    @Nullable
    public String getColumnDefault() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.columns.is_nullable</code>.
     */
    public void setIsNullable(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_nullable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsNullable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.columns.data_type</code>.
     */
    public void setDataType(@Nullable String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.columns.data_type</code>.
     */
    @Nullable
    public String getDataType() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.columns.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(@Nullable Integer value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.columns.character_maximum_length</code>.
     */
    @Nullable
    public Integer getCharacterMaximumLength() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.columns.character_octet_length</code>.
     */
    public void setCharacterOctetLength(@Nullable Integer value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.columns.character_octet_length</code>.
     */
    @Nullable
    public Integer getCharacterOctetLength() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>information_schema.columns.numeric_precision</code>.
     */
    public void setNumericPrecision(@Nullable Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.columns.numeric_precision</code>.
     */
    @Nullable
    public Integer getNumericPrecision() {
        return (Integer) get(10);
    }

    /**
     * Setter for
     * <code>information_schema.columns.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(@Nullable Integer value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>information_schema.columns.numeric_precision_radix</code>.
     */
    @Nullable
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>information_schema.columns.numeric_scale</code>.
     */
    public void setNumericScale(@Nullable Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.columns.numeric_scale</code>.
     */
    @Nullable
    public Integer getNumericScale() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>information_schema.columns.datetime_precision</code>.
     */
    public void setDatetimePrecision(@Nullable Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.columns.datetime_precision</code>.
     */
    @Nullable
    public Integer getDatetimePrecision() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>information_schema.columns.interval_type</code>.
     */
    public void setIntervalType(@Nullable String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.columns.interval_type</code>.
     */
    @Nullable
    public String getIntervalType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.columns.interval_precision</code>.
     */
    public void setIntervalPrecision(@Nullable Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.columns.interval_precision</code>.
     */
    @Nullable
    public Integer getIntervalPrecision() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>information_schema.columns.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(@Nullable String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.columns.character_set_catalog</code>.
     */
    @Nullable
    public String getCharacterSetCatalog() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.columns.character_set_schema</code>.
     */
    public void setCharacterSetSchema(@Nullable String value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.columns.character_set_schema</code>.
     */
    @Nullable
    public String getCharacterSetSchema() {
        return (String) get(17);
    }

    /**
     * Setter for <code>information_schema.columns.character_set_name</code>.
     */
    public void setCharacterSetName(@Nullable String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.columns.character_set_name</code>.
     */
    @Nullable
    public String getCharacterSetName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>information_schema.columns.collation_catalog</code>.
     */
    public void setCollationCatalog(@Nullable String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.columns.collation_catalog</code>.
     */
    @Nullable
    public String getCollationCatalog() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.columns.collation_schema</code>.
     */
    public void setCollationSchema(@Nullable String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.columns.collation_schema</code>.
     */
    @Nullable
    public String getCollationSchema() {
        return (String) get(20);
    }

    /**
     * Setter for <code>information_schema.columns.collation_name</code>.
     */
    public void setCollationName(@Nullable String value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.columns.collation_name</code>.
     */
    @Nullable
    public String getCollationName() {
        return (String) get(21);
    }

    /**
     * Setter for <code>information_schema.columns.domain_catalog</code>.
     */
    public void setDomainCatalog(@Nullable String value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.columns.domain_catalog</code>.
     */
    @Nullable
    public String getDomainCatalog() {
        return (String) get(22);
    }

    /**
     * Setter for <code>information_schema.columns.domain_schema</code>.
     */
    public void setDomainSchema(@Nullable String value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.columns.domain_schema</code>.
     */
    @Nullable
    public String getDomainSchema() {
        return (String) get(23);
    }

    /**
     * Setter for <code>information_schema.columns.domain_name</code>.
     */
    public void setDomainName(@Nullable String value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.columns.domain_name</code>.
     */
    @Nullable
    public String getDomainName() {
        return (String) get(24);
    }

    /**
     * Setter for <code>information_schema.columns.udt_catalog</code>.
     */
    public void setUdtCatalog(@Nullable String value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.columns.udt_catalog</code>.
     */
    @Nullable
    public String getUdtCatalog() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.columns.udt_schema</code>.
     */
    public void setUdtSchema(@Nullable String value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.columns.udt_schema</code>.
     */
    @Nullable
    public String getUdtSchema() {
        return (String) get(26);
    }

    /**
     * Setter for <code>information_schema.columns.udt_name</code>.
     */
    public void setUdtName(@Nullable String value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.columns.udt_name</code>.
     */
    @Nullable
    public String getUdtName() {
        return (String) get(27);
    }

    /**
     * Setter for <code>information_schema.columns.scope_catalog</code>.
     */
    public void setScopeCatalog(@Nullable String value) {
        set(28, value);
    }

    /**
     * Getter for <code>information_schema.columns.scope_catalog</code>.
     */
    @Nullable
    public String getScopeCatalog() {
        return (String) get(28);
    }

    /**
     * Setter for <code>information_schema.columns.scope_schema</code>.
     */
    public void setScopeSchema(@Nullable String value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.columns.scope_schema</code>.
     */
    @Nullable
    public String getScopeSchema() {
        return (String) get(29);
    }

    /**
     * Setter for <code>information_schema.columns.scope_name</code>.
     */
    public void setScopeName(@Nullable String value) {
        set(30, value);
    }

    /**
     * Getter for <code>information_schema.columns.scope_name</code>.
     */
    @Nullable
    public String getScopeName() {
        return (String) get(30);
    }

    /**
     * Setter for <code>information_schema.columns.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(@Nullable Integer value) {
        set(31, value);
    }

    /**
     * Getter for <code>information_schema.columns.maximum_cardinality</code>.
     */
    @Nullable
    public Integer getMaximumCardinality() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>information_schema.columns.dtd_identifier</code>.
     */
    public void setDtdIdentifier(@Nullable String value) {
        set(32, value);
    }

    /**
     * Getter for <code>information_schema.columns.dtd_identifier</code>.
     */
    @Nullable
    public String getDtdIdentifier() {
        return (String) get(32);
    }

    /**
     * Setter for <code>information_schema.columns.is_self_referencing</code>.
     */
    public void setIsSelfReferencing(@Nullable String value) {
        set(33, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_self_referencing</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsSelfReferencing() {
        return (String) get(33);
    }

    /**
     * Setter for <code>information_schema.columns.is_identity</code>.
     */
    public void setIsIdentity(@Nullable String value) {
        set(34, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_identity</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsIdentity() {
        return (String) get(34);
    }

    /**
     * Setter for <code>information_schema.columns.identity_generation</code>.
     */
    public void setIdentityGeneration(@Nullable String value) {
        set(35, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_generation</code>.
     */
    @Nullable
    public String getIdentityGeneration() {
        return (String) get(35);
    }

    /**
     * Setter for <code>information_schema.columns.identity_start</code>.
     */
    public void setIdentityStart(@Nullable String value) {
        set(36, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_start</code>.
     */
    @Nullable
    public String getIdentityStart() {
        return (String) get(36);
    }

    /**
     * Setter for <code>information_schema.columns.identity_increment</code>.
     */
    public void setIdentityIncrement(@Nullable String value) {
        set(37, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_increment</code>.
     */
    @Nullable
    public String getIdentityIncrement() {
        return (String) get(37);
    }

    /**
     * Setter for <code>information_schema.columns.identity_maximum</code>.
     */
    public void setIdentityMaximum(@Nullable String value) {
        set(38, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_maximum</code>.
     */
    @Nullable
    public String getIdentityMaximum() {
        return (String) get(38);
    }

    /**
     * Setter for <code>information_schema.columns.identity_minimum</code>.
     */
    public void setIdentityMinimum(@Nullable String value) {
        set(39, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_minimum</code>.
     */
    @Nullable
    public String getIdentityMinimum() {
        return (String) get(39);
    }

    /**
     * Setter for <code>information_schema.columns.identity_cycle</code>.
     */
    public void setIdentityCycle(@Nullable String value) {
        set(40, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_cycle</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIdentityCycle() {
        return (String) get(40);
    }

    /**
     * Setter for <code>information_schema.columns.is_generated</code>.
     */
    public void setIsGenerated(@Nullable String value) {
        set(41, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_generated</code>.
     */
    @Nullable
    public String getIsGenerated() {
        return (String) get(41);
    }

    /**
     * Setter for <code>information_schema.columns.generation_expression</code>.
     */
    public void setGenerationExpression(@Nullable String value) {
        set(42, value);
    }

    /**
     * Getter for <code>information_schema.columns.generation_expression</code>.
     */
    @Nullable
    public String getGenerationExpression() {
        return (String) get(42);
    }

    /**
     * Setter for <code>information_schema.columns.is_updatable</code>.
     */
    public void setIsUpdatable(@Nullable String value) {
        set(43, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_updatable</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsUpdatable() {
        return (String) get(43);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnsRecord
     */
    public ColumnsRecord() {
        super(Columns.COLUMNS);
    }

    /**
     * Create a detached, initialised ColumnsRecord
     */
    @ConstructorProperties({ "tableCatalog", "tableSchema", "tableName", "columnName", "ordinalPosition", "columnDefault", "isNullable", "dataType", "characterMaximumLength", "characterOctetLength", "numericPrecision", "numericPrecisionRadix", "numericScale", "datetimePrecision", "intervalType", "intervalPrecision", "characterSetCatalog", "characterSetSchema", "characterSetName", "collationCatalog", "collationSchema", "collationName", "domainCatalog", "domainSchema", "domainName", "udtCatalog", "udtSchema", "udtName", "scopeCatalog", "scopeSchema", "scopeName", "maximumCardinality", "dtdIdentifier", "isSelfReferencing", "isIdentity", "identityGeneration", "identityStart", "identityIncrement", "identityMaximum", "identityMinimum", "identityCycle", "isGenerated", "generationExpression", "isUpdatable" })
    public ColumnsRecord(@Nullable String tableCatalog, @Nullable String tableSchema, @Nullable String tableName, @Nullable String columnName, @Nullable Integer ordinalPosition, @Nullable String columnDefault, @Nullable String isNullable, @Nullable String dataType, @Nullable Integer characterMaximumLength, @Nullable Integer characterOctetLength, @Nullable Integer numericPrecision, @Nullable Integer numericPrecisionRadix, @Nullable Integer numericScale, @Nullable Integer datetimePrecision, @Nullable String intervalType, @Nullable Integer intervalPrecision, @Nullable String characterSetCatalog, @Nullable String characterSetSchema, @Nullable String characterSetName, @Nullable String collationCatalog, @Nullable String collationSchema, @Nullable String collationName, @Nullable String domainCatalog, @Nullable String domainSchema, @Nullable String domainName, @Nullable String udtCatalog, @Nullable String udtSchema, @Nullable String udtName, @Nullable String scopeCatalog, @Nullable String scopeSchema, @Nullable String scopeName, @Nullable Integer maximumCardinality, @Nullable String dtdIdentifier, @Nullable String isSelfReferencing, @Nullable String isIdentity, @Nullable String identityGeneration, @Nullable String identityStart, @Nullable String identityIncrement, @Nullable String identityMaximum, @Nullable String identityMinimum, @Nullable String identityCycle, @Nullable String isGenerated, @Nullable String generationExpression, @Nullable String isUpdatable) {
        super(Columns.COLUMNS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setOrdinalPosition(ordinalPosition);
        setColumnDefault(columnDefault);
        setIsNullable(isNullable);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setNumericPrecision(numericPrecision);
        setNumericPrecisionRadix(numericPrecisionRadix);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setIntervalType(intervalType);
        setIntervalPrecision(intervalPrecision);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setDomainCatalog(domainCatalog);
        setDomainSchema(domainSchema);
        setDomainName(domainName);
        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setScopeCatalog(scopeCatalog);
        setScopeSchema(scopeSchema);
        setScopeName(scopeName);
        setMaximumCardinality(maximumCardinality);
        setDtdIdentifier(dtdIdentifier);
        setIsSelfReferencing(isSelfReferencing);
        setIsIdentity(isIdentity);
        setIdentityGeneration(identityGeneration);
        setIdentityStart(identityStart);
        setIdentityIncrement(identityIncrement);
        setIdentityMaximum(identityMaximum);
        setIdentityMinimum(identityMinimum);
        setIdentityCycle(identityCycle);
        setIsGenerated(isGenerated);
        setGenerationExpression(generationExpression);
        setIsUpdatable(isUpdatable);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ColumnsRecord
     */
    public ColumnsRecord(edu.java.domain.jooq.information_schema.tables.pojos.Columns value) {
        super(Columns.COLUMNS);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            setOrdinalPosition(value.getOrdinalPosition());
            setColumnDefault(value.getColumnDefault());
            setIsNullable(value.getIsNullable());
            setDataType(value.getDataType());
            setCharacterMaximumLength(value.getCharacterMaximumLength());
            setCharacterOctetLength(value.getCharacterOctetLength());
            setNumericPrecision(value.getNumericPrecision());
            setNumericPrecisionRadix(value.getNumericPrecisionRadix());
            setNumericScale(value.getNumericScale());
            setDatetimePrecision(value.getDatetimePrecision());
            setIntervalType(value.getIntervalType());
            setIntervalPrecision(value.getIntervalPrecision());
            setCharacterSetCatalog(value.getCharacterSetCatalog());
            setCharacterSetSchema(value.getCharacterSetSchema());
            setCharacterSetName(value.getCharacterSetName());
            setCollationCatalog(value.getCollationCatalog());
            setCollationSchema(value.getCollationSchema());
            setCollationName(value.getCollationName());
            setDomainCatalog(value.getDomainCatalog());
            setDomainSchema(value.getDomainSchema());
            setDomainName(value.getDomainName());
            setUdtCatalog(value.getUdtCatalog());
            setUdtSchema(value.getUdtSchema());
            setUdtName(value.getUdtName());
            setScopeCatalog(value.getScopeCatalog());
            setScopeSchema(value.getScopeSchema());
            setScopeName(value.getScopeName());
            setMaximumCardinality(value.getMaximumCardinality());
            setDtdIdentifier(value.getDtdIdentifier());
            setIsSelfReferencing(value.getIsSelfReferencing());
            setIsIdentity(value.getIsIdentity());
            setIdentityGeneration(value.getIdentityGeneration());
            setIdentityStart(value.getIdentityStart());
            setIdentityIncrement(value.getIdentityIncrement());
            setIdentityMaximum(value.getIdentityMaximum());
            setIdentityMinimum(value.getIdentityMinimum());
            setIdentityCycle(value.getIdentityCycle());
            setIsGenerated(value.getIsGenerated());
            setGenerationExpression(value.getGenerationExpression());
            setIsUpdatable(value.getIsUpdatable());
            resetChangedOnNotNull();
        }
    }
}