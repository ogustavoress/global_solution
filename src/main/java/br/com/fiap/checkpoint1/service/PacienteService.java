package br.com.fiap.checkpoint1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.fiap.checkpoint1.dto.PacienteRequestCreate;
import br.com.fiap.checkpoint1.dto.PacienterequestUpdate;
import br.com.fiap.checkpoint1.model.Paciente;

@Service
public class PacienteService {

    private List<Paciente> pacientes;
    private long sequence = 1L;

    public Paciente createPaciente(PacienteRequestCreate dto){
        Paciente paciente = new Paciente();
        paciente.setId(sequence++);
        paciente.setNome(dto.getNome());
        paciente.setEndereco(dto.getEndereco());
        paciente.setBairro(dto.getBairro());
        paciente.setEmail(dto.getEmail());
        paciente.setTelefone_completo(dto.getTelefone_completo());
        pacientes.add(paciente);
        return paciente;
    }
    public Optional<Paciente> updatePaciente(Long id, PacienterequestUpdate dto){
        return pacientes.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst()
            .map(p -> {
                p.setEndereco(dto.getEndereco());
                p.setBairro(dto.getBairro());
                p.setEmail(dto.getEmail());
                p.setTelefone_completo(dto.getTelefone_completo());
                return p;
            });
    }
    public boolean deletePaciente(@PathVariable Long id){
        return pacientes.removeIf(p ->p.getId().equals(id));
    }

    public Optional<Paciente> getPacienteById(@PathVariable Long id){
        return pacientes.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst();
    }
    public List <Paciente> getAll(){
        return pacientes;
   }



}