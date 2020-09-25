import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalAppWMainMethod {

	public static void main(String[] args) {
		// p. 111
		double pct = .0356789;
		System.out.println(pct);
		
		// create a big decimal with scale of 4 (rounding to 4th decimal) and half up rounding (traditional rounding)
		BigDecimal pctBD = new BigDecimal(pct);
		System.out.println(pctBD);
		pctBD = pctBD.setScale(4, RoundingMode.HALF_UP);
		System.out.println(pctBD);
		
		// add and subtract
		BigDecimal bd1 = new BigDecimal(50);
		BigDecimal bd2 = new BigDecimal(25.5);
		BigDecimal bd3 = new BigDecimal("10.75");
		
		BigDecimal sum = bd1.add(bd2);
		System.out.println(sum);
		
		BigDecimal diff = bd2.subtract(bd3);
		System.out.println(diff);
		
		BigDecimal product = bd2.multiply(bd3);
		System.out.println(product);
		
		BigDecimal quotient = bd1.divide(bd3,7,RoundingMode.HALF_UP);
		System.out.println(quotient);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
