package br.com.fiap.rm_550983.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.rm_550983.model.Abrigo;


@Repository
public interface AbrigoRepository extends JpaRepository<Abrigo, Long> {

}
