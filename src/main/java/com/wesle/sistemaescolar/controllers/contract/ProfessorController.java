package com.wesle.sistemaescolar.controllers.contract;

import com.wesle.sistemaescolar.dto.request.RegisterProfessorDTO;
import com.wesle.sistemaescolar.dto.response.ProfessorDTO;
import com.wesle.sistemaescolar.dto.response.StudentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;

public interface ProfessorController {

    public ResponseEntity<Page<ProfessorDTO>> findAll(Pageable pageable);
    public ResponseEntity<ProfessorDTO> findById(UUID id);
    public ResponseEntity<ProfessorDTO> save(RegisterProfessorDTO registerProfessorDTO, UriComponentsBuilder uriBuilder);
    public ResponseEntity<ProfessorDTO> update(UUID id, ProfessorDTO dto);
    public ResponseEntity<Void> delete(UUID id);
}
