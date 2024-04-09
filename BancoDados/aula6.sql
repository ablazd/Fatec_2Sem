//seleções
 
select primeiroNome, salario, codSetor
from Funcionario
where primeiroNome like '%M%'

select cod_produto, descricao, unidade
from produto 
where unidade like 'K%'

select nome_vendedor
from vendedor
where faixa_comissao in ('A','B')

select primeiroNome
from Funcionario
where codSetor in (1,3)

select * 
from cliente
where ie is not null

select primeiroNome, salario, codSetor, email
from Funcionario
where email is not null

select nrMatricula, ultimoNome, salario
from Funcionario
where salario > 1000 and nrMatricula >=3

select * 
from Funcionario
where salario > 2500 or codSetor = 4

select descricao
from produto
where unidade = 'M' and valor_unitario =1.05

select descricao
from produto
where unidade ='UN' and Valor_unitario =4

select nome_vendedor, salario_fixo
from vendedor
order by nome_vendedor

select *
from Funcionario
where codSetor not in (2,4)
order by codSetor desc /*desc = ordem descrescente*/

select *
from Funcionario
where codSetor not in (2,4)
order by codSetor, primeiroNome

select *
from Funcionario
where codSetor not in (2,4)
order by codSetor, primeiroNome 
/*ordenar poe dois parametros, no exemplo separa por setor e
dentro do setor esta em ordem*/

create table Pessoa (
idPessoa integer primary key,
nomePessoa varchar(20),
cpf varchar(14));

Insert into Pessoa values (1, 'Pedro Pascal', '12345678990'),(2, 'Bela Ramsay', '123456907772');

create table Pessoa_Fisica (
idPessoa integer primary key,
nomePessoa varchar(20),
cpf varchar(14));

insert into Pessoa_Fisica select idPessoa, nomePessoa, cpf from Pessoa;
/*insert os itens de outra tabela em outra sem reescrevê-los*/

select Funcionario.primeiroNome,Funcionario.salario, Setor.nomeSetor
from Funcionario, Setor
where Funcionario.codSetor = Setor.codSetor

select f.primeiroNome, f.salario, s.nomeSetor
from Funcionario f, Setor s
where f.codSetor=s.codSetor
/*apelidar tabelas*/

insert into Setor (nomeSetor) values ('Marketing')

select c.nome_cliente, p.num_pedido
from cliente c
Full outer join pedido p on c.Cod_cliente = p.cod_cliente

select f.primeiroNome, f.salario, s.nomeSetor
from Funcionario f 
Cross join Setor s
order by f.primeiroNome

/*max, min listar o menor e maior salario*/
select min(salario_fixo) as 'Menor salario', max(salario_fixo) as 'Maior salario'
from vendedor

/*sum somar */
select sum(quantidade) as 'Soma'
from item_pedido
where cod_produto = 3

/*avg valor médio*/
select avg(salario_fixo) as MEDIA_SALARIO
from vendedor

/*count conta quantas vezes o valor aparece,
a quantidade de saidas*/
select count(*) from vendedor
where salario_fixo > 2500.00

/*listar quantos produtos tem em cada pedido*/
select num_pedido, total_produtos = count(*)
from item_pedido
group by num_pedido

/*listar os pedidos que tem mais do que um produto*/
select num_pedido, total_produtos = count(*)
from item_pedido
where quantidade > 5 
group by num_pedido
having count(*) > 1

/*update*/
update produto
set Valor_unitario = 4.00
where descricao = 'alface'


