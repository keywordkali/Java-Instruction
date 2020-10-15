
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator!");

		System.out.println(sum(2, 4));
		System.out.println(sum(2, 4, 6));
		System.out.println(sum(2, 4, 6, 8));
		System.out.println(sum(2, 4, 6, 8, 10));

		System.out.println("Bye.");

	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

private static int sum(int a , int b, int c, int d) {
	return a + b + c;
}

//variable of args
	private static int sum(int... n) {
		int sum = 0;
		for (int a : n) {
			sum += a;

		}
		return sum;
	}

}
