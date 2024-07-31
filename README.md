# ActiveMQ Spring Boot Demo

This project demonstrates the use of ActiveMQ with Spring Boot for message production and consumption. It includes a simple REST API to send messages and consumes them asynchronously.

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [Setup and Installation](#setup-and-installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Logging](#logging)
- [Testing](#testing)
- [License](#license)

## Features

- Send messages to an ActiveMQ queue.
- Receive messages from the ActiveMQ queue.
- REST API for sending messages.
- Simple test endpoint for health checks.

## Requirements

- JDK 11 or higher
- Maven
- ActiveMQ server

## Setup and Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/activemq-demo.git
   cd activemq-demo
   ```

2. **Start ActiveMQ**

   Ensure that you have ActiveMQ running locally. You can download it from [ActiveMQ website](http://activemq.apache.org/). Start ActiveMQ using:

   - On Windows: `bin\activemq.bat start`
   - On Linux/Mac: `bin/activemq start`

3. **Build the Project**

   Use Maven to build the project:

   ```bash
   mvn clean install
   ```

4. **Run the Application**

   You can run the application using:

   ```bash
   mvn spring-boot:run
   ```

## Configuration

The application properties are defined in `src/main/resources/application.properties`. Make sure to set the following parameters according to your ActiveMQ configuration:

```properties
spring.application.name=activemq-demo
spring.activemq.broker-url=tcp://localhost:61616
spring.activemq.user=admin
spring.activemq.password=admin
spring.jms.template.default-destination=TEST.FOO
```

## Usage

Once the application is running, you can send messages to the ActiveMQ queue by making a POST request to the `/send` endpoint.

## Endpoints

### Send Message

- **URL:** `/send`
- **Method:** `POST`
- **Query Parameters:**
  - `message`: The message you want to send.
  
**Example Request:**

```bash
curl -X POST "http://localhost:8080/send?message=Hello%20ActiveMQ"
```

### Test Endpoint

- **URL:** `/test`
- **Method:** `GET`

**Example Request:**

```bash
curl -X GET "http://localhost:8080/test"
```

This endpoint can be used to verify if the application is running.

## Logging

Messages sent and received will be logged in the console:

- Sent Message: "Mensagem enviada: [message]"
- Received Message: "Mensagem recebida: [message]"

## Testing

You can run the tests using Maven:

```bash
mvn test
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
