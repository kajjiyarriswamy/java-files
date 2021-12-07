package com.technoelevate.exception.programs;

public class MyAccount {

	public static void main(String[] args) {
		ICICIBank ic = new ICICIBank("Swamy","Yarri","1999",500);
		ic.deposit("Yarri", "1999", 100);
		ic.withdraw("Yarri", "1999", 900);
	}

}
