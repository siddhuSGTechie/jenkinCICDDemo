FROM openjdk:11

COPY target/srmapp.jar  /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","srmapp.jar"]