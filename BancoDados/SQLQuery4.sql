/*create table Cliente
(
cod_cli int not null,
nome_cli varchar(40) not null,
end_cli varchar(30) not null,
bai_cli varchar(20) not null,
cid_cli varchar(20) not null,
uf_cli varchar(3) not null,
tel_cli varchar(15) null,
constraint PK_Cliente Primary Key(cod_cli)
) 

CREATE TABLE NotaFiscal
(
num_nota int not null,
cod_cli int not null,
serie_nota varchar(10) not null,
emissao_nota smalldatetime null,
vtot_nota smallmoney not null,

constraint PK_NotaFiscal primary key(num_nota),
constraint FK_Cliente foreign key(cod_cli) References Cliente(cod_cli)
)

create table cidade
(
codCidade varchar(2) not null,
nomeCidade varchar(40)
)

create table Empregado(
numMatri int,
nome varchar(50),
dataDemissao datetime,
salario float
)

create table estado
(cdEstado varchar(2) not null,
nomeEstado varchar(30))
CRIAÇÃO DE TABELA */

/*alter table cidade
add primary key(codCidade);

alter table cidade
add cdEstado char(2) not null,
teste varchar(1);

Alter table cidade
drop column teste;

alter table cidade 
alter column cdEstado varchar(2);


alter table cidade
drop constraint PK__cidade__0FC85A0B376E06D6;


alter table cidade 
add constraint pk_codcidade primary key(codcidade);

alter table estado
add primary key (cdEstado);

alter table cidade 
add foreign key (cdestado) references estado(cdestado);
ALTERAÇÃO DE TABELA*/

/*drop table empregado;
EXCLUIR TABELA*/
