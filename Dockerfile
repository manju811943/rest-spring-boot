FROM mcr.microsoft.com/openjdk/jdk:21-azurelinux
COPY target/rest-spring-boot.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "rest-spring-boot.jar"]
