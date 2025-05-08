package br.com.fiap.checkpoint1.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.checkpoint1.dto.ConsultaCreateRequest;
import br.com.fiap.checkpoint1.dto.ConsultaResponse;
import br.com.fiap.checkpoint1.service.ConsultaService;
import br.com.fiap.checkpoint1.service.PacienteService;
import br.com.fiap.checkpoint1.service.ProfissionalService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;
    private PacienteService pacienteService;
    private ProfissionalService profissionalService;

    @PostMapping
    public ResponseEntity<ConsultaResponse> createConsulta(@RequestBody ConsultaCreateRequest dto) {
        
        return ResponseEntity.status(201).body(new ConsultaResponse().toDto(consultaService.createConsulta(dto, pacienteService, profissionalService)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaciente(@PathVariable Long id) {
        if (consultaService.deleteConsulta(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaResponse> getConsultaById(@PathVariable Long id) {
        return consultaService.getConsultaById(id)
                .map(consulta -> new ConsultaResponse().toDto(consulta))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ConsultaResponse>> getAllConsultas() {
        List<ConsultaResponse> consultas = consultaService.getAll()
                .stream()
                .map(consulta -> new ConsultaResponse().toDto(consulta))
                .collect(Collectors.toList());
        
        return ResponseEntity.ok(consultas);
    }
}
