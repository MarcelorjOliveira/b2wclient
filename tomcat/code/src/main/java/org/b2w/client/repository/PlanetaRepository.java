package org.b2w.client.repository;

import org.b2w.client.Planeta;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

public interface PlanetaRepository extends CassandraRepository<Planeta, Long> {
	
	@Query("SELECT p FROM Planeta p WHERE p.nome = ?1")
	public Planeta planetaPeloNome(String nome);
	
}
