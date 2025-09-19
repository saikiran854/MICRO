package com.axison.coding;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5;
		int result = 1;
		for(int j = i; j > 0; j--) {
			result = result * j;
		}
		System.out.println("result :: " + result);

	}

}
