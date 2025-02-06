# Workshop - Projeto Spring Boot com JPA

![Java](https://img.shields.io/badge/Java-17-blue?style=flat&logo=java) 
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-green?style=flat&logo=spring) 
![Hibernate](https://img.shields.io/badge/Hibernate-JPA-yellow?style=flat&logo=hibernate) 
![Maven](https://img.shields.io/badge/Maven-Build-orange?style=flat&logo=apachemaven)

## 📌 Sobre o Projeto

Este projeto é um workshop prático de **Spring Boot com JPA (Java Persistence API)**, desenvolvido para aprender e aplicar conceitos fundamentais de persistência de dados utilizando **Spring Data JPA** e **Hibernate**. 

O projeto implementa uma API REST para gerenciar usuários e pedidos, aplicando conceitos de modelagem relacional e boas práticas de desenvolvimento.

### 🔍 Modelo de Domínio
Abaixo está a estrutura do modelo de domínio utilizada no projeto:

![Modelo de Domínio](https://github.com/user-attachments/assets/f294cf27-eadf-4968-ac57-8abf1443616a)


## 🚀 Tecnologias Utilizadas

- **Java 17** - Linguagem principal do projeto  
- **Spring Boot 3.0** - Framework para construção da aplicação  
- **Spring Data JPA** - Camada de persistência com ORM  
- **Hibernate** - Implementação JPA  
- **Maven** - Gerenciador de dependências  
- **H2 Database** - Banco de dados em memória para testes  
- **Postman** - Testes de API  

## 🏗️ Funcionalidades

- 📌 Cadastro e listagem de usuários  
- 📌 Cadastro e listagem de pedidos  
- 📌 Relacionamento entre usuários e pedidos  
- 📌 Utilização do banco de dados H2  

### 📊 Instância de Domínio
A estrutura dos dados instanciados no sistema:

![Instância de Domínio](https://github.com/user-attachments/assets/1a908b2a-cfb2-4402-abb5-b3a8c446e197)


## 🛠 Estrutura do Projeto
workshop-projetospring-jpa │── src/main/java/com/example │ ├── entities # Entidades JPA │ ├── repositories # Interfaces do Spring Data JPA │ ├── resources # Controladores REST │ ├── services # Regras de negócio │── src/main/resources │ ├── application.properties # Configurações do projeto │── pom.xml # Dependências do Maven


### 🏛️ Lógica de Camadas
O projeto segue a arquitetura de camadas conforme ilustrado abaixo:

![Lógica de Camadas](https://github.com/user-attachments/assets/7fc340bf-a4c6-4d40-b8a6-2550c9b18bfa)


## 🔧 Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/nicolassantana42/workshop-projetospring-jpa.git
cd workshop-projetospring-jpa

