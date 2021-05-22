FROM nejshow/game-gen
WORKDIR /app
RUN rm -r *
COPY target/game-0.0.1-SNAPSHOT.jar .
