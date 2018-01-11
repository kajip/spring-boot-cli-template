#
# Copyright (c) 2017 Tomomi Kajita. All rights reserved.
#
FROM openjdk:8-jdk-alpine

LABEL  maintainer "Tomomi Kajita <t-kajita@biglobe.co.jp>"

ARG JAR_FILE

ENV JAVA_MEMORY_OPT="-Xmx512M -Xms512M -Xss1M"
ENV JAVA_OPT=""
ENV APP_OPT=""

VOLUME /tmp

ADD ${JAR_FILE} app.jar

ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom ${JAVA_MEMORY_OPT} ${JAVA_OPT} -jar app.jar ${APP_OPT}