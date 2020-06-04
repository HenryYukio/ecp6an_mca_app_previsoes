package br.usjt.Aula_12_Rest_Json.model.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.Aula_12_Rest_Json.model.beans.Cidade;
import br.usjt.Aula_12_Rest_Json.model.repository.CidadeRepository;

	@RestController
	@RequestMapping ("/cidades")
	
	
	public class CidadeResource {
	@Autowired
	private CidadeRepository cidadeRepo;
	@GetMapping ("/lista")
	public List <Cidade> todasAsCidades (){
		return cidadeRepo.findAll();
	}

		//Listando todas as cidades por determinada Letra;
		@GetMapping ("/{letraInicial}")
		public List<Cidade> buscarPelaLetra(@PathVariable String letraInicial) {
			return cidadeRepo.findByletraInicial(letraInicial);
		}
		
		//Obter uma cidade por sua latitude e longitude.
		@GetMapping("/{latitude}/{longitude}")
		public List<Cidade> buscarPelaLatitudeLongitude(@PathVariable String latitude, @PathVariable String longitude ){
			return cidadeRepo.findByLatitudeAndLongitude(latitude, longitude);
		}
		
		//Cadastrar novas cidades.
		@PostMapping("/salvar")
		public ResponseEntity<Cidade> salvar(@RequestBody Cidade cidade) {
			Cidade c = cidadeRepo.save(cidade);
			URI uri = ServletUriComponentsBuilder.
					fromCurrentServletMapping().path("/{id}").
					buildAndExpand(c.getId()).
					toUri();
			return ResponseEntity.created(uri).body(c);
		}
}


