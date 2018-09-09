package org.b2w.client.controller;

import java.util.List;

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
		// List<Planeta> listaLivros = planetaRepos itory.findAll();
		Planeta planeta = new Planeta("nome1", "usuario1", "terreno1" );
		planetaRepository.save(planeta);
		return planeta;

	}
	/*
	 * @RequestMapping(value="/mongoconfig") public MongoConfig config() { return
	 * config; }
	 */

	public void adicionarPlaneta(Planeta planeta) {

	}
/*
	@RequestMapping(value = "/listarPlanetas")
	public List<Planeta> listarPlanetas() {
		return planetaRepository.findAll();
	}
	*/
}