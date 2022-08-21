package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		System.out.println("** Cash Register **");
		System.out.println();
		double change = menu();
		if (change > 0) {
			whatChangeDue(change);
		}
	}

	public static double menu() {
		// Retrieve an item's price and how much the customer paid
		double purchasePrice, amountTendered, changeDue = 0;
		Scanner kb = new Scanner(System.in);

		System.out.print("What is the price of the item being purchased?: ");
		purchasePrice = kb.nextDouble();
		System.out.print("How much did the customer pay?: ");
		amountTendered = kb.nextDouble();

		// Compare amount tendered to price
		if (amountTendered == purchasePrice) {
			System.out.println("No change due, thank the customer for their business.");
		} else if (amountTendered < purchasePrice) {
			System.out.println("Insufficient funds tendered");
		} else {
			System.out.print("Change due: ");
			changeDue = amountTendered - purchasePrice;
		}
		kb.close();
		return changeDue;
	}

	public static void whatChangeDue(double amountOver) {
		// Determine the amount of change due and convert to rounded int
		int changeInt = (int) (amountOver * 100 + .5);
		double changeDouble = changeInt;
		System.out.println("$ " + (changeDouble / 100));
		// Note: values below this point are multiplied by 100

		// number of $20 bills
		int num20 = changeInt / 2000;
		int remain20 = changeInt % 2000;

		// number of $10 bills
		int num10 = remain20 / 1000;
		int remain10 = remain20 % 1000;

		// number of $5 bills
		int num5 = remain10 / 500;
		int remain5 = remain10 % 500;

		// number of $1 bills
		int num1 = remain5 / 100;
		int remain1 = remain5 % 100;

		// number of Quarters
		int num_25c = remain1 / 25;
		int remain_25c = remain1 % 25;

		// number of Dimes
		int num_10c = remain_25c / 10;
		int remain_10c = remain_25c % 10;

		// number of Nickels
		int num_5c = remain_10c / 5;
		int remain_5c = remain_10c % 5;

		// number of Pennies
		int num_1c = remain_5c / 1;

		// Determine plural vs singular unit and appropriate commas/"and", then print
		// out the results
		System.out.println("Give the customer the following: ");
		if (num20 > 0) {
			if (num20 > 1) {
				System.out.print(num20 + " twenty dollar bills");
			} else {
				System.out.print(num20 + " twenty dollar bill");
			}
			if (remain20 == 0) {
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		if (num10 > 0) {
			if (num20 > 0 & (num5 == 0 & num1 == 0 & num_25c == 0 & num_10c == 0 & num_5c == 0 & num_1c == 0)) {
				System.out.print("and ");
			}
			if (num10 > 1) {
				System.out.print(num10 + " ten dollar bills");
			} else {
				System.out.print(num10 + " ten dollar bill");
			}
			if (remain10 == 0) {
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		if (num5 > 0) {
			if ((num20 > 0 | num10 > 0) & (num1 == 0 & num_25c == 0 & num_10c == 0 & num_5c == 0 & num_1c == 0)) {
				System.out.print("and ");
			}
			if (num5 > 1) {
				System.out.print(num5 + " five dollar bills");
			} else {
				System.out.print(num5 + " five dollar bill");
			}
			if (remain5 == 0) {
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		if (num1 > 0) {
			if ((num20 > 0 | num10 > 0 | num5 > 0) & (num_25c == 0 & num_10c == 0 & num_5c == 0 & num_1c == 0)) {
				System.out.print("and ");
			}
			if (num1 > 1) {
				System.out.print(num1 + " one dollar bills");
			} else {
				System.out.print(num1 + " one dollar bill");
			}
			if (remain1 == 0) {
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		if (num_25c > 0) {
			if ((num20 > 0 | num10 > 0 | num5 > 0 | num1 > 0) & (num_10c == 0 & num_5c == 0 & num_1c == 0)) {
				System.out.print("and ");
			}
			if (num_25c > 1) {
				System.out.print(num_25c + " quarters");
			} else {
				System.out.print(num_25c + " quarter");
			}
			if (remain_25c == 0) {
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		if (num_10c > 0) {
			if ((num20 > 0 | num10 > 0 | num5 > 0 | num1 > 0 | num_25c > 0) & (num_5c == 0 & num_1c == 0)) {
				System.out.print("and ");
			}
			if (num_10c > 1) {
				System.out.print(num_10c + " dimes");
			} else {
				System.out.print(num_10c + " dime");
			}
			if (remain_25c == 0) {
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		if (num_5c > 0) {
			if ((num20 > 0 | num10 > 0 | num5 > 0 | num1 > 0 | num_25c > 0 | num_10c > 0) & (num_1c == 0)) {
				System.out.print("and ");
			}
			if (num_5c > 1) {
				System.out.print(num_5c + " nickels");  //two nickels = 1 dime, line won't be used?
			} else {
				System.out.print(num_5c + " nickel");
			}
			if (remain_5c == 0) {
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}
		if (num_1c > 0) {
			if (num20 > 0 | num10 > 0 | num5 > 0 | num1 > 0 | num_25c > 0 | num_10c > 0 | num_5c > 0) {
				System.out.print("and ");
			}
			if (num_1c > 1) {
				System.out.print(num_1c + " pennies.");
			} else {
				System.out.print(num_1c + " penny.");
			}
		}
	}
}