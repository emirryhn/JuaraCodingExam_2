package main.controller;

import java.util.List;
import java.util.Scanner;

import main.interfaces.HeaderInterface;
import main.model.Income;
import main.model.Staff;
import main.ui.Menu;

public class Controller {

	private HeaderInterface header;

	
	double totalTax;
	int getTax;
	Scanner sc = new Scanner(System.in);
	Staff staff = new Staff();
	Income income = new Income();
	Menu menu = new Menu();
	
	//CONSTRUCTOR
	public Controller(HeaderInterface header, Menu menu) {
		this.header = header;
		this.menu = menu;
	}
	
	//RUN HEADER
	public void showAll() {
		this.header.showHeader();
		
	}
	//RUN ALL CODES
	public void run() {
		showAll();
		displayStaffInfo();
	}
	
	//CODES FOR INPUT STAFF INFO
	//TO DISPLAY INFO AFTER INPUT
	public void displayStaffInfo() {
		System.out.println("Input your name: ");
		String staffName = sc.next();
		System.out.println("What is your ID: ");
		int staffId = sc.nextInt();
		System.out.println("What is your income: ");
		double staffIncome = sc.nextDouble();
		System.out.println("Which one is your income source? ");
		String[] arr = menu.getIncomeSource();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+". "+arr[i]);
		}
		System.out.println("Input here: ");
		int option = sc.nextInt();
		if(option == 1) {
			getTax = 10;
		}else if(option == 2 ){
			getTax = 7;
		}else if(option == 3) {
			getTax = 5;
		}
		
		System.out.println("Your name is " + staffName);
		System.out.println("Your ID is " + staffId);
		System.out.println("Your income is " + staffIncome);
		System.out.println();
		totalTaxPaid(staffIncome);
		totalNetIncome(totalTax, staffIncome);
	}
	
	// CODES WITH TAX FORMULA 
	public void totalTaxPaid(double staffIncome) {
		totalTax = (getTax / 100.0f) * staffIncome;
		System.out.println("Your total tax is : " + totalTax);
	}
	
	//CODES WITH NET INCOME FORMULA
	public void totalNetIncome(double totalTax, double staffIncome) {
		double totalIncome = staffIncome-totalTax;
		System.out.println("Your net income is :"+totalIncome);
	}

}
