SELECT * from estados

select sigla, nome as 'Nome do Estado' from estados
where regiao = 'Sudeste'

select 
    id,
    nome,
    regiao,
    populacao
from estados
where populacao >= 10
order by populacao desc