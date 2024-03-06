create table Professores(
idProf int not null primary key,
nomeProf varchar(50),
disciplina varchar(15) );

insert into Professores
values
('01', 'Ana Oliveira', 'Português');

update Professores
set nomeProf = 'Ana Silva'
where idProf = '01'

insert into Professores
values ('02','Lourdes', 'Literatura')
 
insert into Professores
values ('03','Clovis','Arte');
 
insert into Professores
values ('04','Antonio','Matematica');
 
insert into Professores
values ('05','Victor','Portugues');
 
insert into Professores
values ('06','Murilo','Calculo');
 
insert into Professores
values ('07','Junior','Biologia');
 
insert into Professores
values ('08','Julio','Fisica');
 
insert into Professores
values ('09','Northon','Algoritmo');
 
insert into Professores
values ('10','Evelin','Informatica');
 
insert into Professores
values ('11','Lucas','História');

select * from Professores

delete from Professores
where idProf='2'

create table Turmas(
idTurmas int identity(1,1),
nomeTurmas varchar(50),
idProf int not null
 
Constraint PK_idTurmas Primary Key(idTurmas),
Constraint FK_idProf Foreign Key(idProf) References Professores(idProf)
);

insert into Turmas
(nomeTurmas, idProf)
values ('9a', 1)

select * from Professores

insert into Turmas
(nomeTurmas, idProf)
values ('9b', '2')

insert into Turmas
(nomeTurmas, idProf)
values ('9a', 1)

insert into Turmas
(nomeTurmas, idProf)
values ('9b', 2)

insert into Turmas
(nomeTurmas, idProf)
values ('9c', 3)

insert into Turmas
(nomeTurmas, idProf)
values ('9d', 4)

insert into Turmas
(nomeTurmas, idProf)
values ('8a', 5)

insert into Turmas
(nomeTurmas, idProf)
values ('8b', 6)

insert into Turmas
(nomeTurmas, idProf)
values ('8c', 7)

insert into Turmas
(nomeTurmas, idProf)
values ('8d', 8)

insert into Turmas
(nomeTurmas, idProf)
values ('7a', 9)

insert into Turmas
(nomeTurmas, idProf)
values ('7b', 10)

insert into Turmas
(nomeTurmas, idProf)
values ('7c', 11)

select * from Professores

create table Alunos (
idALuno int identity(1,1),
nomeAluno varchar(50),
dataNasc date,
idTurma int not null 

 
Constraint PK_idAluno Primary Key(idAluno),
Constraint FK_idTurma Foreign Key(idTurma) References Turmas(idTurmas)
);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Maria Souza','2005-10-15', 1);
 
select * from Alunos

update Alunos
set nomeAluno = 'Maria da Silva'
where idTurma = 1

select * from Alunos
