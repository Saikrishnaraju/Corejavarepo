package com.reverse;

import java.util.Scanner;

public class EqualsDoubleequals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check");
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();

		// String word1 = "Java";
		// String word2 = "Java";
		String word3 = new String("Java");

		System.out.println(word1 == word2); // Output: true
		System.out.println(word1 == word3); // Output: false

		System.out.println(word1.equals(word2)); // Output: true
		System.out.println(word1.equals(word3)); // Output: true
		sc.close();
	}
}
