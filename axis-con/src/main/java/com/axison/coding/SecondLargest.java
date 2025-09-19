package com.axison.coding;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {3,2,6,4,7,8,434,6};
		
		int first = arr[0];
		int second = arr[1];
		
		for(int i : arr) {
			if(i > first) {
				first = i;
			}
			if(i > first && i) {
				
			}
		}
		System.out.println("Second largest :: " + second);

	}

}
