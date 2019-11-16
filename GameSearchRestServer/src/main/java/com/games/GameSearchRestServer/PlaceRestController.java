package com.games.GameSearchRestServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
public class PlaceRestController {
	
	@Autowired
	PlaceRepository repository;
	
	@GetMapping("/placebyname")
	public Iterable<Place> findbyName(String name){
		return repository.findbyName(name);
	}

}
