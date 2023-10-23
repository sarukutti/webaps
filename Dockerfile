FROM eclipse-temurin:17
COPY target/webaps.jar	webaps.jar
CMD ["java","-jar","webaps.jar"]