# PaginaLogin
fazer uma aplicação de login simples

# Tecnologias Usadas 
  - Mysql
  - Java
  - Java swing

# Instalação da aplicação 
- Faça o download do repositorio em algum diretorio no seu dekstop
- abra com o netbeans
- aguarde o Maven baixar as dependencias
- ***importante*** Trocar as variável de acesso ao banco e dados da classe Conexão que se encontra no package util Link:https://github.com/Rafael-co/PaginaLogin/blob/main/src/main/java/util/Conexao.java
 - nome das variaveis que precisam ser trocadas 
   * String url = Caso seu Mysql execute em outra porta, por favor altera a varivel para a porta certa; -> valor padrão  jdbc:mysql://**localhost:3306**/login?createDatabaseIfNotExist=true"
   * String user = Trocar o nome do usuario caso seja diferente do padrão;Valor padrão -> padrão :"root"
   * String password = Mudar e colocar a senha do seu banco de dados MYSQL;
