/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;


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
public class PgPublication implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private String pubname;
    private Long pubowner;
    private Boolean puballtables;
    private Boolean pubinsert;
    private Boolean pubupdate;
    private Boolean pubdelete;
    private Boolean pubtruncate;
    private Boolean pubviaroot;

    public PgPublication() {}

    public PgPublication(PgPublication value) {
        this.oid = value.oid;
        this.pubname = value.pubname;
        this.pubowner = value.pubowner;
        this.puballtables = value.puballtables;
        this.pubinsert = value.pubinsert;
        this.pubupdate = value.pubupdate;
        this.pubdelete = value.pubdelete;
        this.pubtruncate = value.pubtruncate;
        this.pubviaroot = value.pubviaroot;
    }

    @ConstructorProperties({ "oid", "pubname", "pubowner", "puballtables", "pubinsert", "pubupdate", "pubdelete", "pubtruncate", "pubviaroot" })
    public PgPublication(
        @NotNull Long oid,
        @NotNull String pubname,
        @NotNull Long pubowner,
        @NotNull Boolean puballtables,
        @NotNull Boolean pubinsert,
        @NotNull Boolean pubupdate,
        @NotNull Boolean pubdelete,
        @NotNull Boolean pubtruncate,
        @NotNull Boolean pubviaroot
    ) {
        this.oid = oid;
        this.pubname = pubname;
        this.pubowner = pubowner;
        this.puballtables = puballtables;
        this.pubinsert = pubinsert;
        this.pubupdate = pubupdate;
        this.pubdelete = pubdelete;
        this.pubtruncate = pubtruncate;
        this.pubviaroot = pubviaroot;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.oid</code>.
     */
    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getPubname() {
        return this.pubname;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubname</code>.
     */
    public void setPubname(@NotNull String pubname) {
        this.pubname = pubname;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubowner</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getPubowner() {
        return this.pubowner;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubowner</code>.
     */
    public void setPubowner(@NotNull Long pubowner) {
        this.pubowner = pubowner;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.puballtables</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPuballtables() {
        return this.puballtables;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.puballtables</code>.
     */
    public void setPuballtables(@NotNull Boolean puballtables) {
        this.puballtables = puballtables;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubinsert</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubinsert() {
        return this.pubinsert;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubinsert</code>.
     */
    public void setPubinsert(@NotNull Boolean pubinsert) {
        this.pubinsert = pubinsert;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubupdate</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubupdate() {
        return this.pubupdate;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubupdate</code>.
     */
    public void setPubupdate(@NotNull Boolean pubupdate) {
        this.pubupdate = pubupdate;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubdelete</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubdelete() {
        return this.pubdelete;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubdelete</code>.
     */
    public void setPubdelete(@NotNull Boolean pubdelete) {
        this.pubdelete = pubdelete;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubtruncate</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubtruncate() {
        return this.pubtruncate;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubtruncate</code>.
     */
    public void setPubtruncate(@NotNull Boolean pubtruncate) {
        this.pubtruncate = pubtruncate;
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubviaroot</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getPubviaroot() {
        return this.pubviaroot;
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubviaroot</code>.
     */
    public void setPubviaroot(@NotNull Boolean pubviaroot) {
        this.pubviaroot = pubviaroot;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgPublication other = (PgPublication) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.pubname == null) {
            if (other.pubname != null)
                return false;
        }
        else if (!this.pubname.equals(other.pubname))
            return false;
        if (this.pubowner == null) {
            if (other.pubowner != null)
                return false;
        }
        else if (!this.pubowner.equals(other.pubowner))
            return false;
        if (this.puballtables == null) {
            if (other.puballtables != null)
                return false;
        }
        else if (!this.puballtables.equals(other.puballtables))
            return false;
        if (this.pubinsert == null) {
            if (other.pubinsert != null)
                return false;
        }
        else if (!this.pubinsert.equals(other.pubinsert))
            return false;
        if (this.pubupdate == null) {
            if (other.pubupdate != null)
                return false;
        }
        else if (!this.pubupdate.equals(other.pubupdate))
            return false;
        if (this.pubdelete == null) {
            if (other.pubdelete != null)
                return false;
        }
        else if (!this.pubdelete.equals(other.pubdelete))
            return false;
        if (this.pubtruncate == null) {
            if (other.pubtruncate != null)
                return false;
        }
        else if (!this.pubtruncate.equals(other.pubtruncate))
            return false;
        if (this.pubviaroot == null) {
            if (other.pubviaroot != null)
                return false;
        }
        else if (!this.pubviaroot.equals(other.pubviaroot))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.pubname == null) ? 0 : this.pubname.hashCode());
        result = prime * result + ((this.pubowner == null) ? 0 : this.pubowner.hashCode());
        result = prime * result + ((this.puballtables == null) ? 0 : this.puballtables.hashCode());
        result = prime * result + ((this.pubinsert == null) ? 0 : this.pubinsert.hashCode());
        result = prime * result + ((this.pubupdate == null) ? 0 : this.pubupdate.hashCode());
        result = prime * result + ((this.pubdelete == null) ? 0 : this.pubdelete.hashCode());
        result = prime * result + ((this.pubtruncate == null) ? 0 : this.pubtruncate.hashCode());
        result = prime * result + ((this.pubviaroot == null) ? 0 : this.pubviaroot.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPublication (");

        sb.append(oid);
        sb.append(", ").append(pubname);
        sb.append(", ").append(pubowner);
        sb.append(", ").append(puballtables);
        sb.append(", ").append(pubinsert);
        sb.append(", ").append(pubupdate);
        sb.append(", ").append(pubdelete);
        sb.append(", ").append(pubtruncate);
        sb.append(", ").append(pubviaroot);

        sb.append(")");
        return sb.toString();
    }
}
