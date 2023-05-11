package com.wesle.sistemaescolar.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity

@Table(name = "subjects")
public class Subject  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    @Size(max = 100)
    private String name;

    @ManyToOne
    @NotBlank
    private Professor professor;

    @ManyToMany(mappedBy = "subjects")
    private List<Student> alunos= new ArrayList<>();


}
