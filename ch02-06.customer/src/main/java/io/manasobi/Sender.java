package io.manasobi;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
class Sender {

    @Autowired
    private RabbitMessagingTemplate template;

    public void send(String message){
        template.convertAndSend("CustomerQ", message);
    }
}
