package com.games.GameSearchRestServer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,String> {
	
	@Query("Select u from User u where u.name = ?1") 
	  public Iterable<User> findUserByName(String name);
		//u.name y u.nickname?Buscar por nombre y nick o solo nombre?
	
	@Query("Select u from User u where u.nickName = ?1")
		public User findUserByNickname(String nickName);
	
	/*
	 * @Query("Select u from User u where u.mail = ?1") public User
	 * findUserByEmail(String mail);
	 */
}

