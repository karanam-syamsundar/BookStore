FROM java:8-jdk-alpine
VOLUME /tmp
COPY target/online-bookstore-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch online-bookstore-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","online-bookstore-0.0.1-SNAPSHOT.jar"]