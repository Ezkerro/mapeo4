/**
 * 
 */
package org.ezquerrogurrea.hibernate.davidtarea5.dao;

import java.util.List;

import org.ezquerrogurrea.hibernate.davidtarea5.HibernateSession;
import org.ezquerrogurrea.hibernate.davidtarea5.models.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class PatientDAO implements PatientDAOInterface {

	/* 
	 * selects one Student by Id
	 * @param id
	 * @return Student
	 */
	public Patient selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Patient patient= (Patient) session.get(Patient.class, id);
	    
	    session.close();
	    return patient;
	}

	/*
	 * retrieves all Students from db
	 * @return List of Students
	 */
	public List<Patient> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Patient> patients = session.createQuery("from Patient").list();
	    
	    session.close();
	    return patients;
	}

	/*
	 * inserts a new Student in database
	 * retrieves generated id and sets to Student instance
	 * @param new Student
	 */
	public void insert(Patient patient) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.merge(patient);
	         
	    session.getTransaction().commit();
	    session.close();

	}

	/*
	 * updates Student
	 * @param Student to update
	 */
	public void update(Patient patient) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(patient);
		 
		    session.getTransaction().commit();
		    session.close();
	}

	/*
	 * delete given Student
	 * @param Student to delete
	 */
	public void delete(Patient patient) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(patient);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
