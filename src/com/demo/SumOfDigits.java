package com.demo;

public class SumOfDigits {
	public static void main(String[] args) {
		
		int num=3212;
		int sum=0;
		
		while(num>0) {
			
		int temp=	num%10;
			sum=sum+temp;
			num=num/10;
			
		}
		
		
		System.out.println(sum);
		
		
	}
	

}
