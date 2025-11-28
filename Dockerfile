FROM openjdk:21-jdk
COPY target/rest-spring-boot.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "rest-spring-boot.jar"]