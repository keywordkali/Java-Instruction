package ui;

import java.util.ArrayList;
import java.util.List;

import ui.console.Console;

public class WizardInventoryApp {

	private static List<String> items = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to the Wizard Inventory App!");

		initializeItems1();

		String command = "";
		while (!command.equalsIgnoreCase("Exit")) {
			displayMenu();
			command = Console.getString("Command: ");
			switch (command) {
			case "Show":
				// show item
				for (int i = 0; i < items.size(); i++) {
					System.out.println(i + 1 + ". " + items.get(i));
				}
				System.out.println();

				break;

			case "Grab":
				// grab item / add item, but max of 4
				if (items.size() >= 4) {
					System.out.println("You can't carry anymore items. Please drop one first");
				} else {
					String name = Console.getLine("Name: ");
					items.add(name);
					System.out.println(name + "was added.");

				}
				break;

			case "Edit":
				// edit item - prompt for item # ( not the index!)

				String item = findItem();
				int idx = items.indexOf(item);
				String newName = Console.getLine("Updated name: ");
				items.set(idx, newName);
				System.out.println("Item #" + (idx + 1) + "was updated.");

				break;

			case "Drop":
				// drop item
				int itemNumber = Console.getInt("Number:", 1, items.size());
				String itemRemoved = items.remove(itemNumber - 1);
				System.out.println(itemRemoved + "was removed.");

				break;

			case "Exit":
				// exit
				break;

			}

		}
		System.out.println("Bye!");

	}

	private static void initializeItems1() {
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");

	}

	private static void displayMenu() {
		String menu = "Command Menu:" + "Show- all items\n" + "Grab- (add) an item\n" + "Edit- an item\n"
				+ "Drop- an item\n" + "Exit - Exit app\n";
		System.out.println(menu);
	}

	private static String findItem() {

		int itemNumber = Console.getInt("Number: ", 1, items.size());
		String item = items.get(itemNumber - 1);
		return item;
	}

	private static String findItem1() {
		// TODO Auto-generated method stub
		return null;
	}
}
