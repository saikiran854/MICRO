package com.axison.coding;

import java.util.Arrays;

public class RotateRightLeft {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,6,4,5,8,9,5};
		System.out.println("Array is :: " + Arrays.toString(arr));
		int k = 2;
		arr = leftRotate(arr,k);
		System.out.println("Left rotate :: " + Arrays.toString(arr));
		arr = rightRotate(arr,k);
		System.out.println("Right Rotate :: " + Arrays.toString(arr));
		
		
		
		
 	}

	private static int[] rightRotate(int[] arr, int k) {
		
		int[] temp = new int[2];
		int p = 0;
		for(int i = arr.length - k; i < arr.length; i++ ) {
			temp[p++] = arr[i];
		}
		
		for(int i = arr.length - 1 - k; i >= 0; i--) {
			arr[i + k] = arr[i];
		}
		
		for(int i = 0; i < k; i++) {
			arr[i] = temp[i];
		}
		
		return arr;
	}

	private static int[] leftRotate(int[] arr, int k) {
		
		int[] temp = new int[2];
		
		for(int i = 0; i < k ; i++) {
			temp[i] = arr[i];
		}
		
		for(int i = k; i < arr.length ; i++) {
			arr[i - k] = arr[i];
		}
		
		int p = 0;
		for(int i = arr.length - k; i < arr.length ; i++) {
			arr[i] = temp[p++];
		}
		
		return arr;
	}

}
