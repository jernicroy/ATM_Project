package com.atm_project;

import java.text.DecimalFormat;
import java.util.*;

public class Account {
	private int pinNumber;
	private int custNumber;
	private double balance=0;
	
	DecimalFormat dc= new DecimalFormat("'$'###,##0.00");
	Scanner input= new Scanner(System.in);
	
	public void setPinNumber(int pin) {
		this.pinNumber=pin;
	}
	
	public void setCustomerNumber(int custNum) {
		this.custNumber=custNum;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public int getCustomerNumber() {
		return custNumber;
	}
	
	//	Get the Balance of the Savings Account
	public double getBalance() {
		return balance;
	}
	
	public void withdrawAmount() {
		// TODO Auto-generated method stub
		
	}
	
	

	public double calcCheckWithdrawAmt(double amt) {
		balance=balance-amt;
		return balance;
	}
	public void checkWithdrawAmt() {
		System.out.println("Checking Available balance...... "+dc.format(balance));
		System.out.println("Enter the Withdrawal Amount:");
		double amt= input.nextDouble();
		if((balance-amt)>=0) {
			calcCheckWithdrawAmt(amt);
			System.out.println("New Checking Account Balance: "+ dc.format(balance));
			
		}else {
			System.out.println("\nBalance cannont be negative\n");
		}
	}
	protected void checkDepAmt() {
		System.out.println("Checking Available Balance......"+dc.format(balance));
		System.out.println("Enter the deposit Ammount:");
		double amt= input.nextDouble();
		if((balance+amt)>=0) {
			 calcdepositAmt(amt);
			 System.out.println("New Available Balance.... "+dc.format(balance));
		}else {
			System.out.println("Balance cannot be Negative\n");
		}
	}

	private void calcdepositAmt(double amt) {
		balance+=amt;		
	}
}
