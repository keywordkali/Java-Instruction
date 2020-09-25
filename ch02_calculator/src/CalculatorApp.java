
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App! :)");
		
		// This simple app will add two numbers
		
		int n1 = 5;
		int n2 = 25;
		
		int sum = n1 + n2;
		
		System.out.println("The sum is "+sum);
		
		// do more math
		double d1 = 25.5;
		double d2 = 5.0;
		
		System.out.println("The difference is "+(d1 - d2));
		System.out.println("The product is "+(d1 * d2));
		System.out.println("The quotient is "+(d2 / d1));
		
		//This doesn't work
		//int sum = n1 + d1
		// change sum to a double
		double sum2 = n1 + d1;
		
		//or cast d1 as an int
		
		sum = n1 + (int)d1; // the parenthesis cast
		
		// declare a counter variable
		int i = 0;
		// add 1
		i = i + i;
		i = i + 1;
		System.out.println();
		
		

		
		
		
		
		
		
		System.out.println("Have a nice day! :)");
	}

}
