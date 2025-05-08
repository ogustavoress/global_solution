package br.com.fiap.checkpoint2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.fiap.checkpoint2.dto.ConsultaCreateRequest;
import br.com.fiap.checkpoint2.model.Consulta;

@Service
public class ConsultaService {

    private List<Consulta> consultas;
    private Long sequence = 1L;

    public Consulta createConsulta(ConsultaCreateRequest dto, PacienteService pacienteService,
            ProfissionalService profissionalService) {

        Consulta consulta = new Consulta();
        consulta.setId(sequence++);
        consulta.setProfissional(dto.getProfissionalId());
        consulta.setPaciente(dto.getPacienteId());
        consulta.setDataConsulta(dto.getDataConsulta());
        consulta.setStatusConsulta(dto.getStatusConsulta());
        consulta.setQuantidadeHoras(dto.getQuantidadeHoras());
        consulta.setValorConsulta(dto.getValorConsulta());
        return consulta;
    }

    public Optional<Consulta> updateConsulta(Long id, ConsultaCreateRequest dto) {
        return consultas.stream()
                .filter(consulta -> consulta.getId().equals(id))
                .findFirst()
                .map(consulta -> {
                    consulta.setProfissional(dto.getProfissionalId());
                    consulta.setPaciente(dto.getPacienteId());
                    consulta.setDataConsulta(dto.getDataConsulta());
                    consulta.setStatusConsulta(dto.getStatusConsulta());
                    consulta.setQuantidadeHoras(dto.getQuantidadeHoras());
                    consulta.setValorConsulta(dto.getValorConsulta());
                    return consulta;
                });
    }

    public boolean deleteConsulta(@PathVariable Long id) {
        return consultas.removeIf(consulta -> consulta.getId().equals(id));
    }

    public Optional<Consulta> getConsultaById(@PathVariable Long id) {
        return consultas.stream()
                .filter(consulta -> consulta.getId().equals(id))
                .findFirst();
    }
    
    public List<Consulta> getAll() {
        return consultas;
    }
}