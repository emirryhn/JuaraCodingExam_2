package main.model;

public class Income {
	
	public String incomeType[] = {"Employee", "Business", "Party"};
	
	double amount;
	double tax;
	double totalTax;
	
	
	public String[] getIncomeType() {
		return incomeType;
	}
	public double getAmount() {
		return amount;
	}
	public double getTax() {
		return tax;
	}
	public double getTotalTax() {
		return totalTax;
	}
	
	
	
	
}
