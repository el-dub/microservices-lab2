#
# Build stage
#
FROM maven:3.8.5-openjdk-17-slim AS build
COPY src /build/src
COPY pom.xml /build
RUN mvn -f /build/pom.xml package

#
# Package stage
#
FROM openjdk:17-slim
COPY --from=build /build/target/service2-0.0.1-SNAPSHOT.jar /app/service2.jar
ENTRYPOINT ["java","-jar", "/app/service2.jar"]