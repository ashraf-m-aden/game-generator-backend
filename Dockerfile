
FROM amazoncorretto:11-alpine
EXPOSE 8080
WORKDIR /app
COPY target/game-0.0.1-SNAPSHOT.war .
ENTRYPOINT [ "java", "-jar -Dserver.port=$PORT", "game-generator-0.0.1-SNAPSHOT.war"]