package org.example.demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@Setter
@Getter
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;
}
