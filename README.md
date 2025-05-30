# Global Solution - Gestão de Abrigos

Projeto acadêmico para a disciplina Microservice and Web Engineering, 3º semestre, Bacharelado em Sistemas de Informação (FIAP).  

Tema: Eventos Extremos — cadastro e gestão de abrigos para situações de desastres naturais.

---

## Tecnologias utilizadas

- Java 17  
- Spring Boot 3  
- Spring Data JPA  
- MySQL  
- Maven  
- Springdoc OpenAPI (Swagger)  
- Jakarta Validation (opcional)  

---

## Configuração do projeto

### Metadata no Spring Initializr

- **Group:** `br.com.fiap.rm_550983`  
- **Artifact:** `globalsolution`  
- **Package:** `br.com.fiap.rm_550983`  

### Dependências principais

- Spring Web  
- Spring Data JPA  
- MySQL Driver  
- Springdoc OpenAPI UI  
- Spring Boot DevTools  
- Jakarta Validation (opcional)  

---

## Configuração do banco de dados MySQL

Configure seu banco MySQL local e ajuste o arquivo `src/main/resources/application.properties` com as credenciais corretas:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/api?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root_pwd

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.open-in-view=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
