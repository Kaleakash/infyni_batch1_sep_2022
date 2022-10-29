package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDemoTest {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1);
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the date");
		String dobInfo		= 	sc.next();
		LocalDate dob = LocalDate.parse(dobInfo);
		System.out.println(dob);
		System.out.println(dob.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(dob.format(DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(dob.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
	}

}
