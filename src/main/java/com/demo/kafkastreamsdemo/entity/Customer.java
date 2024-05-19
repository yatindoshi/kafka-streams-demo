package com.demo.kafkastreamsdemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("sample")
@Data
@NoArgsConstructor
public class Customer {

    private String name;
    private String number;
    private Address address;

}
