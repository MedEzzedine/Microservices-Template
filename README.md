# Spring-Boot Microservices Template

This project is a template for bootstrapping microservices, using Spring Boot Cloud architecture.

## Microservices
This table contains each service in the project and its purpose:

| Service     | Description |
| ----------- | ----------- |
| Configuration server      | Centralized configuration of all microservices    |
| Eureka Server   | Acts as a service discovery server        |
| Gateway Server   | A simple gateway that directs traffic to discovery server       |
| Admin Server   | Offers a dashboard describing the state of all microservices      |

## To be added
Planning on adding an authentication server (Keycloak) that communicates with the gateway, in order to increase the security of the architecture using OAuth2.
