package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pirate;

public class PirateFightApp {
	private static List<Pirate> pirates = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Argh! Welcome to the Pirate Fight App!");

		// Create some pirates and store in the list
		pirates.add(new Pirate("BlackBeard"));
		pirates.add(new Pirate("JackSparrow"));
		pirates.add(new Pirate("CapnHook"));
		pirates.add(new Pirate("LongJohnSilver"));
		pirates.add(new Pirate("BootstrapBill"));
		pirates.add(new Pirate("BootstrapBill2"));

		printPirateStats();

		for (int i = 0; i < 10; i++) {
			int pirateIdx = genRandomIndex();
			Pirate p = pirates.get(pirateIdx);
			p.loseALimb();
			if (p.isDead()) {
				pirates.remove(p);

			}
		}
		printPirateStats();
		System.out.println("Aye, Sea ya later!");
		// Simulate a fight by generating a random index

		// to pick a pirate, then they lose a limb!
		// total of 10 times

	}

	private static int genRandomIndex() {
		int r = (int) (Math.random() * pirates.size());
		return r;
	}

	private static void printPirateStats() {
		System.out.println("***** Pirate Stats *****");
		System.out.println("Total Pirates: " + Pirate.numPirates);
		System.out.println("Total Limbs Lost: " + Pirate.totalLimbsLost);
		for (Pirate p : pirates) {
			System.out.println(p);
		}
		System.out.println("*******************************");
	}

}
