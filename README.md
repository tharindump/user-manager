# user-manager-backend
This is a example project for managing users with RESTful web API

# Compile & packaging
Compile & package the project using `mvn clean package -U`
Find the jar file in the target folder, & run it or you can use `mvn spring-boot:run`

The REST web service will run on 8080 (default tomcat) port.

# Endpoints
`GET`    localhost:8080/users - list all the users

`POST`   localhost:8080/users - add a single user to the list

`DELETE` localhost:8080/users/{username} - delete the user with username from the list

`GET`    localhost:8080/users/{username} - returns the user with username
