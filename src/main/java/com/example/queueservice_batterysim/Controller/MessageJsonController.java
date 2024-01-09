package com.example.queueservice_batterysim.Controller;

import com.example.queueservice_batterysim.dto.BatterySimMessage;
import com.example.queueservice_batterysim.publisher.RabbitMQJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queue")
public class MessageJsonController {
    private RabbitMQJsonProducer jsonProducer;
    private long uniqueId = 0;

    public MessageJsonController(RabbitMQJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }
    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody BatterySimMessage simMessage){
        simMessage.setId(++uniqueId);
        jsonProducer.sendJsonMessage(simMessage);
        return ResponseEntity.ok("Simulation Data sent to Rabbit MQ. \nYour simulation ID is: " + simMessage.getId());
    }
}

