package ucsal.bes.arq20232.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucsal.bes.arq20232.demo.service.ConsultaAlunoService;

@RequestMapping("x")
@RestController
public class ConsultaController {
	
	@Autowired
	private ConsultaAlunoService service;
	
	@GetMapping("/{matricula}")
	public String aluno(@PathVariable String matricula) {
		return service.consultaNome(matricula);
	}

}
