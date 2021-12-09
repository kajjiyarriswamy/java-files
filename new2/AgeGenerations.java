package com.technoelevate.assignment.program;

import java.util.Scanner;

public class AgeGenerations {
	static int year = 2022;
	static int  age ;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
          age= s.nextInt();
          int res =year-age;
		if (res <= 1995) {
			System.out.println("You are belong to the Gen Y OR millenials Generation");
		} else {
			System.out.println(" You belong to the gen z Generation");
		}
	}

}
