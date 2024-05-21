-- usando declare e set
declare @MinPreco DECIMAL(10,2); -- Declara��o de variavel

Set @MinPreco = 50; -- defini��o do valor da variavel 

select NomeProduto, Preco --consulta usando a variavel
From Produto 
Where Preco >= @MinPreco;

--usando declare e select
declare @TotalPedidos INT;

select @TotalPedidos = COUNT(*)
from Pedido;

PRINT 'O total de pedidos �: ' + CAST(@TotalPedidos as NVARCHAR(10));

--calcular m�dia 
declare @MediaPreco DECIMAL(10,2);

set @MediaPreco = (
	select AVG(Preco)
	From Produto
	Where CategoriaID = 1
);

PRINT 'A m�dia de pre�o na categoria de Eletr�nicos �: ' + CAST(@MediaPreco as NVARCHAR(10));

--obter o nome do produto mais caro
declare @ProdutoMaisCaro NVARCHAR(50);

select top 1 @ProdutoMaisCaro = NomeProduto
From Produto
Order by Preco DESC;

print 'O produto mais caro �: ' + @ProdutoMaisCaro;

--comando TOP limita o numero de linhas que uma consulta retorna
select TOP 10 NomeProduto, Preco
from Produto
order by Preco DESC;


