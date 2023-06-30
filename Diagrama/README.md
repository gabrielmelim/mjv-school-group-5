<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/mvj-school/mjv-1585819712-kenoby-thumbnail-552x368-3png.png" alt="mjv-school" width="100%">
</div>
<h1 align="center">Mjv School - Java</h1>
<h2 align="center">Diagrama - Universidade</h2>
<h3>Descrição do diagrama</h3>
Classe "Universidade":

Atributos:

nome: String - representa o nome da universidade.

endereco: String - representa o endereço da universidade.
Métodos:

adicionarAluno(aluno: Aluno): void - adiciona um aluno à universidade.
removerAluno(aluno: Aluno): void - remove um aluno da universidade.
listarAlunos(): Aluno[] - retorna uma lista com todos os alunos da universidade.
Classe "Aluno":

Atributos:

matricula: String - representa a matrícula do aluno.
nome: String - representa o nome do aluno.
endereco: String - representa o endereço do aluno.
Métodos:

getMatricula(): String - retorna a matrícula do aluno.
getNome(): String - retorna o nome do aluno.
getEndereco(): String - retorna o endereço do aluno.
Classe "Professor":

Atributos:

codigo: String - representa o código do professor.
nome: String - representa o nome do professor.
endereco: String - representa o endereço do professor.
Métodos:

getCodigo(): String - retorna o código do professor.
getNome(): String - retorna o nome do professor.
getEndereco(): String - retorna o endereço do professor.
Classe "Disciplina":

Atributos:

codigo: String - representa o código da disciplina.
nome: String - representa o nome da disciplina.
cargaHoraria: int - representa a carga horária da disciplina em horas.
Métodos:

getCodigo(): String - retorna o código da disciplina.
getNome(): String - retorna o nome da disciplina.
getCargaHoraria(): int - retorna a carga horária da disciplina.
Classe "Turma":

Atributos:

codigo: String - representa o código da turma.
horario: String - representa o horário da turma.
Métodos:

getCodigo(): String - retorna o código da turma.
getHorario(): String - retorna o horário da turma.
Relacionamentos:

Associação:

A classe "Universidade" possui uma associação com a classe "Aluno". Isso significa que a universidade tem uma coleção de alunos.
A classe "Disciplina" possui uma associação com a classe "Professor". Isso significa que uma disciplina é ministrada por um professor.
A classe "Turma" possui associações com as classes "Professor" e "Disciplina". Isso significa que uma turma é formada por um professor e uma disciplina específicos.
<p align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/mjv-school-group-5/gabriel-melim/diagrama.png" width="80%">
</p>
