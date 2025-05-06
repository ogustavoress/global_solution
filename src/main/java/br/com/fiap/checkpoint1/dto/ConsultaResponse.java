package br.com.fiap.checkpoint1.dto;

import java.time.LocalDate;

public class ConsultaResponse {
    private Long id;
    private Long pacienteId;
    private Long profissionalId;
    private String dataConsulta;
    private String statusConsulta;
    private int quantidadeHoras;
    private double valorConsulta;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public ConsultaResponse toDto(ConsultaResponse consulta) {
        ConsultaResponse response = new ConsultaResponse();
        response.setId(consulta.getId());
        response.setPacienteId(consulta.getPacienteId());
        response.setProfissionalId(consulta.getProfissionalId());
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

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
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
    public LocalDate getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }  
    public LocalDate getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}