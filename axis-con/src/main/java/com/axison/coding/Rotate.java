package com.axison.coding;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// toate right by 2
		int [] arr = {4,3,6,6,4,3,28,9,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		int rotateIndex = arr.length - 2 ;
		System.out.println(rotateIndex);
		int tmp[] = new int[2];
		int j = 0;
		for(int i = rotateIndex ; i < arr.length ; i++) {
			tmp[j] = arr[i];
			j++;
		}
		System.out.println(Arrays.toString(tmp));
		int x = rotateIndex - 1;
		for(int i = x; i >= 0 ; i--) {
			arr[i+2] = arr[i];
		}
		
		for(int i = 0; i < 2 ; i++) {
			arr[i] = tmp[i];
		}
		System.out.println("Rotatate right by 2");
		System.out.println(Arrays.toString(arr));
			
		// rotate left by 2
		int k = 2;
		System.out.println("Left");
		for(int i=0; i < k; i++) {
			tmp[i] = arr[i];
		}
		System.out.println(Arrays.toString(tmp));
		for(int i = k; i < arr.length ; i++) {
			arr[i - k] = arr[i]; 
		}
		System.out.println(Arrays.toString(arr));
		int p = 0;
		for(int i = arr.length - k ; i < arr.length; i++) {
			arr[i] = tmp[p++];
		}
		
		System.out.println("Left rotate");
		System.out.println(Arrays.toString(arr));
	}

}
