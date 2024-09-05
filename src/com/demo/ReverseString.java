package com.demo;

public class ReverseString {

	public static void main(String[] args) {

		String s = "selenium";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char ss = s.charAt(i);
			rev = rev + ss;
		}
		System.out.println("reverse=" + rev);

	}

}
