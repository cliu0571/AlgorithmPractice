package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//Description
//Implement an iterative, post-order traversal of a given binary tree, return the list of keys of each node in the tree as it is post-order traversed.
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
//Post-order traversal is [1, 4, 3, 11, 8, 5]
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

public class PostOrderTraversalOfBinaryTree {
	public List<Integer> postOrder(TreeNode root) {
	    // Write your solution here
		List<Integer> postOrderList = new ArrayList<>();
		if (root == null) {
			return postOrderList;
		}
		
		Deque<TreeNode> stack = new LinkedList<>();
		TreeNode curr = null;
		
		stack.offerFirst(root);
		while(!stack.isEmpty()) {
			curr = stack.pollFirst();
			postOrderList.add(curr.key);
			
			if (curr.left != null) {
				stack.offerFirst(curr.left);
			}
			
			if (curr.right!=null) {
				stack.offerFirst(curr.right);
			}
		}
		
		Collections.reverse(postOrderList);
		
		return postOrderList;
	  }
}
