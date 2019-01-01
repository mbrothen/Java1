//Chapter 6, Exercise 14a - Purchase.java
//Christian Hur

//package ch6.ex14.purchase;

public class Purchase {
	
	private int invoiceNo;
	private double saleAmount;
	private double salesTax;

	//Constructor
	public Purchase() {	}
	
	public void displayPurchaseDetails() {
		System.out.println(" Invoice No: " + this.invoiceNo);
		System.out.println("Sale Amount: $" + String.format("%.2f", this.saleAmount));
		System.out.println("  Sales Tax: $" + String.format("%.2f", this.salesTax));
	}

	//Accessors and Mutators
	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public double getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(double saleAmount) {
		this.salesTax = saleAmount * 0.05;
		this.saleAmount = saleAmount;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

}
