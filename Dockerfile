FROM nejishow/game-gen
WORKDIR /app
COPY target/game-0.0.1-SNAPSHOT.jar .
CMD ["./start.sh"]
