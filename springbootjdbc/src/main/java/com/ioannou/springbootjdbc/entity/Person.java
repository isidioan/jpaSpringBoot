package com.ioannou.springbootjdbc.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Person {
    int id;
    String name;
    String location;
    Date birthDate;
}
