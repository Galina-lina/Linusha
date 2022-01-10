DROP TABLE IF EXISTS product CASCADE;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE product
(
        id       INTEGER PRIMARY KEY DEFAULT nextval ('global_seq'),
        name     VARCHAR         NOT NULL,
        brand    VARCHAR         NOT NULL,
        price    INTEGER         NOT NULL,
        quantity INTEGER         NOT NULL
);

INSERT INTO public.product (name, brand, price, quantity) VALUES ('Harry Potter', 'Rosmen', 100, 2);
INSERT INTO public.product (name, brand, price, quantity) VALUES ('Home alone', 'AST', 120,50);
INSERT INTO public.product (name, brand, price, quantity) VALUES ('The Little Prince', 'AST', 55, 20);
INSERT INTO public.product (name, brand, price, quantity) VALUES ('Notre-Dame de Paris', 'world books',289, 56);
