CREATE TABLE link
(
    id              BIGINT    GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    url             TEXT      NOT NULL UNIQUE,
    created_at      TIMESTAMP NOT NULL,
    last_checked_at TIMESTAMP NOT NULL DEFAULT '1970-01-01 00:00:00'
)
