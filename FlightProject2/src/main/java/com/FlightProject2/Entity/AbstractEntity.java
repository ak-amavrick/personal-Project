package com.FlightProject2.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "AbstractEntity [Id=" + Id + "]";
	}

	public AbstractEntity(long id) {
		super();
		Id = id;
	}

	public AbstractEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
