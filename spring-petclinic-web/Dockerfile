FROM openjdk:8-jdk-alpine

LABEL maintainer="callicoder@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/spring-petclinic-web-0.0.4-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} spring-petclinic-web.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-petclinic-web.jar"]