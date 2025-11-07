package com.demo.test;

import com.demo.circularsinglylinkedlist.CircularSinglyLinkedList;

public class TestCircularSinglyLinkedList {

	public static void main(String[] args) {
		CircularSinglyLinkedList clist=new CircularSinglyLinkedList();
		clist.addNode(10);
		clist.addNode(20);
		clist.addNode(11);
		clist.addNode(1);
		clist.displayData();
		/*clist.addByPosition(1, 120);
		clist.addByPosition(3, 100);
		clist.addByPosition(7, 150);
		clist.addByPosition(20, 300);*/
		
		//add by value
		/*clist.addByValue(100,10);
		clist.addByValue(110,20);
		clist.addByValue(150,1);
		//not found
		clist.addByValue(100,45);*/
		
		//delete by position
		/*clist.delteByPosition(1);
		//clist.delteByPosition(3);
		//clist.delteByPosition(4);
		clist.displayData();*/
		
		//delete by value
		clist.deleteByValue(10);
		clist.deleteByValue(11);
		clist.deleteByValue(1);
		clist.deleteByValue(45);
		clist.displayData();
		clist.addByValue(100,20);
		clist.displayData();
		clist.addByValue(101,100);
		clist.displayData();

	}

}
