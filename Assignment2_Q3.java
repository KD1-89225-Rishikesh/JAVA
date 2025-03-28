package com.assignment;

class Date{
	private int day;
	private int month;
	private int year;

	
	public Date() {
		this.day = 5;
		this.month = 12;
		this.year = 2004;
	}


	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public void display() {
		System.out.println("Date : "+ day+ "/"+ month+ "/" + year );
	}

	@Override
	public String toString() {
		return "Date : "+day + "/"+ month+ "/" + year ;
	}
	
  
	
}

public class Assignment2_Q3 {

	public static void main(String[] args) {
	
		Date TestDate1 = new Date();
		TestDate1.display();
		
		Date TestDate2 = new Date(5,56,2003);
		TestDate2.display();

	}

}
