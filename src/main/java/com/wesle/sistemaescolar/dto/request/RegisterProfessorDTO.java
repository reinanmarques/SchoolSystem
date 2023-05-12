package com.wesle.sistemaescolar.dto.request;

import com.wesle.sistemaescolar.entities.Subject;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class RegisterProfessorDTO {

    private UUID id;
    @Email @NotBlank
    private String name;

    @NotBlank
    private String email;

    private List<Subject> subjectsTaught = new ArrayList<>();
    private String password;
}
