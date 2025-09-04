package com.axison.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysSorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,5,4,1,2,6};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		array = Arrays.stream(array)   
                .boxed()      
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer :: intValue)
                .toArray();
		System.out.println(Arrays.toString(array));
		
		List<Integer> list = List.of(1,2,3,4,5,6);
		int sum = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum);
	}

}
