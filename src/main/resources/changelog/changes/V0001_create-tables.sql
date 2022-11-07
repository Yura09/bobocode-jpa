create table if not exists notes
(
    id           bigint primary key,
    body         varchar(255) not null
);