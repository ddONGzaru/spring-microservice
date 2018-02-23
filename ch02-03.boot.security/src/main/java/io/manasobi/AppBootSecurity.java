package io.manasobi;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableGlobalMethodSecurity
@EnableEncryptableProperties
@SpringBootApplication
public class AppBootSecurity {

    public static void main(String[] args) {
        SpringApplication.run(AppBootSecurity.class, args);
    }

}
