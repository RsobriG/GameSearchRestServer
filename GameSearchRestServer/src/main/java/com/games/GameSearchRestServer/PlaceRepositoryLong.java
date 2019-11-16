package com.games.GameSearchRestServer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepositoryLong extends CrudRepository<Place,Long>{
	

}
