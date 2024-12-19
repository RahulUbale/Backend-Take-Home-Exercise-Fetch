# Backend-Take-Home-Exercise-Fetch
Fetch 
# My Java Application with Docker

This project is a Java application packaged using Docker. Follow the steps below to build, run, and access the application.

## Prerequisites

- [Docker](https://www.docker.com/get-started) must be installed and running.

## Getting Started

### 1. Clone or Download the Repository

Clone the repository or download the project as a ZIP file.

```bash
git clone <repository-url>
cd <project-directory>
```
2. Build the Docker Image
Run the following command to build the Docker image:

```bash
docker build -t my-java-app .
```
3. Run the Docker Container
To start the application, use:

```bash

docker run -p 8080:8080 my-java-app
```
4. Access the Application
Once the container is running, open your browser and go to:

http://localhost:8080

API Documentation

For detailed API requests,
https://planetary-astronaut-138818.postman.co/workspace/p565-demo~5c66980a-4172-47b7-b062-8649d2f5f878/request/26468111-5188de6b-92ea-4605-b6e2-27d02c6bbc01?action=share&creator=26468111&ctx=documentation
