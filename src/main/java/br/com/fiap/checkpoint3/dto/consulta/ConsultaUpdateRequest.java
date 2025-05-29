package br.com.fiap.checkpoint3.dto.consulta;

import java.math.BigInteger;
import java.time.LocalDateTime;

import br.com.fiap.checkpoint3.model.ConsultaStatus;

public class ConsultaUpdateRequest {
    private Long pacienteId;
    private Long profissionalId;
    private LocalDateTime data;
    private ConsultaStatus status;
    private BigInteger quantidadeHoras;

    public Long getPacienteId() {
        return pacienteId;
    }

    public Long getProfissionalId() {
        return profissionalId;
    }

    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public ConsultaStatus getStatus() {
        return status;
    }
    public void setStatus(ConsultaStatus status) {
        this.status = status;
    }

    public BigInteger getQuantidadeHoras() {
        return quantidadeHoras;
    }
    public void setQuantidadeHoras(BigInteger quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}
