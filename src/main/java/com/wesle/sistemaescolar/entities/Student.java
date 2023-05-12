package com.wesle.sistemaescolar.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;


@Data
@Table(name = "students")
@Entity
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO  )
    private UUID id;

    @NotBlank @Size(max = 200)
    private String name;

    @Email @NotBlank
    private String email;

    @ManyToOne
    private Course course;

    private String registration;

    private String password;


}
