package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Previsao;
import br.usjt.hellospringboot.repository.PrevisoesRepository;

@Controller
public class PrevisoesController {
	@Autowired
	private PrevisoesRepository previsoesRepo;

	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_previsoes");
		List<Previsao> previsoes = previsoesRepo.findAll();
		mv.addObject(new Previsao());
		mv.addObject("previsoes", previsoes);
		return mv;
	}

	@PostMapping("/previsoes")
	public String salvar(Previsao previsao) {
		previsoesRepo.save(previsao);
		return "redirect:/previsoes";
	}
}
