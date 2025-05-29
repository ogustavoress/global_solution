package br.com.fiap.checkpoint3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.checkpoint3.model.Consulta;
import br.com.fiap.checkpoint3.model.ConsultaStatus;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    // select c.* from consulta c where c.status = '?'
    public List<Consulta> findByStatus(ConsultaStatus status);
}
