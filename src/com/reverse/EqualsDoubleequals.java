package com.reverse;

public class EqualsDoubleequals {

	public static void main(String[] args) {
		String word1 = "Java";
		String word2 = "Java";
		String word3 = new String("Java");

		System.out.println(word1 == word2); // Output: true
		System.out.println(word1 == word3); // Output: false

		System.out.println(word1.equals(word2)); // Output: true
		System.out.println(word1.equals(word3)); // Output: true
	}
}
