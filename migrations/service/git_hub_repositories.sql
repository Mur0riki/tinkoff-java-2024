CREATE TABLE git_hub_repositories
(
    id                   bigint,
    link_id              BIGINT       NOT NULL REFERENCES link (id) ON DELETE CASCADE,
    name                 VARCHAR(128) NOT NULL,
    owner                VARCHAR(128) NOT NULL,
    updated_at           TIMESTAMP    NOT NULL,
    activities_ids       BIGINT[]     NOT NULL,

    UNIQUE (name, owner),
    PRIMARY KEY (id)
);
