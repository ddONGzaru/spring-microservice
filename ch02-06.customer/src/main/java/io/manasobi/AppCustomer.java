package io.manasobi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppCustomer implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppCustomer.class, args);
    }

    @Autowired
    private CustomerRepo repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        repo.save(Customer.of("Adam","adam@boot.com"));
        repo.save(Customer.of("John","john@boot.com"));
        repo.save(Customer.of("Smith","smith@boot.com"));
        repo.save(Customer.of("Edgar","edgar@boot.com"));
        repo.save(Customer.of("Martin","martin@boot.com"));
        repo.save(Customer.of("Tom","tom@boot.com"));
        repo.save(Customer.of("Sean","sean@boot.com"));

    }
}
