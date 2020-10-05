package ui;

import ui.console.Console;

public class ConsoleLibraryDemoApp {

	public ConsoleLibraryDemoApp() {
		
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		
		String str = Console.getLine("Enter a sentence: ");
		
		int n = Console.getInt("Enter a number between 1  and 10: ", 1, 10);
		System.out.println(str);
		System.out.println(n);
		
		System.out.println("Bye.");

	}

}
