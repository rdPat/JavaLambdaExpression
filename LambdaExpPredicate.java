package com.rdpat;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

/* predicate interface along with lambda exp 
 * here calculating whether the number is  even
 * also used steam api
 * 
 * */

public class LambdaExpPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=List.of(1,2,3,4,5,6,7);
		Predicate<Integer> p1=n1 ->n1%2==0;
		for(Integer i:l) {
			System.out.println(i+" "+p1.test(i));
		}
		
		//use stream for filtering even
		
		List<Integer> l2=List.of(10,20,30,40,50,60,70);
		List<Integer> res=l2.stream().filter(p1).collect(Collectors.toList());
		System.out.println(res);

	}

}
