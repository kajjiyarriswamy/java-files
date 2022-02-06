package com.te.dao;

import com.te.dto.Doctors;

public interface DaoInt {

	public boolean signUpDoc(Doctors doc);

	public boolean loginForPat(int aadharNumber, String password);

	public boolean loginForDoc(int id, String password);

}
