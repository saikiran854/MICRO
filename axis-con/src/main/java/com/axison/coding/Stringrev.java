package com.axison.coding;

public class Stringrev {
	
	public static void main(String[] args) {
		
		String s = "hello";
		char[] c = {'a','b','c','d'};
		System.out.println(c.toString());
		char[] rev = s.toCharArray();
		int i = 0;
		System.out.println(s.length());
		int j = s.length() - 1;
		char temp = 0;
		while(i < j) {
			temp = s.charAt(i);
			rev[i] = rev[j];
			rev[j] = temp;
			i++;
			j--;
		}
		System.out.println("normal string :: " + s + "   reversed string :: " + new String(rev));
		
	}

}
