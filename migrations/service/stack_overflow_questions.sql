create table stack_overflow_questions
(
    id                   bigint     not null primary key,
    link_id              bigint     not null references link (id) on delete cascade unique,
    last_activity_date   timestamp  not null,
    answers_ids          bigint[]   not null,
)
