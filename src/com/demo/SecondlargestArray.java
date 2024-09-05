package com.demo;

import java.util.Arrays;

public class SecondlargestArray {

	public static void main(String[] args) {

		int a[] = { 2, 4, 6, 8, 22, 7 };
//
//		Arrays.sort(a);
//		int size = a.length;
//		System.out.println(" this is second largest array" + a[size - 2]);
//
////alternarive method-----
//
//		int Array[] = { 9, 4, 6, 8, 22, 7 };
//
//		int temp, siz;
//		siz = Array.length;
//		for (int i = 0; i < siz; i++) {
//			for (int j = i + 1; j < siz; j++) {
//				if (Array[i] > Array[j]) {
//					temp = Array[i];
//					Array[i] = Array[j];
//					Array[j] = temp;
//				}
//
//			}
//
//		}
//		System.out.println("this is second largest number " + Array[siz - 2]);

	   int temp,size;
	   size=a.length;
	   for(int i=0;i<size;i++) {
		   
		   for(int j=i+1;j<size;j++) {
			  if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;  
			  }
			   
		   }
		   
	   }
	  System.out.println(Arrays.toString(a)); 
	System.out.println(a[size-2]);
	}

}
