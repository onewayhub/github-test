FROM openjdk:8u171-jdk-slim

MAINTAINER one way

ADD github-test-1.0-SNAPSHOT.jar app.jar

VOLUME /tmp

VOLUME /home/github/logs

EXPOSE 8099

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","~/app.jar"]