package io.manasobi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Receiver {

    @Autowired
    private Mailer mailer;

    @RabbitListener(queues = "CustomerQ")
    public void processMessage(String email) {
        log.info("email :: {}", email);
        mailer.sendMail(email);
    }

}
