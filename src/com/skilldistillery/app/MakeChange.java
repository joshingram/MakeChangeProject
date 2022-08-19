package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		System.out.println("** Cash Register **");
		System.out.println();
		// Get an item's price and how much the customer paid
		double purchasePrice, amountTendered;
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
			System.out.println("Insufficient funds tendered, ask the customer for more money");
		}
		else {
			
		}
			
			
		
		
kb.close();
	}

}
