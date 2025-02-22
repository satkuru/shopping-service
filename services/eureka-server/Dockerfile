FROM eclipse-temurin:21-jdk-jammy
RUN apt-get install -y --no-install-recommends curl && rm -rf /var/lib/apt/lists/*
VOLUME /tmp
ARG JAR_FILE=target/eureka-server-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]