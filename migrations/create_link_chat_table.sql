create table link_chat
(
    id      bigint generated always as identity primary key,
    chat_id bigint not null references chat (id) on delete cascade unique,
    link_id bigint not null references link (id) on delete cascade unique,
    created_at timestamp not null
)
