package org.b2w.client.repository;

import org.b2w.client.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
/*
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface PlanetaRepository extends CassandraRepository<Planeta, Integer> {

}
*/


public interface PlanetaRepository extends JpaRepository<Planeta, Long> {

}
