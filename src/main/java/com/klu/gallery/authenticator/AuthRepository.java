package com.klu.gallery.authenticator;

import org.springframework.data.repository.CrudRepository;


public interface AuthRepository extends CrudRepository<Authenticator, String>{
	
	Authenticator findByUsernameAndPassword(String username, String password);


}
