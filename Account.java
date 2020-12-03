package oop;

import java.util.Date;

public class Account {
	private int id=0;
	private double balance=0;
	private static double yearInterestRate=0;
	private Date dateCreated=new Date();
	Account(){
		//default values
	}
	Account(int newId, double newBalance, double newYearInterestRate){
		id = newId;
		balance = newBalance;
		yearInterestRate=newYearInterestRate;
	}
	String dateCreated() {
		return dateCreated.toString();
	}
	void setID(int newID) {
		id=newID;
	}
	void setBalance(int newBalance) {
		balance=newBalance;
	}
	void setYearInterestRate(int newYearInterstRate) {
		yearInterestRate=newYearInterstRate;
	}
	int getID() {
		return id;
	}
	double getBalance() {
		return this.balance;
	}
	double getYearInterestRate() {
		return yearInterestRate;
	}
	double getMonthlyInterestRate() {
		return yearInterestRate/12;
	}
	double getMontlyInterest() {
		return (yearInterestRate/12)*this.balance;
	}
	void withdraw(int a) {
		balance-=a;
	}
	void deposit(int a) {
		balance+=a;
	}
}
