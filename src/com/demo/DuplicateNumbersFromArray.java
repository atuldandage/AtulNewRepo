package com.demo;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbersFromArray {
	public static void main(String[] args) {

		int a[] = { 2, 3, 44, 56, 2, 3, 56 };

		List<Integer> duplicate = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					duplicate.add(a[i]);
				}
			}
			System.out.println("duplicate element= " + duplicate);

		}
		String dup = "Seleniumgoodm";
		List<Character> list = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
        
		char[] al = dup.toCharArray();

		for (int i = 0; i < dup.length(); i++) {
			for (int j = i + 1; j < dup.length(); j++) {
				if (al[i] == al[j]) {
					list.add(al[i]);
					
				}
				
				
		}
		
		

	}
		System.out.println("Duplicate characters =" + list);
		
	}
}