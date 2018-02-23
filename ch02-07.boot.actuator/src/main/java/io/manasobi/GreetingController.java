package io.manasobi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GreetingController {

    @Autowired
    private TPSHealth health;

    @Autowired
    private CounterService counterService;

    @Autowired
    private GaugeService gaugeService;

    @CrossOrigin
    @RequestMapping("/greet")
    public Greet greet(){

        log.info("Serving Request....!!!");

        health.updateTx();

        counterService.increment("greet.txnCount");

        gaugeService.submit("greet.customgauge", 1.0);

        return new Greet("Hello World!");
    }
}
