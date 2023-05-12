package com.wesle.sistemaescolar.dto.response;

import com.wesle.sistemaescolar.entities.Professor;
import com.wesle.sistemaescolar.entities.Subject;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class ProfessorDTO {

    private UUID id;

    @NotBlank
    private String name;

    @NotBlank @Email
    private String email;

    private List<Subject> subjectsTaught = new ArrayList<>();

    public ProfessorDTO(Professor professor) {

        this.id = professor.getId();
        this.name = professor.getName();
        this.email = professor.getEmail();
        this.subjectsTaught = professor.getSubjectsTaught();
    }
}
