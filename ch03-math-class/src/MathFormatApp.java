import java.text.NumberFormat;

public class MathFormatApp {

	public static void main(String[] args) {
		// p 105
		double astinMartinPrice = 245789.23;
		double interestPct = .035447;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat pct = NumberFormat.getPercentInstance();
		pct.setMaximumFractionDigits(2);
		System.out.println("Car finance info:");
		System.out.println("Price:\t\t"+currency.format(astinMartinPrice));
		System.out.println("Interest:\t"+pct.format(interestPct));

	}

}
