package br.com.fiap.checkpoint3.controller;

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

import br.com.fiap.checkpoint3.dto.profissional.ProfissionalCreateRequest;
import br.com.fiap.checkpoint3.dto.profissional.ProfissionalResponse;
import br.com.fiap.checkpoint3.dto.profissional.ProfissionalUpdateRequest;
import br.com.fiap.checkpoint3.service.ProfissionalService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {

    @Autowired
    private ProfissionalService profissionalService;

    @PostMapping
    public ResponseEntity<ProfissionalResponse> create(@RequestBody ProfissionalCreateRequest dto){

        return ResponseEntity.status(201).body(new ProfissionalResponse().toDto(profissionalService.create(dto)));
    }

    @PutMapping("/{id}") 
    public ResponseEntity<ProfissionalResponse> update(@PathVariable Long id, @RequestBody ProfissionalUpdateRequest dto){

        return profissionalService.update(id, dto)
                .map(updateProfissional -> new ProfissionalResponse().toDto(updateProfissional))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }  

    @GetMapping("/{id}")
    public ResponseEntity<ProfissionalResponse> getById(@PathVariable Long id) {
        return profissionalService.getProfissionalById(id)
                .map(profissional -> new ProfissionalResponse().toDto(profissional))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<List<ProfissionalResponse>> getAll() {
        List<ProfissionalResponse> profissionais = profissionalService.getAll()
                .stream()
                .map(profissional -> new ProfissionalResponse().toDto(profissional))
                .collect(Collectors.toList());

        return ResponseEntity.ok(profissionais);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (profissionalService.delete(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
