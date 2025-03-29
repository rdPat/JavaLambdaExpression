package com.rdpat;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intf i=(a,b)->a+b;
		System.out.println("sum"+i.add(500, 30));
		intf1 j=name ->{System.out.println("hello !!"+name);};
		j.name("ram");
			
	}

}
@FunctionalInterface
interface intf{
	int add(int a,int b);
	
}
@FunctionalInterface
interface intf1{
	void name(String name);
}
