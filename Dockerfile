FROM nejishow/game-gen
WORKDIR /app
RUN rm start.sh
COPY start.sh .

COPY target/game-0.0.1-SNAPSHOT.jar .
CMD ["./start.sh"]
