package loop_map_exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class car_inventory {

	public static void main(String[] args) {
		HashMap<String, String> stock = new HashMap<String, String>();
		stock.put("Civic", "Honda");
		stock.put("Grand Cherokee", "Jeep");
		stock.put("Corolla", "Toyota");
		stock.put("RX350", "Lexus");
		Scanner in = new Scanner(System.in);
		System.out.print("What model are you looking for?");
		String model = in.next();
		in.close();
		if (stock.containsKey(model)) {
			System.out.println("We have a " + stock.get(model) + " " + model + " in stock.");
		} else {
			System.out.println("Sorry, we don't have one in stock.");
		}

	}

}
