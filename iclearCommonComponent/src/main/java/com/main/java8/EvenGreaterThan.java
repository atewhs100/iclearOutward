package com.main.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.main.java8.inf.Java8Inf;
import com.main.java8.inf.Java8SquareIt;
import com.main.java8.inf.ValueGreaterThan;
import com.main.java8.inf.java8SumInf;

public class EvenGreaterThan {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(67);
		lst.add(64);
		lst.add(44);
		lst.add(3);
		lst.add(4);
		lst.add(5);

		System.out.println(lst.stream().filter(x -> x % 2 == 0 && x > 5).collect(Collectors.toList()));

		Java8Inf inf = () -> System.out.println("hello world");
		inf.helloWorld();
		
		/////////////////////////////////////////////////////////

		java8SumInf inf2 = (a, b) -> {
			System.out.print("The sum of " + a + " and " + b + "is : ");
			System.out.println(a + b);

		};
		inf2.sum(11, 12);
		
		//////////////////////////////////////////////////////
		
		Java8SquareIt sq  = (a)-> a*a;
		System.out.println(sq.squareIt(5));
		System.out.println(sq.squareIt(3));
		System.out.println(sq.squareIt(6));
		
		///////////////////////////////////////////////////////
		
		//ValueGreaterThan vg= (a)-> 

	}
}
