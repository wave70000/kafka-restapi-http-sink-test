FROM adoptopenjdk/openjdk11:alpine-jre

VOLUME /tmp

EXPOSE 8443

ARG JAR_FILE=demo-0.0.1.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]