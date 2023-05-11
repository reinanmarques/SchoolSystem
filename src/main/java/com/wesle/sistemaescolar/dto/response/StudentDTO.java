package com.wesle.sistemaescolar.dto.response;

import com.wesle.sistemaescolar.entities.Subject;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class StudentDTO implements Serializable {

    private UUID id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @Email
    @NotBlank
    private String email;

    private List<Subject> subjects = new ArrayList<>();

    private String registration;


}