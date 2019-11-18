package com.games.GameSearchRestServer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameSesionRepositoryLong extends CrudRepository<GameSesion,Long>{
	

	
	
}

