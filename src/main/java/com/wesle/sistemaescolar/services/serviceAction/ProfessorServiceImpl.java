package com.wesle.sistemaescolar.services.serviceAction;

import com.wesle.sistemaescolar.dto.request.RegisterProfessorDTO;
import com.wesle.sistemaescolar.dto.response.ProfessorDTO;
import com.wesle.sistemaescolar.dto.response.StudentDTO;
import com.wesle.sistemaescolar.entities.Professor;
import com.wesle.sistemaescolar.repositories.ProfessorRepository;
import com.wesle.sistemaescolar.services.contract.ProfessorService;
import com.wesle.sistemaescolar.util.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

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
        Professor professor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity Not found"));
        return new ProfessorDTO(professor);
    }

    @Override
    public ProfessorDTO save(RegisterProfessorDTO registerProfessorDTO) {

        Professor entity = Mapper.parseObject(registerProfessorDTO, Professor.class);

        entity = repository.save(entity);
        return Mapper.parseObject(entity, ProfessorDTO.class);
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
