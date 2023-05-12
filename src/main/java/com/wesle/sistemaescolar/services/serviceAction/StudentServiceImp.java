package com.wesle.sistemaescolar.services.serviceAction;

import com.wesle.sistemaescolar.dto.request.RegisterStudentDTO;
import com.wesle.sistemaescolar.dto.response.StudentDTO;
import com.wesle.sistemaescolar.services.contract.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public class StudentServiceImp implements StudentService {
    @Override
    public Page<StudentDTO> findAll(Pageable pageable) {
        return null;
    }
    @Override
    public StudentDTO findById(UUID id) {
        return null;
    }

    @Override
    public List<RegisterStudentDTO> save(RegisterStudentDTO registerStudentDTO) {
        return null;
    }

    @Override
    public StudentDTO update(UUID id, StudentDTO dto) {
        return null;
    }

    @Override
    public Void delete(UUID id) {
        return null;
    }
}
