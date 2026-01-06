# Build Stage
#FROM gradle:jdk21-alpine AS build
FROM gradle:8.14.3-jdk21-corretto-al2023 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

# Run Stage
FROM eclipse-temurin:21-jre-alpine
EXPOSE 8080
COPY --from=build /home/gradle/src/build/libs/app.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
