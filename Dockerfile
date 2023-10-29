FROM openjdk:17
ADD target/contatoapi.jar contatoapi.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "contatoapi.jar" ]