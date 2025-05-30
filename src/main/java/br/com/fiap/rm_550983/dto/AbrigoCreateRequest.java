package br.com.fiap.rm_550983.dto;

import br.com.fiap.rm_550983.model.Abrigo;

public class AbrigoCreateRequest {
    private String nome;
    private String endereco;
    private int capacidadeMaxima;
    private int capacidadeAtual;
    private String status;

    public Abrigo toModel(){
        Abrigo abrigo = new Abrigo();
        abrigo.setNome(getNome());
        abrigo.setEndereco(getEndereco());
        abrigo.setCapacidadeMaxima(getCapacidadeMaxima());
        abrigo.setCapacidadeAtual(getCapacidadeAtual());
        return abrigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
