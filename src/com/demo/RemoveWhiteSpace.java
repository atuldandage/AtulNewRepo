package com.demo;

public class RemoveWhiteSpace {
public static void main(String[] args) {
	
	String s="java is best language";
	
	StringBuffer ss=new StringBuffer();
	
	char []ch=s.toCharArray();
	
	for (char c : ch) {
		
		if(c!=' ') {
			
			ss.append(c);
		}
		}
	
	System.out.println(ss);
}
}
