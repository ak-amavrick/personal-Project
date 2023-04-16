package com.FlightProject2.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User extends AbstractEntity {


	@Column(name = "FIRST_NAME", length = 45, nullable = false)
	private String First_Name;
	@Column(name = "LAST_NAME", length = 45, nullable = false)
	private String last_Name;
	@Column(name = "EMAIL", length = 45, nullable = false, unique = true)
	private String email;
	@Column(name = "PASSWORD", length = 45, nullable = false)
	private String password;
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "FlightUser [First_Name=" + First_Name + ", last_Name=" + last_Name + ", email=" + email + ", password="
				+ password + "]";
	}
	public User(String first_Name, String last_Name, String email, String password) {
		super();
		First_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
