package com.games.GameSearchRestServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
public class GameSesionRestController {
	
	@Autowired
	GameSesionRepository repository;
	
	@GetMapping("/mygames")
	public Iterable<GameSesion> findbyUserId(String userid){
		
		return repository.findbyUserId(userid);
	}
	
	@GetMapping("/gameplayers")
	public Iterable<GameSesion> findbyGameId(String gameid){
		
		return repository.findbyGameId(gameid);
	}
	
	@PostMapping(path="/insertgamesesion",consumes="aplication/json")
	public void insertGameSesion(@RequestBody GameSesion gamesesion) {
		repository.save(gamesesion);
	}

}
