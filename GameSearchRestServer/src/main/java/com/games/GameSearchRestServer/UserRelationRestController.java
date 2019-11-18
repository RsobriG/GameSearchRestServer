package com.games.GameSearchRestServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
public class UserRelationRestController {
	
	@Autowired
	UserRelationRepository repository;
	
	
	
	
	
	  @GetMapping("/myrelations") 
	  public Iterable<UserRelation>  findbyUserId(String userid){
	  
	  return repository.findbyUserId(userid); 
	  }
	 
	 
	
	@PostMapping(path="/adduserrelation",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addUserRelation(@RequestBody UserRelation rel) {
		repository.save(rel);
	}
	
	


}
