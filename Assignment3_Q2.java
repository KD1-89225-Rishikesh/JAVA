package com.assignment;

import java.util.Scanner;

class CreditCalculator {
	private int acountNumber;
	private int beginMonthBalance;
	private int totalAmountSpend;
	private int criditGiven;
	private int allowedCreditLimit;

	public CreditCalculator() {
	}

	public CreditCalculator(int acountNumber, int beginMonthBalance, int totalAmountSpend, int criditGiven, int allowedCreditLimit) {
		super();
		this.acountNumber = acountNumber;
		this.beginMonthBalance = beginMonthBalance;
		this.totalAmountSpend = totalAmountSpend;
		this.criditGiven = criditGiven;
		this.allowedCreditLimit = allowedCreditLimit;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number :");
		this.acountNumber = sc.nextInt();
		System.out.println("Enter  beginning month Blance :");
		this.beginMonthBalance = sc.nextInt();
		System.out.println("Enter Total amount Spend : ");
		this.totalAmountSpend = sc.nextInt();
		System.out.println("Enter cridit Given : ");
		this.criditGiven = sc.nextInt();
		System.out.println("Enter allowed Credit Limit : ");
		this.allowedCreditLimit = sc.nextInt();
	}

	public int newBalance() {
       return beginMonthBalance + totalAmountSpend - allowedCreditLimit;
	}
	
	public void limitCheck() {
		if (newBalance() > 0 ) {
			System.out.println("Credit limit exceeded");
		}

	}
	
	public String print() {
		return "New Balance is " + newBalance() +" .";
	}
	
	

	public int getAllowedCreditLimit() {
		return allowedCreditLimit;
	}

	public void setAllowedCreditLimit(int allowedCreditLimit) {
		this.allowedCreditLimit = allowedCreditLimit;
	}

	public int getAcountNumber() {
		return acountNumber;
	}

	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}

	public int getBeginMonthBalance() {
		return beginMonthBalance;
	}

	public void setBeginMonthBalance(int beginMonthBalance) {
		this.beginMonthBalance = beginMonthBalance;
	}

	public int getTotalAmountCharge() {
		return totalAmountSpend;
	}

	public void setTotalAmountCharge(int totalAmountSpend) {
		this.totalAmountSpend = totalAmountSpend;
	}

	public int getCriditGiven() {
		return criditGiven;
	}

	public void setCriditGiven(int criditGiven) {
		this.criditGiven = criditGiven;
	}

}

public class Assignment3_Q2 {

	public static void main(String[] args) {

		CreditCalculator cc = new CreditCalculator();
		cc.accept();
		System.out.println(cc.print());
		cc.limitCheck();

	}

}
