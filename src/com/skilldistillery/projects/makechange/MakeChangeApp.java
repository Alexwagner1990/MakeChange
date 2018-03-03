package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeApp {
	
static Scanner input;

	public static void main(String[] args) {
		System.out.println("WELCOME TO THE FREEDOM EMPORIUM CAPITALISM SUPERSTORE AUTOMATED BRANCH!");
		double cost = costOfItem();
		isThisCostPositive(cost); //this doesn't change the value of cost
		double cash	= howMuchIsCustomerPaying();
		isThisCashPositive(cash);
		double finalcost = roundDoublesToNearestCent(cost);
		double finalcash = roundDoublesToNearestCent(cash);
		System.out.println("DUE TO THE INCREASED POPULARITY OF OFFICE SPACE,\n WE NO LONGER SELL ITEMS AT COSTS WITH FRACTIONS OF A CENT\nNOR DO WE ACCEPT FRACTIONS OF A CENT IN PAYMENT\nTHE FREEDOM EMPORIUM CAPITALISM SUPERSTORE CORPORATE TEAM\nAPOLOGIZES FOR THE INCONVENIENCE!");
		doesCustomerPayEnough(finalcost, finalcash);
		
	}
	
	public static void doesCustomerPayEnough(double cost, double cash) {
		do {
			if(cost > cash) {
				double needmore = cost-cash;
				System.out.println("INVALID TRANSACTION: $" +needmore+ "MORE DOLLARS REQUIRED.\nPLEASE BEGIN A NEW TRANSACTION.");
				
			}
		}while (cost > cash);
		System.out.println("PAYMENT ACCEPTED! PROCESSING . . . . . . .");
	}

	public static double roundDoublesToNearestCent(double rawnumber) {
		int cashvalueint = (int) (rawnumber * 100); //turn raw data to an int, then put it back to a double to get rid of decimals
		double cashvaluedouble = (cashvalueint); // turn it back to a double so that dividing by 100 will return two decimals
		double cashvalue = cashvaluedouble/100; //gives the decimal points back to the number
		
		return cashvalue;
	}

	public static double isThisCostPositive(double cost) {
		
		while(true) {
			if (cost < 0) {
			System.out.print("ERROR: WE DO NOT SELL ITEMS AT NEGATIVE PRICES!\nPLEASE CHECK BACK DURING BLACK FRIDAY CLOSEOUT \nOR TRY A POSITIVE COST\n***************\n");
			cost = costOfItem();
			}
			else {
				break;
			}
		}
		return cost;
	}
	public static double isThisCashPositive(double cash) {

		while(true) {
			if (cash < 0) {
				System.out.print("ERROR: WE DO NOT ACCEPT NEGATIVE AMMOUNTS OF CASH!\n PLEASE CHECK BACK DURING THE NEXT GLOBAL FINANCIAL CRISIS \nOR SUBMIT A POSITIVE AMOUNT OF CASH\n***************\n");
				cash = costOfItem();
			}
			else {
				break;
			}
		}
		return cash;
	}

	public static double costOfItem() {
		Scanner item = new Scanner(System.in);
		System.out.print("ENTER THE COST OF YOUR DESIRED ITEM, VALUED CONSUMER:");
		double cost = item.nextDouble();
		return cost;
	}
	public static double howMuchIsCustomerPaying() {
		Scanner item = new Scanner(System.in);
		System.out.print("PLEASE ENTER THE AMOUNT YOU WILL PAY: ");
		double cash = item.nextDouble();
		return cash;
	}

}


/* HINTS
 * Multiply a double by 100 and cast it as an int, then divide that int by 100 to get rid of extra decimal places
 */


// Make Change (Cash Register)
// Overview
// In the cash register we will calculate the amount of change returned to a
// customer based on the purchase price and the amount tendered. We will also
// notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1,
// .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change
// should be provided using the largest bill and coin denominations as possible.
// Denominations that are not used should not be displayed.
//
// Hint: Mod operator
//
// User Story #1
// The user is prompted asking for the price of the item.
//
// User Story #2
// The user is then prompted asking how much money was tendered by the customer.
//
// User Story #3
// Display an appropriate message if the customer provided too little money or
// the exact amount.
//
// User Story #4
// If the amount tendered is more than the cost of the item, display the number
// of bills and coins that should be given to the customer.
//
// Grading
// This is a graded project. You are expected to have your project completed by
// the start of class on Monday morning.
//
// You will be given either a pass or fail based on whether your code works
// given all of the following test conditions:
//
// Amount: .67, Tendered: .50, Result: Error message
// Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
// Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
// Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill,
// 1 one dollar bill, 4 pennies.
// Amount: any amount less than 20.00, Tendered: anything greater than amount:
// correct denominations for correct change.
// If the project does work with all of the above test conditions, you will be
// given a 1 for this week's project.
//
// If the project does not work with the above test conditions, you will be
// given a 0 for this week's project.
//
// If you get a zero on the project, you can upgrade to a score of .5 if you
// turn in a working project by the start of class on the following Monday
// morning AND notify an instructor that you wish to get partial credit.
//
// To turn in a project, you must push it to GitHub. You must include a
// README.md that describes how to run your program.