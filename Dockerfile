FROM openjdk:17-alpine
WORKDIR /app
COPY . .
CMD ["./gradlew","bootRun"]
# EXPOSE 8080
