//Chapter 6, Exercise 14b - CreatePurchase.java
//Christian Hur

//package ch6.ex14.purchase;

import java.util.Scanner;

public class CreatePurchase {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Purchase purchase = new Purchase();
		
		getInvoiceNumber(purchase);
		getSaleAmount(purchase);				
		printPurchaseDetails(purchase);
		
		input.close();	//close read stream
	}
	
	//Prints the purchase details
	public static void printPurchaseDetails(Purchase purchase) {
		System.out.println("\n******* PURCHASE DETAILS *******\n");
		purchase.displayPurchaseDetails();
		System.out.println("\n**** END OF PURCHASE DETAILS ***\n");
	}
	
	//Get sale amount from user
	//Set to purchase object
	public static void getSaleAmount(Purchase purchase) {
		double saleAmount = 0;
		do {
			System.out.print("Enter a sale amount greater than 0: ");
			saleAmount = input.nextDouble();
			
		}while(saleAmount < 0);
		
		input.nextLine();	//read off carriage return
		purchase.setSaleAmount(saleAmount);
	}
	
	//Get invoice number from user
	//Set to purchase object
	public static void getInvoiceNumber(Purchase purchase) {
		final int minInvoiceNumber = 1000;
		final int maxInvoiceNumber = 8000;
		int invoiceNo = 0;
		do {
			System.out.print("Enter an invoice number between 1000 and 8000: ");
			invoiceNo = input.nextInt();
			
		}while(invoiceNo < minInvoiceNumber || invoiceNo > maxInvoiceNumber);
		
		input.nextLine();	//read off carriage return
		purchase.setInvoiceNo(invoiceNo);
	}

}
