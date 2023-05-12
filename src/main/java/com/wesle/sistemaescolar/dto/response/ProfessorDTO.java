package com.wesle.sistemaescolar.dto.response;

import com.wesle.sistemaescolar.entities.Professor;
import com.wesle.sistemaescolar.entities.Subject;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class ProfessorDTO {

    private UUID id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotBlank @Email
    private String email;

    @Setter(AccessLevel.NONE)
    private List<Subject> subjectsTaught = new ArrayList<>();

    public ProfessorDTO(Professor professor) {

        this.id = professor.getId();
        this.name = professor.getName();
        this.email = professor.getEmail();
        this.subjectsTaught = professor.getSubjectsTaught();
    }
}
