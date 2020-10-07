import java.util.ArrayList;

//p 392
public class NumberListApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		//ArrayList<int> numbers = new ArrayList<>();   <This doesn't work because you have to put in a reference type and import the array list
		
		ArrayList<Integer> numbers = new ArrayList<>(); //Integer is a wrapper class
		numbers.add(5);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		
		System.out.println(numbers);
		
		numbers.add(1,10);
		System.out.println(numbers);
		
		System.out.println(numbers.get(2));
		
		
		System.out.println("Bye");

	}

}
