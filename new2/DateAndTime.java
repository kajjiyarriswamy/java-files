package com.technoelevate.date_and_time.programs;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {

	public static void main(String[] args) {
	LocalTime t= LocalTime.now();
	System.out.println(t);
	LocalDate d = LocalDate.now();
	System.out.println(d);

	}

}
