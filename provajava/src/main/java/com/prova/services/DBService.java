package com.prova.services;

import com.prova.domains.Medico;
import com.prova.domains.Paciente;
import com.prova.repositories.MedicoRepository;
import com.prova.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private MedicoRepository medicoRepo;

    @Autowired
    private PacienteRepository pacienteRepo;

    public void initDB(){
        Medico medico01 = new Medico(0,"Marcela",LocalDate.now(),new BigDecimal("5000.00"));
        Paciente paciente01 = new Paciente(0,"Richard",LocalDate.now(),new BigDecimal("2000.00"));

        medicoRepo.save(medico01);
        pacienteRepo.save(paciente01);
    }
}
