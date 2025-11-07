package com.demo.test;

import com.demo.doublylinkedlist.DoubleLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		DoubleLinkedList list=new DoubleLinkedList();
		list.addNode(15);
		list.addNode(20);
		list.addNode(12);
		list.displayData();
		//Add at firstPosition
		list.addByPosition(1,12);
		list.displayData();
		list.addByPosition(3,14);
		list.displayData();
		list.deleteByValue(12);
		list.displayData();
		list.deleteByValue(14);
		list.displayData();
		list.addByPosition(2,14);
		list.addByValue(45,12);
		list.displayData();
		list.deleteByPosition(1);
		list.deleteByPosition(3);

	}

}
