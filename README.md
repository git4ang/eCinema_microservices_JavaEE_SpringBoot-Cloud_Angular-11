# eCinema Microservice (fullStack Project): Java EE & Angular 11

***
***
Project developed in **Java EE** with **Spring 5 framework** (+ Spring Boot & Spring Cloud) and frontend (Angular 11, bootstrap 4).

- The goal of this project is to implement a Java EE web application on the backend side and Angular 7 on the frontend side for managing the Cinema entity.
  This project concerns the implementation of JPA-2, JUnit-Mockito, Hibernate 6, Spring 5 (MVC, IOC, Spring security, Spring boot, Spring cloud ... etc),
  microservices (config-server, eureka-server, gateway-server, open feign, loadbalancer, Hateoas, actuator...etc), JWT, MySQL Database, H2 Database, GIT, Maven, docker,
  Angular 11, Boostrap 4… etc.
***
## Backend side: Java EE & Spring 5 (Spring Boot 2.52 & Spring Cloud)

### Technologies:

|            1              |                 2                 |          3            |                   4                   |   
|           ---             |                ---                |         ---           |                  ---                  |
| Java EE 			        | Spring 5		                    | H2 Database			| Unit Test
| Declarative programming	| Spring Boot 2.52	Spring          | Data Reactive MongoDB	| Maven
| Functional programming	| Spring Cloud 2020.0.3	            | PostgreSQL Driver		| Git
| Reactive programming 	    | Spring Reactive Web	            | MySQL DRIVER			| Lombok
| Java JDK-16               | Spring Web						| ELK - Elasticsearch, Logstash & Kibana                      | Spring Boot DevTools
|                           | Spring Security					| 	                    | java-jwt (Json Web Token)
|                           | Spring Data JPA					| 	                    | Spring Cloud Sleuth
|                           | Rest Repositories					|                       | Spring Cloud Sleuth Zipkin
|                           | Spring Data Rest					|                       | Spring Validation (V. Hibernate JPA)
|                           | Spring Cloud Gateway				| 	                    | Springdoc OpenApi 3.0
|                           | Spring Cloud Config client/server	| 		                | Spring Configuration Processor
|                           | Eureka Discovery client/server    |                       | Docker, Docker-Compose
|                           | Spring HATEOAS                    |                       | 
|                           | Spring Cloud LoadBalancer         |                       |
|                           | Spring Cloud Consul
|                           | Spring Boot Actuator
|                           | Spring Cloud OpenFeign

### Objective and detail of the project

- Each **City entity** is defined by his id, a name and his coordinate position.
- Each **Cinema entity** is defined by his id, name, address, rooms collection & City entity.
- Each **Room entity** is defined by his id, name, number of seats, Cinema entity & seats collection.
- Each **Seat entity** is defined by his id, rowSeat, columnSeat, seatNumber & Room entity.
- Each **Category entity** is defined by his id, name, movies collection.
- Each **Movie entity** is defined by his id, title, releaseDate, runningTime, director, actors, country, languages, photo, description.
- Each **MovieProjection entity** is defined by his id, dateProjection, price, Movie entity & Room entity.
- Each **MovieSession entity** id defined by his id, movieProjection entity.
- Each **MovieTicket entity** is defined by his id, price, codePayment, isReserved, Seat entity & movieProjection entity.
- Each **CustomerReact entity** is defined by his id, name, address, phoneNumber & user entity.
- Each **RoleReact entity** is defined by his id, roleName & users collection.
- Each **UserReact entity** is defined by his id, username, password, email, enabled & roles collection.

***The last 3 entities (CustomerReact, UserReact & RoleReact) are implemented in reactive programming***
***
### The creation of the project is based on the following points that will be detailed below:

- [x] Project initial (multiProject)

***
- [x] M01-config-server module creation.
    - Spring Cloud Config provides server-side and client-side support for externalized configuration in a distributed system.
      With the Config Server, you have a central place to manage external properties for applications across all environments.

***
- [x] M02-config-eureka module creation.
    - Eureka Server is an application that holds the information about all client-service applications.
      Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address.

***  
- [x] M03-config-gateway module creation.
    - An API Gateway is a server that is the single entry point into the system. All requests from clients first go through the API Gateway.
      It then routes requests to the appropriate microservice.

***  
- [x] M10-city-microservice module creation.
    - Set up the M10-city-microservice module with the creation of the necessary packages such as: entities, repositories, restControllers, services, exceptions, proxies ... etc

***
- [x] M11-cinema-microservice module creation.
    - Set up the M11-cinema-microservice module with the creation of the necessary packages such as: entities, repositories, restControllers, services, exceptions, proxies ... etc

***
- [x] M12-movie-microservice module creation.
    - Set up the M12-movie-microservice module with the creation of the necessary packages such as: entities, repositories, restControllers, services, exceptions, proxies ... etc

***
- [x] M13-ticket-microservice module creation.
    - Set up the M13-ticket-microservice module with the creation of the necessary packages such as: entities, repositories, restControllers, services, exceptions, proxies ... etc

***
- [x] M00-user-microservice module creation.
    - Set up the M00-ticket-microservice module with the creation of the necessary packages such as: entities, repositories, restControllers, services, exceptions, proxies ... etc

***
- [x] **Zipkin server** and **Sleuth** for all microservices modules.
    - [x] **M10-city-microservice**
    - [x] **M11-cinema-microservice**
    - [x] **M12-movie-microservice**
    - [x] **M13-ticket-microservice**
    - [x] **M00-user-microservice**
    - **Docker:** docker run -d -p 9411:9411 openzipkin/zipkin
    - **Java:** curl -sSL https://zipkin.io/quickstart.sh | bash -s java -jar zipkin.jar

***    
- [x] Swagger2 config for all microservices modules.
    - [x] **M10-city-microservice**
    - [x] **M11-cinema-microservice**
    - [x] **M12-movie-microservice**
    - [x] **M13-ticket-microservice**
        - [**Swagger-url cinema**] (http://localhost:8080/cinema-microservice/swagger-ui/)

***
- [x] Validations JPA for the module **M10-city-microservice**.
- [x] Validations JPA for the module **M11-cinema-microservice**.
- [x] Validations JPA for the module **M12-movie-microservice**.
- [x] Validations JPA for the module **M13-ticket-microservice**.
- [x] Validations JPA for the module **M00-user-microservice**.

***
- [ ] Spring Security for the **M01-config-server**
- [ ] Spring Security for the **M02-eureka-server**
- [ ] Spring Security for the **M03-gateway-server**
- [ ] Spring Security & JWT for the **M10-city-microservice**
- [ ] Spring Security & JWT for the **M11-cinema-microservice**
- [ ] Spring Security & JWT for the **M12-movie-microservice**
- [ ] Spring Security & JWT for the **M13-ticket-microservice**
- [ ] Spring Security & JWT for the **M00-user-microservice**

***
- [ ] **JWT (Json Web Token)** for the M03-Gateway-server & all microservices

***
- [ ] Spring Boot Admin/Client for all microservices.
    - codecentric’s Spring Boot Admin is a community project to manage and monitor your Spring Boot ® applications. The applications register with our Spring Boot Admin Client (via HTTP) or are discovered using Spring Cloud ® (e.g. Eureka, Consul). The UI is just a Vue.js application on top of the Spring Boot Actuator endpoints.

***
- [ ] Change Swagger 2.0 by OpenApi 3.0 Specification in all microservices
    - [**OpenApi-url cinema**] => (http://localhost:8080/cinema-microservice/swagger-ui.html/)

***
- [ ] Unit Tests for the module **M10-city-microservice**.
- [ ] Unit Tests for the module **M11-cinema-microservice**.
- [ ] Unit Tests for the module **M12-movie-microservice**.
- [ ] Unit Tests for the module **M13-ticket-microservice**.
- [ ] Unit Tests for the module **M00-user-microservice**.

***   
- [ ] ELK - Elasticsearch, logstash & kibana.
    - "ELK" is the acronym for three open source projects: Elasticsearch, Logstash, and Kibana. Elasticsearch is a search and analytics engine. Logstash is a server‑side data processing pipeline that ingests data from multiple sources simultaneously, transforms it, and then sends it to a "stash" like Elasticsearch. Kibana lets users visualize data with charts and graphs in Elasticsearch.


***
***
## Frontend side: Angular 11 & Boostrap 4
***
***  
    