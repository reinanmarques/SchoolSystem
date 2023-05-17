package com.wesle.sistemaescolar.services.serviceAction;

import com.wesle.sistemaescolar.dto.request.RegisterStudentDTO;
import com.wesle.sistemaescolar.dto.response.StudentDTO;
import com.wesle.sistemaescolar.entities.Student;
import com.wesle.sistemaescolar.repositories.StudentRepository;
import com.wesle.sistemaescolar.services.contract.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImp implements StudentService {

    final
    StudentRepository repository;

    public StudentServiceImp(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<StudentDTO> findAll(Pageable pageable) {
        Page<Student> pageStudent =  repository.findAll(pageable);

        return pageStudent.map(StudentDTO::new);
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
