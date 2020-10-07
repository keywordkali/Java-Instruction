import java.util.ArrayList;


//p389
public class SevenDwarvesCollectionsApp {
//p 388-391
	public static void main(String[] args) {
		System.out.println("Hello");

		ArrayList<String> dwarves = new ArrayList<>();
		dwarves.add("Doc");
		dwarves.add("Sleepy");
		dwarves.add("Grumpy");
		dwarves.add("Dopey");
		dwarves.add("Happy");
		dwarves.add(0, "Bashful"); // 0 pushes Bashful to the top of the line because of index 0
		dwarves.add("Sneezy");
		System.out.println("7 Dwarves:" + dwarves);

		System.out.println("Dwarf at position 3:" + dwarves.get(3)); // demo of get method on array list class

		System.out.println("# of dwarves:" + dwarves.size()); // same as the length attribute. It counts the number of
																// elements in the array

		System.out.println("contains 'Happy'?" + dwarves.contains("Happy")); // this is case sensitive //this is the contains method
		
		
		System.out.println("Index of 'Dopey'?"+dwarves.indexOf("Dopey")); // this is the index method
		
		dwarves.add("Grumpy");
		System.out.println(dwarves);
		System.out.println("Index of 'Grumpy'"+dwarves.indexOf("Grumpy")); // method showing where in the array Grumpy appears first if there are multiple Grumpy's

		dwarves.remove(3);
		System.out.println(dwarves);
		
		dwarves.set(3, "Temp Dwarf");
		System.out.println(dwarves);
		
		System.out.println("Goodbye");

	}

}
