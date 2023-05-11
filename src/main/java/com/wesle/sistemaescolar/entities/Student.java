package com.wesle.sistemaescolar.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
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

    @ManyToMany
    @JoinTable(name = "tb_alunos_subjects", joinColumns = @JoinColumn(name = "aluno_id"), inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subject> subjects = new ArrayList<>();

    private String registration;

    private String password;


}
