package com.test;

/**
 * Remove Kth element in linkedlist
 * 
 * @author patha
 *
 */
public class LinkedListRemove {

	Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {

		LinkedListRemove linkedList = new LinkedListRemove();

		linkedList.head = new Node(2);
		Node first = new Node(3);
		Node second = new Node(7);

		linkedList.head.next = first;
		first.next = second;

		int count = 1;

		printLinkedList(linkedList);
		removeKthElement(linkedList, count);
		printLinkedList(linkedList);

	}

	private static void removeKthElement(LinkedListRemove linkedList, int count) {

		Node previous = linkedList.head;
		Node current = linkedList.head.next;
		int value = 1;

		while (current != null) {
			//System.out.print(previous.data + "------->");
			if (count == value) {
				previous.next = current.next;
				break;

			}
			previous = current;
			current = current.next;

			value++;
		}

		previous.next = current.next;
		current.next = null;


	}

	private static void printLinkedList(LinkedListRemove linkedList) {

		Node current = linkedList.head;
		while (current != null) {

			System.out.print(current.data + "------->");
			current = current.next;
		}

		System.out.println("null");
	}

}