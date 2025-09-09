package com.axison.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,6,4,5,8,6,2,4,7,9}; 
		System.out.println("count :: " + Arrays.stream(nums).count());
		System.out.println("count1 :: " + Arrays.stream(nums).boxed().collect(Collectors.counting()));
		
		Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(map);
		
		map.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(e -> System.out.println(e.getKey()));
//		Map<Integer, Long> res = map.entrySet().stream().filter(entry ->entry.getValue() > 0).collect(Collectors.groupingBy(n ->n,Collectors.counting()));
		
		int[] nums1 = {1,2,3,4,5};
		System.out.println("sum  :: " + Arrays.stream(nums1).sum());
		IntStream i = IntStream.of(1,2,2);
		i.forEach(e -> System.out.println(e));
		
		Stream<String> str = Stream.of("sai","kiran","streams");
		str.forEach(e -> System.out.println(e));
//		str.forEach(e -> System.out.println(e));
		List<String> str1 = Arrays.asList("sai","kiran","streams");
		Map<String, Long> m = str1.stream().collect(Collectors.groupingBy(s -> s,Collectors.counting()));
//		Collections.sort(str1);
		Collections.reverse(str1);
		System.out.println("After sorting");
		System.out.println(str1);
		System.out.println("Descending");
		Collections.sort(str1, Collections.reverseOrder());
		System.out.println(str1);
	}

}
