package com.demo.kafkastreamsdemo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("sample")
@Data
public class Customer {

    private String name;
    private String number;
    private Address address;

}
