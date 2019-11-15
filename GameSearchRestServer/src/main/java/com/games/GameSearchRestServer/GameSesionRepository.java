package com.games.GameSearchRestServer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameSesionRepository extends CrudRepository<GameSesion,String>{
	
	@Query("Select u from GameSesion u where u.userid = ?1") 
	  public Iterable<GameSesion> findbyUserId(String userid);

	@Query("Select u from GameSesion u where u.gameId = ?1") 
	  public Iterable<GameSesion> findbyGameId(String gameid);
}
