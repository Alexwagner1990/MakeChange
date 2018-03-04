package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	static Scanner input;
	
//THIS NO LONGER HAS A MAIN, THIS IS AN OBJECT FOR MakeChangeAppFinal.java
/* This is the first version of the MakeChange program - it ALMOST worked, but rounding errors meant it often returned one too many or too few pennies.
 * After looking at it the errors were because of converting doubles to ints too many times, but other than that the other methods worked fine and are
 * preserved in the final project. The faulty methods have been commented out.
 */
//	public static void main(String[] args) {
//		System.out.println("WELCOME TO THE AMERICAN FREEDOM EMPORIUM CAPITALISM SUPERSTORE AUTOMATED BRANCH!");
//		double cost = costOfItem();
//		isThisCostPositive(cost); 
//		double cash = howMuchIsCustomerPaying();
//		isThisCashPositive(cash);
////		double finalcost = roundDoublesToNearestCent(cost);
////		double finalcash = roundDoublesToNearestCent(cash);
//		System.out.println(
//				"DUE TO THE INCREASED POPULARITY OF OFFICE SPACE (TM),\nWE NO LONGER SELL ITEMS AT COSTS WITH FRACTIONS OF A CENT\nNOR DO WE ACCEPT FRACTIONS OF A CENT IN PAYMENT\nTHE AMERICAN FREEDOM EMPORIUM CAPITALISM SUPERSTORE CORPORATE TEAM\nAPOLOGIZES FOR THE INCONVENIENCE!");
//		doesCustomerPayEnough(cost, cash);
////The previous version of this code had each of these values divided by their dollar values. they've been modified to find change in pennies and not convert a double to an int.
//		int change = doesCustomerNeedChange(cost, cash);
//		change = doesCustomerNeedHundreds(change);
//		change = doesCustomerNeedFifties(change);
//		change = doesCustomerNeedTwenties(change);
//		change = doesCustomerNeedTens(change);
//		change = doesCustomerNeedFives(change);
//		change = doesCustomerNeedOnes(change);
//		change = doesCustomerNeedQuarters(change);
//		change = doesCustomerNeedDimes(change);
//		change = doesCustomerNeedNickels(change);
//		doesCustomerNeedPennies(change);
//		System.out.println("THANK YOU FOR YOUR PATRONAGE. \nIN COMPLIANCE WITH THE \"SMALL GOVERNMENT FIGHTING HOMEGROWN TERRORISM ACT\" OF 2018 \nYOUR PURCHASE DATA HAS BEEN SENT TO THE NSA AND OTHER APPLICABLE GOVERNMENT OFFICES AND MARKETERS.\nTRANSACTION COMPLETE. HAVE A NICE DAY!");
//
//	}

	public static void doesCustomerNeedPennies(int change) {
			
		int pennies = (int) (change);
//		if (change > 0 && change < 1) {
//			pennies = pennies + 1;
//		} This if statement tried to compensate for the missing penny 
		
		if (pennies == 1) {
			System.out.println("DISPENSING " + pennies + " PENNY.");
		} else if (pennies > 1) {
			System.out.println("DISPENSING " + pennies + " PENNIES.");
		}
	}

	public static int doesCustomerNeedNickels(int change) {
		int nickels = (int) (change / 5);
		if (nickels == 1) {
			System.out.println("DISPENSING " + nickels + " NICKEL.");
		} else if (nickels > 1) {
			System.out.println("DISPENSING " + nickels + " NICKELS.");
		}
		int remainingchange = change % 5;
//		remainingchange = roundDoublesToNearestCent(remainingchange);
		return remainingchange;
	}

	public static int doesCustomerNeedDimes(int change) {
		int dimes = (int) (change / 10);
		if (dimes == 1) {
			System.out.println("DISPENSING " + dimes + " DIME.");
		} else if (dimes > 1) {
			System.out.println("DISPENSING " + dimes + " DIMES.");
		}
		int remainingchange = change % 10;
//		remainingchange = roundDoublesToNearestCent(remainingchange);
		return remainingchange;
	}

	public static int doesCustomerNeedQuarters(int change) {
		int quarters = (int) (change / 25);
		if (quarters == 1) {
			System.out.println("DISPENSING " + quarters + " QUARTER.");
		} else if (quarters > 1) {
			System.out.println("DISPENSING " + quarters + " QUARTERS.");
		}
		int remainingchange = change % 25;
//		remainingchange = roundDoublesToNearestCent(remainingchange);
		return remainingchange;
	}

	public static int doesCustomerNeedOnes(int change) {
		int ones = (int) (change/100);
		if (ones == 1) {
			System.out.println("PRINTING " + ones + " ONE DOLLAR BILL.");
		}
		if (ones > 1) {
			System.out.println("PRINTING " + ones + " ONE DOLLAR BILLS.");
		}
		int remainingchange = change % 100;
//		remainingchange = roundDoublesToNearestCent(remainingchange);
		return remainingchange;
	}

	public static int doesCustomerNeedFives(int change) {
		int fives = (int) (change / 500);
		if (fives == 1) {
			System.out.println("PRINTING " + fives + " FIVE DOLLAR BILL.");
		} else if (fives > 1) {
			System.out.println("PRINTING " + fives + " FIVE DOLLAR BILLS.");
		}
		int remainingchange = change % 500;
//		remainingchange = roundDoublesToNearestCent(remainingchange);
		return remainingchange;
	}

	public static int doesCustomerNeedTens(int change) {
		int tens = (int) (change / 1000);
		if (tens == 1) {
			System.out.println("PRINTING " + tens + " TEN DOLLAR BILL.");
		} else if (tens > 1) {
			System.out.println("PRINTING " + tens + " TEN DOLLAR BILLS.");
		}
		int remainingchange = change % 1000;
//		remainingchange = roundDoublesToNearestCent(remainingchange);
		return remainingchange;
	}

	public static int doesCustomerNeedTwenties(int change) {
		int twenties = (int) (change / 2000);
		if (twenties == 1) {
			System.out.println("PRINTING " + twenties + " TWENTY DOLLAR BILL.");
		} else if (twenties > 1) {
			System.out.println("PRINTING " + twenties + " TWENTY DOLLAR BILLS.");
		}
		int remainingchange = change % 2000;
//		remainingchange = roundDoublesToNearestCent(remainingchange);
		return remainingchange;
	}
	
	public static int doesCustomerNeedFifties(int change) {
		int fifties = (int) (change / 5000);
		if (fifties == 1) {
			System.out.println("PRINTING " + fifties + " FIFTY DOLLAR BILL.");
		} else if (fifties > 1) {
			System.out.println("PRINTING " + fifties + " FIFTY DOLLAR BILLS.");
		}
		int remainingchange = change % 5000;
//		remainingchange = roundDoublesToNearestCent(remainingchange);
		return remainingchange;
	}
	
	public static int doesCustomerNeedHundreds(int change) {
		int hundreds = (int) (change / 10000);
		if (hundreds == 1) {
			System.out.println("PRINTING " + hundreds + " ONE-HUNDRED DOLLAR BILL.");
		} else if (hundreds > 1) {
			System.out.println("PRINTING " + hundreds + " ONE-HUNDRED DOLLAR BILLS.");
		}
		int remainingchange = change % 10000;
//		remainingchange = roundDoublesToNearestCent(remainingchange);
		return remainingchange;
	}

	public static int doesCustomerNeedChange(int finalcost, int finalcash) {
		if (finalcost == finalcash) {
			System.out.println("NO CHANGE REQUIRED. \nTHE AMERICAN FREEDOM EMPORIUM CAPITALISM SUPERSTORE CORPORATION \nVALUES YOUR SLAVISH LOYALTY AND IMPRESSIONABLE FRONTAL CORTEX.\nHAVE A NICE DAY!\n***************");
			System.exit(0);
		}
		//roundDoublesToNearestCent(finalcost);
		//roundDoublesToNearestCent(finalcash);
		int change = finalcash - finalcost;
//		double changeDisplay = (change/100); - ORIGINALLY USED TO DISPLAY TOTAL CHANGE IN $$$ FORMAT. ROUNDING ERRORS CAME UP.
//		change = roundDoublesToNearestCentFinal(change);
		System.out.println("\"THE FAIRNESS IN FISCAL EXCHANGE ACT\" OF 1790 OBLIGATES THIS CORPORATION \nTO RETURN TO YOU EXCESS MONIES PAID\n\nPROCESSING . . .\n\n");
		return change;
	}

	public static void doesCustomerPayEnough(int cost, int cash) {
		do {
			if (cost > cash) {
//				cost = roundDoublesToNearestCent(cost);
//				cash = roundDoublesToNearestCent(cash);
				int needmoreInPennies = cost - cash;
//				double needmoreInDollars = needmoreInPennies/100; - ORIGINALLY USED TO SEE HOW MUCH REMAINED. SAW ROUNDING ERRORS
				System.out.println("INVALID TRANSACTION: MORE MONEY REQUIRED.\nPLEASE BEGIN A NEW TRANSACTION.\n***************");
				System.exit(0);
//				double rawcost = costOfItem();
//				isThisCostPositive(rawcost); 
//				double rawcash = howMuchIsCustomerPaying();
//				isThisCashPositive(rawcash);
//				cost = (int)(rawcost*100);
//				cash = (int)(rawcash*100);
		
			}
		} while (cost > cash);
		System.out.println("PAYMENT ACCEPTED! \n\nPROCESSING . . . . . . .\n\n");
	}

//	public static double roundDoublesToNearestCent(double rawnumber) { 
//		int cashvalueint = (int) (rawnumber * 10000); 
//		double cashvaluedouble = (cashvalueint); 
//		double cashvalue = cashvaluedouble / 10000; 
//		System.out.println(cashvalue);
//		//this cashvalue has some leftovers
//		return cashvalue;
//	}
	
//	public static double roundDoublesToNearestCentFinal(double rawnumber) { 
//		int cashvalueint = (int) (rawnumber * 100); 
//		double cashvaluedouble = (cashvalueint); 
//		double cashvalue = cashvaluedouble / 100; 
//		System.out.println(cashvalue);
//		return cashvalue;
//	}

	public static double isThisCostPositive(double cost) {

		while (true) {
			if (cost < 0) {
				System.out.print("ERROR: WE DO NOT SELL ITEMS AT NEGATIVE PRICES!\nPLEASE CHECK BACK DURING BLACK FRIDAY CLOSEOUT \nOR TRY A POSITIVE COST\n***************\n");
//				cost = costOfItem(); - ORIGINALLY THIS LINE WAS USED TO ALLOW USER TO RE-ENTER CORRECT COST, BUT SAW BUGS WHEN ITERATED MULTIPLE TIMES
				System.exit(0);
			} else {
				break;
			}
		}
		return cost;
	}

	public static double isThisCashPositive(double cash) {

		while (true) {
			if (cash < 0) {
				System.out.print("ERROR: WE DO NOT ACCEPT NEGATIVE AMOUNTS OF CASH!\nPLEASE CHECK BACK DURING THE NEXT GLOBAL FINANCIAL CRISIS \nOR SUBMIT A POSITIVE AMOUNT OF CASH\n***************\n");
				System.exit(0);
//				cash = howMuchIsCustomerPaying(); - ORIGINALLY THIS LINE WAS USED TO ALLOW USER TO RE-ENTER CORRECT CASH VALUE. SAW BUGS WHEN INITIATED MULTIPLE TIMES
			} else {
				break;
			}
		}
		return cash;
	}

	public static double costOfItem() {
		Scanner item = new Scanner(System.in);
		System.out.print("ENTER THE COST OF YOUR DESIRED ITEM, VALUED CONSUMER: $");
		double cost = item.nextDouble();
		return cost;
	}

	public static double howMuchIsCustomerPaying() {
		Scanner item = new Scanner(System.in);
		System.out.print("PLEASE ENTER THE AMOUNT YOU WILL PAY: $");
		double cash = item.nextDouble();
		return cash;
	}

}
