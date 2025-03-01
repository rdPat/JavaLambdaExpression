package com.rdpat;

import java.util.Scanner;

@FunctionalInterface
interface Addition
{
	int add(int a, int b);
}

/*here i can not add subtract method in above interface 
 * as it is functional interface it can only holds one abstract method
 * */
interface Subtraction
{
	int sub(int a,int b);
}

interface Name{
	void name(String name);
}

interface Multiply{
	int mul(int a,int b);
}

public class ArithmeticOpsUsingLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// addition 
		Addition sum=(i,j)->i+j;
		System.out.println("Addition is :"+sum.add(100, 10));
		
		Subtraction sub=(i,j)->i-j;
		System.out.println("Subtraction is :"+sub.sub(100, 10));
		
		Multiply mul=(a,b)->{
			System.out.println("multiplication of "+a+" & "+b);
			return a*b;
		};
		System.out.println(mul.mul(100, 10));
		
		Name n=name->System.out.print("my name is"+name);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String usrname=sc.next();
		n.name(usrname);
		
	}

}
