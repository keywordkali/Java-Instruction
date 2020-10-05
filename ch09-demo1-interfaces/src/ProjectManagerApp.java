
public class ProjectManagerApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Hello");
		Product p = new Product("java", "Murach's Java", 57.50);
		Employee e = new Employee("Harry", "Styles", "111-222-3333", 2);

		
		
		
		printMultiple(p, 5);
		printMultiple(e, 3);
		p.print();
		
		// p317
		Product p1 = new Product("java", "Murach's Java", 57.50);
		Product p2 = (Product)p1.clone();
		p1.print();
		p2.print();
		
		System.out.println("Bye.");

	}

//p 303
	private static void printMultiple(Printable p, int count) {

		for (int i = 0; i < count; i++) {
			p.print();
		}
	}

}
