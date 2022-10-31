FROM openjdk:11
#Create the app directory
WORKDIR /app
#Expose application port
EXPOSE 8080
#Copy the final application artifact
COPY ./target/*.jar ./bobocode-jpa.jar
#Execute the application
CMD ["java", "-jar", "/app/bobocode-jpa.jar"]
