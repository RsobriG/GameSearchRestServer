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
public class UserRestController {

	@Autowired
	UserRepository repository;
	
	@GetMapping("/users")
	public Iterable<User> findAll(){
		return repository.findAll();
	}
	
	@PostMapping(path="/users", consumes="application/json")
	public void insertUser(@RequestBody User user) {
		repository.save(user);
	}
	
	
	@DeleteMapping("/users/{name}")
	public void deleteBook(@PathVariable String name) {
		Optional<User> user = repository.findById(name);
		
		if(user.isPresent()) {
			repository.delete(user.get());
		}
	}

}
