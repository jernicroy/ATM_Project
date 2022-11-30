package com.atm_project;

import java.io.IOException;

public class ATM extends OptionMenu{

	public static void main(String[] args) {
		OptionMenu obj= new OptionMenu();
		try {
			obj.getLogin();
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
