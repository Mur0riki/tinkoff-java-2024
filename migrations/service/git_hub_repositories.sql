CREATE TABLE git_hub_repositories
(
    id                   BIGINT,      PRIMARY KEY
    link_id              BIGINT       NOT NULL REFERENCES link (id) ON DELETE CASCADE,
    name                 VARCHAR(128) NOT NULL UNIQUE,
    owner                VARCHAR(128) NOT NULL UNIQUE,
    description_md5_hash TEXT         NOT NULL,
    activities_ids       BIGINT[]     NOT NULL
)
