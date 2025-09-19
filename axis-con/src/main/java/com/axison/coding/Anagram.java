package com.axison.coding;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcdef";
		String s2 = "abcdef";
		
		int c1 = 'a' - 'A';
		System.out.println(c1);
		int[] count = new int[26];

		for(char c : s1.toCharArray()) {
			count[c - 'a']++;
		}
		for(char c : s2.toCharArray()) {
			count[c - 'a']--;
		}
		System.out.println("Are 2 strings Anagrams :: " + Arrays.equals(s1.toCharArray(), s2.toCharArray()));

	}

}
