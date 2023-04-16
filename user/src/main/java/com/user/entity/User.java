package com.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Name;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + "]";
	}
	public User(long id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
