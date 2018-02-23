package io.manasobi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRegistrar customerRegistrar;

    @PostMapping("/reg")
    public Customer register(@RequestBody Customer customer) {
        return customerRegistrar.register(customer);
    }

}
