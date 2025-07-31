FROM mysql:latest


ENV MYSQL_DATABASE=plantDB
ENV MYSQL_ROOT_PASSWORD=rootpassword
ENV MYSQL_USER=plantuser
ENV MYSQL_PASSWORD=userpassword

COPY ./init-plantDB.sql /docker-entrypoint-initdb.d/

EXPOSE 3306