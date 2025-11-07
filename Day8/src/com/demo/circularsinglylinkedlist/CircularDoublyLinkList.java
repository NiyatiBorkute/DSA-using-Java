package com.demo.circularsinglylinkedlist;

public class CircularDoublyLinkList {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
			this.next=null;
			this.prev=null;
		}
		
	}
	public CircularDoublyLinkList() {
		head=null;
	}
	
	public void addNode(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
			head.next = head;
	        head.prev = head;
		}else {
			//temp at the last node
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.next=head;
			head.prev=newNode;
			newNode.prev=temp;
			
		}
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			do{
			   System.out.print(temp.data+"--->");
			   temp=temp.next;
			}while(temp!=head);
		}
		System.out.println("head");
		
	}
	
	public void addByPosition(int pos,int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node newNode=new Node(val);
			if(pos==1) {
				Node temp=head.prev;
				temp.next=newNode;
				newNode.next=head;
				newNode.prev=temp;
				head.prev=newNode;
				head=newNode;
			}else {
				Node temp=head;
				int i=0;
				//place temp at proper position
				for(;temp.next!=head && i<pos-2;i++) {
					temp=temp.next;
				}
				if(i==pos-2) {
					newNode.prev=temp;
					newNode.next=temp.next;
					temp.next=newNode;
					newNode.next.prev=newNode;
					
				}else {
					System.out.println(pos + " is beyond the limit");
				}
				
		}
		}
	}

	public void addByValue(int val, int num) {
		// TODO Auto-generated method stub
		Node temp=head;
		Node newNode=new Node(val);
		while(temp.next!=head && temp.data!=num) {
			temp=temp.next;
		}
		if(temp.data==num) {
			newNode.prev=temp;
			newNode.next=temp.next;
			temp.next=newNode;
			newNode.next.prev=newNode;
			
		}else {
			System.out.println(num + " not found");
		}
		
	}

	public void deleteByPosition(int pos) {
		// TODO Auto-generated method stub
		if(head==null) {
			System.out.println("list is Empty");
		
		}else {
			Node tail=head.prev;
			if(pos==1) {
				if(head==tail) {
					head=null;
				}
				else {
					head.next.prev=tail;
					tail.next=head.next;
					Node temp=head;
					head=head.next;
					temp.next=null;
				}	
			}
			else {
				Node temp=head;
				int i=0;
				for(;temp.next!=head && i<pos-1;i++) {
					temp=temp.next;
					
				}
				if(i==pos-1) {
					temp.next.prev=temp.prev;
					temp.prev.next=temp.next;
					temp.next=null;
					temp.prev=null;
				}else {
					System.out.println(pos+" position is beyond limit");
				}
			}
		}
		
	}

	public void deleteByValue(int value) {
		// TODO Auto-generated method stub
		if(head==null) {
			System.out.println("list is Empty");
		
		}else {
			Node tail=head.prev;
			if(head.data==value) {
				if(head==tail) {
					head=null;
				}
				else {
					head.next.prev=tail;
					tail.next=head.next;
					Node temp=head;
					head=head.next;
					temp.next=null;
				}	
			}
			else {
				Node temp=head;
				int i=0;
				for(;temp.next!=head && temp.data!= value;i++) {
					temp=temp.next;
					
				}
				if(temp.data==value) {
					temp.next.prev=temp.prev;
					temp.prev.next=temp.next;
					temp.next=null;
					temp.prev=null;
				}else {
					System.out.println(value+" Not Found");
				}
			}
		}
	}
	
}
