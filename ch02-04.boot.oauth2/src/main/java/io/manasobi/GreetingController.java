package io.manasobi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public Greet greet(){
        return new Greet("Hello World!");
    }
}
