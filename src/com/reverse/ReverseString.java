package com.reverse;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "Reverse";
		String str = "";
		char ch;
		for (int i = 0; i < st.length(); i++) {
			ch = st.charAt(i);
			str = ch + str;
		}
		System.out.println(str);
	}

	/*
	 * String st = "Saikrishnaraju"; StringBuffer sb = new StringBuffer(st);
	 * StringBuffer reverse = sb.reverse(); System.out.println(reverse);
	 */
}
