package com.example;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//Description
//Implement an iterative, in-order traversal of a given binary tree, return the list of keys of each node in the tree as it is in-order traversed.
//
//Examples
//
//        5
//
//      /    \
//
//    3        8
//
//  /   \        \
//
//1      4        11
//
//In-order traversal is [1, 3, 4, 5, 8, 11]
//
//Corner Cases
//
//What if the given binary tree is null? Return an empty list in this case.
//How is the binary tree represented?
//
//We use the level order traversal sequence with a special symbol "#" denoting the null node.
//
//For Example:
//
//The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
//
//    1
//
//  /   \
//
// 2     3
//
//      /
//
//    4
public class InOrderTraversalOfBinaryTree {
	public List<Integer> inOrder(TreeNode root) {
		// Write your solution here
		// result stores here in the ArrayList
		List<Integer> inOrderList = new ArrayList<>();
		// store parent node during traversal
		Deque<TreeNode> stack = new LinkedList<>();
		TreeNode curr = root;
		
		// curr == null, stack == null -> root = null
		// curr == null, stack != null -> left-most node 
		//				-> print node, print parent(poll from stack)
		// curr != null, stack == null -> root
		// curr != null, stack != null -> go left 
		//				-> left == null -> print parent -> go right
		while (curr != null || !stack.isEmpty()) {
			if (curr != null) {
				stack.offerFirst(curr);
				curr = curr.left;
			}else {
				curr = stack.pollFirst();
				inOrderList.add(curr.key);
				curr = curr.right;
			}
		}
		
		return inOrderList;
	}	
}

class TreeNode {
	public int key;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int key) {
		this.key = key;
	}
}
