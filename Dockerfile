FROM openjdk:21-jdk
MAINTAINER Savelyev Alexander
COPY target/pastebox-0.0.1-SNAPSHOT.jar pastebox.jar
ENTRYPOINT ["java","-jar","/pastebox.jar"]