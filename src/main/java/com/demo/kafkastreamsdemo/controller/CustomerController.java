package com.demo.kafkastreamsdemo.controller;

import com.demo.kafkastreamsdemo.entity.Customer;
import com.demo.kafkastreamsdemo.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;
    
    @GetMapping("customers")
    public List<Customer> getCustomers(){
        return customerService.findAll();
    }
}
