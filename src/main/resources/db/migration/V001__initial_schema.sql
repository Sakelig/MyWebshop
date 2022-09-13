create table cart
(
    cart_id     serial primary key,
    cart_name   varchar(256) not null
);

create table items
(
    item_id         serial primary key,
    item_name       varchar(256) not null,
    item_quantity   bigint  not null
);

create table cart_items
(
    cart_id bigint,
    item_id bigint
);