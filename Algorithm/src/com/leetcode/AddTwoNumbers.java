package com.leetcode;

/**
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 *
 */

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return recursiveSum(l1, l2, 0);

	}

	public ListNode recursiveSum(ListNode l1, ListNode l2, int carry) {

		ListNode result = new ListNode();
		ListNode head = null;
		int sum = 0;
		int output = 0;
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else {
			while (l1 != null || l2 != null) {

				if (l1 != null && l2 != null) {
					sum = l1.val + l2.val + carry;
					l1 = l1.next;
					l2 = l2.next;

				} else if (l1 != null) {
					sum = l1.val + carry;
					l1 = l1.next;
				} else {
					sum = l2.val + carry;
					l2 = l2.next;
				}
				carry = 0;
				if (sum > 9) {
					carry = sum / 10;
					output = sum % 10;
				} else {
					output = sum;
				}

				result.next = new ListNode(output);
				result = result.next;
				if (head == null) {
					head = result;
				}

			}

			if (sum > 9) {
				sum = carry;
				result.next = new ListNode(sum);
			}

		}
		return head;

	}

	public static void main(String[] args) {
	}

}
