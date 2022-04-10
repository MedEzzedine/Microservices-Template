FROM openjdk:11
VOLUME /tmp
COPY ConfigServer/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]