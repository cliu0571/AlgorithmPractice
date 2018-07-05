package com.example;

//Description
//Determine if a given binary tree is binary search tree.
//
//Assumptions
//
//There should no be duplicate keys in binary search tree.
//You can assume the keys stored in the binary search tree can not be Integer.MIN_VALUE or Integer.MAX_VALUE.
//Corner Cases
//
//What if the binary tree is null? Return true in this case.

public class IsBinarySearchTreeOrNot {
	public boolean isBST(TreeNode root) {
		
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	    // Write your solution here
	}
	
	private boolean isBST(TreeNode root, Integer min, Integer max) {
		if (root == null) {
			return true;
		}
		
		if (root.key < min || root.key > max) {
			return false;
		}
		
		return isBST(root.left, min, root.key-1) 
				&&
				isBST(root.right, root.key+1, max);
		
	  }
}
