FROM alpine:latest

RUN apk --update add openjdk8-jre

ADD gs-mysql-data-0.1.0.jar /home/java-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/home/java-app.jar"]
