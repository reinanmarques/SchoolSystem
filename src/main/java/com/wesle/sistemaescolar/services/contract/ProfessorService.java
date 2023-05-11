package com.wesle.sistemaescolar.services.contract;

import com.wesle.sistemaescolar.dto.request.RegisterStudentDTO;
import com.wesle.sistemaescolar.dto.response.StudentDTO;

import java.util.List;
import java.util.UUID;

public interface ProfessorService {

    public List<StudentDTO> findAll();
    public StudentDTO findById(UUID id);
    public List<RegisterStudentDTO> save(RegisterStudentDTO registerStudentDTO);
    public StudentDTO update(UUID id, StudentDTO dto);
    public Void delete(UUID id);
}
