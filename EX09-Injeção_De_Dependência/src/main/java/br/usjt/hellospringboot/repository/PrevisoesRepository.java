package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.hellospringboot.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao,Long> {

}
