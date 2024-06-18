package com.ajtech.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "employee")
public class Employee {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String city;

}
