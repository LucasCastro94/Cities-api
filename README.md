# Cities API
---
Um projeto desenvolvido para calcular distâncias entre duas cidades ou cidades vizinhas num raio de distância, também é possível verificar qual estado pertence um 'DDD' especifico.


### Requisitos
---
* Java 17
* IntelliJ Community
* Docker
* Postgres



#### DataBase
---
  É necessario ter postgres instalado no host ou container, nesse projeto foi utilizado a **lib Flyway**, ao executar injeta as depencias de script sql direto no banco de dados alimentando todas informações como todos estados, cidades do brasil e paises.

  Para utilização de container com docker:

>docker run --name cities-api -d -p 5432:5432 -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=root -e POSTGRES_DB=cities postgres



### **Endpoints**

Exibindo todas cidades:
> http://localhost:8080/cities

Exibindo todos estados:
> http://localhost:8080/states

Exibindo todos paises:
> http://localhost:8080/countries

Exibindo qual estado pertence um DDD:
> http://localhost:8080/ddd?code=ddd

calculando distância entre 2 cidades:
> http://localhost:8080/distances?from=id&to=id

Exibir cidades dentro de um raio a partir de outra:
> http://localhost:8080/nearby?city_id=id&radius=metros






### Spring Boot
---
https://start.spring.io/ \
Java 17 \
Gradle Project \
Jar\
Spring Web\
Spring Data JPA\
PostgreSQL Driver\
Lombok

### Spring Data
---
jpa.query-methods\
Properties\
appendix-application-properties\
jdbc-database-connection\

### Types
---
JsonTypes\
UserType



## Agradecimentos:
Base de dados sql:\
https://github.com/chinnonsantos/sql-paises-estados-cidades/commits?author=chinnonsantos

Instrutor: André Luis gomes\
https://github.com/andrelugomes