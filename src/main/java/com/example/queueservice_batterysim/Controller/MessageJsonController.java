package com.example.queueservice_batterysim.Controller;

import com.example.queueservice_batterysim.dto.BatterySim;
import com.example.queueservice_batterysim.publisher.RabbitMQJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queue")
public class MessageJsonController {
    private RabbitMQJsonProducer jsonProducer;

    public MessageJsonController(RabbitMQJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }
    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody BatterySim sim){
        jsonProducer.sendJsonMessage(sim);
        return ResponseEntity.ok("Json Message Sent to RabbitMQ ...");
    }
}

