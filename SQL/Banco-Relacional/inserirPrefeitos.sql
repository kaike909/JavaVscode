insert into prefeitos
    (nome, cidade_id)
values
    ('Ricardo Nunes', (select id from cidades where nome = 'São Paulo')),
    ('Dário Saadi', (select id from cidades where nome = 'Campinas')),
    ('Orlando Morando', (select id from cidades where nome = 'São Bernardo do Campo')),
    ('Eduardo Paes', (select id from cidades where nome = 'Rio de Janeiro')),
    ('Nelson Ruas dos Santos', (select id from cidades where nome = 'São Gonçalo')),
    ('Wilson Miguel', (select id from cidades where nome = 'Duque de Caxias')),
    ('Antonio Vidigal', (select id from cidades where nome = 'Serra')),
    ('Arnaldo Borgo Filho', (select id from cidades where nome = 'Vila Velha')),
    ('Euclerio Sampaio Jr', (select id from cidades where nome = 'Cariacica')),
    ('Fuad Noman', (select id from cidades where nome = 'Belo Horizonte')),
    ('Odelmo Leão', (select id from cidades where nome = 'Uberlândia')),
    ('Marília Campos', (select id from cidades where nome = 'Contagem'));
