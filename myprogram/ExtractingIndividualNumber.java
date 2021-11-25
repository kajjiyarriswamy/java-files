package com.technoelevate.myprogram;
//Extracting individual digits from given a given number
public class ExtractingIndividualNumber {

	public static void main(String[] args) {
		int num=11003;
		while(num>0) {
			int rem=num%10;
			System.out.print(rem);
			num=num/10;
		}

	}

}
