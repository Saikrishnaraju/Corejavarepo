package com.reverse;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a, b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n = sc.nextInt();
		int c = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			b = b + (a * a * a);
			System.out.println(a + "  " + n + "  " + b); // to see the logic
		}
		if (c == b)
			System.out.println("Armstrong number");
		else
			System.out.println(" Not Armstrong number");

	}
}
