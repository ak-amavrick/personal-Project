package com.Novosale.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="novo")
public class Novo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long ID;

@Column(name="first_name", length= 45 ,nullable =false)
private String firstName;

@Column(name="last_name",length =45, nullable =false)
private String LastName;

@Column(name="email",length =102 ,nullable =false)
private String email;

@Column(length =10, unique=true , nullable =false)
private long mobile;

@Column(name="dealer_ID",length =102 ,nullable =false)
private int dealerID;

@Column(name="dealer_name",length =122 ,nullable =false)
private String dealerName;

@Column(name="source")
private String source;

public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
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
public int getDealerID() {
	return dealerID;
}
public void setDealerID(int dealerID) {
	this.dealerID = dealerID;
}
public String getDealerName() {
	return dealerName;
}
public void setDealerName(String dealerName) {
	this.dealerName = dealerName;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
@Override
public String toString() {
	return "Novosalesbean [ID=" + ID + ", firstName=" + firstName + ", LastName=" + LastName + ", email=" + email
			+ ", mobile=" + mobile + ", dealerID=" + dealerID + ", dealerName=" + dealerName + ", source=" + source
			+ "]";
}
public Novo(long iD, String firstName, String lastName, String email, long mobile, int dealerID,
		String dealerName, String source) {
	super();
	ID = iD;
	this.firstName = firstName;
	LastName = lastName;
	this.email = email;
	this.mobile = mobile;
	this.dealerID = dealerID;
	this.dealerName = dealerName;
	this.source = source;
}




}

