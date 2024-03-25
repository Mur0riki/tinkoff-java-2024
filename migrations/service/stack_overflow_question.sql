CREATE TABLE stack_overflow_questions
(
    id                   BIGINT   NOT NULL PRIMARY KEY,
    link_id              BIGINT   NOT NULL REFERENCES link (id) ON DELETE CASCADE UNIQUE,
    description_md5_hash TEXT     NOT NULL,
    answers_ids          BIGINT[] NOT NULL,
)
