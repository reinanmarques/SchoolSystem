package com.wesle.sistemaescolar.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity

@Table(name = "professors")
public class Professor  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotBlank
    @Email
    private String email;
    @OneToMany(mappedBy = "professor")
    @Setter(AccessLevel.NONE)
    private List<Subject> subjectsTaught = new ArrayList<>();

    private String password;


}
