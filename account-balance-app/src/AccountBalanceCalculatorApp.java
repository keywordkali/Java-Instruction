
import java.text.NumberFormat;

import ui.console.Console;

public class AccountBalanceCalculatorApp {

	public AccountBalanceCalculatorApp() {

	}

	public static void main(String[] args) {
		System.out.println("Welcome to account balance calculator!");

		String choice = "y";
		CheckingAccount ca = new CheckingAccount(1000, 1);// declare the bank balances
		SavingsAccount sa = new SavingsAccount(1000, .01);

		System.out.println("Starting Balances:");
		printAccountBalances(ca, sa);// to create this after printing the line above this, right click go under
										// refactor> extract method.

		System.out.println("Enter transactions for the month:");
		while (choice.equalsIgnoreCase("y")) {
			String txn = Console.getString("withdrawal or deposit?(w/d)");
			String acct = Console.getString("checking or savings? (c/s)");
			double amt = Console.getDouble("Amount?", 1, Double.POSITIVE_INFINITY);

			Account a = null;
			if (acct.equalsIgnoreCase("c"))
				a = ca;
			else if (acct.equalsIgnoreCase("s"))
				a = sa;

			if (txn.equalsIgnoreCase("w"))
				a.withdraw(amt);
			else if (txn.equals("d"))
				a.deposit(amt);

			choice = Console.getLine("Continue?");
		}

		sa.applyPaymentToBalance();
		ca.subtractMonthlyFee();

		System.out.println("Monthly Payments and Fees:");
		System.out.println("Checking Fee:              " + ca.getMonthlyFee());
		System.out.println("Savings Interest Payment:  " + sa.getMonthlyInterestPayment());

		System.out.println("Final Balances:");
		printAccountBalances(ca, sa);
		System.out.println("Bye");

	}

	private static void printAccountBalances(CheckingAccount ca, SavingsAccount sa) {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Checking:  " + cf.format(ca.getBalance()));
		System.out.println("Savings:   " + cf.format(sa.getBalance()));
	}

}
