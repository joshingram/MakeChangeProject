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
		double num20b = amountToBreakDown / 20;
			int num20bO = (int)num20b;
		double running = amountToBreakDown - (num20bO * 20);
		double num10b = running / 10;
			int num10bO = (int)num10b;
		running = running - (num10bO * 10);
		
		double num5b = running / 5;
		int num5bO = (int)num5b;
		running = running - (num5bO * 5);
		
		double num1b = running / 1;
		int num1bO = (int)num1b;
		running = running - (num5bO * 1);
		
		System.out.println("The customer gets the following: " + num20bO + " 20 bills, \n"
				+ num10bO + " 10 bills, \n"
				+ num5bO + " 5 bills, \n"
				+ num1bO + " 1 bills, \n");  

	}
	}
}
