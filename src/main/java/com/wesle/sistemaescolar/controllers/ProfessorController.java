package com.wesle.sistemaescolar.controllers;

import com.wesle.sistemaescolar.dto.response.ProfessorDTO;
import com.wesle.sistemaescolar.services.contract.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/professors")
public class ProfessorController {


    private ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }


    @GetMapping
    public Page<ProfessorDTO> findAll(Pageable pageable){
            return  service.findAll(pageable);
    }
}
