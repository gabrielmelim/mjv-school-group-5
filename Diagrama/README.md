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

codigo: String - representa o código do professor.<br>
nome: String - representa o nome do professor.<br>
endereco: String - representa o endereço do professor.<br>

#### Métodos:

getCodigo(): String - retorna o código do professor.<br>
getNome(): String - retorna o nome do professor.<br>
getEndereco(): String - retorna o endereço do professor.<br>


### Classe "Disciplina"

#### Atributos:

codigo: String - representa o código da disciplina.<br>
nome: String - representa o nome da disciplina.<br>
cargaHoraria: int - representa a carga horária da disciplina em horas.<br>

#### Métodos:

getCodigo(): String - retorna o código da disciplina.<br>
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
A classe "DisciplinaProfessor" pode ser entendida como uma entidade intermediária que estabelece a relação entre uma disciplina específica e o professor responsável por ministrá-la. Essa classe pode conter informações adicionais sobre a relação entre a disciplina e o professor, como a carga horária atribuída ao professor para aquela disciplina específica, notas ou avaliações dadas pelo professor aos alunos, entre outros aspectos relacionados ao ensino da disciplina.

Dessa forma, a classe "DisciplinaProfessor" atua como uma ligação entre as classes "Disciplina" e "Professor", permitindo que seja estabelecido o relacionamento específico entre uma disciplina e o professor responsável por ela.

### Relacionamentos:

#### Associação:

A classe "Universidade" possui uma associação com a classe "Aluno". Isso significa que a universidade tem uma coleção de alunos.<br>
A classe "Disciplina" possui uma associação com a classe "Professor". Isso significa que uma disciplina é ministrada por um professor.<br>
A classe "Turma" possui associações com as classes "Professor" e "Disciplina". Isso significa que uma turma é formada por um professor e uma disciplina específicos.<br>
</div>
