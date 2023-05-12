package com.wesle.sistemaescolar.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "courses")
@EqualsAndHashCode
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    @Size(max = 200)
    private String name;


    @ManyToMany
    @Setter(AccessLevel.NONE)

    @JoinTable(name = "course_subjects",
            joinColumns = @JoinColumn (name = "couse_id"),
                inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subject> subjects;


    @OneToMany(mappedBy = "course")
    @Setter(AccessLevel.NONE)
    private List<Student> students= new ArrayList<>();
    private String password;
}
