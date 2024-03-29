/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables;


import edu.java.domain.jooq.public_.Keys;
import edu.java.domain.jooq.public_.Public;
import edu.java.domain.jooq.public_.tables.records.StackOverflowQuestionsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class StackOverflowQuestions extends TableImpl<StackOverflowQuestionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.stack_overflow_questions</code>
     */
    public static final StackOverflowQuestions STACK_OVERFLOW_QUESTIONS = new StackOverflowQuestions();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<StackOverflowQuestionsRecord> getRecordType() {
        return StackOverflowQuestionsRecord.class;
    }

    /**
     * The column <code>public.stack_overflow_questions.id</code>.
     */
    public final TableField<StackOverflowQuestionsRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.stack_overflow_questions.link_id</code>.
     */
    public final TableField<StackOverflowQuestionsRecord, Long> LINK_ID = createField(DSL.name("link_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>public.stack_overflow_questions.last_activity_date</code>.
     */
    public final TableField<StackOverflowQuestionsRecord, LocalDateTime> LAST_ACTIVITY_DATE = createField(DSL.name("last_activity_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.stack_overflow_questions.answers_ids</code>.
     */
    public final TableField<StackOverflowQuestionsRecord, Long[]> ANSWERS_IDS = createField(DSL.name("answers_ids"), SQLDataType.BIGINT.nullable(false).array(), this, "");

    private StackOverflowQuestions(Name alias, Table<StackOverflowQuestionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private StackOverflowQuestions(Name alias, Table<StackOverflowQuestionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.stack_overflow_questions</code> table
     * reference
     */
    public StackOverflowQuestions(String alias) {
        this(DSL.name(alias), STACK_OVERFLOW_QUESTIONS);
    }

    /**
     * Create an aliased <code>public.stack_overflow_questions</code> table
     * reference
     */
    public StackOverflowQuestions(Name alias) {
        this(alias, STACK_OVERFLOW_QUESTIONS);
    }

    /**
     * Create a <code>public.stack_overflow_questions</code> table reference
     */
    public StackOverflowQuestions() {
        this(DSL.name("stack_overflow_questions"), null);
    }

    public <O extends Record> StackOverflowQuestions(Table<O> child, ForeignKey<O, StackOverflowQuestionsRecord> key) {
        super(child, key, STACK_OVERFLOW_QUESTIONS);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @NotNull
    public UniqueKey<StackOverflowQuestionsRecord> getPrimaryKey() {
        return Keys.STACK_OVERFLOW_QUESTIONS_PKEY;
    }

    @Override
    @NotNull
    public List<UniqueKey<StackOverflowQuestionsRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.STACK_OVERFLOW_QUESTIONS_LINK_ID_KEY);
    }

    @Override
    @NotNull
    public List<ForeignKey<StackOverflowQuestionsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.STACK_OVERFLOW_QUESTIONS__STACK_OVERFLOW_QUESTIONS_LINK_ID_FKEY);
    }

    private transient Link _link;

    /**
     * Get the implicit join path to the <code>public.link</code> table.
     */
    public Link link() {
        if (_link == null)
            _link = new Link(this, Keys.STACK_OVERFLOW_QUESTIONS__STACK_OVERFLOW_QUESTIONS_LINK_ID_FKEY);

        return _link;
    }

    @Override
    @NotNull
    public StackOverflowQuestions as(String alias) {
        return new StackOverflowQuestions(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public StackOverflowQuestions as(Name alias) {
        return new StackOverflowQuestions(alias, this);
    }

    @Override
    @NotNull
    public StackOverflowQuestions as(Table<?> alias) {
        return new StackOverflowQuestions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public StackOverflowQuestions rename(String name) {
        return new StackOverflowQuestions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public StackOverflowQuestions rename(Name name) {
        return new StackOverflowQuestions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public StackOverflowQuestions rename(Table<?> name) {
        return new StackOverflowQuestions(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Long, Long, LocalDateTime, Long[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super Long, ? super LocalDateTime, ? super Long[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super Long, ? super LocalDateTime, ? super Long[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
