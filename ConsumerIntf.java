package com.rdpat;
import java.util.*;
import java.util.function.Consumer;
public class ConsumerIntf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Consumer interface
		 * in which accept method is defined which takes input but returns nothing
		 * so it is major used to print output*/
		Consumer<String> con=s->System.out.println(s);
		con.accept("hello consumer");
		
	}

}
