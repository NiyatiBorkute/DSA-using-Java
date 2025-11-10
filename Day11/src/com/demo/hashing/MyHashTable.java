package com.demo.hashing;

public class MyHashTable {
	Node [] heads;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	public MyHashTable () {
		heads=new Node[10] ;
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	public MyHashTable(int size) {
		heads=new Node[size] ;
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	public void insertData(int key) {
		
		Node newNode=new Node(key);
		int pos=key%heads.length;
		if(heads[pos]!=null) {
			newNode.next=heads[pos];
		}
		heads[pos]=newNode;
	}
	public void displayHashTable() {
		for(int i=0;i<heads.length;i++) {
			Node temp=heads[i];
			System.out.println(i+"--->");
			while(temp!=null) {
				System.out.println(temp.data+"--->");
				temp=temp.next;
			}
			System.out.println("null");
		}
		
	}
	public boolean searchData(int num) {
		int pos=num%heads.length;
		Node temp=heads[pos];
		while(temp!=null) {
			if(temp.data==num) {
				System.out.println(num+"found in bucket "+pos);
				return true;
				
			}
			temp=temp.next;
		}
		System.out.println(num+"not found in bucket");
		return false;
	}
	

}
