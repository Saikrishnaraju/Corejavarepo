package com.reverse;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str = "";
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String st = sc.nextLine();
		for (int i = 0; i < st.length(); i++) {
			ch = st.charAt(i);
			str = ch + str;
		}
		System.out.println(str);
		sc.close();
	}

	/*
	 * System.out.println("Enter the string to reverse"); String st = sc.nextLine();
	 * StringBuffer sb = new StringBuffer(st); StringBuffer reverse = sb.reverse();
	 * System.out.println(reverse);
	 */
}
