FROM openjdk:11
#Create the app directory
WORKDIR /app
#Expose application port
EXPOSE 8080
ARG JAR_FILE=./target/*.jar
#Copy the final application artifact
COPY $JAR_FILE ./bobocode-jpa.jar
#Execute the application
CMD ["java", "-jar", "/app/bobocode-jpa.jar"]
