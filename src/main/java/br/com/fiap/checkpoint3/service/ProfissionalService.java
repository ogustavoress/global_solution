package br.com.fiap.checkpoint3.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.fiap.checkpoint3.dto.ProfissionalCreateRequest;
import br.com.fiap.checkpoint3.dto.ProfissionalUpdateRequest;
import br.com.fiap.checkpoint3.model.Profissional;

@Service
public class ProfissionalService {

    private List<Profissional> profissionais; 
    private Long sequence = 1L;

    public Profissional createProfissional(ProfissionalCreateRequest dto){
        Profissional profissional = new Profissional(); 
        profissional.setId(sequence++); 
        profissional.setNome(dto.getNome()); 
        profissional.setEspecialidade(dto.getEspecialidade()); 
        profissional.setValorHora(dto.getValorHora()); 
        profissionais.add(profissional); 
        return profissional; 
    }

    public Optional<Profissional> updateProfissional(Long id, ProfissionalUpdateRequest dto){
        return profissionais.stream() 
            .filter(profissional -> profissional.getId().equals(id)) 
            .findFirst() 
            .map(profissional ->{
                profissional.setNome(dto.getNome());
                profissional.setEspecialidade(dto.getEspecialidade()); 
                profissional.setValorHora(dto.getValorHora()); 
                return profissional; 
            });        
    }

    public boolean deleteProfissional(@PathVariable Long id){
        return profissionais.removeIf(profissional -> profissional.getId().equals(id));
    }

    
    public Optional<Profissional> getProfissionalById(@PathVariable Long id){
        return profissionais.stream() 
            .filter(profissional -> profissional.getId().equals(id)) 
            .findFirst();
    }

    public List<Profissional> getAll(){
        return profissionais;
    }
}
