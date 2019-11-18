package com.games.GameSearchRestServer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
public class PlaceRestController {
	
	@Autowired
	PlaceRepository repository;
	PlaceRepositoryLong repositoryLong;
	
	@GetMapping("/placebyname")
	public Iterable<Place> findbyName(String name){
		return repository.findbyName(name);
	}

	@PostMapping(path="/addplace",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addPlace(@RequestBody Place place) {
		repository.save(place);
		
	}
	
	@DeleteMapping("/deleteplace/{placeId}")
	public void deletePlace(@PathVariable long placeId) {
		Optional<Place> place = repositoryLong.findById(placeId);
		if(place.isPresent()) {
			repositoryLong.delete(place.get());
		}
	}
}
