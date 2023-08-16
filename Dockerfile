FROM openjdk

WORKDIR /app

COPY target/estudo-docker-0.0.1-SNAPSHOT.jar /app/estudo-docker.jar

ENTRYPOINT ["java", "-jar", "estudo-docker.jar"]