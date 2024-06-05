create table stack_overflow_questions
(
    id                   BIGINT    NOT NULL,
    link_id              BIGINT    NOT NULL REFERENCES link (id) ON DELETE CASCADE,
    last_activity_date   TIMESTAMP NOT NULL,
    answers_ids          BIGINT[]  NOT NULL,

    UNIQUE (link_id),
    PRIMARY KEY (id)
)
