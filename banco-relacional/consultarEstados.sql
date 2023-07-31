SELECT * FROM estados

SELECT
    Sigla,
    nome as 'Nome do Estado'
FROM
    estados 
WHERE
    regiao = 'Sul'

select 
    nome,
    regiao,
    populacao
from estados
WHERE populacao >= 10
order by populacao desc
