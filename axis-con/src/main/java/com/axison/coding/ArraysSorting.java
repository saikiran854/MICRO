package com.axison.coding;

public class ArraysSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A1402 Hno 6 Ground Floor North East Building Errummanzil Im Colony Hyderabad Khairatabad Telangana India 500082";
		String a = "A!402 Hno 6 Ground Floor North East Building Errummanzil Im Colony Hyderabad Khairatabad Telangana India 500082";
		String compulsaryAlphaNumericAndSpace = "^[a-zA-Z0-9 ]*";
		if (a.matches(compulsaryAlphaNumericAndSpace)) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
		}

	}

}
