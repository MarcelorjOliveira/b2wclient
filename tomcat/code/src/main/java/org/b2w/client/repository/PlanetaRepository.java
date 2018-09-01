package org.b2w.client.repository;

import java.util.List;

import org.b2w.client.Planeta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanetaRepository extends MongoRepository<Planeta, String> {

}