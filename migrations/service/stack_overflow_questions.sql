create table stack_overflow_questions
(
    id                   bigint   not null,
    link_id              bigint   not null references links (id) on delete cascade,
    description_md5_hash text     not null,
    answers_ids          bigint[] not null,

    unique (link_id),
    primary key (id)
)
