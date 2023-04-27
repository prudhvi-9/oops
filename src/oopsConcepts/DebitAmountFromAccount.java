package oopsConcepts;

public class DebitAmountFromAccount {
	public DebitAmountFromAccount(double balance) {

		this.balance = balance;
	}

	/**
	 * Instance variable.
	 */

	private double balance;

	/**
	 * If the initial balance is not greater than zero than balance is initialized
	 * to the default value 0.
	 */

	public void initialBalance(double initialBalance)

	{
		if (initialBalance > 0.0)
			balance = initialBalance;
	}

	/**
	 * Credit amount from the account
	 *
	 */
	public void credit(double amount) {
		balance = balance + amount;
	}

	/**
	 * Debit amount from the account
	 * 
	 * @param debitAmount
	 */
	public void debit(double debitAmount) {

		if (debitAmount > balance) {
			debitAmount = 0.0;
			System.out.println("Debit amount exceeded account balance.");
		}
		balance = balance - debitAmount;
	}

	/**
	 * return the account balance
	 * 
	 * @return
	 */
	public double getBalance() {
		return balance;

	}
}