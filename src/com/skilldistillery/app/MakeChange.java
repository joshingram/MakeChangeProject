package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		System.out.println("** Cash Register **");
		System.out.println();
		menu();
	}

	public static void menu() {
		// Retrieve an item's price and how much the customer paid
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
		} else if (amountTendered < purchasePrice) {
			System.out.println("Insufficient funds tendered, ask the customer for more money.");
		} else {
			System.out.print("Change is due:");
			excess = amountTendered - purchasePrice;
			whatChangeDue(excess);
		}

		kb.close();

	}

	public static void whatChangeDue(double amountOver) {
		// Determine the amount of change due and convert to rounded int
		int changeInt = (int) (amountOver * 100 + .5);
		double changeDouble = changeInt;
		System.out.println("$ " + (changeDouble / 100));
		// Note: values below this point are multiplied by 100

		// number of $20 bills
		int num20 = changeInt / 2000;
		int running = changeInt - (num20 * 2000);

		// number of $10 bills
		int num10 = running / 1000;
		running = running - (num10 * 1000);

		// number of $5 bills
		int num5 = running / 500;
		running = running - (num5 * 500);

		// number of $1 bills
		int num1 = running / 100;
		running = running - (num1 * 100);

		// number of Quarters
		int num_25c = running / 25;
		running = running - (num_25c * 25);

		// number of Dimes
		int num_10c = running / 10;
		running = running - (num_10c * 10);

		// number of Nickels
		int num_5c = running / 5;
		running = running - (num_5c * 5);

		// number of Pennies
		int num_1c = running / 1;

		// Printout the results
		System.out.println("Give the customer the following change: ");
		if (num20 > 0) {
			System.out.println(num20 + " $20 bill(s)");
		}
		if (num10 > 0) {
			System.out.println(num10 + " $10 bill(s)");
		}
		if (num5 > 0) {
			System.out.println(num5 + " $5 bill(s)");
		}
		if (num1 > 0) {
			System.out.println(num1 + " $1 bill(s)");
		}
		if (num_25c > 0) {
			System.out.println(num_25c + " quarter(s)");
		}
		if (num_10c > 0) {
			System.out.println(num_10c + " dime(s)");
		}
		if (num_5c > 0) {
			System.out.println(+num_5c + " nickel(s)");
		}
		if (num_1c > 0) {
			System.out.println(num_1c + " penny/pennies");
		}
	}
}