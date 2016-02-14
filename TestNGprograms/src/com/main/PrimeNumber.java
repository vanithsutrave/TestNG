//e. Write a program  to check if a given number is prime or not.

package com.main;


public class PrimeNumber {
		
	
	public boolean isPrime(int num){
		for(int i = 2; i <= num/2; i++){
			if(num % i == 0){
			System.out.println(num + " is not a Prime Number");
			return false;
			}
		}
		System.out.println(num + " is a Prime Number");
		return true;
	}
	
}



