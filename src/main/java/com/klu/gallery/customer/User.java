package com.klu.gallery.customer;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false, unique = true, length = 45)
	private String fname;
	@Column(nullable = false, unique = true, length = 45)
	private String lname;
	@Column(nullable = false, unique = true, length = 45)
	private String email;
	@Column(nullable = false, unique = true, length = 45)
	private String username;
	@Column(length = 45)
	private String password;
	public String getFname() {
		return fname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
