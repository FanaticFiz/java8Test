package ru.fiz.java8_test.case1.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Artist {

    private String name;
    private String country;
    private String city;
    private Integer salary;
}
