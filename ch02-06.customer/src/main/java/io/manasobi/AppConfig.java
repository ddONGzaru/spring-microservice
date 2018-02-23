package io.manasobi;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
@EntityScan(
        basePackageClasses = {Jsr310JpaConverters.class},
        basePackages = {"io.manasobi"}
)
public class AppConfig {

    @Bean
    public Queue queue() {
        return new Queue("CustomerQ", false);
    }

}