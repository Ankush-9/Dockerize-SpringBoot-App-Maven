FROM eclipse-temurin:17-jdk-jammy

MAINTAINER <your-name> <your-email>

COPY SpringBoot/target/<app-name.jar> /usr/app/

EXPOSE 8080

WORKDIR /usr/app

ENTRYPOINT ["java" ,"-jar" ,"<app-name.jar>"]
