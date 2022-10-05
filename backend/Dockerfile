### STAGE 1: Build ###
FROM gradle:7.5.1-jdk-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

### STAGE 2: Run ###
FROM openjdk:17-alpine
EXPOSE 8081
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/playground.jar
ENTRYPOINT ["java", "-jar","/app/playground.jar"]