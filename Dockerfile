FROM openjdk:17

EXPOSE 8080

ADD target/actions-poc.jar actions-poc.jar

ENTRYPOINT  ["java","-jar","/actions-poc.jar"]