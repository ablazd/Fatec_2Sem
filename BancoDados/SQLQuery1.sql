create table Professores(
idProfessor int not null,
nomeProfessor varchar(50) not null,
disciplina varchar(15)
);

insert into Professores 
values
('01', 'Ana Oliveira', 'Português');

update Professores
set nomeProfessor = 'Ana Silva'
where idProfessor = '01'

select * from Professores

insert into Professores
(nomeProfessor, disciplina)
values ('', '')