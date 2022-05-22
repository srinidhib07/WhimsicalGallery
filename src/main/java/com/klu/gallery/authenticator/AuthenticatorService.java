package com.klu.gallery.authenticator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticatorService {
	
	@Autowired
	AuthRepository authRepository;
	  public void addUserRecord(Authenticator auth)
	  {
	    authRepository.save(auth);
	  }
	  public Authenticator findByUsernameAndPassword(String username, String password)
	  {
		  return authRepository.findByUsernameAndPassword(username, password);
	  }
	  public List<Authenticator> getAllUserRecords()
	  {
	    return (List<Authenticator>) authRepository.findAll();
	  }

	  public void deleteUserRecord(String auth) 
	  {
		  authRepository.deleteById(auth);
	  }


}
