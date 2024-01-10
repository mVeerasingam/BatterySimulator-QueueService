# BatterySimulator-QueueService
Rabbit MQ Message Broker for simulation jobs.
This microservice is the producer for the BatterySim JSON Message to be consumed.

local port = 8081
rabbit mq port = 5672

## Instructions:
### Running the application From Docker:
- [Pull the Lithium Ion Battery Simulator Artifact Repository from Docker Hub](https://hub.docker.com/repository/docker/mveerasingam/batterysimulator_jobmanagerservice/general)
  - We found an issue when trying the command
    
    `docker pull mveerasingam/batterysimulator_jobmanagerservice`
    
    Produced an **Error response from daemon: manifest for mveerasingam/batterysimulator_jobmanagerservice:latest not found: manifest unknown: manifest unknown**
    
- You can pull each of the images individually
  
``
docker pull mveerasingam/batterysimulator_jobmanagerservice:battery-simulator-database
docker pull mveerasingam/batterysimulator_jobmanagerservice:battery-simulator-flask
docker pull mveerasingam/batterysimulator_jobmanagerservice:battery-simulator-job-manager
docker pull mveerasingam/batterysimulator_jobmanagerservice:battery-simulator-queue-service
docker pull mveerasingam/batterysimulator_jobmanagerservice:rabbitmq
``

- We've updated the [Docker Compose File in Job Manager to Containerise the above images from Docker](https://github.com/mVeerasingam/BatterySimulator-JobManager/blob/master/docker-compose.yml)
  
### To run on Localhost
- Download and Run DockerDesktop
- Run command ```docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.12.10-management```
- In applications.yml change the the to "host: localhost"
- Be sure to update the other urls in the other microservices.
- Send a POST request to http://localhost:8081/queue/publish

## Post Request
{
  "simulationType": "cell",
  "time": 1,
  "upperVoltage": 4.2,
  "lowerVoltage": 2.5,
  "nominalCell": 8,
  "controlCurrent": 4
}

### Type of SimulationTypes
- "cell" - Produces Single Cell Li-Ion Simulation

- "driveCycle" - Produces a single cell drive cycle

