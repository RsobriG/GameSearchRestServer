package com.games.GameSearchRestServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userrelationapi")
public class UserRelationRestController {
	
	@Autowired
	UserRelationRepository repository;
	
	@PostMapping(path="/userrelations",consumes="aplication/json")
	public void addUserRelation(@RequestBody UserRelation rel) {
		repository.save(rel);
	}
	
	


}
