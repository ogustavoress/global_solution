# Checkpoint
Documentação referente à API criada para o 1º checkpoint de *Microsservice and Web Engineering*.

## Informações
**Nome:** Gustavo de Carvalho Sena Ressurreição.

**RM** 550983.

**Turma:** 3SIR.

## Escopo do Projeto
O projeto consiste no desenvolvimento de uma API que responde a requisições HTTP, com suporte para os seguintes métodos:

* **POST:** 
    * Cadastro de um paciente.
* **PUT:** 
    * Atualização dos dados do paciente.
* **DELETE:** 
    * Remoção de um paciente.
* **GET:**
    
    * Busca de um paciente pelo ID.
    * Listagem de todos os pacientes.

## Estrutura de Código
A aplicação foi estruturada em diferentes camadas, cada uma com suas responsabilidades: 

**Model:** Realiza o mapeamento das entidades utilizadas no banco de dados.

**Controller:** Responsável por gerenciar as requisições HTTP, encaminhando-as para os serviços correspondentes.

**DTO:** Facilita o transporte de dados entre as camadas aplicação.

**Service:** Concentra a lógica de negócio da API.

## Configuração e Execução

### Swagger para Documentação da API
Para configurar a documentação com Swagger, consulte a [documentação oficial](https://sprinhttps://springdoc.org/properties.html).

No arquivo `application.properties`, utilize as seguintes configurações:

```
properties
spring.application.name=checkpoint1
springdoc.swagger-ui.path=/
```
## Rodando a API
Use o *Maven* para iniciar a aplicação com o comando:
```
mvn spring-boot:run
```
Após a execução, a documentação inter/swagger-ui/index.htmlativa da API estará disponível no endereço:
http://localhost:8080/swagger-ui/index.html

## Referências
* [SpringDoc](https://springdoc.org/)
