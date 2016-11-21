package org.ezquerrogurrea.hibernate.davidtarea5.models;

import java.util.ArrayList;
import java.util.List;


public class Patient {
	private long id;
	private String name;
	private String sex;
	private List<Doctor> doctors = new ArrayList<Doctor>();

	public Patient(){
		
	}
	
	public Patient(long id, String name, String sex){
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the doctors
	 */
	public List<Doctor> getDoctors() {
		return doctors;
	}

	/**
	 * @param doctors the doctors to set
	 */
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", sex=" + sex + ", doctors=" + doctors + "]";
	}

	public void addDoctors(Doctor doctor) {
		this.doctors.add(doctor);
	}
	
	

}
