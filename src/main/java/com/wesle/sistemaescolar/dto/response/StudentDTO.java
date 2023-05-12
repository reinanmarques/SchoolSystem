package com.wesle.sistemaescolar.dto.response;

import com.wesle.sistemaescolar.entities.Course;
import com.wesle.sistemaescolar.entities.Student;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class StudentDTO implements Serializable {

    private UUID id;

    @NotBlank @Size(max = 200)
    private String name;

    @Email @NotBlank
    private String email;

    @ManyToOne
    private Course course;

    private String registration;

    public StudentDTO(Student student) {
        this.name = student.getName();
        this.email = student.getEmail();
        this.course = student.getCourse();
        this.registration = student.getRegistration();
    }
}