FROM openjdk:27-ea-trixie
COPY target/messages-app.jar messages-app.jar
CMD ["java", "-jar", "messages-app.jar"]