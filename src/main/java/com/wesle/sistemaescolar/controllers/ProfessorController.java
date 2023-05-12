package com.wesle.sistemaescolar.controllers;

import com.wesle.sistemaescolar.dto.request.RegisterProfessorDTO;
import com.wesle.sistemaescolar.dto.response.ProfessorDTO;
import com.wesle.sistemaescolar.services.contract.ProfessorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/v1/professors")
public class ProfessorController {

    private ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<Page<ProfessorDTO>> findAll(Pageable pageable){
            return  ResponseEntity.ok(service.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfessorDTO> findById(@PathVariable UUID id){
            return  ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<ProfessorDTO> save(@RequestBody RegisterProfessorDTO professorDTO, UriComponentsBuilder uriBuilder){
       ProfessorDTO profDTO = service.save(professorDTO);
        URI uri = uriBuilder.path("/users/{id}").buildAndExpand(profDTO.getId()).toUri();
            return  ResponseEntity.created(uri).body(profDTO);
    }
}
