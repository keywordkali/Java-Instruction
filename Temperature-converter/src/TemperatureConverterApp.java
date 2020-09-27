import java.text.NumberFormat;
import java.util.*;

public class TemperatureConverterApp {

	public static void main(String[] args) {

		float temperature;
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Fahrenheit to Celcius Converter");
			System.out.println(" ");
			System.out.println("Enter temperature in Fahrenheit");
			temperature = sc.nextFloat();

			temperature = ((temperature - 32) * 5) / 9;
			NumberFormat number = NumberFormat.getInstance();
			number.setMaximumFractionDigits(2);

			System.out.println("Temperature in Celsius = " + temperature);

			System.out.println("Again?");
			choice = sc.next();

		}
	}
}
