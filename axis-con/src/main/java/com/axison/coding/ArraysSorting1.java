package com.axison.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArraysSorting1 {

	public static void main(String[] args) {
		
		Comparator<String> strCompare = (s1,s2) -> s1.length() - s2.length();
		Comparator<String> strComparerev = (s1,s2) -> s2.length() - s1.length();
		
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
		
		List<String> names = Arrays.asList("a","go","kiran","sai","oolive");
		names.sort(strCompare);
		System.out.println(names);
		System.out.println(names.toString());
		
		Collections.sort(names);
		System.out.println(names);
		Collections.sort(names,strComparerev);
		System.out.println(names);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "sai");
		map.put(2, "hello");
		map.put(3, "kiran");
		map.put(4, "olive");
		System.out.println(map);
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> intListEv = intList.stream().filter(n -> n %2 ==0).collect(Collectors.toList());
		System.out.println("Even numbers ::  " + intListEv);
		
		List<Integer> intListOdd = intList.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
		System.out.println("Odd numbers ::  " + intListOdd);
		
		Calculator add = (a,b) -> a+b;
		Calculator sub = (a,b) -> a- b;
		Calculator multiply = (a,b) -> a*b;
		
		System.out.println("Addition ::  " + add.calculate(10, 5));
		System.out.println("Subtraction ::  " + sub.calculate(10, 5));
		System.out.println("Multiplication ::  " + multiply.calculate(10, 5));
		
		List<Integer> countlist = Arrays.asList(1,2,3,3,3,4,5,5,66,6,7,5,5,5,8,9);
		System.out.println("coubt ::   " + countlist.stream().count());
		System.out.println("collectors counting ::  " + countlist.stream().collect(Collectors.counting()));
		
		List<Integer> unqCount = countlist.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct ::  " + unqCount);
		
		boolean anymatch = countlist.stream().anyMatch(n -> n%2 == 0);
		System.out.println("anymatch ::  " + anymatch);
		
		boolean allMatch = countlist.stream().allMatch(n -> n%2 == 0);
		System.out.println("allMatch ::   " + allMatch);
		
		boolean noneMatch = countlist.stream().noneMatch(n -> n % 10 == 0);
		System.out.println("noneMatch ::   " + noneMatch);
		
		int sum1 = countlist.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println("sum ::  " + sum1);
		
		List<String> stringlist = Arrays.asList("java","spring","lambda","java") ;
		Map<String, Long> group = stringlist.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println("after grouping  :: " + group);
		group.forEach((k,v) -> System.out.println("key :: "+k + "   value :: " + v ));
		
		List<String> only2 = stringlist.stream().limit(2).collect(Collectors.toList());
		System.out.println("only2  : " + only2);
		
	}
	

}
