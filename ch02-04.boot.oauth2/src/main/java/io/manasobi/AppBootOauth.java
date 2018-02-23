package io.manasobi;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@EnableAuthorizationServer
@EnableGlobalMethodSecurity
@EnableEncryptableProperties
@SpringBootApplication
public class AppBootOauth {

    public static void main(String[] args) {
        SpringApplication.run(AppBootOauth.class, args);
    }

}
