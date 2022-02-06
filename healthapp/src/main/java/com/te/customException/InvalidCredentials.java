package com.te.customException;

public class InvalidCredentials extends RuntimeException {

	public InvalidCredentials() {

	}

	@Override
	public String toString() {
		return "InvalidCredentials please check the details you enetered";
	}

}
