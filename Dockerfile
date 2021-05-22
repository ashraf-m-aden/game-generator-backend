FROM nejishow/game-gen
WORKDIR /app
RUN rm start.sh
COPY start.sh .
RUN  chmod a+x start.sh
COPY target/game-0.0.1-SNAPSHOT.jar .
CMD sed -i -e 's/$PORT/'"$PORT"'/g' /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'
