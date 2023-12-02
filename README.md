# BatterySimulator-QueueService
Rabbit MQ Message Broker for simulation jobs.

local port = 8081Q
rabbit mq port = 5672

## Instructions:
- Download and Run DockerDesktop
- Run command ```docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.12.10-management```
- send a POST request to http://localhost:8081/queue/publish

 {
  "time": 1,
  "upperVoltage": 4.2,
  "lowerVoltage": 2.5,
  "nominalCell": 7,
  "controlCurrent": 3
}


