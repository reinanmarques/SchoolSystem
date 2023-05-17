package com.wesle.sistemaescolar.services.contract;

import com.wesle.sistemaescolar.dto.request.RegisterProfessorDTO;
import com.wesle.sistemaescolar.dto.response.ProfessorDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ProfessorService {

    public Page<ProfessorDTO> findAll(Pageable pageable);
    public ProfessorDTO findById(UUID id);
    public ProfessorDTO save(RegisterProfessorDTO registerProfessorDTO);
    public ProfessorDTO update(UUID id, ProfessorDTO dto);
    public void delete(UUID id);
}
