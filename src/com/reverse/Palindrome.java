package com.reverse;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int remainder;
		int reverse = 0;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n = sc.nextInt();
		temp = n;
		while (n > 0) {
			remainder = n % 10;
			reverse = (reverse * 10) + remainder;
			n = n / 10;
		}
		if (temp == reverse) {
			System.out.println("This is a palindrome number");
		} else {
			System.out.println("This is not a palindrome number");
		}
		sc.close();
	}
}
