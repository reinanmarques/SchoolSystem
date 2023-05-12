package com.wesle.sistemaescolar.services.serviceAction;

import com.wesle.sistemaescolar.dto.request.RegisterProfessorDTO;
import com.wesle.sistemaescolar.dto.request.RegisterStudentDTO;
import com.wesle.sistemaescolar.dto.response.ProfessorDTO;
import com.wesle.sistemaescolar.dto.response.StudentDTO;
import com.wesle.sistemaescolar.entities.Professor;
import com.wesle.sistemaescolar.repositories.ProfessorRepository;
import com.wesle.sistemaescolar.services.contract.ProfessorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProfessorServiceImpl implements ProfessorService {


    private ProfessorRepository repository;

    public ProfessorServiceImpl(ProfessorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<ProfessorDTO> findAll(Pageable pageable) {
        Page<Professor> page = repository.findAll(pageable);
        return page.map(ProfessorDTO::new);
    }

    @Override
    public ProfessorDTO findById(UUID id) {
        return null;
    }

    @Override
    public ProfessorDTO save(RegisterProfessorDTO registerProfessorDTO) {
        return null;
    }

    @Override
    public ProfessorDTO update(UUID id, StudentDTO dto) {
        return null;
    }

    @Override
    public Void delete(UUID id) {
        return null;
    }
}
