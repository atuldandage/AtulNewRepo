package com.demo;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		String str = "hello worrld";

		Set<Character> chars = new HashSet<>();
		Set<Character> duplicate = new HashSet<Character>();

		for (Character ch : str.toCharArray()) {

			if (!chars.add(ch)) {
				duplicate.add(ch);
			}

		}
		System.out.println("Duplicate chars are = " + duplicate);
    System.out.println("unique "+chars);
	}

}
