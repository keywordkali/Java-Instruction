import java.util.HashMap;
import java.util.Map;

//p408
public class SevenDwarvesHashMapApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		//lets create a hashmap of the seven dwarves
		// we need keys for each
		
		HashMap<String, String> dwarves = new HashMap<>();
		dwarves.put("DC", "Doc");
		dwarves.put("SL", "Sleepy"); ///demonstration of the put method
		dwarves.put("SN", "Sneezy");
		dwarves.put("BA", "Bashful");
		dwarves.put("DO", "Dopey");
		dwarves.put("HA", "Happy");
		dwarves.put("GR", "Grumpy");
		//common methods of the map.entry interface
		System.out.println("List of all Dwarves: ");
		for (Map.Entry<String, String> dwarf: dwarves.entrySet()) {
			System.out.println(dwarf.getKey()+"\t"+dwarf.getValue());
			
		}
		System.out.println(dwarves);
		String str = "SN";
		System.out.println("Dwarf SN is "+dwarves.get(str));
		
		
		
		
		
		
		System.out.println("Bye");

	}

}
