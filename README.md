# Spring-Boot-Demo-2
Spring Boot Request Method Types(POST,GET, UPDATE,DELETE) using Services

## System Configuration

- Spring Tool Suite 3.9.9
- jre1.8.0_191
- apache-tomcat-8.5.43
- POSTMAN

## Dependency

- Refer pom.xml `<dependencies>` element

## Instructions to build Project

- Create a Maven Project (check create simple project)
- Update Java Libraries to 1.8(Existing JRE)
- Update dependencies in pom.xml 

[Optional]
- create application.properties with content
  `servlet:port=8081` in case server tomcat server port isn't working
- create 3 class `SecondSample`,`CustomerService`,`WebController`,`States` in package `com.demo`
- update the contents from the given files
- Run as Java Application


## For POSTMAN (for Testing)
NB: Set HEADER property `Content-Type` : `application/json`

 | Method| Function | URL | Body |
 |:--------:|:---------:|:------:|:---:|
 | GET | To retrive all the values | [localhost:8081/states](http://localhost:8081/states) |No|
 | POST | To add new values | [localhost:8081/states](http://localhost:8081/states)|Yes|
 | PUT | To update values | [localhost:8081/states/{id}](http://localhost:8081/states/101)|Yes|
 | DELETE | To delete value | [localhost:8081/states/{id}](http://localhost:8081/states/101)|No|






