package com.demo;

public class CreateDynamicMethods {
	
	// to take any String as input
	
	public static void addString(String s) {
		s=s.toUpperCase();
		System.out.println(s);
		switch(s) {
		case "java":
			System.out.println("I am interested in java");
		  break;
		case "pycharm":
			System.out.println("I am interested in pycharm");
             break;		
		case "bdd":
			System.out.println("i am in bdd");
			break;
         default :
        	 System.out.println("went wrong");
		}
		
		
	}
	public static void main(String[] args) {
		CreateDynamicMethods.addString("bdd");
		
		
	}
	

}
