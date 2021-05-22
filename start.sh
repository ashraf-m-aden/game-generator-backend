#!/bin/bash

/usr/bin/java -jar -Dserver.port=8089 game-0.0.1-SNAPSHOT.jar ; sed -i -e 's/$PORT/'"$PORT"'/g' /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'
