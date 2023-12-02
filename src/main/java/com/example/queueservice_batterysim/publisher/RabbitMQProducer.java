package com.example.queueservice_batterysim.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.name}")
    private String routingKey;

    // lets use rabbitTemplate to send the messages. Spring Boot automatically configs this for us. We
    // just need to inject and use it

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQProducer.class);
    private RabbitTemplate rabbitTemplate;

    // we don't @Autowired because spring will automatically inject this dependency whenever it will find sinlge
    // Constructor in the spring Bean class
    public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info(String.format("Message Sent -> %s", message));
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }
}

