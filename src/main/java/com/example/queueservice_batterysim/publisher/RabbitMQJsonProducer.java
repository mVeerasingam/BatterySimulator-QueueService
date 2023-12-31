package com.example.queueservice_batterysim.publisher;

import com.example.queueservice_batterysim.dto.BatterySimMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonProducer {
    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.json.name}")
    private String routingKeyJson;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonProducer.class);

    private RabbitTemplate rabbitTemplate;

    public RabbitMQJsonProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendJsonMessage(BatterySimMessage simMessage){
        LOGGER.info(String.format("Json Message Sent -> %s", simMessage.toString()));
        rabbitTemplate.convertAndSend(exchange, routingKeyJson, simMessage);
    }
}