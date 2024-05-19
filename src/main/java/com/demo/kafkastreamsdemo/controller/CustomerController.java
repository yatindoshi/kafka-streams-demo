package com.demo.kafkastreamsdemo.controller;

import com.demo.kafkastreamsdemo.entity.Customer;
import com.demo.kafkastreamsdemo.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("customers")
    public List<Customer> getCustomers(){
        return customerService.findAll();
    }

    @GetMapping("customers/{pinCode}")
    public List<Customer> getCustomers(@PathVariable String pinCode){
        return customerService.findAllByPinCode(pinCode);
    }

    @PostMapping("customers")
    public Customer addCustomers(@RequestBody Customer customer){
        return customerService.insert(customer);
    }
}
