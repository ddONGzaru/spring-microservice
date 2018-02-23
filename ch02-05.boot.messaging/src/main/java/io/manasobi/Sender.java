package io.manasobi;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private RabbitMessagingTemplate template;

    public void send(String message){
        template.convertAndSend("TestQ", message);
    }
}
