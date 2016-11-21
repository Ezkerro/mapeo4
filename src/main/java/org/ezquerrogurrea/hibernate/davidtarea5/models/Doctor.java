package org.ezquerrogurrea.hibernate.davidtarea5.models;

import java.util.ArrayList;
import java.util.List;


public class Doctor {

	private long id;
	private String name;
	private String area;
	private List<Patient> patients = new ArrayList<Patient>();

	
	public Doctor(){
		
	}
	
	public Doctor(long id, String name, String area){
		this.id = id;
		this.name = name;
		this.area = area;
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
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the patients
	 */
	public List<Patient> getPatients() {
		return patients;
	}

	/**
	 * @param patients the patients to set
	 */
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", area=" + area + ", patients=" + patients + "]";
	}

	public void addPatients(Patient patient) {
		this.patients.add(patient);
		patient.addDoctors(this);
	}

}
