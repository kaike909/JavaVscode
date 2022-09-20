select * from cidades

insert into cidades 
    (nome, area, estado_id)
values 
    ('São Paulo', 1521, (select id from estados where sigla = 'SP')),
    ('Campinas', 795.7, (select id from estados where sigla = 'SP')),
    ('São Bernardo do Campo', 409.5, (select id from estados where sigla = 'SP')),
    ('Rio de Janeiro', 1200, (select id from estados where sigla = 'RJ')),
    ('São Gonçalo', 249, (select id from estados where sigla = 'RJ')),
    ('Duque de Caxias', 467.27, (select id from estados where sigla = 'RJ')),
    ('Serra', 547.6, (select id from estados where sigla = 'ES')),
    ('Vila Velha', 210, (select id from estados where sigla = 'ES')),
    ('Cariacica', 279.97, (select id from estados where sigla = 'ES')),
    ('Belo Horizonte', 331.4, (select id from estados where sigla = 'MG')),
    ('Uberlândia', 4.11, (select id from estados where sigla = 'MG')),
    ('Contagem', 195.04, (select id from estados where sigla = 'MG'));