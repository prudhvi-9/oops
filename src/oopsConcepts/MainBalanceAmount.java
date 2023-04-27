package oopsConcepts;

import java.util.Scanner;

public class MainBalanceAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Creating object
		 */

		DebitAmountFromAccount account = new DebitAmountFromAccount(5000.0);

		/*
		 * Displaying initial balance of each object.
		 */
		System.out.printf("Your Account Balance is: $%.2f\n", account.getBalance());
		;

		/**
		 * Creating Scanner class to obtain input from console.
		 */
		Scanner cs = new Scanner(System.in);
		double withdrawAmount;

		System.out.print("Enter the amount to withdraw from your account: ");
		withdrawAmount = cs.nextDouble();

		System.out.printf("Deducting $%.2f from account balance.\n", withdrawAmount);
		account.debit(withdrawAmount);

		/**
		 * Displaying account balances
		 */
		System.out.printf("Your Account Balance is : $%.2f\n", account.getBalance());

	}

}
