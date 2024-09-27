package com.prova.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.prova.domains.Medico;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MedicoDTO {
    private long idMedico;

    @NotNull(message = "o campo nome não pode ser nulo")
    @NotBlank(message = "o campo nome não pode ser vazio")
    private String nome;

    @NotNull(message = "o campo salario não pode ser nulo")
    @Digits(integer = 15, fraction = 3)
    private BigDecimal salario;

    @JsonFormat (pattern = "dd/MM/yyyy")
    private LocalDate dataContratacao = LocalDate.now();


    public long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(long idMedico) {
        this.idMedico = idMedico;
    }

    public @NotNull(message = "o campo nome não pode ser nulo") @NotBlank(message = "o campo nome não pode ser vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "o campo nome não pode ser nulo") @NotBlank(message = "o campo nome não pode ser vazio") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "o campo salario não pode ser nulo") @Digits(integer = 15, fraction = 3) BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "o campo salario não pode ser nulo") @Digits(integer = 15, fraction = 3) BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public MedicoDTO(Medico medico) {
        this.idMedico = medico.getIdMedico();
        this.nome = medico.getNome();
        this.salario = medico.getSalario();
        this.dataContratacao = medico.getDataContratacao();


    }}



