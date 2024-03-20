create table Setor 
(codSetor int primary key,
nomeSetor varchar(30) not null);

create table Funcionario 
(nrMatricula int,
primeiroNome varchar(20),
ultimoNome varchar(50),
email varchar(200),
telefone varchar(20),
dataAdmissao datetime,
salario float,
codSetor int,
constraint PK_Funcionario Primary Key (nrMatricula),
constraint FK_Func_Setor Foreign Key(codSetor) references Setor(codSetor));

insert into Setor
values
(1, 'Vendas'),
(2, 'Recursos Humanos'),
(3, 'Financeiro'),
(4, 'Produção'),
(5, 'Logística');


insert into Funcionario 
values /*(nrMatricula, primeiroNome, ultimoNome, email, telefone, dataAdmissao, salario, codSetor)*/
(1, 'João', 'Silva', 'joao.silva@example.com', '123456789', '2023-01-10', 3000.00, 1),
(2, 'Maria', 'Oliveira', 'maria.oliveira@example.com', '987654321', '2022-03-15', 3500.00, 2),
(3, 'José', 'Santos', 'jose.santos@example.com', '111222333', '2021-07-20', 4000.00, 3),
(4, 'Ana', 'Souza', 'ana.souza@example.com', '444555666', '2020-12-05', 3200.00, 1),
(5, 'Pedro', 'Ferreira', 'pedro.ferreira@example.com', '777888999', '2023-05-18', 3800.00, 2),
(6, 'Carolina', 'Lima', 'carolina.lima@example.com', '222333444', '2022-09-30', 4200.00, 3),
(7, 'Lucas', 'Almeida', 'lucas.almeida@example.com', '555666777', '2021-11-25', 3500.00, 1),
(8, 'Fernanda', 'Gomes', 'fernanda.gomes@example.com', '888999000', '2020-08-12', 3900.00, 2);