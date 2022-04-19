FROM adoptopenjdk/openjdk11:alpine-jre

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=demo-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} app.jar

ADD /demo-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]