package com.Development.Lead;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
@Entity
@Table(name="user")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "first_name", length = 45, nullable = false)
	private String firstName;
	@Column(name = "last_name", length = 45, nullable = false)
	private String lastName;
	
	@Column(name = "email",length=65, nullable = false)
	private String email;
	@Column(length = 10, unique = true, nullable = false)
	private long mobile;
	@Column(name = "gender", length = 20, nullable = false)
	private String gender;
	@JsonFormat(pattern = "yyyy-dd-MM", shape = Shape.STRING)
    @Column(name = "date_of_birth")
	private String date;
	@Column(name = "language", length = 30, nullable = false)
	private String language;
	@Column(name = "state", length = 25, nullable = false)
	private String state;
	@Column(name = "Qualification", length = 15, nullable = false)
	private String qualification;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Lead [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobile=" + mobile + ", gender=" + gender + ", date=" + date + ", language=" + language + ", state="
				+ state + ", qualification=" + qualification + "]";
	}
	public Lead(int iD, String firstName, String lastName, String email, long mobile, String gender, String date,
			String language, String state, String qualification) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.date = date;
		this.language = language;
		this.state = state;
		this.qualification = qualification;
	}
	public Lead() {
		super();
		// TODO Auto-generated constructor stub
	}

}
