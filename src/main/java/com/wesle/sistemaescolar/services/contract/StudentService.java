package com.wesle.sistemaescolar.services.contract;

import com.wesle.sistemaescolar.dto.request.RegisterStudentDTO;
import com.wesle.sistemaescolar.dto.response.StudentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    public Page<StudentDTO> findAll(Pageable pageable);
    public StudentDTO findById(UUID id);
    public List<RegisterStudentDTO> save(RegisterStudentDTO registerStudentDTO);
    public StudentDTO update(UUID id, StudentDTO dto);
    public Void delete(UUID id);
}
