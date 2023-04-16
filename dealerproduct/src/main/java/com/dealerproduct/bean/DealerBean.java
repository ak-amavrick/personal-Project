package com.dealerproduct.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="dealer")
public class DealerBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String firstName;


	private String LastName;


	private String email;

	
	private long mobile;


	private int dealerID;


	private String dealerName;


	private String source;

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
		return "DealerBean [firstName=" + firstName + ", LastName=" + LastName + ", email=" + email + ", mobile="
				+ mobile + ", dealerID=" + dealerID + ", dealerName=" + dealerName + ", source=" + source + "]";
	}

	public DealerBean(String firstName, String lastName, String email, long mobile, int dealerID, String dealerName,
			String source) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.dealerID = dealerID;
		this.dealerName = dealerName;
		this.source = source;
	}
     
}
