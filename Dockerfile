FROM openjdk:8-jdk-alpine
# FROM openjdk:latest
ENV APP_ROOT=/app
RUN mkdir ${APP_ROOT}
COPY target/config-server-0.0.1-SNAPSHOT.jar ${APP_ROOT}
WORKDIR ${APP_ROOT}
EXPOSE 8888
VOLUME ${APP_ROOT}/config
CMD ["java", "-jar", "config-server-0.0.1-SNAPSHOT.jar", "--spring.cloud.config.server.git.uri=file:${APP_ROOT}/config"]
