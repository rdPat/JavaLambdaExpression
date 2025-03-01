package com.rdpat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(110);
		ar.add(0);
		ar.add(20);
		ar.add(440);
		
		System.out.println("Before making to descending"+ar);
		/*
		 * by default there is no sorting happens
		 * when we use collection sort method without any argument 
		 * it sort in ascending order
		 * to sort it in descending order 
		 * // Sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        
        but....
        if we want write our own compare function below code is used 
        in which we first target compare method in interface which return 
        int value on comparision between two number        
		 * 
		 * */
		
		
		Comparator <Integer> c=(a,b)->{
			if(a>b) {return 1;}
			else if (a<b) { return -1;}
			else {return 0;}
		};
		
		Collections.sort(ar,c);
		System.out.println("After making to descending"+ar);


	}

}
