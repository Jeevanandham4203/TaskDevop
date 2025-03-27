FROM eclipse-temurin:17
COPY target/taskdev.jar taskdev.jar
CMD [ "java","-jar","taskdev.jar" ]