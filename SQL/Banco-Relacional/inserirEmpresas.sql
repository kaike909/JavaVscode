alter table empresas modify cnpj varchar(14);

insert into empresas
    (nome, cnpj)
values
    ('Bradesco', 95694186000132),
    ('Itaú', 3218671000178),
    ('McDonalds', 75412896000156),
    ('Renner', 58901319000178),
    ('Vale', 32497553000198);


desc empresas;
desc prefeitos;
select * from empresas;
select * from cidades;
desc empresas_unidades;

insert into empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (1, 1, 0),
    (1, 2, 1),
    (1, 3, 0),
    (3, 6, 1);

select * from empresas_unidades;

insert into empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (2, 11, 0),
    (2, 1, 1),
    (2, 4, 0),
    (3, 1, 1),
    (3, 2, 0),
    (3, 3, 0),
    (3, 4, 0),
    (3, 5, 0),
    (3, 7, 0),
    (3, 8, 0),
    (3, 9, 0),
    (3, 10, 0),
    (3, 11, 0),
    (3, 12, 0),
    (5, 2, 1);