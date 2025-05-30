package br.com.fiap.rm_550983.controller;

import br.com.fiap.rm_550983.dto.AbrigoCreateRequest;
import br.com.fiap.rm_550983.dto.AbrigoUpdateRequest;
import br.com.fiap.rm_550983.dto.AbrigoResponse;
import br.com.fiap.rm_550983.service.AbrigoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abrigos")
public class AbrigoController {

    @Autowired
    private AbrigoService abrigoService;

    @PostMapping
    public ResponseEntity<AbrigoResponse> create(@RequestBody AbrigoCreateRequest dto) {
        AbrigoResponse response = abrigoService.criar(dto);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AbrigoResponse> update(
            @PathVariable Long id,
            @RequestBody AbrigoUpdateRequest dto) {
        AbrigoResponse response = abrigoService.atualizar(id, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        abrigoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AbrigoResponse> getById(@PathVariable Long id) {
        AbrigoResponse response = abrigoService.buscarPorId(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<AbrigoResponse>> getAll() {
        List<AbrigoResponse> lista = abrigoService.listarTodos();
        return ResponseEntity.ok(lista);
    }
}
