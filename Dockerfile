FROM nejishow/javanx
WORKDIR /app
COPY target/game-0.0.1-SNAPSHOT.jar .
RUN chmod a+x start.sh
CMD ["./start.sh"]
