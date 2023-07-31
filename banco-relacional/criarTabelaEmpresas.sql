create table if not exists empresas (
    id INT unsigned not null auto_increment,
    nome varchar(255) NOT NULL,
    cnpj int unsigned,
    primary key (id),
    unique key (cnpj)
);

-- cidades_empresas
create table if not exists empresas_unidades (
    empresa_id INT unsigned not null,
    cidade_id INT unsigned not null,
    sede tinyint(1) NOT NULL,
    primary key (empresa_id, cidade_id)
);