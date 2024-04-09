/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


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
public class PgStatProgressCluster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;
    private Long datid;
    private String datname;
    private Long relid;
    private String command;
    private String phase;
    private Long clusterIndexRelid;
    private Long heapTuplesScanned;
    private Long heapTuplesWritten;
    private Long heapBlksTotal;
    private Long heapBlksScanned;
    private Long indexRebuildCount;

    public PgStatProgressCluster() {}

    public PgStatProgressCluster(PgStatProgressCluster value) {
        this.pid = value.pid;
        this.datid = value.datid;
        this.datname = value.datname;
        this.relid = value.relid;
        this.command = value.command;
        this.phase = value.phase;
        this.clusterIndexRelid = value.clusterIndexRelid;
        this.heapTuplesScanned = value.heapTuplesScanned;
        this.heapTuplesWritten = value.heapTuplesWritten;
        this.heapBlksTotal = value.heapBlksTotal;
        this.heapBlksScanned = value.heapBlksScanned;
        this.indexRebuildCount = value.indexRebuildCount;
    }

    @ConstructorProperties({ "pid", "datid", "datname", "relid", "command", "phase", "clusterIndexRelid", "heapTuplesScanned", "heapTuplesWritten", "heapBlksTotal", "heapBlksScanned", "indexRebuildCount" })
    public PgStatProgressCluster(
        @Nullable Integer pid,
        @Nullable Long datid,
        @Nullable String datname,
        @Nullable Long relid,
        @Nullable String command,
        @Nullable String phase,
        @Nullable Long clusterIndexRelid,
        @Nullable Long heapTuplesScanned,
        @Nullable Long heapTuplesWritten,
        @Nullable Long heapBlksTotal,
        @Nullable Long heapBlksScanned,
        @Nullable Long indexRebuildCount
    ) {
        this.pid = pid;
        this.datid = datid;
        this.datname = datname;
        this.relid = relid;
        this.command = command;
        this.phase = phase;
        this.clusterIndexRelid = clusterIndexRelid;
        this.heapTuplesScanned = heapTuplesScanned;
        this.heapTuplesWritten = heapTuplesWritten;
        this.heapBlksTotal = heapBlksTotal;
        this.heapBlksScanned = heapBlksScanned;
        this.indexRebuildCount = indexRebuildCount;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.pid</code>.
     */
    @Nullable
    public Integer getPid() {
        return this.pid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.pid</code>.
     */
    public void setPid(@Nullable Integer pid) {
        this.pid = pid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.datid</code>.
     */
    @Nullable
    public Long getDatid() {
        return this.datid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.datid</code>.
     */
    public void setDatid(@Nullable Long datid) {
        this.datid = datid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.datname</code>.
     */
    @Nullable
    public String getDatname() {
        return this.datname;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.datname</code>.
     */
    public void setDatname(@Nullable String datname) {
        this.datname = datname;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.relid</code>.
     */
    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.relid</code>.
     */
    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.command</code>.
     */
    @Nullable
    public String getCommand() {
        return this.command;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.command</code>.
     */
    public void setCommand(@Nullable String command) {
        this.command = command;
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.phase</code>.
     */
    @Nullable
    public String getPhase() {
        return this.phase;
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.phase</code>.
     */
    public void setPhase(@Nullable String phase) {
        this.phase = phase;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.cluster_index_relid</code>.
     */
    @Nullable
    public Long getClusterIndexRelid() {
        return this.clusterIndexRelid;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.cluster_index_relid</code>.
     */
    public void setClusterIndexRelid(@Nullable Long clusterIndexRelid) {
        this.clusterIndexRelid = clusterIndexRelid;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_scanned</code>.
     */
    @Nullable
    public Long getHeapTuplesScanned() {
        return this.heapTuplesScanned;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_scanned</code>.
     */
    public void setHeapTuplesScanned(@Nullable Long heapTuplesScanned) {
        this.heapTuplesScanned = heapTuplesScanned;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_written</code>.
     */
    @Nullable
    public Long getHeapTuplesWritten() {
        return this.heapTuplesWritten;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_written</code>.
     */
    public void setHeapTuplesWritten(@Nullable Long heapTuplesWritten) {
        this.heapTuplesWritten = heapTuplesWritten;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_total</code>.
     */
    @Nullable
    public Long getHeapBlksTotal() {
        return this.heapBlksTotal;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_total</code>.
     */
    public void setHeapBlksTotal(@Nullable Long heapBlksTotal) {
        this.heapBlksTotal = heapBlksTotal;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_scanned</code>.
     */
    @Nullable
    public Long getHeapBlksScanned() {
        return this.heapBlksScanned;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_scanned</code>.
     */
    public void setHeapBlksScanned(@Nullable Long heapBlksScanned) {
        this.heapBlksScanned = heapBlksScanned;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.index_rebuild_count</code>.
     */
    @Nullable
    public Long getIndexRebuildCount() {
        return this.indexRebuildCount;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.index_rebuild_count</code>.
     */
    public void setIndexRebuildCount(@Nullable Long indexRebuildCount) {
        this.indexRebuildCount = indexRebuildCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatProgressCluster other = (PgStatProgressCluster) obj;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.datid == null) {
            if (other.datid != null)
                return false;
        }
        else if (!this.datid.equals(other.datid))
            return false;
        if (this.datname == null) {
            if (other.datname != null)
                return false;
        }
        else if (!this.datname.equals(other.datname))
            return false;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.command == null) {
            if (other.command != null)
                return false;
        }
        else if (!this.command.equals(other.command))
            return false;
        if (this.phase == null) {
            if (other.phase != null)
                return false;
        }
        else if (!this.phase.equals(other.phase))
            return false;
        if (this.clusterIndexRelid == null) {
            if (other.clusterIndexRelid != null)
                return false;
        }
        else if (!this.clusterIndexRelid.equals(other.clusterIndexRelid))
            return false;
        if (this.heapTuplesScanned == null) {
            if (other.heapTuplesScanned != null)
                return false;
        }
        else if (!this.heapTuplesScanned.equals(other.heapTuplesScanned))
            return false;
        if (this.heapTuplesWritten == null) {
            if (other.heapTuplesWritten != null)
                return false;
        }
        else if (!this.heapTuplesWritten.equals(other.heapTuplesWritten))
            return false;
        if (this.heapBlksTotal == null) {
            if (other.heapBlksTotal != null)
                return false;
        }
        else if (!this.heapBlksTotal.equals(other.heapBlksTotal))
            return false;
        if (this.heapBlksScanned == null) {
            if (other.heapBlksScanned != null)
                return false;
        }
        else if (!this.heapBlksScanned.equals(other.heapBlksScanned))
            return false;
        if (this.indexRebuildCount == null) {
            if (other.indexRebuildCount != null)
                return false;
        }
        else if (!this.indexRebuildCount.equals(other.indexRebuildCount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.datid == null) ? 0 : this.datid.hashCode());
        result = prime * result + ((this.datname == null) ? 0 : this.datname.hashCode());
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.command == null) ? 0 : this.command.hashCode());
        result = prime * result + ((this.phase == null) ? 0 : this.phase.hashCode());
        result = prime * result + ((this.clusterIndexRelid == null) ? 0 : this.clusterIndexRelid.hashCode());
        result = prime * result + ((this.heapTuplesScanned == null) ? 0 : this.heapTuplesScanned.hashCode());
        result = prime * result + ((this.heapTuplesWritten == null) ? 0 : this.heapTuplesWritten.hashCode());
        result = prime * result + ((this.heapBlksTotal == null) ? 0 : this.heapBlksTotal.hashCode());
        result = prime * result + ((this.heapBlksScanned == null) ? 0 : this.heapBlksScanned.hashCode());
        result = prime * result + ((this.indexRebuildCount == null) ? 0 : this.indexRebuildCount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatProgressCluster (");

        sb.append(pid);
        sb.append(", ").append(datid);
        sb.append(", ").append(datname);
        sb.append(", ").append(relid);
        sb.append(", ").append(command);
        sb.append(", ").append(phase);
        sb.append(", ").append(clusterIndexRelid);
        sb.append(", ").append(heapTuplesScanned);
        sb.append(", ").append(heapTuplesWritten);
        sb.append(", ").append(heapBlksTotal);
        sb.append(", ").append(heapBlksScanned);
        sb.append(", ").append(indexRebuildCount);

        sb.append(")");
        return sb.toString();
    }
}