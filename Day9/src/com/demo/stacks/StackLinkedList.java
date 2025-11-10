package com.demo.stacks;

public class StackLinkedList {
	Node top;
	class Node{
		int data;
		Node next;
		public Node (int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	public StackLinkedList() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top==null;
		
	}

	public void pushValue(int value) {
		Node newNode=new Node(value);
		if(!isEmpty()) {
			newNode.next=top;
		}
		
		top=newNode;
		System.out.println("pushed"+value);
		
		
	}

	public int popValue() {
		if(!isEmpty()) {
			Node temp=top;
			top=top.next;
			temp.next=null;
			return temp.data;
			
		}
		System.out.println("stack is empty");
		return -1;
		
	}
	
	
	
}
