package com.example;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//Description
//Implement an iterative, pre-order traversal of a given binary tree, return the list of keys of each node in the tree as it is pre-order traversed.
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
//Pre-order traversal is [5, 3, 1, 4, 8, 11]
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

public class PreOrderTraversalOfBinaryTree {
	public List<Integer> preOrder(TreeNode root) {
		// Write your solution here
		List<Integer> preOrderList = new ArrayList<>();
		if (root == null) {
			return preOrderList;
		}
		Deque<TreeNode> stack = new LinkedList<>();
		TreeNode curr = null;

		stack.add(root);
		while (!stack.isEmpty()) {
			curr = stack.pollFirst();
			preOrderList.add(curr.key);
			
			if (curr.right!= null) {
				stack.offerFirst(curr.right);
			}
			
			if (curr.left != null) {
				stack.offerFirst(curr.left);
			}
		}

		return preOrderList;
	}
}
