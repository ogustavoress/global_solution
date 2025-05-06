package br.com.fiap.checkpoint1.dto;

public class ProfissionalResponse {
    private String nome;
    private String especialidade;
    private double valorHora;
    private String createdAt;
    private String updatedAt;

    public ProfissionalResponse toDto(ProfissionalResponse profissional){
        ProfissionalResponse response = new ProfissionalResponse();
        response.setNome(profissional.getNome());
        response.setEspecialidade(profissional.getEspecialidade());
        response.setValorHora(profissional.getValorHora());
        response.setCreatedAt(profissional.getCreatedAt());
        response.setUpdatedAt(profissional.getUpdatedAt());
        return response;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    

}
