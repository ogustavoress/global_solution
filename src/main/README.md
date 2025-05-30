# Global Solution - Gestão de Abrigos

Projeto desenvolvido para a disciplina Microservice and Web Engineering, 3º semestre, Bacharelado em Sistemas de Informação (FIAP).  

Tema: Eventos Extremos — cadastro e gestão de abrigos para situações de desastres naturais.

---

## Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL Database
- Maven
- Springdoc OpenAPI (Swagger)
- Jakarta Validation

---

## Configuração do projeto

### Metadata no Spring Initializr

- **Group:** `br.com.fiap.rm_550983`
- **Artifact:** `globalsolution`
- **Package:** `br.com.fiap.rm_550983`

### Dependências principais

- Spring Web
- Spring Data JPA
- MySQL Database
- Springdoc OpenAPI UI
- Spring Boot DevTools
- Jakarta Validation (opcional, para validação DTOs)

---

## Estrutura do projeto

- `entity` — Classe `Abrigo` representa a tabela do banco de dados.
- `repository` — Interface `AbrigoRepository` para operações CRUD.
- `dto` — Objetos de transferência:  
  - `AbrigoCreateRequest` — dados para criação de abrigo  
  - `AbrigoUpdateRequest` — dados para atualização  
  - `AbrigoResponse` — dados para respostas da API
- `service` — `AbrigoService` encapsula a lógica de negócio e operações.
- `controller` — `AbrigoController` expõe as APIs REST para CRUD.
- `exception` (opcional) — tratamento customizado de erros (não implementado).

---

## Modelagem da entidade Abrigo

| Campo            | Tipo    | Descrição                     |
|------------------|---------|-------------------------------|
| id               | Long    | Identificador único (PK)      |
| nome             | String  | Nome do abrigo                |
| endereco         | String  | Endereço do abrigo            |
| capacidadeMaxima  | Integer | Capacidade máxima de pessoas  |
| capacidadeAtual   | Integer | Quantidade atual de pessoas   |

---

## Endpoints da API REST

| Método | URL            | Descrição                         |
|--------|----------------|-----------------------------------|
| POST   | `/abrigos`     | Criar um novo abrigo              |
| PUT    | `/abrigos/{id}`| Atualizar abrigo existente        |
| DELETE | `/abrigos/{id}`| Remover abrigo por ID             |
| GET    | `/abrigos/{id}`| Buscar abrigo por ID              |
| GET    | `/abrigos`     | Listar todos os abrigos           |

---

## Rodando a API
Use o *Maven* para iniciar a aplicação com o comando:
```
mvn spring-boot:run
```
Após a execução da aplicação, use a ferramenta **Swagger UI** para testar os endpoints diretamente:
http://localhost:8080/. 


## Referências
* [SpringDoc](https://springdoc.org/)
