package com.klu.gallery.authenticator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authenticator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false, unique = true, length = 45)
	private String fname;
	@Column(nullable = false, unique = false, length = 45)
	private String lname;
	@Column(nullable = false, unique = false, length = 45)
	private String email;
	@Column(nullable = false, unique = false, length = 45)
	private String username;
	@Column(nullable = false, unique = false, length = 45)
	private String password;
	@Column(nullable = false, unique = false, length = 45)
	private String path;
	@Column(nullable = false, unique = false, length = 45)
	private int experience;
	@Column(nullable = false, unique = false, length = 45)
	private long phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
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
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	

}
