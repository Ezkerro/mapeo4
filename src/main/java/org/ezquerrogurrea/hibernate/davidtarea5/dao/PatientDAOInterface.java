package org.ezquerrogurrea.hibernate.davidtarea5.dao;

import java.util.List;

import org.ezquerrogurrea.hibernate.davidtarea5.models.Patient;



public interface PatientDAOInterface {
	
	public Patient selectById(Long id);
	public List<Patient> selectAll ();
	public void insert (Patient patient);
	public void update (Patient patient);
	public void delete (Patient patient);

}
