FROM nejishow/game-gen
WORKDIR /app
RUN rm -r *
COPY target/game-0.0.1-SNAPSHOT.jar .
CMD sed -i -e 's/$PORT/'"$PORT"'/g' /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'
