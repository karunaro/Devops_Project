FROM openjdk:8-jdk-alpine
EXPOSE 8086
ADD target/timesheet-1.0-SNAPSHOT.war timesheet-1.0-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/timesheet-1.0-SNAPSHOT.war"]