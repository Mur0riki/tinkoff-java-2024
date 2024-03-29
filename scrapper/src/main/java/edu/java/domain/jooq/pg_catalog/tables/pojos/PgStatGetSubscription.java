/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.OffsetDateTime;

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
public class PgStatGetSubscription implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long subid;
    private Long relid;
    private Integer pid;
    private Integer leaderPid;
    private Object receivedLsn;
    private OffsetDateTime lastMsgSendTime;
    private OffsetDateTime lastMsgReceiptTime;
    private Object latestEndLsn;
    private OffsetDateTime latestEndTime;

    public PgStatGetSubscription() {}

    public PgStatGetSubscription(PgStatGetSubscription value) {
        this.subid = value.subid;
        this.relid = value.relid;
        this.pid = value.pid;
        this.leaderPid = value.leaderPid;
        this.receivedLsn = value.receivedLsn;
        this.lastMsgSendTime = value.lastMsgSendTime;
        this.lastMsgReceiptTime = value.lastMsgReceiptTime;
        this.latestEndLsn = value.latestEndLsn;
        this.latestEndTime = value.latestEndTime;
    }

    @ConstructorProperties({ "subid", "relid", "pid", "leaderPid", "receivedLsn", "lastMsgSendTime", "lastMsgReceiptTime", "latestEndLsn", "latestEndTime" })
    public PgStatGetSubscription(
        @Nullable Long subid,
        @Nullable Long relid,
        @Nullable Integer pid,
        @Nullable Integer leaderPid,
        @Nullable Object receivedLsn,
        @Nullable OffsetDateTime lastMsgSendTime,
        @Nullable OffsetDateTime lastMsgReceiptTime,
        @Nullable Object latestEndLsn,
        @Nullable OffsetDateTime latestEndTime
    ) {
        this.subid = subid;
        this.relid = relid;
        this.pid = pid;
        this.leaderPid = leaderPid;
        this.receivedLsn = receivedLsn;
        this.lastMsgSendTime = lastMsgSendTime;
        this.lastMsgReceiptTime = lastMsgReceiptTime;
        this.latestEndLsn = latestEndLsn;
        this.latestEndTime = latestEndTime;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_subscription.subid</code>.
     */
    @Nullable
    public Long getSubid() {
        return this.subid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_subscription.subid</code>.
     */
    public void setSubid(@Nullable Long subid) {
        this.subid = subid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_subscription.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_subscription.relid</code>.
     */
    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_subscription.pid</code>.
     */
    @Nullable
    public Integer getPid() {
        return this.pid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_subscription.pid</code>.
     */
    public void setPid(@Nullable Integer pid) {
        this.pid = pid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_subscription.leader_pid</code>.
     */
    @Nullable
    public Integer getLeaderPid() {
        return this.leaderPid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_subscription.leader_pid</code>.
     */
    public void setLeaderPid(@Nullable Integer leaderPid) {
        this.leaderPid = leaderPid;
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
    public Object getReceivedLsn() {
        return this.receivedLsn;
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
    public void setReceivedLsn(@Nullable Object receivedLsn) {
        this.receivedLsn = receivedLsn;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_send_time</code>.
     */
    @Nullable
    public OffsetDateTime getLastMsgSendTime() {
        return this.lastMsgSendTime;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_send_time</code>.
     */
    public void setLastMsgSendTime(@Nullable OffsetDateTime lastMsgSendTime) {
        this.lastMsgSendTime = lastMsgSendTime;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_receipt_time</code>.
     */
    @Nullable
    public OffsetDateTime getLastMsgReceiptTime() {
        return this.lastMsgReceiptTime;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_receipt_time</code>.
     */
    public void setLastMsgReceiptTime(@Nullable OffsetDateTime lastMsgReceiptTime) {
        this.lastMsgReceiptTime = lastMsgReceiptTime;
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
    public Object getLatestEndLsn() {
        return this.latestEndLsn;
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
    public void setLatestEndLsn(@Nullable Object latestEndLsn) {
        this.latestEndLsn = latestEndLsn;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_get_subscription.latest_end_time</code>.
     */
    @Nullable
    public OffsetDateTime getLatestEndTime() {
        return this.latestEndTime;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_get_subscription.latest_end_time</code>.
     */
    public void setLatestEndTime(@Nullable OffsetDateTime latestEndTime) {
        this.latestEndTime = latestEndTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatGetSubscription other = (PgStatGetSubscription) obj;
        if (this.subid == null) {
            if (other.subid != null)
                return false;
        }
        else if (!this.subid.equals(other.subid))
            return false;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.leaderPid == null) {
            if (other.leaderPid != null)
                return false;
        }
        else if (!this.leaderPid.equals(other.leaderPid))
            return false;
        if (this.receivedLsn == null) {
            if (other.receivedLsn != null)
                return false;
        }
        else if (!this.receivedLsn.equals(other.receivedLsn))
            return false;
        if (this.lastMsgSendTime == null) {
            if (other.lastMsgSendTime != null)
                return false;
        }
        else if (!this.lastMsgSendTime.equals(other.lastMsgSendTime))
            return false;
        if (this.lastMsgReceiptTime == null) {
            if (other.lastMsgReceiptTime != null)
                return false;
        }
        else if (!this.lastMsgReceiptTime.equals(other.lastMsgReceiptTime))
            return false;
        if (this.latestEndLsn == null) {
            if (other.latestEndLsn != null)
                return false;
        }
        else if (!this.latestEndLsn.equals(other.latestEndLsn))
            return false;
        if (this.latestEndTime == null) {
            if (other.latestEndTime != null)
                return false;
        }
        else if (!this.latestEndTime.equals(other.latestEndTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.subid == null) ? 0 : this.subid.hashCode());
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.leaderPid == null) ? 0 : this.leaderPid.hashCode());
        result = prime * result + ((this.receivedLsn == null) ? 0 : this.receivedLsn.hashCode());
        result = prime * result + ((this.lastMsgSendTime == null) ? 0 : this.lastMsgSendTime.hashCode());
        result = prime * result + ((this.lastMsgReceiptTime == null) ? 0 : this.lastMsgReceiptTime.hashCode());
        result = prime * result + ((this.latestEndLsn == null) ? 0 : this.latestEndLsn.hashCode());
        result = prime * result + ((this.latestEndTime == null) ? 0 : this.latestEndTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatGetSubscription (");

        sb.append(subid);
        sb.append(", ").append(relid);
        sb.append(", ").append(pid);
        sb.append(", ").append(leaderPid);
        sb.append(", ").append(receivedLsn);
        sb.append(", ").append(lastMsgSendTime);
        sb.append(", ").append(lastMsgReceiptTime);
        sb.append(", ").append(latestEndLsn);
        sb.append(", ").append(latestEndTime);

        sb.append(")");
        return sb.toString();
    }
}
