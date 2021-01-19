FROM openjdk:11

ENV APP_HOME /apps
WORKDIR $APP_HOME

ENV PORT 8081
EXPOSE $PORT
COPY target/*.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]