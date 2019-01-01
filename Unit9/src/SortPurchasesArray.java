/**
 * @author Matt Brothen
 * Nov 18, 2018
 * SortPurchasesArray.java
 * 
 *
 */
import java.util.*;
public class SortPurchasesArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salesAmount, salesTax;
		int invoiceNumber, menu=0;
		Scanner input  = new Scanner(System.in);
		Purchase[] items = new Purchase[5];

		for (int i = 0; i < items.length; i++) {
			System.out.println("Invoice Number >> ");
			invoiceNumber = input.nextInt();
			System.out.println("Sales amount >> ");
			salesAmount = input.nextDouble();
			System.out.println("Sales tax >> ");
			salesTax = input.nextDouble();
			//set values to the object array 
			items[i] = new Purchase();
			items[i].setInvoiceNo(invoiceNumber);
			items[i].setSaleAmount(salesAmount);
			items[i].setSalesTax(salesTax);			
		}
		while(menu != 999) {
			menu = 0;
			System.out.println("  Select Sort Method");
			System.out.println("----------------------");
			System.out.println("1: Sort by Invoice #");
			System.out.println("2: Sort by Sames Amount");
			System.out.println("999: Exit Program");
			menu = input.nextInt();
	
			if (menu == 1)
				sortInvoice(items);
			else if (menu == 2)
				sortSales(items);
	}
	}
	public static void sortInvoice(Purchase[] items) {
		for (int i = 1; i < items.length; i++) {
			for (int j = 0; j < items.length-i; j++) {
				if (items[j].getInvoiceNo() > items[j+1].getInvoiceNo()) {
					Purchase temp = items[j];
					items[j] = items[j+1];
					items[j+1] =  temp;
				}
				
			}
		}
		System.out.println("-----------------------");
		for (int i = 0; i < items.length; i++) {
			System.out.println("Invoice Number: " + items[i].getInvoiceNo());
			System.out.println("Sale Amount: " + items[i].getSaleAmount());
			System.out.println("Tax: " + items[i].getSalesTax());
			System.out.println("-----------------------");
		}
	}
	public static void sortSales(Purchase[] items) {
		for (int i = 1; i < items.length; i++) {
			for (int j = 0; j < items.length-i; j++) {
				if (items[j].getSaleAmount() > items[j+1].getSaleAmount()) {
					Purchase temp = items[j];
					items[j] = items[j+1];
					items[j+1] =  temp;
				}
				
			}
		}
		System.out.println("-----------------------");
		for (int i = 0; i < items.length; i++) {
			System.out.println("Sale Amount: " + items[i].getSaleAmount());
			System.out.println("Invoice Number: " + items[i].getInvoiceNo());
			System.out.println("Tax: " + items[i].getSalesTax());
			System.out.println("-----------------------");
		}		
	}
}
