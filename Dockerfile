FROM eclipse-temurin:17-jdk-alpine
EXPOSE 9090
COPY target/SpringBoot-Docker.jar SpringBoot-Docker.jar
ENTRYPOINT ["java","-jar","/SpringBoot-Docker.jar"]