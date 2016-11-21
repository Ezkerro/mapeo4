/**
 * 
 */
package org.ezquerrogurrea.hibernate.davidtarea5.dao;

import java.util.List;

import org.ezquerrogurrea.hibernate.davidtarea5.HibernateSession;
import org.ezquerrogurrea.hibernate.davidtarea5.models.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * implementation of subjectDAOInterface
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public class DoctorDAO implements DoctorDAOInterface {

	/* 
	 * selects one subject by Id
	 * @param id
	 * @return Subject
	 */
	public Doctor selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Doctor doctor = (Doctor) session.get(Doctor.class, id);
	    
	    session.close();
	    return doctor;
	}

	/*
	 * retrieves all subjects from db
	 * @return List of subjects
	 */
	public List<Doctor> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Doctor> doctors = session.createQuery("from Doctor").list();
	    
	    session.close();
	    return doctors;
	}

	/*
	 * inserts a new subject in database
	 * subject must come with the idcar set 
	 * @param new subject
	 */
	public void insert(Doctor doctor) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	 
	    session.merge(doctor);    
	    
	    session.getTransaction().commit();	         
	    session.close();

	}

	/*
	 * updates subject
	 * @param subject to update
	 */
	public void update(Doctor doctor) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(doctor); 
		    
		    session.getTransaction().commit();		 
		    session.close();
	}

	/*
	 * delete given subject
	 * @param subject to delete
	 */
	public void delete(Doctor doctor) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(doctor);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
