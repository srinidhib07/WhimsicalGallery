package com.klu.gallery.admin;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Controller;

@Controller
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false, unique = true, length = 45)
	private String username;
	@Column(nullable = false, unique = true, length = 45)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
