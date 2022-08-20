package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		System.out.println("** Cash Register **");
		System.out.println();
		menu();
	}
	public static void menu() {
		// Get an item's price and how much the customer paid
		double purchasePrice, amountTendered, excess;
		Scanner kb = new Scanner(System.in);
		System.out.print("What is the price of the item being purchased?:");
				purchasePrice = kb.nextDouble();

//				if (purchasePrice <= 0) {
//					System.out.println("Call a manager, price is $0 or less");
//				}
		System.out.print("How much did the customer pay?: ");	
			amountTendered = kb.nextDouble();
		// Compare amount tendered to price	
		if (amountTendered == purchasePrice) {
			System.out.println("No change due, thank the customer for their business.");
		}
		else if (amountTendered < purchasePrice) {
			System.out.println("Insufficient funds tendered, ask the customer for more money.");
		}
		else {
			System.out.print("Change is due:");
			excess = amountTendered - purchasePrice; 
			whatChangeDue(excess);	
		}
	
		kb.close();
		
	}

	public static void whatChangeDue(double amountOver) {
		//Determine the amount of change due and convert to rounded int
		int changeInt = (int)(amountOver * 100 + .5);
		double changeDouble = changeInt;
		System.out.println("$ " + (changeDouble/100)); 
		
		//number of $20 bills 
		int num20 = changeInt / 2000;
			int num20Bills = (int)num20;
		int running = changeInt - (num20Bills * 2000);
	
		//number of $10 bills
		int num10 = running / 1000;
			int num10Bills = (int)num10;
		running = running - (num10Bills * 1000);
	
		//number of $5 bills
		int num5 = running / 500;
		int num5Bills = (int)num5;
		running = running - (num5Bills * 500);
	
		//number of $1 bills
		int num1 = running / 100;
		int num1Bills = (int)num1;
		running = running - (num1Bills * 100);
		
		//number of Quarters
		int num_25c = running / 25;
		int numQuarters = (int)num_25c;
		running = running - (numQuarters * 25);
		
		//number of Dimes
		int num_10c = running / 10;
		int numDimes = (int)num_10c;
		running = running - (numDimes * 10);
	
		//number of Nickels
		int num_5c = running / 5;
		int numNickels = (int)num_5c;
		running = running - (numNickels * 5);
		
		//number of Pennies
		int num_1c = running / 1;
		int numPennies = (int)num_1c;
		
		//Printout the results
		System.out.println("The customer gets the following change: "); 
		if (num20Bills > 0)	{	
		System.out.println(num20Bills + " 20 bill(s)");
		}
		if (num10Bills > 0) {
		System.out.println(num10Bills + " 10 bill(s)");
		}
		if (num5Bills > 0) {
		System.out.println(num5Bills + " 5 bill(s)");
		}
		if (num1Bills > 0) {
			System.out.println(num1Bills + " 1 bill(s)");
		}
		if (numQuarters > 0)	{
			System.out.println(numQuarters + " quarter(s)");
		}
		if (numDimes > 0)	{
			System.out.println(numDimes + " dime(s)");
		}
		if (numNickels > 0) {
			System.out.println(+ numNickels + " nickel(s)");
		}
		if (numPennies > 0 ) {
			System.out.println(numPennies + " penny/pennies");
		}		
    }
}