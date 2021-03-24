# VUTTR - Very Usefuls Tools To Remember

## Objetivo
Construir uma API e banco de dados para a aplicação VUTTR (Very Useful Tools to Remember). A aplicação é um simples repositório para gerenciar ferramentas com seus respectivos nomes, links, descrições e tags. 


## Repositório
https://github.com/Victoorres/desafio-back-end


## Requisitos
* JDK 11 - instalar no site da oracle: https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html
* Intellij CE - instalar no site: https://www.jetbrains.com/pt-br/idea/download/#section=windows
* MySQL CE - instalação com link direto: https://cdn.mysql.com//Downloads/MySQLInstaller/mysql-installer-web-community-8.0.23.0.msi
* MySQL WorkBench - instalar no site: https://dev.mysql.com/get/Downloads/MySQLGUITools/mysql-workbench-community-8.0.23-winx64.msi
* Postman(Opcional) - instalar opcional (ferramenta que testa serviços RESTful (Web APIs) por meio do envio de requisições HTTP e da análise do seu retorno.
): https://www.postman.com/downloads/


## Iniciar projeto
Ir no MySQL Workbench e rodar o seguinte script:
*CREATE DATABASE vuttr;*
*USE vuttr;*
Dentro do Intellij pressionar *CTRL* + *SHIFT* + *F10* para rodar a aplicação



## Deploy Links
A deploy está rodando na porta 3001 pois aconteceu uns problemas em tentar mandar a deploy pra porta 3000 pelo meu computador

*GET
http://64.225.9.236:3001/tools
http://64.225.9.236:3001/tools/*qualquer id cadastrado*
http://64.225.9.236:3001/tools?tag=*qualquer tag cadastrada*
http://64.225.9.236:3001/tools?filter=*qualquer coisa cadastrada*