package com.wesle.sistemaescolar.services.contract;

import com.wesle.sistemaescolar.dto.request.RegisterProfessorDTO;
import com.wesle.sistemaescolar.dto.request.RegisterStudentDTO;
import com.wesle.sistemaescolar.dto.response.ProfessorDTO;
import com.wesle.sistemaescolar.dto.response.StudentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface ProfessorService {

    public Page<ProfessorDTO> findAll(Pageable pageable);
    public ProfessorDTO findById(UUID id);
    public ProfessorDTO save(RegisterProfessorDTO registerProfessorDTO);
    public ProfessorDTO update(UUID id, StudentDTO dto);
    public Void delete(UUID id);
}
