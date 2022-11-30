package com.atm_project;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account{
	Scanner sc= new Scanner(System.in);
	DecimalFormat dc= new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> login = new HashMap<Integer,Integer>();
	
	private int selection;
	private int savselec;
	public void getLogin()throws IOException {
		int x=1;
		do {
			try {
				login.put(69089909, 1971);
				login.put(69082139, 1871);
				login.put(1, 1);
				
				System.out.println("\nWelcome to ATM Machine");
				System.out.println("Enter Account No:");
				setCustomerNumber(sc.nextInt());
				System.out.println("Enter the Pin Number:");
				setPinNumber(sc.nextInt());
				
				
			}catch(Exception e) {
				System.out.println(e);
				x=2;
			}
			for(Entry<Integer,Integer> entry : login.entrySet()) {
				if(entry.getKey()==getCustomerNumber()&&entry.getValue()==getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("Wrong Customer ID or pin Number!! ");
		}while(x==1);
	}
	
	public void getAccountType() {
		System.out.println("\nSelect the Account action to be performed: ");
		System.out.println("Type 1: Savings Account");
		System.out.println("Type 2: Exit");
		System.out.println("Choice");
		selection=sc.nextInt();
		
		switch(selection) {
		case 1:
			getSaving();
			break;
		case 2:
			System.out.println("Thank You for using ATM Machine, BYE");
			System.exit(0);
		default:
			System.out.println("Enter the valid Choice!!");
			getAccountType();
		}
	}
	
	public void getSaving() {
		System.out.println("WELCOME TO SAVINGS ACCOUNT");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
		System.out.println("Select the Action:");
		System.out.println("Type 1: Available Balance");
		System.out.println("Type 2: Deposit Amount");
		System.out.println("Type 3: Withdraw Fund");
		System.out.println("Type 4: EXIT");
		System.out.println("\nChoice:");
		savselec=sc.nextInt();
		switch(savselec) {
		case 1:
			System.out.println("Checking Account Balance : "+dc.format(getBalance()));
			getAccountType();
			break;
		case 2:
			checkDepAmt();
			getAccountType();
			break;
		case 3:
			checkWithdrawAmt();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank You for using the ATM!!\n WELCOME AGAIN!!");
		default:
			System.out.println("Enter the Valid Choice!!");
			getSaving();
		}
		
	}
	
	
}
