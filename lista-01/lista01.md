
Questões conceituais


1. Pesquise e descreva: no contexto de programação, o que é uma “biblioteca” e o que é uma “API”? Diferencie ambas utilizando as suas próprias palavras.

Resposta: Biblioteca em programação é um arquivo responsável por organizar os códigos de um programa pré definido. Na biblioteca, tem o acesso ao um conjunto de funções, no entanto não fornece uma interface para que seja consumidos recursos de um sistema. 
API é a interface de um programa, um software com função distinta. 

2. Defina brevemente e descreva a razão para se utilizar os padrões de projetos abaixo:

a. MVC: Tem como função elaborar os modelos, visão e controle. Tornando mais prático e agil o sistema. 
b. DAO: Uma organização por regras codificadas, por um programa de computador. Sendo assim, são organizações de blockchain.
c. Singleton: Tem melhor acesso nas propriedades e nos métofos de classse. 

3. O que é JDBC e como ele se relaciona com bancos de dados e a programação em Java? 

Resposta: JDBC é uma interface de programção de aplicação (API) do java. Realiza a transmissão como sequências para a API, tendo autorização para se conectar com o banco de dados. 

4. O que significa “CRUD” e como ele se  relaciona com os quatro métodos que implementamos em nossas classes DAO?

Resposta: É usada para as maneiras de operar as informações armazenada. 

5. Explique brevemente e com suas palavras qual a utilidade das três classes abaixo:

a. Connection: caracteriza uma conexão ao banco de dados.
b. PreparedStatement: Autoriza organizar a query SQL preparando a dinamicamente pelos parâmetros estabelecidos em ordem com a interrogação.
c. Statement: Realiza a query fazendo o uso de String.  



6. Considere a execução de uma query SQL no banco de dados. Se esperamos um retorno de dados do banco de dados devemos usar a classe Statement ou PreparedStatement? Justifique. (Dica: é possível usar ambas; procure a diferença técnica entre as classes.).

Resposta: Deve-se usar a classe PreparedStatement, pois ela é mais segura contra ataques de injeção SQL, já que utiliza uma consulta parametrizada com os parâmetros definidos antes da execução da consulta. Além disso, ela oferece melhor desempenho para consultas repetidas, pois pode ser pré-compilada pelo driver JDBC.


7. Com as suas próprias palavras, diferencie SWING do WINDOWBUILDER.

Resposta:
- Swing é responsável em efetuar componetes usados para criar a interface gráfica, como os botões, textos etc.
- Windowbuilder promove a construção de telas utilizando as principais APIs gráficas.








