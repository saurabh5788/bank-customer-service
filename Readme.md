Profiles
========
- local
- aws

Core Technologies & Version
===========================
- Spring Boot v2.6.10 with Spring v5.3.22
- Embedded Server Jetty
- Logging Log4j
- Spring Doc OpenAPI (Swagger)
- Hikari Connection Pooling (Spring Boot Default)

# Others
- Lombok
- Apache Commons
	- lang3
- Micrometer Prometheus

# Databases
- H2 (local Profile)
- MySQL (aws Profile)

# Local Setup
- Clone this Repository
- Build using command

	mvnw clean install

- Run using command

		java -jar target\customer-service-local.jar

# Available URLs
- http://localhost:8081/customer/api-docs
- http://localhost:8081/customer/api-docs.yaml
- http://localhost:8081/customer/actuator
- http://localhost:8081/customer/swagger-ui redirects to http://localhost:8081/customer/swagger-ui/index.html
- http://localhost:8081/customer/h2-console