package com.utils.main;

import java.util.Iterator;

public class RotationString {

	public static void main(String[] args) {

		String a = "cloudtech";
		String b = "techcloud";

		if (null != a && null != b) {
			if (a.length() == b.length() && a != b) {
				for (int i = 0; i < a.length(); i++) {
					int indexfirstchar = b.indexOf(a.charAt(0));
					if (-1 == indexfirstchar) {
						System.out.println("Its not rotation string");
					}
					char chara = a.charAt(i);
					char charb = b.charAt(indexfirstchar);
					for (int j = 0; j < b.length(); j++) {
						
					}

				}
			} else {
				System.out.println("Its rotation string");
			}
		}

	}

}
