FROM nejishow/javanx
WORKDIR /app
RUN rm -r *
COPY target/game-0.0.1-SNAPSHOT.jar .
