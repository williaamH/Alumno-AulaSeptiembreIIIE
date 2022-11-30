package idatcom.SeptiembreAulaIIIE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import idatcom.SeptiembreAulaIIIE.model.Aula;
import idatcom.SeptiembreAulaIIIE.service.AulaService;

@Controller
@RequestMapping("/api/aula/v1")
public class AulaController {
	
	@Autowired
	private AulaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Aula aula) {
		service.guardarAula(aula);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarAulumnoAula();
	}
}
