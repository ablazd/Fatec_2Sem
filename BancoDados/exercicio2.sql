/*Exercicio 1*/
create table Tbl_Clientes
(
ID_Cli int identity(1,1) not null,
Nome_Cli varchar(50) not null,
Email_Cli varchar(100) not null,
Telefone_Cli varchar(15) not null,
constraint PK_Clientes Primary Key (ID_Cli)
)

/*Exercicio 2*/
insert into Tbl_Clientes
values
('João Silva', 'joao@email.com', '(11) 1234-5678')

/*Exercicio 3*/
insert into Tbl_Clientes
values
('Maria Silva', 'maria.silva@example.com',  '(11) 1234-5678'),
('João Santos', 'joao.santos@example.com',  '(11) 1334-5678'),
('Ana Oliveira', 'ana.oliveira@example.com',  '(11) 1434-5678'),
('Pedro Souza', 'mpedro.souza@example.com',  '(11) 1534-5678'),
('Carolina Pereira', 'carolzinha@example.com',  '(11) 1634-5678'),
('Lucas Almeida', 'lucas@example.com',  '(11) 1734-5678'),
('Juliana Costa', 'juliana@example.com',  '(11) 1834-5678'),
('Rafaela Fernandes', 'rafa@example.com',  '(11) 1934-7678'),
('Gabriel Lima', 'lima@example.com',  '(11) 1234-8678'),
('Fernanda Gomes', 'fernanda@example.com',  '(11) 1234-9678');

/*Exercicio 4*/
update Tbl_Clientes
set Telefone_Cli = '(11) 8765-4321'
where ID_Cli = '1'

/*Exercicio 5*/
create table Tbl_Produtos
(
ID_Prod int identity(1,1) not null,
Nome_Prod varchar(50) not null,
Preco_Prod decimal(7,2) not null,
Estoque_Prod int not null,
constraint PK_Produtos Primary Key (ID_Prod)
)

/*Exercicio 6*/
insert into Tbl_Produtos
values
('Camiseta', '29.99', '100')

/*Exercicio 7*/
insert into Tbl_Produtos
values
('Calça Jeans', 89.90, 150),
('Vestido Floral', 79.99, 120),
('Blusa de Moletom', 59.99, 200),
('Camisa Social', 69.90, 90),
('Jaqueta Corta-Vento', 99.99, 80),
('Shorts Jeans', 49.90, 180),
('Blazer Feminino', 129.90, 70),
('Calça Legging', 39.90, 160),
('Tênis Esportivo', 119.99, 110),
('Saia Midi', 69.90, 140);

/*Exercicio 8*/
update Tbl_Produtos
set Preco_Prod = '39.99'
where ID_Prod = '1'

/*Exercicio 9*/
create table Tbl_Pedidos
(
ID_Pedido int identity(1,1) not null,
Cliente_ID int not null,
Produto_ID int not null,
Qtd_Pedido int not null,
Data_Pedido Date not null,
constraint PK_Pedidos Primary Key (ID_Pedido),
constraint FK_Cli_Pedido Foreign Key(Cliente_ID) references Tbl_Clientes(ID_Cli),
constraint FK_Prod_Pedido Foreign Key(Produto_ID) references Tbl_Produtos(ID_Prod)
)

/*Exercicio 10*/
insert into Tbl_Pedidos
values
('1', '1', '2', GETDATE())

/*Exercicio 11*/
insert into Tbl_Pedidos
values
(2, 3, 2, GETDATE()),
(4, 5, 1, GETDATE()),
(1, 7, 3, GETDATE()),
(3, 9, 1, GETDATE()),
(5, 2, 2, GETDATE()),
(2, 8, 1, GETDATE()),
(4, 4, 2, GETDATE()),
(1, 1, 1, GETDATE()),
(3, 6, 2, GETDATE()),
(5, 10, 1, GETDATE());

/*Exercicio 12*/
update Tbl_Pedidos
set Qtd_Pedido = '3'
where ID_Pedido = '1'

/*Exercicio 13*/
create table Tbl_Funcionarios
(
ID_Func int identity(1,1) not null,
Nome_Func varchar(50) not null,
Cargo_Func varchar(50) not null,
Salario_Func decimal(7,2) not null,
constraint PK_Funcionario Primary Key (ID_Func)
)

/*Exercicio 14*/
insert into Tbl_Funcionarios
values
('Maria Santos', 'Gerente', '5000')

/*Exercicio 15*/
update Tbl_Funcionarios
set Salario_Func = '6000'
where ID_Func = '1'

/*Exercicio 16*/
insert into Tbl_Funcionarios (Nome_Func, Cargo_Func, Salario_Func)
values
('João Oliveira', 'Vendedor', 3000),
('Ana Silva', 'Assistente de Vendas', 2500),
('Pedro Costa', 'Analista de Marketing', 4000),
('Mariana Ferreira', 'Estoquista', 2800),
('Carlos Rodrigues', 'Atendente', 2600),
('Larissa Martins', 'Caixa', 2700),
('Lucas Almeida', 'Designer Gráfico', 3800),
('Fernanda Sousa', 'Assistente Administrativo', 3200),
('Rafaela Gonçalves', 'Analista de Recursos Humanos', 4200),
('Gustavo Santos', 'Técnico de Informática', 3500);

/*Exercicio 17*/
create table Tbl_Vendas
(
ID_Venda int identity(1,1) not null,
Prod_ID int not null,
Qtd_Venda int not null,
Valor_Total decimal(7,2),
Data_Venda Date,
constraint PK_Vendas Primary Key (ID_Venda),
constraint FK_Prod_Venda Foreign Key(Prod_ID) references Tbl_Produtos(ID_Prod)
)

/*Exercicio 18*/
insert into Tbl_Vendas
values
('1', '2', '79.98', GETDATE())

/*Exercicio 19*/
insert into Tbl_Vendas
values
(3, 3, 239.97, GETDATE()),
(6, 2, 119.98, GETDATE()),
(2, 4, 239.96, GETDATE()),
(7, 1, 49.90, GETDATE()),
(10, 2, 139.80, GETDATE()),
(1, 5, 149.95, GETDATE()),
(8, 3, 389.70, GETDATE()),
(4, 2, 139.98, GETDATE()),
(9, 1, 39.90, GETDATE()),
(5, 4, 399.96, GETDATE());

/*Exercicio 20*/
delete from Tbl_Vendas
where ID_Venda = '1'

