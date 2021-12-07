package com.technoelevate.exception.programs;

public class InValidDetails extends RuntimeException {
	
	public InValidDetails() {
		
	}

	@Override
	public String toString() {
		return "Invalid details try with different username or password" ;
	}

}
