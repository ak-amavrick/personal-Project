package com.crud.Lead;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;
	@Column(name="Emp_name")
	private String empName;
	@Column(name="emp_Designation")
	private String empDesignation;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public Lead(long empId, String empName, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	@Override
	public String toString() {
		return "Lead [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + "]";
	}

}
