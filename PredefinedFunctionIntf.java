package com.rdpat;
import java.util.function.*;

class Student
{
	String name;
	int marks;
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
}

public class PredefinedFunctionIntf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student o=new Student("ram",99);
		
		//create function to check grades of student
		Function<Student,String> fun=s->{
			int m=s.marks;
			String remark="";
			if(m>90) {remark="first class";}
			else if(m<90 && m>70) { remark="good";}
			else {remark="fail";}
			return remark;
		};
		
		Predicate<Integer> isPass=s->(s>10)==true;
		
		String s=fun.apply(o);
		System.out.println(s);
		System.out.println(isPass.test(20));
		
		Consumer<String> con=a->System.out.println(a);
		con.accept(fun.apply(o));
		
		
		
		
	}

}
