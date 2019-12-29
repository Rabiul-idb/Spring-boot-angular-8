package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String Name;
	
	private int Regitration;
	
	private String Post;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRegitration() {
		return Regitration;
	}

	public void setRegitration(int regitration) {
		Regitration = regitration;
	}

	public String getPost() {
		return Post;
	}

	public void setPost(String post) {
		Post = post;
	}
	
	
}
