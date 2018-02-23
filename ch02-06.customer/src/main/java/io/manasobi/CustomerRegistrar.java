package io.manasobi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Lazy
@Component
public class CustomerRegistrar {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private Sender sender;


    public Customer register(Customer customer) {

        Optional<Customer> existingCustomer = customerRepo.findByName(customer.getName());

        if (existingCustomer.isPresent()) {
            throw new RuntimeException("is already exists");
        } else {
            customerRepo.save(customer);
            sender.send(customer.getEmail());
        }
        return customer;
    }

}
