package loop_map_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 5 numbers:\n1. ");
		int num1 = in.nextInt();
		System.out.print("2. ");
		int num2 = in.nextInt();
		System.out.print("3. ");
		int num3 = in.nextInt();
		System.out.print("4. ");
		int num4 = in.nextInt();
		System.out.print("5. ");
		int num5 = in.nextInt();
		in.close();
		numList.add(num1);
		numList.add(num2);
		numList.add(num3);
		numList.add(num4);
		numList.add(num5);
		Collections.sort(numList);
		int lowestNum = numList.get(0);
		int highestNum = numList.get(numList.size() - 1);
		int sum = 0;
		int prod = 1;
		for (int i = 0; i < numList.size(); i++) {
			int value = numList.get(i);
			sum = sum + value;
			prod = prod * value;}
			System.out.println("The sum of all numbers is " + sum + ".");
			System.out.println("The product of all numbers is " + prod + ".");
			System.out.println("The lowest number is " + lowestNum + ".");
			System.out.println("The highest number is " + highestNum + ".");
	}

}
