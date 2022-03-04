// Write a Java program to search an element in a array list.

import java.util.*;

class ArrayListExample {
	public static void main(String[] args) {
		// array list find element
		List<Integer> l1 = new ArrayList<>();
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);


		System.out.println(l1);

		int element = 30;

		System.out.println(element + " found : "+ l1.contains(element));

	}
}