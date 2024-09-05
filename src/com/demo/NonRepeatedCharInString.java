package com.demo;
import java.util.*;

public class NonRepeatedCharInString {
	
	

public static void uniqueCharacters(String str) {
	List<Character> repeatedCharsList = new ArrayList<>(); // List to store repeated characters

//	  boolean isDuplicate=true;
//	  int count = 0 ;
//      if(str == null || str.isEmpty()){
//          System.out.println("Bad string");
//          
//      }
//      outerloop:
//      for (int i = 0; i < str.length() - 1; i++) {
//          for (int j = i + 1; j < str.length(); j++) {
//              if (str.charAt(i) == str.charAt(j)) {
//            System.out.println("Duplicate element are = "+str.charAt(i));	
//            	count++;
//            	System.out.println("The count is="+count);
//            	isDuplicate=true;
//          // break outerloop;
//            	}else {
//            		isDuplicate=false;
//            	}
//            		
//            	
//          }
//        
//      }
//     	System.out.println(isDuplicate);
//  	return isDuplicate;
//     
	
  int count=0;
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			
			if(str.charAt(i)==str.charAt(j)) {
				
				//System.out.println("those are duplicate= "+str.charAt(i));
			 if(!repeatedCharsList.contains(str.charAt(i))) {
				repeatedCharsList.add(str.charAt(i)); 
				 
			 }
				
				count++;
			
			}
			
		}
		
	}
	
	char[] repeatedlist=new char[repeatedCharsList.size()];
	for(int i=0;i<repeatedCharsList.size();i++) {
		
		repeatedlist[i]= repeatedCharsList.get(i);
	}
	
	System.out.println(Arrays.toString(repeatedlist));
}


	public static void main(String[] args) {
		
		NonRepeatedCharInString.uniqueCharacters("applenn"); 
	}
		
		
		
		

	

}
