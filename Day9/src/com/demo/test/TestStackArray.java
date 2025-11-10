package com.demo.test;

import com.demo.stacks.StackArray;

public class TestStackArray {
	public static void main(String []args) {
		StackArray ob=new StackArray(5);
		ob.pushValue(50);
		ob.pushValue(60);
		ob.pushValue(70);
		ob.pushValue(80);
		ob.pushValue(90);
		ob.pushValue(100);//stack is full
		
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());//Stack is Empty
	}
	
}
