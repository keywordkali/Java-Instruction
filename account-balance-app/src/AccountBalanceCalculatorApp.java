import java.text.NumberFormat;

import ui.console.Console;

public class AccountBalanceCalculatorApp {

	public AccountBalanceCalculatorApp() {
		
	}

	public static void main(String[] args) {
		System.out.println("Welcome to account balance calculator!");
		
		String choice = "y";
		CheckingAccount ca = new CheckingAccount(1000, 1);
		SavingsAccount sa = new SavingsAccount(1000, .01);

		System.out.println("Starting Balances:");
		printAccountBalances(ca, sa);

		System.out.println("Enter transactions for the month:");
		while (choice.equalsIgnoreCase("y")) {
			String txn = Console.getString("(w)ithdrawal or (d)eposit?");
			String acct = Console.getString("(c)hecking or (s)avings?");
			double amt = Console.getDouble("Amount?", 0, Double.POSITIVE_INFINITY);

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
