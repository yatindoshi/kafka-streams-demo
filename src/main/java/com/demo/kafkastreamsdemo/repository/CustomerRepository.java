package com.demo.kafkastreamsdemo.repository;

import com.demo.kafkastreamsdemo.entity.Customer;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    List<Customer> findAll();

    @NotNull
    Customer insert(@NotNull Customer customer);

    @Query(value="{'address.pinCode':'?0'}")
    List<Customer> findAllByPinCode(String pinCode);
}
