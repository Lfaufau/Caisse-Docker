FROM alpine:latest

RUN apk --update add openjdk8-jre

ADD app-java.jar /home/java-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/home/java-app.jar"]
#CMD ["/bin/sh"]
