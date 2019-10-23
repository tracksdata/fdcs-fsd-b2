package com;

import java.time.LocalDate;
import java.time.Period;

public class DateAndTimeDemo {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		
		System.out.println(LocalDate.of(1987, 10, 12));

		String dob="1981-07-19";
		
		Period p=Period.between( LocalDate.parse(dob),ld);
		
		System.out.println(p.getYears());
		

	}

}
