FROM maven:3.5.2-jdk-8-alpine

COPY /target/sampleapi-0.0.1-SNAPSHOT.jar sampleapi.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/sampleapi.jar"]