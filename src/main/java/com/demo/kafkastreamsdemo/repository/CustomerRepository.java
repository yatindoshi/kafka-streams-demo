package com.demo.kafkastreamsdemo.repository;

import com.demo.kafkastreamsdemo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    List<Customer> findAll();
}
