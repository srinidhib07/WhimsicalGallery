package com.klu.gallery.customer;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>{
	
	User findByUsernameAndPassword(String username, String password);
	

}
