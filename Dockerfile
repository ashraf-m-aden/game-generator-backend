FROM nejishow/javanx
WORKDIR /app
COPY target/game-0.0.1-SNAPSHOT.jar .
CMD ["./start.sh"]
