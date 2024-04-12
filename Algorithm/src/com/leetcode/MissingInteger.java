package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MissingInteger {

	public static void main(String[] args) {
	
		
		int[] a = new int[] {1, 3, 6, 4, 1, 2};
		Integer[] intA = Arrays.stream(a).boxed().toArray(Integer[]::new);
		List<Integer> lstA =  Arrays.asList(intA);
		Collections.sort(lstA);
		Set<Integer> setA = new HashSet<>(lstA);
		Iterator<Integer> itr = setA.iterator();
		int i =1;
		while (itr.hasNext()) {
			if(i != itr.next()) {
				System.out.println(i);
			}
			i++;
			
		}
		

	}

}
