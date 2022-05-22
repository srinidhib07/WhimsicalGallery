package com.klu.gallery.customer;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PaintingRepository paintingRepository;
	public void addPainting(Painting painting)
	{
		paintingRepository.save(painting);
	}
	  public void addUserRecord(User user)
	  {
	    userRepository.save(user);
	  }
	  public User findByUsernameAndPassword(String username, String password)
	  {
		  return userRepository.findByUsernameAndPassword(username, password);
	  }
	  public List<User> getAllUserRecords()
	  {
	    return (List<User>) userRepository.findAll();
	  }

	  public void deleteUserRecord(String user) 
	  {
		  userRepository.deleteById(user);
	  }

}
