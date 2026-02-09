create table wishlist
(
    user_id    bigint not null,
    product_id bigint not null,
    constraint wishlist_pk
        primary key (product_id, user_id),
    constraint product_fk
        foreign key (product_id) references products (id)
            on delete cascade,
    constraint user_id_fk
        foreign key (user_id) references users (id)
            on delete cascade
);