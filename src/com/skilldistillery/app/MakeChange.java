package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		System.out.println("** Cash Register **");
		System.out.println();
		// Get an item's price and how much the customer paid
		double purchasePrice, amountTendered, amountOver;
		Scanner kb = new Scanner(System.in);
		System.out.print("What is the price of the item being purchased?:");
				purchasePrice = kb.nextDouble();
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
			System.out.println("Change is due:");
		// Determine the amount of change due
			double amountToBreakDown = amountTendered - purchasePrice;  //amountToBreaDown was amountOver
			System.out.println(amountToBreakDown); //amountToBreaDown was amountOver
			//String changeOutPut = whatChangeDue(amountOver);
		//}
		
kb.close();
	//}

	//public static String whatChangeDue(double amountToBreakDown) {
		//number of $20 bills 
		double num20 = amountToBreakDown / 20;
			int num20Bills = (int)num20;
		double running = amountToBreakDown - (num20Bills * 20);
		//number of $10 bills
		double num10 = running / 10;
			int num10Bills = (int)num10;
		running = running - (num10Bills * 10);
		//number of $5 bills
		double num5 = running / 5;
		int num5Bills = (int)num5;
		running = running - (num5Bills * 5);
		//number of $1 bills
		double num1 = running / 1;
		int num1Bills = (int)num1;
		running = running - (num1Bills * 1);
		//number of Quarters
		double num_25c = running / .25;
		int numQuarters = (int)num_25c;
		running = running - (numQuarters * .25);
		//number of Dimes
		double num_10c = running / .1;
		int numDimes = (int)num_10c;
		running = running - (numDimes * .1);
		//number of Nickels
		double num_5c = running / .05;
		int numNickels = (int)num_5c;
		running = running - (numNickels * .05);
		//number of Pennies
		double num_1c = running / .01;
		int numPennies = (int)num_1c;
		running = running - (numPennies * .01); // line may not be needed or should be modified
		
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
}
