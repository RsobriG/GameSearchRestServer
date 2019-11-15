package com.games.GameSearchRestServer;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRelationRepository extends CrudRepository<UserRelation,String>{
	
	
	  @Query("Select u from UserRelation u where u.userId = ?1") 
	  public Iterable<UserRelation> findbyUserId(String userid);
	 
	
}