<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/mvj-school/mjv-1585819712-kenoby-thumbnail-552x368-3png.png" alt="mjv-school" width="100%">
</div>
<h1 align="center">Mjv School - Java</h1>
<h2 align="center">Diagrama - Universidade</h2>

<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/mjv-school-group-5/gabriel-melim/Diagrama/diagrama.png" width="60%">

<div align="center"> 

### Descrição do diagrama

### Classe "Universidade"

#### Atributos:
idUniversidade - representa o indentificador único
nome: String - representa o nome da universidade.<br>
endereco: String - representa o endereço da universidade.

**Métodos:**

 getIdUniversidade() : Integer - retorna o ID da universidade.<br>
 getNome() : String - retorna o nome da universidade.<br>
 getEndereco() : String -  retorna o endereço da faculdade.<br>

### Classe "Turma"

#### Atributos:

 idTurma : Integer - representa o indetificador único.<br>
 codigoTurma : String - representa o código da turma.<br>

#### Métodos:
 
 getIdTurma() : Integer retorna o id da turma.<br>
 getCodigoTurma() : String - retorna o código da turma.<br>
 adicionarAlunoTurma(aluno : Aluno) : void - adiciona um aluno em uma turma.<br>
 removerAlunoTurma(aluno : Aluno) : void - remove o aluno de uma turma<br>
 listarAlunosTurma() : Aluno [ ] - retorna uma lista de alunos referente a turma<br>

### Classe "Aluno"

#### Atributos:

idAluno : Integer - representa o indentificador único.<br>
nome: String - representa o nome do aluno.<br>
dataNasc : LocalDate - representa a data de nascimento do aluno.<br>
matricula : String- representa a matricula do aluno.<br>

#### Métodos:

getMatricula(): String - retorna a matrícula do aluno.<br>
getNome(): String - retorna o nome do aluno.<br>
getEndereco(): String - retorna o endereço do aluno.<br>


### Classe "Professor"

#### Atributos:

idProfessor : Integer - representa indentificador único.<br>
discplinas: [ ] - representa uma lista de disciplinas do professor.<br>
nome: String - representa o nome do professor.<br>
endereco: String - representa o endereço do professor.<br>

#### Métodos:

getIdProfessor() : Integer - retorna o indentificador único do professor.<br>
getListarDisciplinas : Disciplina [ ] - retorna uma lista de disciplinas do professor.<br>
getNome(): String - retorna o nome do professor.<br>
getEndereco(): String - retorna o endereço do professor.<br>


### Classe "Disciplina"

#### Atributos:

idDisciplina : Integer- representa o indentificador único.<br>
nomeDisc: String - representa o nome da disciplina.<br>
cargaHoraria: int - representa a carga horária da disciplina em horas.<br>

#### Métodos:

getIdDisciplina(): Integer - retorna o indentificador único da disciplina.<br>
getNome(): String - retorna o nome da disciplina.<br>
getCargaHoraria(): int - retorna a carga horária da disciplina.<br>


### Classe "Turma"

#### Atributos:

codigo: String - representa o código da turma.<br>
horario: String - representa o horário da turma.<br>


#### Métodos:

getCodigo(): String - retorna o código da turma.<br>
getHorario(): String - retorna o horário da turma.<br>

### Classe "DisciplinaProfessor"
Classe que associa qual professor tem vocação para uma disciplina em questão, uma disciplina pode ser aplicada por vários professores e um professor pode aplicar mais de uma disciplina.

### Classe "TurmaDisciplinaProfessor"

Classe que identifica o professor que irá dar aula, a disciplina que irá ministrar e a turma que a aula será dada, essa classe associa as 3 entidades.

### Um Exemplo genérico das classes associativas:
<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/mjv-school-group-5/gabriel-melim/Diagrama/exemplo.png" width="60%">

<div align="center"> 

### Relacionamentos:

#### Associação:

A classe "Universidade" possui uma associação com a classe "Turma". Isso significa que a universidade é vista como um TODO<br>
A classe "Disciplina" possui uma associação com a classe "Professor". Isso significa que um professor pode conter uma ou mais disciplinas.<br>
A classe "Turma" possui associações com as classes "Professor" e "Disciplina". Isso significa que uma turma é formada por um  ou mais professores e uma ou mais disciplina específicos.<br>
</div>
