# Workshop - Projeto Spring Boot com JPA

![Java](https://img.shields.io/badge/Java-17-blue?style=flat&logo=java) 
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-green?style=flat&logo=spring) 
![Hibernate](https://img.shields.io/badge/Hibernate-JPA-yellow?style=flat&logo=hibernate) 
![Maven](https://img.shields.io/badge/Maven-Build-orange?style=flat&logo=apachemaven)

## 📌 Sobre o Projeto

Este projeto é um workshop prático de **Spring Boot com JPA (Java Persistence API)**, desenvolvido para aprender e aplicar conceitos fundamentais de persistência de dados utilizando **Spring Data JPA** e **Hibernate**. 

O projeto implementa uma API REST para gerenciar usuários e pedidos, aplicando conceitos de modelagem relacional e boas práticas de desenvolvimento.

## 🚀 Tecnologias Utilizadas

- **Java 17** - Linguagem principal do projeto  
- **Spring Boot 3.0** - Framework para construção da aplicação  
- **Spring Data JPA** - Camada de persistência com ORM  
- **Hibernate** - Implementação JPA  
- **Maven** - Gerenciador de dependências  
- **H2 Database** - Banco de dados em memória para testes  
- **Postman** - Testes de API  

## 🛠 Estrutura do Projeto
workshop-projetospring-jpa │── src/main/java/com/example │ ├── entidades # Entidades JPA │ ├── repositórios # Interfaces do Spring Data JPA │ ├── recursos # Controladores REST │ ├── serviços # Regras de negócio │── src/main/resources │ ├── application.properties # Configurações do projeto │── pom.xml # Dependências do Maven

## 🏗️ Funcionalidades

- 📌 Cadastro e listagem de usuários  
- 📌 Cadastro e listagem de pedidos  
- 📌 Relacionamento entre usuários e pedidos  
- 📌 Utilização do banco de dados H2  

## 🔧 Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/nicolassantana42/workshop-projetospring-jpa.git
cd workshop-projetospring-jpa
