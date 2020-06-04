package br.usjt.Aula_12_Rest_Json.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.Aula_12_Rest_Json.model.beans.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
	List<Cidade> findByletraInicial (String letraInicial);
	
	List<Cidade> findByLatitudeAndLongitude(String latitude, String longitude);

}
