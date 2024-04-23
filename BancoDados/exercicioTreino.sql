/*1*/
create table Setor
(
cod_setor int identity(1,1),
nome_setor varchar(30),
constraint PK_Setor Primary key (cod_setor)
)

/*2-3*/
create table Funcionario
(
nrmatricula int identity(1,1),
primeiro_nome varchar(20),
ultimo_nome varchar(50),
email varchar(200),
telefone varchar(20),
data_admissao datetime,
salario float,
setor_cod int,
constraint FK_Func_Cod_Setor Foreign Key(setor_cod) references Setor(cod_setor),
constraint PK_Funcionario Primary key (nrmatricula)
)

/*4*/
insert into Setor
values
('Administração'), ('Recursos Humanos'), ('Produção'), ('Logística'), ('Tecnologia da Informação')

/**/
insert into Funcionario
values
('Maria', 'Silva', 'maria_silva@example.com', '(11) 1234-5678', '2020-10-15', '6000', '1'),
('João', 'Santos', 'joao_santos@example.com', '(21) 9876-5432', '2018-07-20', '4800', '1'),
('Ana', 'Rodrigues', 'ana.rodrigues@example.com', '(31) 2468-1357', '2019-03-08', '5500', '2'),
('Carlos', 'Ferreira', 'cferreira@example.com', '(41) 3698-7412', '2021-06-30', '6200', '2'),
('Patrícia', 'Gomes', 'patricia_g@example.com', '(51) 98765-4321', '2017-12-05', '5200', '2'),
('Pedro', 'Machado', 'pmachado@example.com', '(62) 3333-3333', '2023-02-18', '5800', '3'),
('Camila', 'Oliveira', 'camila.o@example.com', '(55) 1111-2222', '2020-09-10', '5900', '3'),
('Ricardo', 'Costa', 'ricardo.costa@example.com', '(71) 7777-8888', '2018-04-25', '5000', '4'),
('Fernanda', 'Almeida', 'falmeida@example.com', '(81) 9999-9999', '2019-11-12', '5300', '5'),
('Lucas', 'Nunes', 'lucasnunes@example.com', '(91) 1234-5678', '2022-08-05', '6100', '5')

/*6a*/
select distinct setor_cod from Funcionario

/*6b*/
select ultimo_nome + ', ' + CONVERT(varchar, setor_cod) as 'Empregado e Setor' from Funcionario
