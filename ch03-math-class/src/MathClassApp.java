
public class MathClassApp {

	public static void main(String[] args) {
		// page 103 in book
		long result1 = Math.round(1.667);
		System.out.println(result1); // result is 2

		int result2 = Math.round(1.49F); // F means floating point number
		System.out.println(result2);
		
		int result3 = (int)Math.round(1.667); // same as result1 but you can cast it to be int with ()
		System.out.println(result3);
		
		// rounding to a 100th decimal value
		double x = 10.315;
		System.out.println(x);
		x = (double)Math.round(x*100) / 100;
		System.out.println(x);
		
		x = (double)Math.round(x*10) / 10;
		System.out.println(x);
		
		
		System.out.println("Generate some random numbers");
		double r = Math.random();
		System.out.println(r);
		r = Math.random()*10;
		System.out.println(r);
		// generate a roll of a die, between 1 and 6
		int die = (int)(Math.random()*6)+1;
		System.out.println("die roll is:"+die);
		
		
	}

}
