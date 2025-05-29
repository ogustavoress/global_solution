package br.com.fiap.checkpoint3.model;

public enum ConsultaStatus {
    AGENDADA("Consulta Agendada"),
    REALIZADA("Consulta Realizada"),
    CANCELADA("Consulta Cancelada");

    private String mensagem;

    //get e set de mensagem
    private ConsultaStatus(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

}
