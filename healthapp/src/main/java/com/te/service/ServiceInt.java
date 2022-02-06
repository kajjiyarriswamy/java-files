package com.te.service;

import com.te.dto.Doctors;

public interface ServiceInt {

	public boolean signUpDoc(Doctors doc);

	public boolean loginForPat(int aadharNumber, String password);

	public boolean loginForDoc(int id, String password);

}
