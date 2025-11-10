package com.demo.test;

import com.demo.trees.MyBinarySearchTree;

public class TestMyBinarySearchTree {

	public static void main(String[] args) {
		MyBinarySearchTree list= new MyBinarySearchTree();
		
		list.insertNode(30);
		list.insertNode(25);
		list.insertNode(35);
		list.insertNode(21);
		list.insertNode(7);
		list.insertNode(32);
		list.insertNode(33);
		list.insertNode(37);
		
		System.out.println("Inorder");
		list.inorder();
		System.out.println("preorder");
		list.preorder();
		System.out.println("postorder");
		list.postorder();
		

		list.search(33);
		list.searchNonRecussive(31);
		list.search(38);
		
		list.deleteNode(18);
		list.inorder();
		list.deleteNode(32);
		list.inorder();
		list.deleteNode(15);
		list.inorder();

	}

}
