/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.pojos;


import jakarta.validation.constraints.Size;

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
public class SqlParts implements Serializable {

    private static final long serialVersionUID = 1L;

    private String featureId;
    private String featureName;
    private String isSupported;
    private String isVerifiedBy;
    private String comments;

    public SqlParts() {}

    public SqlParts(SqlParts value) {
        this.featureId = value.featureId;
        this.featureName = value.featureName;
        this.isSupported = value.isSupported;
        this.isVerifiedBy = value.isVerifiedBy;
        this.comments = value.comments;
    }

    @ConstructorProperties({ "featureId", "featureName", "isSupported", "isVerifiedBy", "comments" })
    public SqlParts(
        @Nullable String featureId,
        @Nullable String featureName,
        @Nullable String isSupported,
        @Nullable String isVerifiedBy,
        @Nullable String comments
    ) {
        this.featureId = featureId;
        this.featureName = featureName;
        this.isSupported = isSupported;
        this.isVerifiedBy = isVerifiedBy;
        this.comments = comments;
    }

    /**
     * Getter for <code>information_schema.sql_parts.feature_id</code>.
     */
    @Nullable
    public String getFeatureId() {
        return this.featureId;
    }

    /**
     * Setter for <code>information_schema.sql_parts.feature_id</code>.
     */
    public void setFeatureId(@Nullable String featureId) {
        this.featureId = featureId;
    }

    /**
     * Getter for <code>information_schema.sql_parts.feature_name</code>.
     */
    @Nullable
    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * Setter for <code>information_schema.sql_parts.feature_name</code>.
     */
    public void setFeatureName(@Nullable String featureName) {
        this.featureName = featureName;
    }

    /**
     * Getter for <code>information_schema.sql_parts.is_supported</code>.
     */
    @Size(max = 3)
    @Nullable
    public String getIsSupported() {
        return this.isSupported;
    }

    /**
     * Setter for <code>information_schema.sql_parts.is_supported</code>.
     */
    public void setIsSupported(@Nullable String isSupported) {
        this.isSupported = isSupported;
    }

    /**
     * Getter for <code>information_schema.sql_parts.is_verified_by</code>.
     */
    @Nullable
    public String getIsVerifiedBy() {
        return this.isVerifiedBy;
    }

    /**
     * Setter for <code>information_schema.sql_parts.is_verified_by</code>.
     */
    public void setIsVerifiedBy(@Nullable String isVerifiedBy) {
        this.isVerifiedBy = isVerifiedBy;
    }

    /**
     * Getter for <code>information_schema.sql_parts.comments</code>.
     */
    @Nullable
    public String getComments() {
        return this.comments;
    }

    /**
     * Setter for <code>information_schema.sql_parts.comments</code>.
     */
    public void setComments(@Nullable String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SqlParts other = (SqlParts) obj;
        if (this.featureId == null) {
            if (other.featureId != null)
                return false;
        }
        else if (!this.featureId.equals(other.featureId))
            return false;
        if (this.featureName == null) {
            if (other.featureName != null)
                return false;
        }
        else if (!this.featureName.equals(other.featureName))
            return false;
        if (this.isSupported == null) {
            if (other.isSupported != null)
                return false;
        }
        else if (!this.isSupported.equals(other.isSupported))
            return false;
        if (this.isVerifiedBy == null) {
            if (other.isVerifiedBy != null)
                return false;
        }
        else if (!this.isVerifiedBy.equals(other.isVerifiedBy))
            return false;
        if (this.comments == null) {
            if (other.comments != null)
                return false;
        }
        else if (!this.comments.equals(other.comments))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.featureId == null) ? 0 : this.featureId.hashCode());
        result = prime * result + ((this.featureName == null) ? 0 : this.featureName.hashCode());
        result = prime * result + ((this.isSupported == null) ? 0 : this.isSupported.hashCode());
        result = prime * result + ((this.isVerifiedBy == null) ? 0 : this.isVerifiedBy.hashCode());
        result = prime * result + ((this.comments == null) ? 0 : this.comments.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlParts (");

        sb.append(featureId);
        sb.append(", ").append(featureName);
        sb.append(", ").append(isSupported);
        sb.append(", ").append(isVerifiedBy);
        sb.append(", ").append(comments);

        sb.append(")");
        return sb.toString();
    }
}
