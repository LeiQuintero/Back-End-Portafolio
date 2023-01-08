FROM amazoncorretto:8-alpine-jdk
MAINTAINER emaaristimuno
EXPOSE 8080
COPY ./target/PortafolioLeidy-0.0.1-SNAPSHOT.jar PortafolioLeidy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/PortafolioLeidy-0.0.1-SNAPSHOT.jar"]