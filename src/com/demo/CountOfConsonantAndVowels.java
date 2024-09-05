package com.demo;

public class CountOfConsonantAndVowels {
	
	
	public static void main(String[] args) {
		
		String s="infosys";
		
		int vowelsCount=0;
		int consonantsCount=0;
		String vowels= "";
		String consonants="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowelsCount++;
				vowels+=ch;
			//	vowels=vowels+ch;
			}else {
				consonantsCount++;	
				consonants+=ch;
			}
					
		}
		
		System.out.println("consonantsCount ="+consonantsCount);
		System.out.println("vowelsCount ="+vowelsCount);
		System.out.println("vowels are=  "+vowels); 
		System.out.println("cononants are= "+consonants);
	}
	
	
	
	

}
