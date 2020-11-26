package oop;

import java.util.Date;

public class Account {
	private int id=0;
	private double balance=0;
	private double yearInterestRate=0;
	private Date dateCreated=new Date();
	Account(){
		//default values
	}
	Account(int newId, double newBalance, double newYearInterestRate){
		this.id = newId;
		this.balance = newBalance;
		this.yearInterestRate=newYearInterestRate;
	}
	String dateCreated() {
		return dateCreated.toString();
	}
	void setID(int newID) {
		this.id=newID;
	}
	void setBalance(int newBalance) {
		this.balance=newBalance;
	}
	void setYearInterestRate(int newYearInterstRate) {
		this.yearInterestRate=newYearInterstRate;
	}
	int getID() {
		return this.id;
	}
	double getBalance() {
		return this.balance;
	}
	double getYearInterestRate() {
		return this.yearInterestRate;
	}
	double getMonthlyInterestRate() {
		return this.yearInterestRate/12;
	}
	double getMontlyInterest() {
		return (this.yearInterestRate/12)*this.balance;
	}
	void withdraw(int a) {
		balance-=a;
	}
	void deposit(int a) {
		balance+=a;
	}
}
