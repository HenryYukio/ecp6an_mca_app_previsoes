package br.usjt.hellospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.hellospringboot.model.Previsao;
import br.usjt.hellospringboot.repository.PrevisoesRepository;

@Service
	public class PrevisoesService {
@Autowired
	private PrevisoesRepository previsoesRepo;
		public void salvar (Previsao previsao) {
			previsoesRepo.save(previsao);
}
			public List <Previsao> listarTodos (){
				return previsoesRepo.findAll();
			}

}
		
