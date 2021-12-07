package com.technoelevate.exception.programs;

public class InSufficientFunds extends RuntimeException {
	public InSufficientFunds(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "Declined due to insufficient balance,try with lessor amount";
	}

}
