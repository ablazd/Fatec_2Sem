/*retorna o nome da parte de uma data*/
DATENAME (datepart, date)

select datename (yy,getdate())

/*retorna a parte de uma data*/
DATEPART (datepart, date)

select datepart(mm, getdate())
select datepart(month, getdate())

/*retorna um inteiro que representa o dia da date especificada*/
DAY (date)

select day (getdate())

/*retorna um inteiro que representa o mes da date especificada*/
MONTH (date)

select MONTH(getdate())

/*retorna um inteiro que representa o ano da date especificada*/
YEAR(date)

select year(getdate())

/*retorna o n° de limites de datepart de data  ou hora entre duas datas especificas*/
DATEDIFF(datepart, startdate, enddate)

select datediff (yy, getdate(), getdate()+366)
select datediff (week, getdate(), getdate()+720)

/*adiciona um valor a parte de uma data*/
DATEADD (datepart, number, date)

select DATEADD(yy, 1, getdate())
/*select DATENAME(MONTH,(DATEADD(MONTH,3,GETDATE())))*/

/*determina se a expressao de entrada é valida*/
ISDATE(expression)

select ISDATE('27-02-2023')
select ISDATE('30-02-2023')

/*converte um tipo de dado*/
CONVERT (expression)

select	CONVERT(CHAR, GETDATE(), 103)/*103 converte a data com barras*/
select CONVERT(CHAR, GETDATE(), 113)/*113 converte a data por extenso*/

/*arredonda numeros com o n° de digitos de precisão indicados*/
ROUND (numeric_expression, length)

select ROUND(123.3467, 3)
select ROUND(123.3467, 2)
select ROUND(123.3467, 1)
select ROUND(123.3467, 0)
select ROUND(123.3467, -1)
select ROUND(123.3467, -2)

select CONVERT(decimal(10,3), round(123.3467,3))

/*retorna o maior inteiro ou igual a expressao especificada*/
FLOOR (numeric_expression)

select FLOOR (123.45)

/*calcula a potencia de um numero */
POWER(M,EXPOENTE)

select POWER(4,2)
select POWER(2,2)

/*retorna o codigo ASCII do caractere mais à esquerda de uma expressão de caractere */
ASCII (character_expression)

select ASCII ('B'), ASCII('AMANDA')

/*converte um codigo ASCII int em um caractere*/
CHAR (INTEGER_EXPRESSION)

select CHAR(65), CHAR(66)

/*pequisa expressao desejada iniciando em posição inicial*/
CHARINDEX (expression1, expression2, [posição inicial])

select CHARINDEX('Mundo', 'Olá, mundo bonito')
select CHARINDEX('Mundo', 'Olá, mundo bonito', 3)
select CHARINDEX('Mundo', 'Olá, mundo bonito', 6)

/*substitui um ou mais caracteres de uma cadeia com 0 ou mais caracteres*/
REPLACE (cad, cadeia_busca, [cadeia_substituição])

select REPLACE ('abcdef', 'cde', 'xxx')

/*insere uma cadeia de caracteres em outra cadeia de caracteres*/
STUFF (expressao, inicio, quantidade de caracteres que serão trocados, conjunto que irá substituir)

select STUFF ('abcdef', 2, 3, '_ijklm_')

/*retorna a parte da esquerda de uma cadeia de caracteres com a qtd de caracteres especificado*/
LEFT (character_expression, integer_expression)

select LEFT('abcdefgh', 5)

/*retorna a parte da direita de uma cadeia de caracteres com a qtd de caracteres especificado*/
RIGHT (character_expression, integer_expression)

select RIGHT('abcdefgh', 5)

/*repete um valor da cadeia de caracteres um numero especificado de vezes*/
REPLICATE(string_expression, integer_expression)

select REPLICATE('ABC', 3)

/*retorna parte de ua expressao de caracteres*/
SUBSTRING ( value_expression, start_expression, length_expression)

select SUBSTRING ('ABCDEFGHI', 2, 3)

/*retorna o numero de caracteres da expressao*/
LEN(string_expression)

select LEN('ABCD')

/*retorna o inverso*/
REVERSE(string_expression)

select REVERSE('ABCD')

/*converte para minusculas*/
select LOWER('AbCD')

/*converte para maiusculas*/
select UPPER('aBcd')

/*retorna uma expressao de caracteres depois de remover espaços em branco à esquerda*/
select '_' + LTRIM (' AbCD ') + '_'

/*retorna uma expressao de caracteres depois de remover espaços em branco à direita*/
select '_' + RTRIM (' AbCD ') + '_'


