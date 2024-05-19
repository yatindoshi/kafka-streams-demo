package com.demo.kafkastreamsdemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private String pinCode;
    private String state;
}
