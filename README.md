# RestBasedWSSpringBoot
Technology:
Spring Boot (Spring MVC)
Sprint REST api’s like GET, PUT, POST, DELETE.
Postman
 
Below are the end points to test the application:

GET:
http://localhost:8080/persons/1 : This is GET request for getting specific Person
http://localhost:8080/persons/all : This is GET request for getting all the persons

PUT:
http://localhost:8080/persons/1 : With Method in Postman as PUT

In the body section:
{  
   "id":"1",
   "firstName":"CrisAA",
   "lastName":"Baker",
   "age":28
}

POST:
With Method in Postman as PUT
http://localhost:8080/persons/insertPerson

Inserting a new Data:
In the body section:
{  
   "id":"3",
   "firstName":"Nelson",
   "lastName":"Mandela",
   "age":28
}

DELETE:
http://localhost:8080/persons/3 
In Postman select DELETE operation.
