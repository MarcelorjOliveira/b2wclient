package org.b2w.client.controller;

import org.b2w.client.Planeta;
import org.b2w.client.repository.PlanetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetaController {

	@Autowired
	private PlanetaRepository planetaRepository;

	@Autowired
	public PlanetaController(PlanetaRepository planetaRepository) {
		this.planetaRepository = planetaRepository;
	}
	
	@RequestMapping(value = "/planeta")
	public Planeta planetas() {
		//List<Planeta> listaLivros = planetaRepository.findAll();
		return new Planeta("caso","quente","fervendo");
	}
}