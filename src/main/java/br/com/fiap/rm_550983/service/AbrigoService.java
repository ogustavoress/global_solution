package br.com.fiap.rm_550983.service;

import br.com.fiap.rm_550983.dto.AbrigoCreateRequest;
import br.com.fiap.rm_550983.dto.AbrigoResponse;
import br.com.fiap.rm_550983.dto.AbrigoUpdateRequest;
import br.com.fiap.rm_550983.model.Abrigo;
import br.com.fiap.rm_550983.repository.AbrigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AbrigoService {

    @Autowired
    private AbrigoRepository repository;

    // Criar um abrigo (POST)
    public AbrigoResponse criar(AbrigoCreateRequest dto) {
        Abrigo abrigo = dto.toModel();
        Abrigo salvo = repository.save(abrigo);
        return new AbrigoResponse().toDto(salvo);
    }

    // Atualizar abrigo (PUT)
    public AbrigoResponse atualizar(Long id, AbrigoUpdateRequest dto) {
        Abrigo abrigo = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Abrigo não encontrado"));

        abrigo.setNome(dto.getNome());
        abrigo.setEndereco(dto.getEndereco());
        abrigo.setCapacidadeMaxima(dto.getCapacidadeMaxima());
        abrigo.setCapacidadeAtual(dto.getCapacidadeAtual());

        Abrigo atualizado = repository.save(abrigo);
        return new AbrigoResponse().toDto(atualizado);
    }

    // Deletar abrigo (DELETE)
    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Abrigo não encontrado");
        }
        repository.deleteById(id);
    }

    // Buscar abrigo por id (GET)
    public AbrigoResponse buscarPorId(Long id) {
        Abrigo abrigo = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Abrigo não encontrado"));
        return new AbrigoResponse().toDto(abrigo);
    }

    // Listar todos os abrigos (GET)
    public List<AbrigoResponse> listarTodos() {
        return repository.findAll()
            .stream()
            .map(abrigo -> new AbrigoResponse().toDto(abrigo))
            .collect(Collectors.toList());
    }
}
