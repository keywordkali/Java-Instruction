import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class InterestCalculatorApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// welcome the user
			System.out.println("Welcome to the Interest Calculator App");
			System.out.println(" ");
			// get input from the user 2 inputs: loan amt and interest rate
			System.out.println("Enter loan amount");
			double loan = sc.nextDouble();
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String loanString = currency.format(loan);

			System.out.println("Enter Interest Rate:");
			double rate = sc.nextDouble();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3); // set max to 3 digits to the right of the decimal
			String rateString = percent.format(rate);

			// calculate interest based on user loan and rate input
			double interest = loan * rate;
			BigDecimal intereString = new BigDecimal(Double.toString(interest));
			intereString = intereString.setScale(2, RoundingMode.HALF_UP);
			// display conversion result
			String message = "\nLoanAmount:\t" + loanString + "\nInterest Rate:\t" + rateString + "\nInterest:\t"
					+ currency.format(intereString);
			System.out.println(message);

			// see if user wants to continue

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
			

		} System.out.println("Goodbye :)");
		sc.close();
	}
}
