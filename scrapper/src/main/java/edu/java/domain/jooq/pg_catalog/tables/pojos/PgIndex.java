/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
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
public class PgIndex implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long indexrelid;
    private Long indrelid;
    private Short indnatts;
    private Short indnkeyatts;
    private Boolean indisunique;
    private Boolean indnullsnotdistinct;
    private Boolean indisprimary;
    private Boolean indisexclusion;
    private Boolean indimmediate;
    private Boolean indisclustered;
    private Boolean indisvalid;
    private Boolean indcheckxmin;
    private Boolean indisready;
    private Boolean indislive;
    private Boolean indisreplident;
    private Object[] indkey;
    private Object[] indcollation;
    private Object[] indclass;
    private Object[] indoption;
    private Object indexprs;
    private Object indpred;

    public PgIndex() {}

    public PgIndex(PgIndex value) {
        this.indexrelid = value.indexrelid;
        this.indrelid = value.indrelid;
        this.indnatts = value.indnatts;
        this.indnkeyatts = value.indnkeyatts;
        this.indisunique = value.indisunique;
        this.indnullsnotdistinct = value.indnullsnotdistinct;
        this.indisprimary = value.indisprimary;
        this.indisexclusion = value.indisexclusion;
        this.indimmediate = value.indimmediate;
        this.indisclustered = value.indisclustered;
        this.indisvalid = value.indisvalid;
        this.indcheckxmin = value.indcheckxmin;
        this.indisready = value.indisready;
        this.indislive = value.indislive;
        this.indisreplident = value.indisreplident;
        this.indkey = value.indkey;
        this.indcollation = value.indcollation;
        this.indclass = value.indclass;
        this.indoption = value.indoption;
        this.indexprs = value.indexprs;
        this.indpred = value.indpred;
    }

    @ConstructorProperties({ "indexrelid", "indrelid", "indnatts", "indnkeyatts", "indisunique", "indnullsnotdistinct", "indisprimary", "indisexclusion", "indimmediate", "indisclustered", "indisvalid", "indcheckxmin", "indisready", "indislive", "indisreplident", "indkey", "indcollation", "indclass", "indoption", "indexprs", "indpred" })
    public PgIndex(
        @NotNull Long indexrelid,
        @NotNull Long indrelid,
        @NotNull Short indnatts,
        @NotNull Short indnkeyatts,
        @NotNull Boolean indisunique,
        @NotNull Boolean indnullsnotdistinct,
        @NotNull Boolean indisprimary,
        @NotNull Boolean indisexclusion,
        @NotNull Boolean indimmediate,
        @NotNull Boolean indisclustered,
        @NotNull Boolean indisvalid,
        @NotNull Boolean indcheckxmin,
        @NotNull Boolean indisready,
        @NotNull Boolean indislive,
        @NotNull Boolean indisreplident,
        @NotNull Object[] indkey,
        @NotNull Object[] indcollation,
        @NotNull Object[] indclass,
        @NotNull Object[] indoption,
        @Nullable Object indexprs,
        @Nullable Object indpred
    ) {
        this.indexrelid = indexrelid;
        this.indrelid = indrelid;
        this.indnatts = indnatts;
        this.indnkeyatts = indnkeyatts;
        this.indisunique = indisunique;
        this.indnullsnotdistinct = indnullsnotdistinct;
        this.indisprimary = indisprimary;
        this.indisexclusion = indisexclusion;
        this.indimmediate = indimmediate;
        this.indisclustered = indisclustered;
        this.indisvalid = indisvalid;
        this.indcheckxmin = indcheckxmin;
        this.indisready = indisready;
        this.indislive = indislive;
        this.indisreplident = indisreplident;
        this.indkey = indkey;
        this.indcollation = indcollation;
        this.indclass = indclass;
        this.indoption = indoption;
        this.indexprs = indexprs;
        this.indpred = indpred;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indexrelid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getIndexrelid() {
        return this.indexrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indexrelid</code>.
     */
    public void setIndexrelid(@NotNull Long indexrelid) {
        this.indexrelid = indexrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indrelid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getIndrelid() {
        return this.indrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indrelid</code>.
     */
    public void setIndrelid(@NotNull Long indrelid) {
        this.indrelid = indrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indnatts</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getIndnatts() {
        return this.indnatts;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indnatts</code>.
     */
    public void setIndnatts(@NotNull Short indnatts) {
        this.indnatts = indnatts;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indnkeyatts</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getIndnkeyatts() {
        return this.indnkeyatts;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indnkeyatts</code>.
     */
    public void setIndnkeyatts(@NotNull Short indnkeyatts) {
        this.indnkeyatts = indnkeyatts;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisunique</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisunique() {
        return this.indisunique;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisunique</code>.
     */
    public void setIndisunique(@NotNull Boolean indisunique) {
        this.indisunique = indisunique;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indnullsnotdistinct</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndnullsnotdistinct() {
        return this.indnullsnotdistinct;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indnullsnotdistinct</code>.
     */
    public void setIndnullsnotdistinct(@NotNull Boolean indnullsnotdistinct) {
        this.indnullsnotdistinct = indnullsnotdistinct;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisprimary</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisprimary() {
        return this.indisprimary;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisprimary</code>.
     */
    public void setIndisprimary(@NotNull Boolean indisprimary) {
        this.indisprimary = indisprimary;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisexclusion</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisexclusion() {
        return this.indisexclusion;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisexclusion</code>.
     */
    public void setIndisexclusion(@NotNull Boolean indisexclusion) {
        this.indisexclusion = indisexclusion;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indimmediate</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndimmediate() {
        return this.indimmediate;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indimmediate</code>.
     */
    public void setIndimmediate(@NotNull Boolean indimmediate) {
        this.indimmediate = indimmediate;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisclustered</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisclustered() {
        return this.indisclustered;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisclustered</code>.
     */
    public void setIndisclustered(@NotNull Boolean indisclustered) {
        this.indisclustered = indisclustered;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisvalid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisvalid() {
        return this.indisvalid;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisvalid</code>.
     */
    public void setIndisvalid(@NotNull Boolean indisvalid) {
        this.indisvalid = indisvalid;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indcheckxmin</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndcheckxmin() {
        return this.indcheckxmin;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indcheckxmin</code>.
     */
    public void setIndcheckxmin(@NotNull Boolean indcheckxmin) {
        this.indcheckxmin = indcheckxmin;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisready</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisready() {
        return this.indisready;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisready</code>.
     */
    public void setIndisready(@NotNull Boolean indisready) {
        this.indisready = indisready;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indislive</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndislive() {
        return this.indislive;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indislive</code>.
     */
    public void setIndislive(@NotNull Boolean indislive) {
        this.indislive = indislive;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisreplident</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getIndisreplident() {
        return this.indisreplident;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisreplident</code>.
     */
    public void setIndisreplident(@NotNull Boolean indisreplident) {
        this.indisreplident = indisreplident;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indkey</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getIndkey() {
        return this.indkey;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indkey</code>.
     */
    public void setIndkey(@NotNull Object[] indkey) {
        this.indkey = indkey;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indcollation</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getIndcollation() {
        return this.indcollation;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indcollation</code>.
     */
    public void setIndcollation(@NotNull Object[] indcollation) {
        this.indcollation = indcollation;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indclass</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getIndclass() {
        return this.indclass;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indclass</code>.
     */
    public void setIndclass(@NotNull Object[] indclass) {
        this.indclass = indclass;
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indoption</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getIndoption() {
        return this.indoption;
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indoption</code>.
     */
    public void setIndoption(@NotNull Object[] indoption) {
        this.indoption = indoption;
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
    public Object getIndexprs() {
        return this.indexprs;
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
    public void setIndexprs(@Nullable Object indexprs) {
        this.indexprs = indexprs;
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
    public Object getIndpred() {
        return this.indpred;
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
    public void setIndpred(@Nullable Object indpred) {
        this.indpred = indpred;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgIndex other = (PgIndex) obj;
        if (this.indexrelid == null) {
            if (other.indexrelid != null)
                return false;
        }
        else if (!this.indexrelid.equals(other.indexrelid))
            return false;
        if (this.indrelid == null) {
            if (other.indrelid != null)
                return false;
        }
        else if (!this.indrelid.equals(other.indrelid))
            return false;
        if (this.indnatts == null) {
            if (other.indnatts != null)
                return false;
        }
        else if (!this.indnatts.equals(other.indnatts))
            return false;
        if (this.indnkeyatts == null) {
            if (other.indnkeyatts != null)
                return false;
        }
        else if (!this.indnkeyatts.equals(other.indnkeyatts))
            return false;
        if (this.indisunique == null) {
            if (other.indisunique != null)
                return false;
        }
        else if (!this.indisunique.equals(other.indisunique))
            return false;
        if (this.indnullsnotdistinct == null) {
            if (other.indnullsnotdistinct != null)
                return false;
        }
        else if (!this.indnullsnotdistinct.equals(other.indnullsnotdistinct))
            return false;
        if (this.indisprimary == null) {
            if (other.indisprimary != null)
                return false;
        }
        else if (!this.indisprimary.equals(other.indisprimary))
            return false;
        if (this.indisexclusion == null) {
            if (other.indisexclusion != null)
                return false;
        }
        else if (!this.indisexclusion.equals(other.indisexclusion))
            return false;
        if (this.indimmediate == null) {
            if (other.indimmediate != null)
                return false;
        }
        else if (!this.indimmediate.equals(other.indimmediate))
            return false;
        if (this.indisclustered == null) {
            if (other.indisclustered != null)
                return false;
        }
        else if (!this.indisclustered.equals(other.indisclustered))
            return false;
        if (this.indisvalid == null) {
            if (other.indisvalid != null)
                return false;
        }
        else if (!this.indisvalid.equals(other.indisvalid))
            return false;
        if (this.indcheckxmin == null) {
            if (other.indcheckxmin != null)
                return false;
        }
        else if (!this.indcheckxmin.equals(other.indcheckxmin))
            return false;
        if (this.indisready == null) {
            if (other.indisready != null)
                return false;
        }
        else if (!this.indisready.equals(other.indisready))
            return false;
        if (this.indislive == null) {
            if (other.indislive != null)
                return false;
        }
        else if (!this.indislive.equals(other.indislive))
            return false;
        if (this.indisreplident == null) {
            if (other.indisreplident != null)
                return false;
        }
        else if (!this.indisreplident.equals(other.indisreplident))
            return false;
        if (this.indkey == null) {
            if (other.indkey != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.indkey, other.indkey))
            return false;
        if (this.indcollation == null) {
            if (other.indcollation != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.indcollation, other.indcollation))
            return false;
        if (this.indclass == null) {
            if (other.indclass != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.indclass, other.indclass))
            return false;
        if (this.indoption == null) {
            if (other.indoption != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.indoption, other.indoption))
            return false;
        if (this.indexprs == null) {
            if (other.indexprs != null)
                return false;
        }
        else if (!this.indexprs.equals(other.indexprs))
            return false;
        if (this.indpred == null) {
            if (other.indpred != null)
                return false;
        }
        else if (!this.indpred.equals(other.indpred))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.indexrelid == null) ? 0 : this.indexrelid.hashCode());
        result = prime * result + ((this.indrelid == null) ? 0 : this.indrelid.hashCode());
        result = prime * result + ((this.indnatts == null) ? 0 : this.indnatts.hashCode());
        result = prime * result + ((this.indnkeyatts == null) ? 0 : this.indnkeyatts.hashCode());
        result = prime * result + ((this.indisunique == null) ? 0 : this.indisunique.hashCode());
        result = prime * result + ((this.indnullsnotdistinct == null) ? 0 : this.indnullsnotdistinct.hashCode());
        result = prime * result + ((this.indisprimary == null) ? 0 : this.indisprimary.hashCode());
        result = prime * result + ((this.indisexclusion == null) ? 0 : this.indisexclusion.hashCode());
        result = prime * result + ((this.indimmediate == null) ? 0 : this.indimmediate.hashCode());
        result = prime * result + ((this.indisclustered == null) ? 0 : this.indisclustered.hashCode());
        result = prime * result + ((this.indisvalid == null) ? 0 : this.indisvalid.hashCode());
        result = prime * result + ((this.indcheckxmin == null) ? 0 : this.indcheckxmin.hashCode());
        result = prime * result + ((this.indisready == null) ? 0 : this.indisready.hashCode());
        result = prime * result + ((this.indislive == null) ? 0 : this.indislive.hashCode());
        result = prime * result + ((this.indisreplident == null) ? 0 : this.indisreplident.hashCode());
        result = prime * result + ((this.indkey == null) ? 0 : Arrays.deepHashCode(this.indkey));
        result = prime * result + ((this.indcollation == null) ? 0 : Arrays.deepHashCode(this.indcollation));
        result = prime * result + ((this.indclass == null) ? 0 : Arrays.deepHashCode(this.indclass));
        result = prime * result + ((this.indoption == null) ? 0 : Arrays.deepHashCode(this.indoption));
        result = prime * result + ((this.indexprs == null) ? 0 : this.indexprs.hashCode());
        result = prime * result + ((this.indpred == null) ? 0 : this.indpred.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgIndex (");

        sb.append(indexrelid);
        sb.append(", ").append(indrelid);
        sb.append(", ").append(indnatts);
        sb.append(", ").append(indnkeyatts);
        sb.append(", ").append(indisunique);
        sb.append(", ").append(indnullsnotdistinct);
        sb.append(", ").append(indisprimary);
        sb.append(", ").append(indisexclusion);
        sb.append(", ").append(indimmediate);
        sb.append(", ").append(indisclustered);
        sb.append(", ").append(indisvalid);
        sb.append(", ").append(indcheckxmin);
        sb.append(", ").append(indisready);
        sb.append(", ").append(indislive);
        sb.append(", ").append(indisreplident);
        sb.append(", ").append(Arrays.deepToString(indkey));
        sb.append(", ").append(Arrays.deepToString(indcollation));
        sb.append(", ").append(Arrays.deepToString(indclass));
        sb.append(", ").append(Arrays.deepToString(indoption));
        sb.append(", ").append(indexprs);
        sb.append(", ").append(indpred);

        sb.append(")");
        return sb.toString();
    }
}
