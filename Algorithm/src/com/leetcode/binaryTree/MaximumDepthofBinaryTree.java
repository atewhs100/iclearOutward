package com.leetcode.binaryTree;

public class MaximumDepthofBinaryTree {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		TreeNode leftnode = new TreeNode(4);
		TreeNode rightnode = new TreeNode(8);
		node.left = new TreeNode(3, leftnode, rightnode);
		System.out.println(maxDepth(node));

	}

	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return Math.max(left, right) + 1;
	}

}
