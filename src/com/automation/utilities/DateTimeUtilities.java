package com.automation.utilities;

import java.time.LocalDate;

abstract public class DateTimeUtilities {
	
	public static String getCurrentYearMonthDate() {
		LocalDate localDate = LocalDate.now();
		String localDate1 = localDate.toString();
		return localDate1;
		}
	
	public static String getCurrentYear() {
		String localDate = getCurrentYearMonthDate();
		String [] localDate1 = localDate.split("-"); //2022-02-28
		String year = localDate1[0]; // zero index  = 2022
		return year;
		}
	public static String getCurrentMonth() {
		String localDate = getCurrentYearMonthDate();
		String [] localDate1 = localDate.split("-");
		String month = localDate1[1]; // first index = 02
		return month;
		}
	
	public static String getCurrentDate() {
		String localDate = getCurrentYearMonthDate();
		String [] localDate1 = localDate.split("-");
		String Date = localDate1[2]; // second index = 28
		return Date;
		}

	public static void main(String[] args) {
		System.out.println(getCurrentYearMonthDate());
		System.out.println(getCurrentDate());
		System.out.println(getCurrentMonth());
		System.out.println(getCurrentYear());
	}
}
