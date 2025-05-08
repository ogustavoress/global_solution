package br.com.fiap.checkpoint1.dto;

import java.time.LocalDateTime;

import br.com.fiap.checkpoint1.model.Consulta;

public class ConsultaResponse {
    private Long id;
    private Long pacienteId;
    private Long profissionalId;
    private LocalDateTime dataConsulta;
    private String statusConsulta;
    private int quantidadeHoras;
    private double valorConsulta;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ConsultaResponse toDto(Consulta consulta) {
        ConsultaResponse response = new ConsultaResponse();
        response.setId(consulta.getId());
        response.setPacienteId(consulta.getPaciente());
        response.setProfissionalId(consulta.getProfissional());
        response.setDataConsulta(consulta.getDataConsulta());
        response.setStatusConsulta(consulta.getStatusConsulta());
        response.setQuantidadeHoras(consulta.getQuantidadeHoras());
        response.setValorConsulta(consulta.getValorConsulta());
        response.setCreatedAt(consulta.getCreatedAt());
        response.setUpdatedAt(consulta.getUpdatedAt());
        return response;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Long getProfissionalId() {
        return profissionalId;
    }

    public void setProfissionalId(Long profissionalId) {
        this.profissionalId = profissionalId;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(String statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}