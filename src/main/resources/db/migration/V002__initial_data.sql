insert into cart
values (nextval('cart_cart_id_seq'), 'MyCart1');

insert into items
values (nextval('items_item_id_seq'), 'Banana', 2),
(nextval('items_item_id_seq'), 'Apple', 3);

insert into cart_items
values (1,1);

insert into cart_items
values (1,2);