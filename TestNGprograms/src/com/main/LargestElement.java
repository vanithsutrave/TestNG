
// a. Write a program to find the largest number in a given array. 

package com.main;

public class LargestElement {
	
	
	public int getLargest(int[] a){
		
		int num = a[0];
		
		for(int i = 1; i < a.length; i++){
			if( a[i] > num){
				num = a[i];
			}
		}
		
		System.out.println("Largest number in array is : " +num);
		return num;

	}

}
