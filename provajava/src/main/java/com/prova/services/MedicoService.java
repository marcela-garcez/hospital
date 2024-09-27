package com.prova.services;

import com.prova.dtos.MedicoDTO;
import com.prova.dtos.PacienteDTO;
import com.prova.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepo;

    public List<MedicoDTO> findAll(){
        return medicoRepo.findAll().stream()
                .map(obj -> new MedicoDTO(obj))
                .collect(Collectors.toList());
    }
}
