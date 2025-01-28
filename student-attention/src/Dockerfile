FROM openjdk:21-jdk-alpine 

WORKDIR /app

COPY target/student-attention.jar /app/app.jar 

EXPOSE 8080

CMD ["java", "-jar", "/app/app.jar"]