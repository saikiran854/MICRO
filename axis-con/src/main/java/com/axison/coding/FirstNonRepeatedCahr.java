package com.axison.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatedCahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "helloe";
		
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char c : ch) {
			map.put(c, map.getOrDefault(c, 0) +1);
		}
		System.out.println(map);
		char c = map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
		Map<Character, Integer> c1 = map.entrySet().stream().filter(e -> e.getValue() == 1).limit(1).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
//		char char = map.entrySet().stream().filter(e -> e.getValue() == 1).limit(1).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
	}

}
