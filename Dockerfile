FROM adoptopenjdk/openjdk11-openj9
COPY ./target/helloboost-0.0.1-SNAPSHOT.jar /helloworld.jar

CMD ["java", "-jar", "-Dspring.profiles.active=default", "/helloworld.jar"]

