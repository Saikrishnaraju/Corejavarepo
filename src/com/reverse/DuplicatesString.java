package com.reverse;

import java.util.Scanner;

public class DuplicatesString {
	public void RemoveDuplicates() {
		// String s = "Hello World!";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check");
		String s = sc.nextLine();
		int l = s.length();
		char ch;
		String result = "";
		for (int i = 0; i < l; i++) {
			ch = s.charAt(i);
			if (ch != ' ') {
				result = result + ch;
			}
			// Replacing space in all occurrence of the current character
			s = s.replace(ch, ' ');
		}
		System.out.println("After removing duplicate characters : " + result);
		sc.close();
	}

	public static void main(String[] args) {
		DuplicatesString ds = new DuplicatesString();
		ds.RemoveDuplicates();
	}
}
