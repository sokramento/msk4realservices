package com.msk4real.notification;

import com.msk4real.amqp.RabbitMQMessageProducer;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication(
        scanBasePackages = {
                "com.msk4real.notification",
                "com.msk4real.amqp"
        }
)
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(
//            RabbitMQMessageProducer producer,
//            NotificationConfig notificationConfig,
//            RabbitAdmin rabbitAdmin
//    ) {
//        return args -> {
//            rabbitAdmin.declareExchange(new TopicExchange(notificationConfig.getInternalExchange()));
//            producer.publish(new Person("Ali", 18),
//                    notificationConfig.getInternalExchange(),
//                    notificationConfig.getInternalNotificationRoutingKey());
//        };
//    }
//
//    record Person(String name, Integer age){
//
//    }
}


