package com.games.GameSearchRestServer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/webapi")
public class GameRestController {

	@Autowired
	GameRepository repository;
	
	@GetMapping("/games")
	public Iterable<Game> findAll(){
		return repository.findAll();
	}
	
	@PostMapping(path="/games", consumes="application/json")
	public void insertGame(@RequestBody Game game) {
		repository.save(game);
	}
	
	
	@DeleteMapping("/games/{name}")
	public void deleteGame(@PathVariable String name) {
		Optional<Game> game = repository.findById(name);
		
		if(game.isPresent()) {
			repository.delete(game.get());
		}
	}

}
