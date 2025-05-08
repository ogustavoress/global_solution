package br.com.fiap.checkpoint2.dto;

import java.time.LocalDateTime;

public class ConsultaUpdateRequest {
    private LocalDateTime dataConsulta;
    private String statusConsulta;
    private int quantidadeHoras;
    
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
}
