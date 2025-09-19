package com.axison.coding;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madams";
		char[] rev = s.toCharArray();
		int first = 0;
		int last = rev.length - 1;
		char temp = 0;
		while(first < last) {
			temp = rev[first];
			rev[first] = rev[last];
			rev[last] = rev[first];
			first++;
			last--;
		}
		String s2 = new String(s);
		
		System.out.println("Are the 2 Strings Palindroms :: " + s.equals(s2));
		

	}

}
