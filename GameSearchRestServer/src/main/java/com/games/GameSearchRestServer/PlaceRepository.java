package com.games.GameSearchRestServer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Place,String>{
	
	@Query("Select u from Place u where u.name = ?1")
	public Iterable<Place> findbyName(String name);

}
