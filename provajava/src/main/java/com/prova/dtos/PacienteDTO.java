package com.prova.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.prova.domains.Paciente;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PacienteDTO {
    private long idPaciente;

    @NotNull(message = "o campo nome não pode ser nulo")
    @NotBlank(message = "o campo nome não pode ser vazio")
    private String nome;

    @NotNull(message = "o campo salario não pode ser nulo")
    @Digits(integer = 15, fraction = 3)
    private BigDecimal custoInternacao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento = LocalDate.now();


    public PacienteDTO(Paciente paciente) {
        this.idPaciente = paciente.getIdPaciente();
        this.nome = paciente.getNome();
        this.custoInternacao = paciente.getCustoInternacao();
        this.dataNascimento = paciente.getDataNascimento();
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public @NotNull(message = "o campo nome não pode ser nulo") @NotBlank(message = "o campo nome não pode ser vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "o campo nome não pode ser nulo") @NotBlank(message = "o campo nome não pode ser vazio") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "o campo salario não pode ser nulo") @Digits(integer = 15, fraction = 3) BigDecimal getCustoInternacao() {
        return custoInternacao;
    }

    public void setCustoInternacao(@NotNull(message = "o campo salario não pode ser nulo") @Digits(integer = 15, fraction = 3) BigDecimal custoInternacao) {
        this.custoInternacao = custoInternacao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}