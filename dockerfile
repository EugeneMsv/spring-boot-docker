FROM openjdk:8-jre-alpine
MAINTAINER Eugene Moiseev

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]


# Add the service itself
ARG JAR_FILE

ADD target/${JAR_FILE} /usr/share/myservice/myservice.jar