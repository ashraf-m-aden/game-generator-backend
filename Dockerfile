
FROM nejishow/javanx
WORKDIR /app
COPY target/game-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar -Dserver.port=8089", "game-0.0.1-SNAPSHOT.jar"]