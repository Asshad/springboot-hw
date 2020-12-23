# Spring Boot Hello World

A spring boot enabled hello world application


## Usage

- Directly using maven
```
mvn spring-boot:run
```

- From executable jar file
```
mvn clean install
java -jar target/helloboost-0.0.1-SNAPSHOT.jar
```

- To run this as a docker application (assumption docker is installed on your machine)
```
docker pull asshad/spring-hw
docker container run -p 8080:8080 -d asshad/spring-hw

Go to Browser and type http://localhost:8080/hello or do curl http://localhost:8080/hello on command prompt
```



