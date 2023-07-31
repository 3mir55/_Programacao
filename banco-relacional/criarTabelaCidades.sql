create table if not exists cidades (
    id int unsigned not null AUTO_INCREMENT,
    nome VARCHAR(255) not null,
    estado_id int unsigned NOT NULL,
    area DECIMAL(10,2),
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) references `estados` (id)
);

-- create table if not exists teste (
--    id int unsigned not null AUTO_INCREMENT primary key
-- );

-- drop table if exists teste