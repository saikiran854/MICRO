package com.axison.coding;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,5,6,8,2,88,99};
		int min = arr[0];
		int max = arr[0];
		for(int a : arr) {
			if(a < min ) {
				min = a;
			}else {
				max = a;
			}
		}
		System.out.println("Min  :: "+ min + "  Max :: " + max);
		
		// Using streams
		
		OptionalInt minimun = Arrays.stream(arr).min();
		minimun.ifPresent(n -> System.out.println("Minimum  :: " + n));
		
		OptionalInt maximum = Arrays.stream(arr).max();
		if(maximum.isPresent()) {
			System.out.println("Maximun :: " + maximum.getAsInt());
		}

	}

}
