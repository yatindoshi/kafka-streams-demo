package com.demo.kafkastreamsdemo.service;

import com.demo.kafkastreamsdemo.entity.Customer;
import com.demo.kafkastreamsdemo.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

}
