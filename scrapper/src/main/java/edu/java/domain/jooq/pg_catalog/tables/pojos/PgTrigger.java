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
public class PgTrigger implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long oid;
    private Long tgrelid;
    private Long tgparentid;
    private String tgname;
    private Long tgfoid;
    private Short tgtype;
    private String tgenabled;
    private Boolean tgisinternal;
    private Long tgconstrrelid;
    private Long tgconstrindid;
    private Long tgconstraint;
    private Boolean tgdeferrable;
    private Boolean tginitdeferred;
    private Short tgnargs;
    private Object[] tgattr;
    private byte[] tgargs;
    private Object tgqual;
    private String tgoldtable;
    private String tgnewtable;

    public PgTrigger() {}

    public PgTrigger(PgTrigger value) {
        this.oid = value.oid;
        this.tgrelid = value.tgrelid;
        this.tgparentid = value.tgparentid;
        this.tgname = value.tgname;
        this.tgfoid = value.tgfoid;
        this.tgtype = value.tgtype;
        this.tgenabled = value.tgenabled;
        this.tgisinternal = value.tgisinternal;
        this.tgconstrrelid = value.tgconstrrelid;
        this.tgconstrindid = value.tgconstrindid;
        this.tgconstraint = value.tgconstraint;
        this.tgdeferrable = value.tgdeferrable;
        this.tginitdeferred = value.tginitdeferred;
        this.tgnargs = value.tgnargs;
        this.tgattr = value.tgattr;
        this.tgargs = value.tgargs;
        this.tgqual = value.tgqual;
        this.tgoldtable = value.tgoldtable;
        this.tgnewtable = value.tgnewtable;
    }

    @ConstructorProperties({ "oid", "tgrelid", "tgparentid", "tgname", "tgfoid", "tgtype", "tgenabled", "tgisinternal", "tgconstrrelid", "tgconstrindid", "tgconstraint", "tgdeferrable", "tginitdeferred", "tgnargs", "tgattr", "tgargs", "tgqual", "tgoldtable", "tgnewtable" })
    public PgTrigger(
        @NotNull Long oid,
        @NotNull Long tgrelid,
        @NotNull Long tgparentid,
        @NotNull String tgname,
        @NotNull Long tgfoid,
        @NotNull Short tgtype,
        @NotNull String tgenabled,
        @NotNull Boolean tgisinternal,
        @NotNull Long tgconstrrelid,
        @NotNull Long tgconstrindid,
        @NotNull Long tgconstraint,
        @NotNull Boolean tgdeferrable,
        @NotNull Boolean tginitdeferred,
        @NotNull Short tgnargs,
        @NotNull Object[] tgattr,
        @NotNull byte[] tgargs,
        @Nullable Object tgqual,
        @Nullable String tgoldtable,
        @Nullable String tgnewtable
    ) {
        this.oid = oid;
        this.tgrelid = tgrelid;
        this.tgparentid = tgparentid;
        this.tgname = tgname;
        this.tgfoid = tgfoid;
        this.tgtype = tgtype;
        this.tgenabled = tgenabled;
        this.tgisinternal = tgisinternal;
        this.tgconstrrelid = tgconstrrelid;
        this.tgconstrindid = tgconstrindid;
        this.tgconstraint = tgconstraint;
        this.tgdeferrable = tgdeferrable;
        this.tginitdeferred = tginitdeferred;
        this.tgnargs = tgnargs;
        this.tgattr = tgattr;
        this.tgargs = tgargs;
        this.tgqual = tgqual;
        this.tgoldtable = tgoldtable;
        this.tgnewtable = tgnewtable;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.oid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return this.oid;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.oid</code>.
     */
    public void setOid(@NotNull Long oid) {
        this.oid = oid;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgrelid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTgrelid() {
        return this.tgrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgrelid</code>.
     */
    public void setTgrelid(@NotNull Long tgrelid) {
        this.tgrelid = tgrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgparentid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTgparentid() {
        return this.tgparentid;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgparentid</code>.
     */
    public void setTgparentid(@NotNull Long tgparentid) {
        this.tgparentid = tgparentid;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgname</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTgname() {
        return this.tgname;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgname</code>.
     */
    public void setTgname(@NotNull String tgname) {
        this.tgname = tgname;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgfoid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTgfoid() {
        return this.tgfoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgfoid</code>.
     */
    public void setTgfoid(@NotNull Long tgfoid) {
        this.tgfoid = tgfoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgtype</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getTgtype() {
        return this.tgtype;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgtype</code>.
     */
    public void setTgtype(@NotNull Short tgtype) {
        this.tgtype = tgtype;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgenabled</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getTgenabled() {
        return this.tgenabled;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgenabled</code>.
     */
    public void setTgenabled(@NotNull String tgenabled) {
        this.tgenabled = tgenabled;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgisinternal</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getTgisinternal() {
        return this.tgisinternal;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgisinternal</code>.
     */
    public void setTgisinternal(@NotNull Boolean tgisinternal) {
        this.tgisinternal = tgisinternal;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgconstrrelid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTgconstrrelid() {
        return this.tgconstrrelid;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgconstrrelid</code>.
     */
    public void setTgconstrrelid(@NotNull Long tgconstrrelid) {
        this.tgconstrrelid = tgconstrrelid;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgconstrindid</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTgconstrindid() {
        return this.tgconstrindid;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgconstrindid</code>.
     */
    public void setTgconstrindid(@NotNull Long tgconstrindid) {
        this.tgconstrindid = tgconstrindid;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgconstraint</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getTgconstraint() {
        return this.tgconstraint;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgconstraint</code>.
     */
    public void setTgconstraint(@NotNull Long tgconstraint) {
        this.tgconstraint = tgconstraint;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgdeferrable</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getTgdeferrable() {
        return this.tgdeferrable;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgdeferrable</code>.
     */
    public void setTgdeferrable(@NotNull Boolean tgdeferrable) {
        this.tgdeferrable = tgdeferrable;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tginitdeferred</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getTginitdeferred() {
        return this.tginitdeferred;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tginitdeferred</code>.
     */
    public void setTginitdeferred(@NotNull Boolean tginitdeferred) {
        this.tginitdeferred = tginitdeferred;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgnargs</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getTgnargs() {
        return this.tgnargs;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgnargs</code>.
     */
    public void setTgnargs(@NotNull Short tgnargs) {
        this.tgnargs = tgnargs;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgattr</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Object[] getTgattr() {
        return this.tgattr;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgattr</code>.
     */
    public void setTgattr(@NotNull Object[] tgattr) {
        this.tgattr = tgattr;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgargs</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public byte[] getTgargs() {
        return this.tgargs;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgargs</code>.
     */
    public void setTgargs(@NotNull byte[] tgargs) {
        this.tgargs = tgargs;
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
    public Object getTgqual() {
        return this.tgqual;
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
    public void setTgqual(@Nullable Object tgqual) {
        this.tgqual = tgqual;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgoldtable</code>.
     */
    @Nullable
    public String getTgoldtable() {
        return this.tgoldtable;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgoldtable</code>.
     */
    public void setTgoldtable(@Nullable String tgoldtable) {
        this.tgoldtable = tgoldtable;
    }

    /**
     * Getter for <code>pg_catalog.pg_trigger.tgnewtable</code>.
     */
    @Nullable
    public String getTgnewtable() {
        return this.tgnewtable;
    }

    /**
     * Setter for <code>pg_catalog.pg_trigger.tgnewtable</code>.
     */
    public void setTgnewtable(@Nullable String tgnewtable) {
        this.tgnewtable = tgnewtable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgTrigger other = (PgTrigger) obj;
        if (this.oid == null) {
            if (other.oid != null)
                return false;
        }
        else if (!this.oid.equals(other.oid))
            return false;
        if (this.tgrelid == null) {
            if (other.tgrelid != null)
                return false;
        }
        else if (!this.tgrelid.equals(other.tgrelid))
            return false;
        if (this.tgparentid == null) {
            if (other.tgparentid != null)
                return false;
        }
        else if (!this.tgparentid.equals(other.tgparentid))
            return false;
        if (this.tgname == null) {
            if (other.tgname != null)
                return false;
        }
        else if (!this.tgname.equals(other.tgname))
            return false;
        if (this.tgfoid == null) {
            if (other.tgfoid != null)
                return false;
        }
        else if (!this.tgfoid.equals(other.tgfoid))
            return false;
        if (this.tgtype == null) {
            if (other.tgtype != null)
                return false;
        }
        else if (!this.tgtype.equals(other.tgtype))
            return false;
        if (this.tgenabled == null) {
            if (other.tgenabled != null)
                return false;
        }
        else if (!this.tgenabled.equals(other.tgenabled))
            return false;
        if (this.tgisinternal == null) {
            if (other.tgisinternal != null)
                return false;
        }
        else if (!this.tgisinternal.equals(other.tgisinternal))
            return false;
        if (this.tgconstrrelid == null) {
            if (other.tgconstrrelid != null)
                return false;
        }
        else if (!this.tgconstrrelid.equals(other.tgconstrrelid))
            return false;
        if (this.tgconstrindid == null) {
            if (other.tgconstrindid != null)
                return false;
        }
        else if (!this.tgconstrindid.equals(other.tgconstrindid))
            return false;
        if (this.tgconstraint == null) {
            if (other.tgconstraint != null)
                return false;
        }
        else if (!this.tgconstraint.equals(other.tgconstraint))
            return false;
        if (this.tgdeferrable == null) {
            if (other.tgdeferrable != null)
                return false;
        }
        else if (!this.tgdeferrable.equals(other.tgdeferrable))
            return false;
        if (this.tginitdeferred == null) {
            if (other.tginitdeferred != null)
                return false;
        }
        else if (!this.tginitdeferred.equals(other.tginitdeferred))
            return false;
        if (this.tgnargs == null) {
            if (other.tgnargs != null)
                return false;
        }
        else if (!this.tgnargs.equals(other.tgnargs))
            return false;
        if (this.tgattr == null) {
            if (other.tgattr != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.tgattr, other.tgattr))
            return false;
        if (this.tgargs == null) {
            if (other.tgargs != null)
                return false;
        }
        else if (!Arrays.equals(this.tgargs, other.tgargs))
            return false;
        if (this.tgqual == null) {
            if (other.tgqual != null)
                return false;
        }
        else if (!this.tgqual.equals(other.tgqual))
            return false;
        if (this.tgoldtable == null) {
            if (other.tgoldtable != null)
                return false;
        }
        else if (!this.tgoldtable.equals(other.tgoldtable))
            return false;
        if (this.tgnewtable == null) {
            if (other.tgnewtable != null)
                return false;
        }
        else if (!this.tgnewtable.equals(other.tgnewtable))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.oid == null) ? 0 : this.oid.hashCode());
        result = prime * result + ((this.tgrelid == null) ? 0 : this.tgrelid.hashCode());
        result = prime * result + ((this.tgparentid == null) ? 0 : this.tgparentid.hashCode());
        result = prime * result + ((this.tgname == null) ? 0 : this.tgname.hashCode());
        result = prime * result + ((this.tgfoid == null) ? 0 : this.tgfoid.hashCode());
        result = prime * result + ((this.tgtype == null) ? 0 : this.tgtype.hashCode());
        result = prime * result + ((this.tgenabled == null) ? 0 : this.tgenabled.hashCode());
        result = prime * result + ((this.tgisinternal == null) ? 0 : this.tgisinternal.hashCode());
        result = prime * result + ((this.tgconstrrelid == null) ? 0 : this.tgconstrrelid.hashCode());
        result = prime * result + ((this.tgconstrindid == null) ? 0 : this.tgconstrindid.hashCode());
        result = prime * result + ((this.tgconstraint == null) ? 0 : this.tgconstraint.hashCode());
        result = prime * result + ((this.tgdeferrable == null) ? 0 : this.tgdeferrable.hashCode());
        result = prime * result + ((this.tginitdeferred == null) ? 0 : this.tginitdeferred.hashCode());
        result = prime * result + ((this.tgnargs == null) ? 0 : this.tgnargs.hashCode());
        result = prime * result + ((this.tgattr == null) ? 0 : Arrays.deepHashCode(this.tgattr));
        result = prime * result + ((this.tgargs == null) ? 0 : Arrays.hashCode(this.tgargs));
        result = prime * result + ((this.tgqual == null) ? 0 : this.tgqual.hashCode());
        result = prime * result + ((this.tgoldtable == null) ? 0 : this.tgoldtable.hashCode());
        result = prime * result + ((this.tgnewtable == null) ? 0 : this.tgnewtable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTrigger (");

        sb.append(oid);
        sb.append(", ").append(tgrelid);
        sb.append(", ").append(tgparentid);
        sb.append(", ").append(tgname);
        sb.append(", ").append(tgfoid);
        sb.append(", ").append(tgtype);
        sb.append(", ").append(tgenabled);
        sb.append(", ").append(tgisinternal);
        sb.append(", ").append(tgconstrrelid);
        sb.append(", ").append(tgconstrindid);
        sb.append(", ").append(tgconstraint);
        sb.append(", ").append(tgdeferrable);
        sb.append(", ").append(tginitdeferred);
        sb.append(", ").append(tgnargs);
        sb.append(", ").append(Arrays.deepToString(tgattr));
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(tgqual);
        sb.append(", ").append(tgoldtable);
        sb.append(", ").append(tgnewtable);

        sb.append(")");
        return sb.toString();
    }
}