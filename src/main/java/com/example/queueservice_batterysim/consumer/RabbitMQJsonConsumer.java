//package com.example.queueservice_batterysim.consumer;
//
//import com.example.queueservice_batterysim.dto.BatterySim;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RabbitMQJsonConsumer {
//    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);
//
//    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
//    public void consumeJsonMessage(BatterySim sim){
//        LOGGER.info(String.format("Received JSON Message -> %s", sim.toString()));
//    }
//}
