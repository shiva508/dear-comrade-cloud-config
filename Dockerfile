FROM openjdk:17-alpine
WORKDIR /opt
ENV PORT 8888
EXPOSE 8888
COPY ../target/dear-comrade-cloud-config-0.0.1-SNAPSHOT.jar /opt/dear-comrade-cloud-config.jar
ENTRYPOINT exec java $JAVA_OPTS -jar dear-comrade-cloud-config.jar