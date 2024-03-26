create table git_hub_repositories
(
    id                   bigint primary key,
    link_id              bigint not null references link (id) on delete cascade,
    name                 varchar(128) not null,
    owner                varchar(128) not null,
    updated_at           timestamp     not null,
    activities_ids       bigint[]     not null
)
