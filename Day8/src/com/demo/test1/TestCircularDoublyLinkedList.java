package com.demo.test1;

import com.demo.circularsinglylinkedlist.CircularDoublyLinkList;

public class TestCircularDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularDoublyLinkList list= new CircularDoublyLinkList();
		
		list.addNode(12);
		list.addNode(14);
		list.addNode(16);
		list.addNode(18);
		
		list.displayData();
		list.addByPosition(1, 40);
		list.addByPosition(3, 50);
		list.addByPosition(7, 80);
		list.addByPosition(20, 300);
		list.displayData();
		list.addByValue(100,40);
		list.addByValue(150,14);
		list.addByValue(1,80);
		list.displayData();
		
		//list.deleteByPosition(1);
		//list.deleteByPosition(3);
		//list.deleteByPosition(10);
		//list.displayData();
		
		list.deleteByValue(100);
		list.deleteByValue(14);
		list.deleteByValue(1);
		list.displayData();
		
			
		

	}

}
