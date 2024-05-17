package com.emmbeding;

import javax.persistence.Entity;
import javax.persistence.Id;

//embedding me ek clas  ka data dusri class me le skte

@Entity
public class Student2 {
	@Id
	private int id;
	private String name;
	private String city;
	private Certificate certi;//refrence  le liya
	
	
	
	public Student2() {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}



	@Override
	public String toString() {
		return this.id +" "+this.name+": "+this.city;
	}
	
	
	

}
