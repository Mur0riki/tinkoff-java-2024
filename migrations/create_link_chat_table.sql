CREATE TABLE link_chat
(
    chat_id    BIGINT    NOT NULL REFERENCES chat (id) ON DELETE CASCADE,
    link_id    BIGINT    NOT NULL REFERENCES link (id) ON DELETE CASCADE,
    created_at TIMESTAMP NOT NULL DEFAULT '1970-01-01 00:00:00',

    PRIMARY KEY (chat_id,link_id),
    UNIQUE (chat_id, link_id)
)
