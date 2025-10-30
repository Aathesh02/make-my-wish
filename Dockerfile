# Step 1: Use official OpenJDK 21 image
FROM eclipse-temurin:21-jdk

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy all project files
COPY . .

# Step 4: Build the project inside the container (skip tests)
RUN ./mvnw clean package -DskipTests

# Step 5: Run the generated jar
CMD ["java", "-jar", "target/sampleproject-0.0.1-SNAPSHOT.jar"]
