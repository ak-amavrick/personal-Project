package com.MediLabEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medilab")
public class MediLab {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String test;
private String Doctor_Recomendation;
private String LabTechnician;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTest() {
	return test;
}
public void setTest(String test) {
	this.test = test;
}
public String getDoctor_Recomendation() {
	return Doctor_Recomendation;
}
public void setDoctor_Recomendation(String doctor_Recomendation) {
	Doctor_Recomendation = doctor_Recomendation;
}
public String getLabTechnician() {
	return LabTechnician;
}
public void setLabTechnician(String labTechnician) {
	LabTechnician = labTechnician;
}
@Override
public String toString() {
	return "MediLab [id=" + id + ", name=" + name + ", test=" + test + ", Doctor_Recomendation=" + Doctor_Recomendation
			+ ", LabTechnician=" + LabTechnician + "]";
}
public MediLab(int id, String name, String test, String doctor_Recomendation, String labTechnician) {
	super();
	this.id = id;
	this.name = name;
	this.test = test;
	Doctor_Recomendation = doctor_Recomendation;
	LabTechnician = labTechnician;
}
public MediLab() {
	super();
	// TODO Auto-generated constructor stub
}


}