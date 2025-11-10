package com.demo.test;

import com.demo.stacks.StackLinkedList;

public class TestStackLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList clist =new StackLinkedList();
		

		clist.pushValue(50);
		clist.pushValue(60);
		clist.pushValue(70);
		clist.pushValue(80);
		clist.pushValue(90);
		clist.pushValue(100);
		
		System.out.println(clist.popValue());
		System.out.println(clist.popValue());
		System.out.println(clist.popValue());
		System.out.println(clist.popValue());
		System.out.println(clist.popValue());
		System.out.println(clist.popValue());
		

	}

}
