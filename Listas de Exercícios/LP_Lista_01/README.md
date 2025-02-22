![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite sua Nota e Frequencia\]
        input --> verification{ Nota >= 50 \n E \n Frequência >= 75%? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite o primeiro número \]
        input --> inpu[\ Digite o segundo número \]
        inpu --> soma[ Soma = número 1 + número 2 ]
        soma --> A[/ Resultado /]
        A --> finish([ Fim ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite o número \]
        input --> verification{ Número >= 0? }
        verification --> |Sim| A[/ Positivo /]
        verification --> |Não| B[/ Negativo /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite a idade \]
        input --> inpu[\ Possui título eleitoral? \]
        inpu --> verification{ Idade >= 16 E \n possui título de eleitor = sim? }
        verification --> |Sim| A[/ Pode votar /]
        verification --> |Não| B[/ Não pode votar /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite n1 \]
        input --> inpu[\ Digite n2 \]
        inpu --> verification{ n1 % n2 == 1?}
        verification --> |Sim| A[/ Eles são iguais /]
        verification --> |Não| B{ n1 > n2?}
        B --> |Sim| C[/ n1 é maior /]
        B --> |Não| D[/ n2 é maior /]
        A --> finish([ Fim ])
        C --> finish
        D --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   
      flowchart TD
      start(( Início )) --> input[\ Digite n1 \]
      input --> inpu[\ Digite n2 \]
      inpu --> inp[\ Digite n3 \]
      inp --> teste{ n1 % n2 == 0 \n E \n n2 % n3 == 0?}
      teste --> |Sim| A[/ Os três números são iguais /]
      teste --> |Não| test2{ n1 > n2 ? }
      test2 --> |Sim| test4{ n1 > n3 ? }
      test4 --> |Sim| C[/ n1 é o maior número /]
      test4 --> |Não| D[/ n3 é o maior número /]
      test2 --> |Não| test5{ n2 > n3 ? }
      test5 --> |Sim| E[/ n2 é o maior /]
      test5 --> |Não| F[/ n3 é o maior/]
      A --> finish([ Fim ])
      C --> finish
      D --> finish
      E --> finish
      F --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite um número \]
        input --> fat[ r = 1 ]
        fat --> verification{ n > 1 ?}
        verification --> |Sim| A[ r = r * n ]
        A --> C[ n = n - 1]
        C --> verification
        verification --> |Não| B[/ Resposta = r /]
        B --> finish([ Fim ])
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite n \]
        input --> verification{ n % 2 == 2? }
        verification --> |Sim| A[/ n é par /]
        verification --> |Não| B[/ n é ímpar /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite n \]
        input --> verification{ n % 2 == 0 \n E n % 3 == 0 \n E n % 5 == 0? }
        verification --> |Sim| A[/ n é primo /]
        verification --> |Não| B[/ n não é primo /]
        A --> finish([ Fim ])
        B --> finish
   ```