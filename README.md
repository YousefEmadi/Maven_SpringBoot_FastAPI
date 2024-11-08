# Maven_SpringBoot_FastAPI
## By: Yousef Emadi

## Overview

A simple REST API built with Java Spring Boot (Java 11). It supports basic GET and POST operations to retrieve and add messages. The application is packaged as an executable JAR file for easy distribution. 

## Features

- **GET /api/messages**: Retrieve all messages.
- **POST /api/messages**: Add a new message.
- Preloaded with one dummy message on startup.

## Dependencies:
- **Java 11** installed
- **Maven 3.9.9**

## Project Structure
src/
├── main/java/com/example/myapi
│   ├── Application.java       # Main entry point
│   ├── controller/ApiController.java # REST Controller
│   └── model/Message.java     # Message entity
└── resources/application.properties

### Run the Application

1. **Build the JAR**:
   ```
   mvn clean package
   
   java -jar target/fast_api-0.0.1-SNAPSHOT.jar
```

### Test Endpoints:

`GET: http://localhost:8080/api/messages`
`POST: http://localhost:8080/api/messages`

Example JSON for POST:
json
Copy code
```
{
  "content": "Some dummy data!",
  "sender": "Josepe"
}
```


