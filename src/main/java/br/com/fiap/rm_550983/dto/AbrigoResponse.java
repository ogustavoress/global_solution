package br.com.fiap.rm_550983.dto;

import br.com.fiap.rm_550983.model.Abrigo;

public class AbrigoResponse {
    private Long id;
    private String nome;
    private String endereco;
    private int capacidadeMaxima;
    private int capacidadeAtual;

    public AbrigoResponse toDto(Abrigo abrigo) {
        this.setId(abrigo.getId());
        this.setNome(abrigo.getNome());
        this.setEndereco(abrigo.getEndereco());
        this.setCapacidadeMaxima(abrigo.getCapacidadeMaxima());
        this.setCapacidadeAtual(abrigo.getCapacidadeAtual());
        return this;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
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

}