package br.com.fiap.checkpoint1.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.dto.PacienteRequestCreate;
import br.com.fiap.checkpoint1.dto.PacienteResponse;
import br.com.fiap.checkpoint1.dto.PacienterequestUpdate;
import br.com.fiap.checkpoint1.model.Paciente;
import br.com.fiap.checkpoint1.service.PacienteService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService = new PacienteService();

    @PostMapping
    public ResponseEntity<PacienteResponse> create(@RequestBody PacienteRequestCreate dto) {
        Paciente pacienteCreated = pacienteService.createPaciente(dto);
        return ResponseEntity.status(201).body(new PacienteResponse()
                .toDto(pacienteService.createPaciente(dto)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PacienteResponse> update(@PathVariable Long id, @RequestBody PacienterequestUpdate dto){
        
        return pacienteService.updatePaciente(id, dto)
            .map(pacienteUpdated -> new PacienteResponse().toDto(pacienteUpdated))
                .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (pacienteService.deletePaciente(id)) {
            return ResponseEntity.noContent().build();
        } 
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponse> getPacienteById(@PathVariable Long id) {
        return pacienteService.getPacienteById(id)
                .map(paciente -> new PacienteResponse().toDto(paciente))
                    .map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<PacienteResponse>> findAll() {
        List<PacienteResponse> response = pacienteService.getAll().stream()
                .map(paciente -> new PacienteResponse().toDto(paciente))
                    .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }

}
