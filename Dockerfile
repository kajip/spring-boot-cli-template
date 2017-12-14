#
# Copyright (c) 2017 Tomomi Kajita. All rights reserved.
#
FROM alpine:latest

MAINTAINER Tomomi Kajita <t-kajita@biglobe.co.jp>

ENV JAVA_HOME=/usr/lib/jvm/default-jvm
ENV JAVA_MEMORY_OPT="-Xmx512M -Xms512M -Xss1M"
ENV JAVA_OPT=""

RUN apk update
RUN apk add --no-cache openjdk8

ADD build/libs/cli-template-1.0.jar /opt/cli-template.jar

CMD ${JAVA_HOME}/bin/java ${JAVA_MEMORY_OPT} ${JAVA_OPT} -jar /opt/cli-template.jar