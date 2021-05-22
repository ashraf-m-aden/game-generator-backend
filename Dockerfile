FROM nejishow/game-gen
WORKDIR /app
RUN rm start.sh
COPY start.sh .
RUN  chmod a+x start.sh
COPY target/game-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java -jar -Dserver.port=8089 game-0.0.1-SNAPSHOT.jar" ]
CMD [ "start.sh" ]
