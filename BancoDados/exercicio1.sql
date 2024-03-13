/*Exercicio 1*/
Create table Professores
(
ID_Prof int not null,
Nome_Prof varchar(50),
Disc_Prof varchar(15),
Constraint PK_Professor Primary Key (ID_Prof),
);

/*Exercicio 2*/
insert into Professores
values
('1','Ana Oliveira', 'Português'); 

/*Exercicio 3*/
update Professores
set Nome_Prof = 'Ana Silva'
where ID_Prof = '1'

/*Exercicio 4*/
insert into Professores
values
('2','Wanir', 'Português'), 
('3','Antônio', 'Artes'),
('4','Valdir', 'História'), 
('5','Ronaldo', 'Biologia'),
('6','Aparecida', 'Física'), 
('7','Northon', 'Filosofia'),
('8','Rodrigo', 'Matemática'),
('9','Ruth', 'Filosofia'),
('10','Mirtes', 'Geografia'), 
('11','Jorge', 'Sociologia');

select * from Professores;

/*Exercicio 5*/
delete from Professores
where ID_Prof = '2';

/*Exercicio 6*/
create table Turmas
(
ID_Turma int not null,
Nome_Turma varchar(50) not null,
Prof_Responsavel int not null,
Constraint FK_Professor Foreign Key(Prof_Responsavel) References Professores(ID_Prof),
Constraint PK_Turma Primary Key (ID_Turma)
);

/*Exercicio 7*/
insert into Turmas
values
('1', '9A', '1');

select * from Turmas;

/*Exercicio 8*/
insert into Turmas
values
('2', '9B', '3'), 
('3', '9C', '4'), 
('4', '9D', '5'),
('5', '8A', '6'), 
('6', '8B', '7'), 
('7', '8C', '8'),
('8', '8D', '9'), 
('9', '7A', '10'), 
('10', '7B', '11'), 
('11', '7C', '7');

select * from Turmas;

/*Exercicio 9*/
create table Alunos
(
ID_Alunos int not null,
Nome_Aluno varchar(50) not null,
Data_Nasc date not null,
Turma_ID int not null,
Constraint PK_Aluno Primary Key(ID_Alunos),
Constraint FK_Turma Foreign Key(Turma_ID) References Turmas(ID_Turma)
)

/*Exercicio 10*/
insert into Alunos
values
('1','Maria Souza','2005-10-15','1')

/*Exercicio 11*/
update Alunos
set Nome_Aluno = 'Maria da Silva'
where ID_Alunos = '1'

/*Exercicio 12*/
insert into Alunos
values
('2','Eduarda','2005-10-16','1'),
('3','Victor','2005-10-17','2'),
('4','Murilo','2005-10-18','3'),
('5','Felipe','2005-10-19','4'),
('6','Pietro','2005-10-20','5'),
('7','Julia','2005-10-21','6'),
('8','Kaio','2005-10-22','7'),
('9','Juno','2005-10-23','8'),
('10','Juliana','2005-10-24','9'),
('11','Evellyn','2005-10-25','10');

select * from Alunos;

/*Exercicio 13*/
delete from Alunos
where ID_Alunos = '2'

/*Exercicio 14*/
create table Notas
(
ID_Notas int identity(1,1) not null,
Aluno_ID int not null,
Disciplina varchar(15) not null,
Nota decimal(5,2) not null,
Constraint FK_Aluno Foreign Key (Aluno_ID) References Alunos(ID_Alunos),
Constraint PK_Notas Primary Key(ID_Notas)
);

select * from Notas;

/*Exercicio 15*/
insert into Notas
values
('1','Matemática', '8.5');

/*Exercicio 16*/
update Notas
set Nota = '9.0'
where Aluno_ID = '1'

select * from Notas;

/*Exercicio 17*/
insert into Notas
values
('3','Matemática', '7.2'), 
('4','Matemática', '6.4'), 
('5','Matemática', '6.7'),
('6','Matemática', '8.0'), 
('7','Matemática', '6.8'), 
('8','Matemática', '7.4'),
('9','Matemática', '8.7'), 
('10','Matemática', '8.3'), 
('11','Matemática', '9.4');

/*Exercicio 18*/
delete from Notas
where Aluno_ID = '1' and Disciplina = 'Matemática'

select * from Notas;

/*Exercicio 19*/
create table Matriculas(
ID_Matricula int identity(1,1) not null,
Aluno_ID int not null,
Turma_ID int not null,
Data_Matricula date,
Constraint FK_Turma_Matri Foreign Key(Turma_ID) References Turmas(ID_Turma),
Constraint FK_Aluno_Matri Foreign Key(Aluno_ID) References Alunos(ID_Alunos),
Constraint PK_Matricula Primary Key(ID_Matricula)
);

select * from Matriculas;

/*Exercicio 20*/
insert into Matriculas
values
('1', '1', '2022-02-15')

select * from Matriculas;

/*Exercicio 21*/
insert into Matriculas
values 
('3', '2', '2022-02-16'),
('4', '3', '2022-02-17'),
('5', '4', '2022-02-18'),
('6', '5', '2022-02-19'),
('7', '6', '2022-02-10'),
('8', '7', '2022-02-11'),
('9', '8', '2022-02-12'),
('10', '9', '2022-02-13'),
('11', '10', '2022-02-14'),
('3', '11', '2022-02-15');

select * from Matriculas;

select * from Professores;
select * from Turmas;
select * from Alunos;
select * from Notas;
select * from Matriculas;