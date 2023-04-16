package com.CarSales.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CarDemo")
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;

	private String Vehicle_name;
	private double purchase_price;
	private double Cost_price;
	private String Customer_name;
	private String email;
	private int mobile;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVehicle_name() {
		return Vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		Vehicle_name = vehicle_name;
	}
	public double getPurchase_price() {
		return purchase_price;
	}
	public void setPurchase_price(double purchase_price) {
		this.purchase_price = purchase_price;
	}
	public double getCost_price() {
		return Cost_price;
	}
	public void setCost_price(double cost_price) {
		Cost_price = cost_price;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [vid=" + vid + ", Vehicle_name=" + Vehicle_name + ", purchase_price=" + purchase_price
				+ ", Cost_price=" + Cost_price + ", Customer_name=" + Customer_name + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
	
	public Car(int vid, String vehicle_name, double purchase_price, double cost_price, String customer_name,
			String email, int mobile) {
		super();
		this.vid = vid;
		Vehicle_name = vehicle_name;
		this.purchase_price = purchase_price;
		Cost_price = cost_price;
		Customer_name = customer_name;
		this.email = email;
		this.mobile = mobile;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
