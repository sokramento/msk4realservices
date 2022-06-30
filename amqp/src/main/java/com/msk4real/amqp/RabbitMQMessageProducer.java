package com.msk4real.amqp;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class RabbitMQMessageProducer {

    private final AmqpTemplate amqpTemplate;

    public void publish(Object payLoad, String exchange, String routingKey) {
        log.info("Publishing to {} using routing key {}. Payload: {}", exchange, routingKey, payLoad);
        amqpTemplate.convertAndSend(exchange, routingKey, payLoad);
        log.info("Publishing to {} using routing key {}. Payload: {}", exchange, routingKey, payLoad);
    }

}
