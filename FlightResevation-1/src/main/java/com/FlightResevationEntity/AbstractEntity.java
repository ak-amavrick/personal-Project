package com.FlightResevationEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
	
	
}

@Override
public String toString() {
	return "AbstractEntity [id=" + id + "]";
	
	
	
}

public AbstractEntity() {
	super();
	// TODO Auto-generated constructor stub
}

public AbstractEntity(long id) {
	super();
	this.id = id;
}
}
