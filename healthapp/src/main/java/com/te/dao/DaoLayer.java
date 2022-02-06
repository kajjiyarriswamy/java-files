package com.te.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.dto.Doctors;
import com.te.dto.Patients;

@Repository
public class DaoLayer implements DaoInt {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("health");

	public boolean signUpDoc(Doctors doc) {
		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tr = manager.getTransaction();
		try {
			tr.begin();
			manager.persist(doc);
			flag = true;
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		manager.close();
		return flag;
	}

	public boolean loginForPat(int aadharNumber, String password) {
		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		Doctors doc = manager.find(Doctors.class, aadharNumber);
		if (doc.getPassword() == password) {
			flag = true;
		}
		return flag;
	}

	public boolean loginForDoc(int id, String password) {
		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		Patients pat = manager.find(Patients.class, id);
		if (pat.getPassword() == password) {
			flag = true;
		}
		return flag;
	}

}
