package com.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.DaoInt;
import com.te.dto.Doctors;

@Service
public class ServiceImpl implements ServiceInt {

	@Autowired
	private DaoInt dao;

	public boolean signUpDoc(Doctors doc) {
		return dao.signUpDoc(doc);
	}

	public boolean loginForPat(int aadharNumber, String password) {
		return dao.loginForPat(aadharNumber, password);
	}

	public boolean loginForDoc(int id, String password) {
		return dao.loginForDoc(id, password);
	}

}
