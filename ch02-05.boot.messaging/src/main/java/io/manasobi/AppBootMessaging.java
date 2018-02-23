package io.manasobi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppBootMessaging implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppBootMessaging.class, args);
    }

    @Autowired
    private Sender sender;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        sender.send("Hello Messaging!");
    }
}
