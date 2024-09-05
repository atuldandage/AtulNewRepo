package com.demo;

public class StringFormat {
   public static String s="driver.by(@id='sss'/ %s";
	public static String path(String data) {
		
		return String.format(s, data);
		
	}
	
	public static void main(String[] args) {
		System.out.println(StringFormat.path("Than playwright"));
		
	}
}
