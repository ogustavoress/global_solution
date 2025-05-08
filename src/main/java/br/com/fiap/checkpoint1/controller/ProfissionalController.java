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
import br.com.fiap.checkpoint1.dto.ProfissionalCreateRequest;
import br.com.fiap.checkpoint1.dto.ProfissionalResponse;
import br.com.fiap.checkpoint1.dto.ProfissionalUpdateRequest;
import br.com.fiap.checkpoint1.service.ProfissionalService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {

    @Autowired
    private ProfissionalService profissionalService;

    @PostMapping
    public ResponseEntity<ProfissionalResponse> createProfissional(@RequestBody ProfissionalCreateRequest dto){

        return ResponseEntity.status(201).body(new ProfissionalResponse().toDto(profissionalService.createProfissional(dto)));
    }

    @PutMapping("/{id}") 
    public ResponseEntity<ProfissionalResponse> updateProfissional(@PathVariable Long id, @RequestBody ProfissionalUpdateRequest dto){

        return profissionalService.updateProfissional(id, dto)
                .map(updateProfissional -> new ProfissionalResponse().toDto(updateProfissional))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }  
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfissional(@PathVariable Long id) {
        if (profissionalService.deleteProfissional(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfissionalResponse> getProfissionalById(@PathVariable Long id) {
        return profissionalService.getProfissionalById(id)
                .map(profissional -> new ProfissionalResponse().toDto(profissional))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<List<ProfissionalResponse>> getAllProfissionais() {
        List<ProfissionalResponse> profissionais = profissionalService.getAll()
                .stream()
                .map(profissional -> new ProfissionalResponse().toDto(profissional))
                .collect(Collectors.toList());

        return ResponseEntity.ok(profissionais);
    }

}
