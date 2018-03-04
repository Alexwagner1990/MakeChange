package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeAppFinal {

	static MakeChangeApp refactor;

	public static void main(String[] args) {
		System.out.println("WELCOME TO THE AMERICAN FREEDOM EMPORIUM CAPITALISM SUPERSTORE AUTOMATED BRANCH!");
		
			double cost = refactor.costOfItem();
			refactor.isThisCostPositive(cost);
			
			double cash = refactor.howMuchIsCustomerPaying();
			refactor.isThisCashPositive(cash);
			
			int costInPennies = turnValuesIntoPennies(cost);
			int cashInPennies = turnValuesIntoPennies(cash);
			
			refactor.doesCustomerPayEnough(costInPennies, cashInPennies);

		System.out.println(
				"DUE TO THE INCREASED POPULARITY OF OFFICE SPACE (TM),\nWE NO LONGER SELL ITEMS AT COSTS WITH FRACTIONS OF A CENT\nNOR DO WE ACCEPT FRACTIONS OF A CENT IN PAYMENT\nWE APOLOGIZE FOR THE INCONVENIENCE!\n");

			int change = refactor.doesCustomerNeedChange(costInPennies, cashInPennies);
			change = refactor.doesCustomerNeedHundreds(change);
			change = refactor.doesCustomerNeedFifties(change);
			change = refactor.doesCustomerNeedTwenties(change);
			change = refactor.doesCustomerNeedTens(change);
			change = refactor.doesCustomerNeedFives(change);
			change = refactor.doesCustomerNeedOnes(change);
			change = refactor.doesCustomerNeedQuarters(change);
			change = refactor.doesCustomerNeedDimes(change);
			change = refactor.doesCustomerNeedNickels(change);
			refactor.doesCustomerNeedPennies(change);

		System.out.println(
				"\n\nTHANK YOU FOR YOUR PATRONAGE. \nIN COMPLIANCE WITH THE \"SMALL GOVERNMENT FIGHTING HOMEGROWN TERRORISM ACT\" OF 2018 \nYOUR PURCHASE DATA HAS BEEN SENT TO THE NSA AND OTHER APPLICABLE GOVERNMENT OFFICES AND MARKETERS.\nTRANSACTION COMPLETE. HAVE A NICE DAY!\n***************");
	}

	public static int turnValuesIntoPennies(double totalInPennies) {
		int valueInPennies = (int) (totalInPennies * 100);
		// System.out.println(valueInPennies);
		// valueInPennies = floor(valueInPennies);
		System.out.println(valueInPennies);
		return valueInPennies;
	}

}
