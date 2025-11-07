package com.eazybytes.eazyschool.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "class")
public class EazyClass extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private int classId;

    @NotBlank(message = "Name Must Not be blank")
    @Size(min = 3 , message = "Name Must be at least 3 Characters Long")
    private String name;

    @OneToMany(mappedBy = "eazyClass" , fetch = FetchType.LAZY , targetEntity = Person.class,
    cascade = CascadeType.PERSIST)
    private Set<Person> persons;

}
