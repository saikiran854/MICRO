package com.axison.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,2,2,4,3,5,6,7,8,67,6,9,0,65};
		
		Map<Integer, Long> map = new HashMap<Integer, Long>();
		
		map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(map);
		
		Map<Integer, Long> dupMap = map.entrySet().stream()
				.filter(e -> e.getValue() > 1)
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
				
		System.out.println(dupMap);
			 int c = 'a';
			 char ch  = 65;
			 System.out.println(ch);
			 System.out.println(c);
//		by using hashmap
			 Map<Integer, Integer> m = new HashMap<Integer, Integer>();
			 for(int a : arr) {
				 m.put(a, m.getOrDefault(a, 0) + 1 );
			 }
			 System.out.println(m);
		

	}

}
