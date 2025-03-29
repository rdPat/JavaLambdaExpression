package com.rdpat;
import java.util.*;
import java.util.function.Function;
public class FunctionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*Function Chaining is possible for predefined function is java
	     * using function interface we can use them
	     * andThen  is used to call function after previous function ends
	     * compose is used to call composed function first then outer function
	     * apply is function which accept only integer input as passes to respective 
	     * function  
	     * */
		Function<Integer,Integer> f1=i->2*i;
		Function<Integer,Integer>f2=i->(i*i*i);
		// here first f1 is executed then its o/t is given as input to f2
		System.out.println(f1.andThen(f2).apply(2));
		//here first f2 is executed then its o/t is given as input to f1
		System.out.println(f1.compose(f2).apply(2));
		System.out.println(f1.apply(2));
		
		
	}

}
