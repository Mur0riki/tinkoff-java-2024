/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables;


import edu.java.domain.jooq.public_.Keys;
import edu.java.domain.jooq.public_.Public;
import edu.java.domain.jooq.public_.tables.records.GitHubRepositoriesRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


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
public class GitHubRepositories extends TableImpl<GitHubRepositoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.git_hub_repositories</code>
     */
    public static final GitHubRepositories GIT_HUB_REPOSITORIES = new GitHubRepositories();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<GitHubRepositoriesRecord> getRecordType() {
        return GitHubRepositoriesRecord.class;
    }

    /**
     * The column <code>public.git_hub_repositories.id</code>.
     */
    public final TableField<GitHubRepositoriesRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.git_hub_repositories.link_id</code>.
     */
    public final TableField<GitHubRepositoriesRecord, Long> LINK_ID = createField(DSL.name("link_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.git_hub_repositories.name</code>.
     */
    public final TableField<GitHubRepositoriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.git_hub_repositories.owner</code>.
     */
    public final TableField<GitHubRepositoriesRecord, String> OWNER = createField(DSL.name("owner"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.git_hub_repositories.updated_at</code>.
     */
    public final TableField<GitHubRepositoriesRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.git_hub_repositories.activities_ids</code>.
     */
    public final TableField<GitHubRepositoriesRecord, Long[]> ACTIVITIES_IDS = createField(DSL.name("activities_ids"), SQLDataType.BIGINT.nullable(false).array(), this, "");

    private GitHubRepositories(Name alias, Table<GitHubRepositoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private GitHubRepositories(Name alias, Table<GitHubRepositoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.git_hub_repositories</code> table
     * reference
     */
    public GitHubRepositories(String alias) {
        this(DSL.name(alias), GIT_HUB_REPOSITORIES);
    }

    /**
     * Create an aliased <code>public.git_hub_repositories</code> table
     * reference
     */
    public GitHubRepositories(Name alias) {
        this(alias, GIT_HUB_REPOSITORIES);
    }

    /**
     * Create a <code>public.git_hub_repositories</code> table reference
     */
    public GitHubRepositories() {
        this(DSL.name("git_hub_repositories"), null);
    }

    public <O extends Record> GitHubRepositories(Table<O> child, ForeignKey<O, GitHubRepositoriesRecord> key) {
        super(child, key, GIT_HUB_REPOSITORIES);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @NotNull
    public UniqueKey<GitHubRepositoriesRecord> getPrimaryKey() {
        return Keys.GIT_HUB_REPOSITORIES_PKEY;
    }

    @Override
    @NotNull
    public List<ForeignKey<GitHubRepositoriesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.GIT_HUB_REPOSITORIES__GIT_HUB_REPOSITORIES_LINK_ID_FKEY);
    }

    private transient Link _link;

    /**
     * Get the implicit join path to the <code>public.link</code> table.
     */
    public Link link() {
        if (_link == null)
            _link = new Link(this, Keys.GIT_HUB_REPOSITORIES__GIT_HUB_REPOSITORIES_LINK_ID_FKEY);

        return _link;
    }

    @Override
    @NotNull
    public GitHubRepositories as(String alias) {
        return new GitHubRepositories(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public GitHubRepositories as(Name alias) {
        return new GitHubRepositories(alias, this);
    }

    @Override
    @NotNull
    public GitHubRepositories as(Table<?> alias) {
        return new GitHubRepositories(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public GitHubRepositories rename(String name) {
        return new GitHubRepositories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public GitHubRepositories rename(Name name) {
        return new GitHubRepositories(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public GitHubRepositories rename(Table<?> name) {
        return new GitHubRepositories(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<Long, Long, String, String, LocalDateTime, Long[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Long, ? super Long, ? super String, ? super String, ? super LocalDateTime, ? super Long[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super Long, ? super String, ? super String, ? super LocalDateTime, ? super Long[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}