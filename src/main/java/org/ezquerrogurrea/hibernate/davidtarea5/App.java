package org.ezquerrogurrea.hibernate.davidtarea5;

import org.ezquerrogurrea.hibernate.davidtarea5.dao.DoctorDAO;
import org.ezquerrogurrea.hibernate.davidtarea5.dao.PatientDAO;
import org.ezquerrogurrea.hibernate.davidtarea5.models.Doctor;
import org.ezquerrogurrea.hibernate.davidtarea5.models.Patient;

public class App 
{
    public static void main( String[] args )
    {
   
    	Patient patient1 = new Patient();
    	patient1.setName("DAVID");
    	patient1.setSex("Hombre");
    	Patient patient2 = new Patient();
    	patient2.setName("BORJA");
    	patient2.setSex("Hombre");
    	Doctor doctor1 = new Doctor();
    	doctor1.setName("RUBEN");
    	doctor1.setArea("Cirujano");
    	Doctor doctor2 = new Doctor();
    	doctor2.setName("MARCOS");
    	doctor2.setArea("Pediatra");
    	
    	doctor1.addPatients(patient1);
    	doctor1.addPatients(patient2);
    	doctor2.addPatients(patient1);
    	doctor2.addPatients(patient2);
    	
    	PatientDAO patientDAO = new PatientDAO();
    	patientDAO.insert(patient1);
    	patientDAO.insert(patient2);
    	DoctorDAO doctorDAO = new DoctorDAO();
    	doctorDAO.insert(doctor1);
    	doctorDAO.insert(doctor2);
    	
    	
    	
    	
    }
}
