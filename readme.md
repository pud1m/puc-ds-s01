# Sistemas de Matrículas 

a) **Universidade:** Pontifícia Universidade Católica de Minas Gerais. 
**Curso:** Engenharia de Software/Noturno. 
**Disciplina:** Laboratório de Desenvolvimento de Software. **Professor:** Jose Laerte Pires Xavier Junior 
**Alunos:** Guilherme Henrique Ladislau Biagini & Leonardo Henrique Guimaraes & Thalles Alvesda Silva Sales

---------------------------------------------------------------------------------------------------------------------------------

b) **Desenvolvedores:** Guilherme Henrique Ladislau Biagini & Leonardo Henrique Guimaraes & Thalles Alvesda Silva Sales

---------------------------------------------------------------------------------------------------------------------------------

c) **Dependências:** O  trabalho foi feito na linguagem Java na IDE Eclipse implementando as funções...

---------------------------------------------------------------------------------------------------------------------------------

**Sobre o programa:**

Uma universidade pretende informatizar seu sistema de matrículas. A secretaria da universidade gera o currículo para cada semestre e mantém as informações sobre as disciplinas, professores e alunos.

Cada curso tem um nome, um determinado número de créditos e é constituído por diversas disciplinas.

Os alunos podem se matricular em 4 disciplinas como 1ª opção (obrigatórias) e em mais 2 outras alternativas (optativas).

Há períodos para efetuar matrículas, durante os quais um aluno pode acessar o sistema para se matricular em disciplinas e/ou para cancelar matrículas feitas anteriormente.

Uma disciplina só fica ativa, isto é, só vai ocorrer no semestre seguinte se, no final do período de matrículas tiver, pelo menos, 3 alunos inscritos (matriculados). Caso contrário, a disciplina será cancelada. O número máximo de alunos inscritos a uma disciplina é de 60 e quando este número é atingido, as inscrições (matrículas) para essa disciplina são encerradas.

Após um aluno se inscrever para um semestre, o sistema de cobranças é notificado pelo sistema de matrículas, de modo que o aluno possa ser cobrado pelas disciplinas daquele semestre.

Os professores podem acessar o sistema para saber quais são os alunos que estão matriculados em cada disciplina.

Todos os usuários do sistema têm senhas que são utilizadas para validação do respectivo login.

--------------------------------------------------------------------------------------------------------------------------------------

**Histórias de Usuário**  
```
## História 1
Como funcionário(a) da secretaria da universidade, gostaria de criar currículos para cada semestre, criando definições específicas para cada disciplina, professor e aluno.

## História 2
Como funcionário(a) da secretaria da universidade, gostaria de definir as características de cada curso, definindo o número de créditos e suas disciplinas constituintes.

## História 3
Como aluno da universidade, gostaria de me matricular em 4 disciplinas como primeira opção (obrigatórias) e em outras 2 alternativas (optativas).

## História 4
Como gestor da universidade, gostaria de limitar as ações de efetuar/cancelar matrícula em disciplinas para um período específico.

## História 5
Como gestor da universidade, gostaria de que uma disciplina só se tornasse ativa caso, no período de matrícula que antecede o semestre, ao menos 3 alunos tenham se matriculado nela. Caso não seja atingido esse número, gostaria de que a disciplina fosse cancelada.

## História 6
Como gestor da universidade, gostaria de que, após uma disciplina alcançar 60 alunos matriculados, as inscrições para ela sejam fechadas, por atingir o número máximo de vagas.

## História 7
Como gestor da universidade, gostaria de que, após concluída a matrícula do aluno para o semestre, o sistema de cobrança seja notificado para gerar as cobranças referentes àquele semestre.

## História 8
Como professor da universidade, gostaria de poder acessar o sistema e ver quais alunos estão matriculados em cada disciplina.

## História 9
Como usuário do sistema, gostaria de ter o acesso aos meus dados protegido por usuário e senha.

```

---------------------------------------------------------------------------------------------------------------------------------------
**Sistema de Casos de Uso**

![casosDeUso](https://user-images.githubusercontent.com/38760047/132139391-e39fdeee-822f-43cf-9d68-7ffab56f7459.PNG)

---------------------------------------------------------------------------------------------------------------------------------------
**Primeira UML Gerada**
