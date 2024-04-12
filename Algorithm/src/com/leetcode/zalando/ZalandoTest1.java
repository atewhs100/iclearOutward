package com.leetcode.zalando;

public class ZalandoTest1 {
	
	
	
	
	
	

	public static void main(String[] args) {
		

		// StringBuilder sb = new StringBuilder("CABABD");

		StringBuilder strBuilder = new StringBuilder();
		// System.out.println((char)(S.charAt(0) - 1));

		int sbLength = S.length();
		int resultLength= S

		for (int i = 0; i < sbLength; i++) {
			resultLength = sbLength;
			if (resultLength != 0 && S.charAt(i) == strBuilder.charAt(resultLength - 1)) {
				strBuilder.deleteCharAt(resultLength - 1);
				continue;
			}

			strBuilder.append(S.charAt(i));
			System.out.println(S.toString());
			// System.out.println(Str.toString());
		}
		return strBuilder.toString();
	

	}

}
