package com.axison.cj;

import java.util.Arrays;

public class MoreStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int len = getsringLen("hello","hi","sai","kiran","Go","fast");
		System.out.println("length is::" + len);
		
	}

	private static int getsringLen(String...s) {
		
		Arrays.stream(s).forEach(x -> System.out.println(x));
		
		return s.length;
	}

}
