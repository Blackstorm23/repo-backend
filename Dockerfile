FROM amazoncorretto:19-alpine-jdk

MAINTAINER Blackstorm23

COPY target/blackstorm23-0.0.1-SNAPSHOT.jar blackstorm23-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/blackstorm23-0.0.1-SNAPSHOT.jar"]