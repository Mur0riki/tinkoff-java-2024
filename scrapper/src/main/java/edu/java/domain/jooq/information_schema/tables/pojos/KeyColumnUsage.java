/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

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
public class KeyColumnUsage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String constraintCatalog;
    private String constraintSchema;
    private String constraintName;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String columnName;
    private Integer ordinalPosition;
    private Integer positionInUniqueConstraint;

    public KeyColumnUsage() {}

    public KeyColumnUsage(KeyColumnUsage value) {
        this.constraintCatalog = value.constraintCatalog;
        this.constraintSchema = value.constraintSchema;
        this.constraintName = value.constraintName;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.ordinalPosition = value.ordinalPosition;
        this.positionInUniqueConstraint = value.positionInUniqueConstraint;
    }

    @ConstructorProperties({ "constraintCatalog", "constraintSchema", "constraintName", "tableCatalog", "tableSchema", "tableName", "columnName", "ordinalPosition", "positionInUniqueConstraint" })
    public KeyColumnUsage(
        @Nullable String constraintCatalog,
        @Nullable String constraintSchema,
        @Nullable String constraintName,
        @Nullable String tableCatalog,
        @Nullable String tableSchema,
        @Nullable String tableName,
        @Nullable String columnName,
        @Nullable Integer ordinalPosition,
        @Nullable Integer positionInUniqueConstraint
    ) {
        this.constraintCatalog = constraintCatalog;
        this.constraintSchema = constraintSchema;
        this.constraintName = constraintName;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.ordinalPosition = ordinalPosition;
        this.positionInUniqueConstraint = positionInUniqueConstraint;
    }

    /**
     * Getter for
     * <code>information_schema.key_column_usage.constraint_catalog</code>.
     */
    @Nullable
    public String getConstraintCatalog() {
        return this.constraintCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.key_column_usage.constraint_catalog</code>.
     */
    public void setConstraintCatalog(@Nullable String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.key_column_usage.constraint_schema</code>.
     */
    @Nullable
    public String getConstraintSchema() {
        return this.constraintSchema;
    }

    /**
     * Setter for
     * <code>information_schema.key_column_usage.constraint_schema</code>.
     */
    public void setConstraintSchema(@Nullable String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    /**
     * Getter for
     * <code>information_schema.key_column_usage.constraint_name</code>.
     */
    @Nullable
    public String getConstraintName() {
        return this.constraintName;
    }

    /**
     * Setter for
     * <code>information_schema.key_column_usage.constraint_name</code>.
     */
    public void setConstraintName(@Nullable String constraintName) {
        this.constraintName = constraintName;
    }

    /**
     * Getter for
     * <code>information_schema.key_column_usage.table_catalog</code>.
     */
    @Nullable
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.key_column_usage.table_catalog</code>.
     */
    public void setTableCatalog(@Nullable String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * Getter for <code>information_schema.key_column_usage.table_schema</code>.
     */
    @Nullable
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Setter for <code>information_schema.key_column_usage.table_schema</code>.
     */
    public void setTableSchema(@Nullable String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * Getter for <code>information_schema.key_column_usage.table_name</code>.
     */
    @Nullable
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Setter for <code>information_schema.key_column_usage.table_name</code>.
     */
    public void setTableName(@Nullable String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter for <code>information_schema.key_column_usage.column_name</code>.
     */
    @Nullable
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Setter for <code>information_schema.key_column_usage.column_name</code>.
     */
    public void setColumnName(@Nullable String columnName) {
        this.columnName = columnName;
    }

    /**
     * Getter for
     * <code>information_schema.key_column_usage.ordinal_position</code>.
     */
    @Nullable
    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    /**
     * Setter for
     * <code>information_schema.key_column_usage.ordinal_position</code>.
     */
    public void setOrdinalPosition(@Nullable Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    /**
     * Getter for
     * <code>information_schema.key_column_usage.position_in_unique_constraint</code>.
     */
    @Nullable
    public Integer getPositionInUniqueConstraint() {
        return this.positionInUniqueConstraint;
    }

    /**
     * Setter for
     * <code>information_schema.key_column_usage.position_in_unique_constraint</code>.
     */
    public void setPositionInUniqueConstraint(@Nullable Integer positionInUniqueConstraint) {
        this.positionInUniqueConstraint = positionInUniqueConstraint;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final KeyColumnUsage other = (KeyColumnUsage) obj;
        if (this.constraintCatalog == null) {
            if (other.constraintCatalog != null)
                return false;
        }
        else if (!this.constraintCatalog.equals(other.constraintCatalog))
            return false;
        if (this.constraintSchema == null) {
            if (other.constraintSchema != null)
                return false;
        }
        else if (!this.constraintSchema.equals(other.constraintSchema))
            return false;
        if (this.constraintName == null) {
            if (other.constraintName != null)
                return false;
        }
        else if (!this.constraintName.equals(other.constraintName))
            return false;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.columnName == null) {
            if (other.columnName != null)
                return false;
        }
        else if (!this.columnName.equals(other.columnName))
            return false;
        if (this.ordinalPosition == null) {
            if (other.ordinalPosition != null)
                return false;
        }
        else if (!this.ordinalPosition.equals(other.ordinalPosition))
            return false;
        if (this.positionInUniqueConstraint == null) {
            if (other.positionInUniqueConstraint != null)
                return false;
        }
        else if (!this.positionInUniqueConstraint.equals(other.positionInUniqueConstraint))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.constraintCatalog == null) ? 0 : this.constraintCatalog.hashCode());
        result = prime * result + ((this.constraintSchema == null) ? 0 : this.constraintSchema.hashCode());
        result = prime * result + ((this.constraintName == null) ? 0 : this.constraintName.hashCode());
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.columnName == null) ? 0 : this.columnName.hashCode());
        result = prime * result + ((this.ordinalPosition == null) ? 0 : this.ordinalPosition.hashCode());
        result = prime * result + ((this.positionInUniqueConstraint == null) ? 0 : this.positionInUniqueConstraint.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("KeyColumnUsage (");

        sb.append(constraintCatalog);
        sb.append(", ").append(constraintSchema);
        sb.append(", ").append(constraintName);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(positionInUniqueConstraint);

        sb.append(")");
        return sb.toString();
    }
}
