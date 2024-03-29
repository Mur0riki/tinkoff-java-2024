create table link
(
    id              bigint generated always as identity primary key,
    url             text      not null unique,
    created_at      timestamp not null,
    last_checked_at timestamp not null default '1970-01-01 00:00:00'
)
