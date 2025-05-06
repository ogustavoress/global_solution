package br.com.fiap.checkpoint1.dto;

import java.time.LocalDateTime;

public class ConsultaCreateRequest {
    private Long pacienteId;
    private Long profissionalId;
    private LocalDateTime dataConsulta;
    private String statusConsulta;
    private int quantidadeHoras;
    private double valorConsulta;
    
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
    
    



}
