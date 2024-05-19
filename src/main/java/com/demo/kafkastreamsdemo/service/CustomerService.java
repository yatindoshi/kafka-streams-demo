package com.demo.kafkastreamsdemo.service;

import com.demo.kafkastreamsdemo.entity.Customer;
import com.demo.kafkastreamsdemo.repository.CustomerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;
    private ObjectMapper objectMapper;

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Customer insert(Customer customer){
        return customerRepository.insert(customer);
    }

    public Customer insert(String value){
        Customer customer;
        try {
            customer = objectMapper.readValue(value, Customer.class);
            return customerRepository.insert(customer);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Customer> findAllByPinCode(String pinCode){
        return customerRepository.findAllByPinCode(pinCode);
    }

}
